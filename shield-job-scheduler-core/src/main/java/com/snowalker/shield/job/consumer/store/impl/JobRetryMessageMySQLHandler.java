package com.snowalker.shield.job.consumer.store.impl;

import com.snowalker.shield.job.Result;
import com.snowalker.shield.job.consumer.store.JobRetryMessage;
import com.snowalker.shield.job.consumer.store.JobRetryMessageHandler;

import java.util.List;

/**
 * @author snowalker
 * @version 1.0
 * @date 2019/4/10 16:06
 * @className JobRetryMessageMySQLHandler
 * @desc TODO 作业消息存储MySQL处理器实现
 */
public class JobRetryMessageMySQLHandler implements JobRetryMessageHandler {

    @Override
    public Result<Boolean> storeRetryJobMsg(JobRetryMessage jobRetryMessage) {
        System.out.println("作业消息存储MySQL处理器实现--模拟存储消息");
        return null;
    }

    @Override
    public Result<Boolean> countRetryJobMsgResendTimes(String messageId, String msgTopic) {
        System.out.println("作业消息存储MySQL处理器实现--模拟增加重试次数");
        return null;
    }

    @Override
    public Result<Boolean> removeRetrySuccessJobMsg(List<JobRetryMessage> jobRetryMessages) {
        return null;
    }

    @Override
    public Result<Boolean> markAfterRetryDeadJobMsg(String messageId, String msgTopic) {
        return null;
    }
}