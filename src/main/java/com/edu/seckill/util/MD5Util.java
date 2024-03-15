package com.edu.seckill.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * ClassName:  MD5Util
 * Description:
 *
 * @author Jay
 * @version v1.0
 */
public class MD5Util {

    public static String md5(String str){
        return DigestUtils.md5Hex(str);
    }

    // 准备一个salt
    private static final String SALT = "U03y8XSf";

    /**
     * 加密加盐,完成的任务md5(password明文 + salt)
     * @param inputPass
     */
    public static String inputPassToMidPass(String inputPass){
        String str = SALT.charAt(0) + inputPass + SALT.charAt(6);
        return md5(str);
    }

    /**
     * 加密加盐,完成的任务md5(md5(password明文 + salt1)+salt2)
     * @return
     */
    public static String midPassToDbPass(String midPass,String salt){
        String str = salt.charAt(0) + midPass + salt.charAt(5);
        return md5(str);
    }

    /**
     * 编写一个方法,可以将password明文直接转成数据库密码
     * @param inputPass
     * @param salt
     * @return
     */
    public static String inputPassToDbPass(String inputPass,String salt){
        String midPass = inputPassToMidPass(inputPass);
        String dbPass = midPassToDbPass(midPass, salt);
        return dbPass;
    }

}
