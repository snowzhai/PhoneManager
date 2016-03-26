package com.example.administrator.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2016/3/26.
 */
public class Md5Utils {
    public static String getMd5Digest(String password){
        String afterpassword="";

        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");//得到md5的信息摘要器
            byte[] digest = md5.digest(password.getBytes());//通过摘要器将传过来的信息转化成字节数据
            StringBuffer result=new StringBuffer();
            for ( byte s:digest){
                int ret=s&0xff;//将数据与上一个2进制的数
                String s1 = Integer.toHexString(ret);
                if (s1.length()==1){
                    result.append("0");//如果长度为1就在数的前面加上一个零补齐两位  因为它里面必须都是两位的十六进制数
                }
                result.append("result");
            }
            afterpassword=result.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return  afterpassword;
    }
}
