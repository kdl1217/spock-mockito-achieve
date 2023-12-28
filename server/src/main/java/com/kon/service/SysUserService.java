package com.kon.service;

import com.kon.entity.SysUser;

import java.util.List;

/**
 * 系统用户信息接口
 *
 * @author kon, created on 2023/12/28T14:20.
 * @version 1.0.16
 */
public interface SysUserService {

    /**
     * 查询所有
     * @return 所有数据
     */
    List<SysUser> findAll();

    /**
     * 保存
     * @param sysUser   用户
     * @return  系统用户
     */
    SysUser save(SysUser sysUser);

}
