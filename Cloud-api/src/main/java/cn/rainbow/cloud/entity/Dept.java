package cn.rainbow.cloud.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * dept
 * @author 
 */
@Data
public class Dept implements Serializable {
    /**
     * 编号
     */
    private Long deptNo;

    /**
     * 名称
     */
    private String deptName;

    /**
     * 数据源
     */
    private String dbSource;

    private static final long serialVersionUID = 1L;
}