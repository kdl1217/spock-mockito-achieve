package com.kon.service.impl;

import com.kon.entity.SysUser;
import com.kon.repository.SysUserRepository;
import com.kon.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 系统用户信息接口实现
 *
 * @author kon, created on 2023/12/28T14:20.
 * @version 1.0.16
 */
@Slf4j
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public List<SysUser> findAll() {
        return (List<SysUser>) sysUserRepository.findAll();
    }

    @Override
    public SysUser save(SysUser sysUser) {
        if (!StringUtils.hasText(sysUser.getName())) {
            throw new IllegalArgumentException("用户名不能为空");
        }
        return sysUserRepository.save(sysUser);
    }

}
