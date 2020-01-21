package com.hendisantika.springbootapacherocketmq.transaction;

import org.apache.rocketmq.spring.annotation.RocketMQTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionState;
import org.springframework.messaging.Message;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-apache-rocketmq
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/01/20
 * Time: 07.33
 */
@RocketMQTransactionListener(txProducerGroup = "test-transaction")
class TransactionListenerImpl implements RocketMQLocalTransactionListener {
    @Override
    public RocketMQLocalTransactionState executeLocalTransaction(Message msg, Object arg) {
        // ... local transaction process, return ROLLBACK, COMMIT or UNKNOWN
        return RocketMQLocalTransactionState.UNKNOWN;
    }

    @Override
    public RocketMQLocalTransactionState checkLocalTransaction(Message msg) {
        // ... check transaction status and return ROLLBACK, COMMIT or UNKNOWN
        return RocketMQLocalTransactionState.COMMIT;
    }
}