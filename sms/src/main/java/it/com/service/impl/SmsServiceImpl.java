package it.com.service.impl;

import it.com.api.entity.Sms;
import it.com.api.service.SmsService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author hao.li
 * @Title:
 * @Description:
 * @date 2022/10/1915:01
 */
@DubboService(group = "group-sms", version = "1.0.0", timeout = 30000)
public class SmsServiceImpl implements SmsService {

    @Override
    public String sendSms(Sms sms) {
        System.out.println("发送短信成功:" + sms.getMsg());
        return "ok";
    }
}
