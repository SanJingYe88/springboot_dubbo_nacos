package it.com.service.impl;

import it.com.api.entity.UserInfo;
import it.com.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author hao.li
 * @Title:
 * @Description:
 * @date 2022/8/915:48
 */
@DubboService(group = "group-sso", version = "1.0.0", timeout = 30000)
@Component
public class UserInfoServiceImpl implements UserService {

    @Override
    public UserInfo getUserInfo(String uid) {
        System.out.println("调用sso服务的getUserInfo方法");
        UserInfo userInfo = new UserInfo();
        if ("10000".equals(uid)) {
            userInfo.setUid("10000");
            userInfo.setUserName("张三");
            userInfo.setAge(18);
        } else {
            userInfo.setUid("10001");
            userInfo.setUserName("李四");
            userInfo.setAge(20);
        }
        return userInfo;
    }
}
