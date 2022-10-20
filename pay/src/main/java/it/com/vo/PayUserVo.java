package it.com.vo;

import it.com.api.entity.UserInfo;
import it.com.entity.Pay;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hao.li
 * @Title:
 * @Description:
 * @date 2022/8/916:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayUserVo implements Serializable {
    private Pay pay;
    private UserInfo userInfo;
}
