package it.com.api.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hao.li
 * @Title:
 * @Description:
 * @date 2022/10/1915:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sms implements Serializable {
    private String phone;
    private String msg;
}
