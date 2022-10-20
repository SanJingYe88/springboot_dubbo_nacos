package it.com.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title:
 * @Description:
 * @author hao.li
 * @date 2022/8/916:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pay implements Serializable {
    private String payId;
    private String payName;
    private Date payDate;
}
