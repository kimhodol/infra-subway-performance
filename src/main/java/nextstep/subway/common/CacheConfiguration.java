package nextstep.subway.common;

import static org.springframework.data.redis.cache.RedisCacheManager.RedisCacheManagerBuilder.*;
import static org.springframework.data.redis.serializer.RedisSerializationContext.SerializationPair.*;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@EnableCaching
@Configuration
public class CacheConfiguration extends CachingConfigurerSupport {
    private final RedisConnectionFactory connectionFactory;

    public CacheConfiguration(RedisConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public CacheManager cacheManager() {
        RedisCacheConfiguration configuration = RedisCacheConfiguration.defaultCacheConfig()
            .serializeKeysWith(fromSerializer(new StringRedisSerializer()))
            .serializeValuesWith(fromSerializer(new GenericJackson2JsonRedisSerializer()));

        return fromConnectionFactory(connectionFactory)
            .cacheDefaults(configuration)
            .build();

    }
}
