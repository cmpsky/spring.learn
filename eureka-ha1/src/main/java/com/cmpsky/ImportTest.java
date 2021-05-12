package com.cmpsky;

import com.cmpsky.file.FileCut;
import com.cmpsky.user.bean.UserInfo;

public class ImportTest {
    public static void test(){
        //直接从本地工程引入依赖
        UserInfo user = new UserInfo();
        user.setUserName("haha");
        user.setPhone("13888888888");

        /**
         * 从私库引入依赖
         * 私库地址 http://192.168.3.12:8081/repository/maven-public/
         */
        FileCut cut = new FileCut();
    }
}
