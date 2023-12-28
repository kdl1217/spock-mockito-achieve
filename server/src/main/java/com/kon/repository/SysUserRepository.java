package com.kon.repository;

import com.kon.entity.SysUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 系统用户信息Repository
 *
 * @author kon, created on 2023/12/28T14:11.
 * @version 1.0.16
 */
@Repository
public interface SysUserRepository extends CrudRepository<SysUser, Long> {

}
