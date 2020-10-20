package cn.xzxy.lewy.circleachieve.controller;

import cn.xzxy.lewy.circleachieve.dto.country.CountryKafkaDto;
import cn.xzxy.lewy.circleachieve.message.model.ConstantsMessage;
import cn.xzxy.lewy.framework.core.json.FastJsonUtil;
import cn.xzxy.lewy.framework.core.model.JsonResponseEntity;
import cn.xzxy.lewy.framework.kafka.domain.sender.exception.SendException;
import cn.xzxy.lewy.framework.kafka.domain.sender.model.MessageVO;
import cn.xzxy.lewy.framework.kafka.domain.sender.service.KafkaMessageSender;
import com.alibaba.fastjson.JSONObject;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * test kafka message pushing
 */
@RestController
@RequestMapping("/message")
public class KafkaController {

    @Resource
    KafkaMessageSender mqMessageSender;

    @PostMapping("/push")
    @Transactional(rollbackFor = Exception.class)
    public JsonResponseEntity sendMsg(@RequestBody @Valid CountryKafkaDto dto) {
        JSONObject jMessage = new JSONObject();
        try {
            jMessage.put("businessType", ConstantsMessage.BUSINESS_TYPE_QUERY);
            jMessage.put("data", FastJsonUtil.to(dto));
            // test for EU
            MessageVO messageVO = new MessageVO(
                    ConstantsMessage.COUNTRY_TOPIC,
                    ConstantsMessage.TITLE_FOR_EU,
                    jMessage);

            mqMessageSender.sendMessage(messageVO);
        } catch (SendException e) {
            e.printStackTrace();
        }
        return JsonResponseEntity.buildOK("success");
    }
}
