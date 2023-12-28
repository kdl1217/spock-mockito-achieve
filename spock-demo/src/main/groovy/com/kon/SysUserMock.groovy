package com.kon

import com.kon.entity.SysUser

import java.time.Instant


/**
 * 系统用户Mock
 *
 * @author kon, created on 2023/12/28T14:38.
 * @version 1.0.16
 */
class SysUserMock {

    static def mock() {
        return new SysUser(
                "userName": "admin",
                "password": "123456",
                "salt": "123456",
                "name": "超级管理员",
                "sex": 1,
                "email": "",
                "mobile": "13000000000",
                "identityCard": "123456789012345678",
                "isAdmin": 1,
                "isSystem": 1,
                "status": 1,
                "remark": "超级管理员",
                "lastPwdUpdateTime": Date.from(Instant.now()),
                "isDel": 0,
                "createTime": Date.from(Instant.now()),
                "updateTime": Date.from(Instant.now()),
                "createIp": "127.0.0.1",
                "updateIp": "127.0.0.1",
                "createId": 1,
                "updateId": 1,
        )
    }
}
