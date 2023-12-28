package com.kon.entity;

import com.alibaba.druid.sql.ast.SQLDataType;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户信息表
 *
 * @author kon, created on 2023-12-28T10:37.
 * @version 1.0.0-SNAPSHOT
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = -3109257305686112653L;
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String password;

    /**
     * 盐
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String salt;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别(0:未知，1：男，2：女，9：其他)
     */
    @Column(name = "sex", columnDefinition = SQLDataType.Constants.TINYINT)
    private Integer sex;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 身份证号
     */
    private String identityCard;

    /**
     * 是否管理员（0：不是；1：是）
     */
    @Column(name = "is__admin", columnDefinition = SQLDataType.Constants.TINYINT)
    private Integer isAdmin;

    /**
     * 是否系统账号（0：不是；1：是）
     */
    @Column(name = "is_system", columnDefinition = SQLDataType.Constants.TINYINT)
    private Integer isSystem;

    /**
     * 数据状态（1：可用，2：禁用）
     */
    @Column(name = "status", columnDefinition = SQLDataType.Constants.TINYINT)
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 上次更新密码时间
     */
    private Date lastPwdUpdateTime;

    /**
     * 是否已删除（1:是，0:否）
     */
    @Column(name = "is_del", columnDefinition = SQLDataType.Constants.TINYINT)
    private Integer isDel;

    /**
     * 数据创建时间
     */
    private Date createTime;

    /**
     * 数据创建人ID
     */
    private Long createId;

    /**
     * 数据创建人IP
     */
    private String createIp;

    /**
     * 数据更新时间
     */
    private Date updateTime;

    /**
     * 数据更新人ID
     */
    private Long updateId;

    /**
     * 数据创建人ID
     */
    private String updateIp;
}
