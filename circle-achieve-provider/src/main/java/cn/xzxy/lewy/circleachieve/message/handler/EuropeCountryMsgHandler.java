package cn.xzxy.lewy.circleachieve.message.handler;

import cn.xzxy.lewy.circleachieve.message.model.ConstantsMessage;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Country in Europe
 *
 * @author lewy95
 */
@Slf4j
@Service("COUNTRY_MESSAGE_TITLE_EU")
public class EuropeCountryMsgHandler implements MessageHandler {

    @Override
    public void handler(String title, JSONObject messageContent) {
        String data = messageContent.get("data").toString();
        String businessType = messageContent.get("businessType").toString();
        // doing different work following the businessType
        if (ConstantsMessage.BUSINESS_TYPE_QUERY.equals(businessType)) {
            this.doingQuery(data);
        } else if (ConstantsMessage.BUSINESS_TYPE_INSERT.equals(businessType)) {
            log.info("req{}", data);
            this.doingInsert(data);
        }
    }

    private void doingQuery(String data) {
        // business code
        log.info("【EU == QUERY】 GET IT，req{}", data);
    }


    private void doingInsert(String data) {
        // business code
        log.info("【EU == INSET】 GET IT，req{}", data);
    }
}
