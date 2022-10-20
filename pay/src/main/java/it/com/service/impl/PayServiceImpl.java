package it.com.service.impl;

import it.com.entity.Pay;
import java.util.Date;
import org.springframework.stereotype.Component;

/**
 * @author hao.li
 * @Title:
 * @Description:
 * @date 2022/8/916:43
 */
@Component
public class PayServiceImpl {
    public Pay getPay() {
        Pay pay = new Pay();
        pay.setPayId("11111111111");
        pay.setPayName("订单");
        pay.setPayDate(new Date());
        return pay;
    }
}
