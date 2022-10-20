package it.com.api.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title:
 * @Description:
 * @author hao.li
 * @date 2022/8/915:32
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserInfo implements Serializable {
    private String uid;
    private String userName;
    private Integer age;
}
