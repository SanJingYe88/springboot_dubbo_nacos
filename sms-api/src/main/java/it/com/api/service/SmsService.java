package it.com.api.service;

import it.com.api.entity.Sms;

/**
 * @Title:
 * @Description:
 * @author hao.li
 * @date 2022/10/1915:07
 */
public interface SmsService {
    String sendSms(Sms sms);
}
