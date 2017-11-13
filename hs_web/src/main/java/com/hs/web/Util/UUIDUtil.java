package com.hs.web.Util;

import java.util.UUID;

/**
 * @user :flyxk
 * date :2017/10/28
 */
public class UUIDUtil {

    public static String genUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "");
    }
}
