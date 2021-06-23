package nextstep.subway.common;

import static org.springframework.transaction.support.TransactionSynchronizationManager.*;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class ReplicationRoutingSource extends AbstractRoutingDataSource {

    public static final String SLAVE = "slave";
    public static final String MASTER = "master";

    @Override
    protected Object determineCurrentLookupKey() {
        return isCurrentTransactionReadOnly() ? SLAVE : MASTER;
    }
}
