package com.kon

import com.kon.entity.SysUser
import com.kon.repository.SysUserRepository
import com.kon.service.impl.SysUserServiceImpl
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import spock.lang.Specification

import static org.mockito.ArgumentMatchers.any
import static org.mockito.Mockito.when

/**
 * 简单Spock测试
 *
 *                          ------------------------------
 *                          ｜                            ↓
 *      setupSpec() ->  [setup() -> def 自定义方法 ——> cleanup()] -> cleanupSpec()
 *                          ↑                            ｜
 *                          ------------------------------
 *
 * @author kon, created on 2023/12/28T14:28.
 * @version 1.0.16
 */
class SysUserSpec extends Specification {

    @Mock
    SysUserRepository sysUserRepository

    @InjectMocks
    SysUserServiceImpl sysUserService

    // 初始化
    def setupSpec() {
        println ">>>>> 初始化"
    }

    def setup() {
        println ">>>>> setup"
        MockitoAnnotations.openMocks(this)
    }

    def cleanup() {
        println ">>>>> cleanup"
    }

    def cleanupSpec() {
        println ">>>>> cleanupSpec"
    }

    def "保存数据"() {
        given:
        when(sysUserRepository.save(any(SysUser) as SysUser)).thenReturn(SysUserMock.mock())

        when:
        def user = sysUserService.save(SysUserMock.mock())

        then:
        user != null
    }


}
