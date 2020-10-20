package cn.xzxy.lewy.circleachieve.message.handler;

import com.alibaba.fastjson.JSONObject;

/**
 * handler interface with strategy
 *
 * @author lewy95
 */
public interface MessageHandler {

    /**
     * 处理消息的方法
     * @param title title
     * @param messageContent messageContent
     */
    void handler(String title, JSONObject messageContent);
}
