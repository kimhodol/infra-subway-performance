package nextstep.subway.common;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@EnableAsync
@Configuration
public class AsyncThreadConfiguration {

    /**
     *
     * $ cat /proc/cpuinfo | grep "model name" | uniq -c | awk '{print $5 $6, $7,$8, $9, $10 $11}'
     * Intel(R)Xeon(R) CPU E5-2686 v4 @2.30GHz
     *
     * $ cat /proc/cpuinfo | grep "cpu cores" | tail -1 | awk '{print $4}'
     * 2
     *
     * $ cat /proc/cpuinfo | grep "physical id" | sort -u | wc -l
     * 1
     *
     * $ grep -c processor /proc/cpuinfo
     * 2
     */

    @Bean
    public Executor executor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(4);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("subway-async-");
        return executor;
    }
}
