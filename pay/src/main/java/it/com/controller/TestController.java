package it.com.controller;

import it.com.api.entity.Sms;
import it.com.api.entity.UserInfo;
import it.com.api.service.SmsService;
import it.com.api.service.UserService;
import it.com.entity.Pay;
import it.com.service.impl.PayServiceImpl;
import it.com.vo.PayUserVo;
import java.util.Date;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hao.li
 * @Title:
 * @Description:
 * @date 2022/8/916:38
 */
@RestController
@RequestMapping("/test")
public class TestController {

    // 自身服务
    @Autowired
    private PayServiceImpl payServiceImpl;
    // 远程服务
    @DubboReference(group = "group-sso", version = "1.0.0", check = false, retries = 0)
    private UserService userService;    // 公共接口服务
    @DubboReference(group = "group-sms", version = "1.0.0", check = false, retries = 0)
    private SmsService smsService;

    @GetMapping("getPayUserVo")
    public PayUserVo getPayUserVo() {
        System.out.println("请求" + new Date());
        PayUserVo payUserVo = new PayUserVo();
        // 调用自身服务
        Pay pay = payServiceImpl.getPay();
        payUserVo.setPay(pay);
        // 调用 sso 服务
        UserInfo userInfo = userService.getUserInfo("10000");
        payUserVo.setUserInfo(userInfo);
        // 调用 sms 服务
        Sms sms = new Sms();
        sms.setPhone("111");
        sms.setMsg(userInfo.getUserName() + "你好");
        smsService.sendSms(sms);
        return payUserVo;
    }
}
