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


    def setup() {
        MockitoAnnotations.openMocks(this)
    }

    def "查询数据"() {
        given: "模拟数据"
        when(sysUserRepository.findAll()).thenReturn([SysUserMock.mock()])

        when:
        def list = sysUserService.findAll()

        then:
        list.size() == 1
    }

    def "保存数据"() {
        given: "模拟数据"
        when(sysUserRepository.save(any() as SysUser)).thenReturn(SysUserMock.mock())

        when:
        def user = sysUserService.save(SysUserMock.mock())

        then:
        user != null
    }



}
