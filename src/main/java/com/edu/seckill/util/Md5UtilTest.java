package com.edu.seckill.util;

import org.junit.jupiter.api.Test;

/**
 * ClassName:  MD5UtilTest
 * Description:
 *
 * @author Jay
 * @version v1.0
 */
public class Md5UtilTest {

    @Test
    public void f1(){
        // 密码明文12345即用户输入的密码,inputPassToMidPass返回中间密码
        // 中间密码为了增加安全性,防止网络传输的密码被网络拦截设计的
        // 中间密码也是经过前端md5计算得到,并通过网络发送给服务器,也就是说发送给服务器后端的密码是先经过加密的
        // 第一次加密加盐
        System.out.println(MD5Util.inputPassToMidPass("12345"));

        // 第二次加密加盐
        // 对中间密码进行加密加盐时,salt可能不一样
        System.out.println(MD5Util.midPassToDbPass("950d4bf1fc056aa8d4179da29e6e5d79", "U03y8XSf"));

        // 明文密码12345得到存放在数据库密码
        System.out.println(MD5Util.inputPassToDbPass("12345", "U03y8XSf"));

    }

}
