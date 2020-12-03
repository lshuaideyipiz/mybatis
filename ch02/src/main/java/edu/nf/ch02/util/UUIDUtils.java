package edu.nf.ch02.util;

import java.util.UUID;

public class UUIDUtils {

    public static String createUUID(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-","");
        return uuid;
    }

    public static void main(String[] args) {
        System.out.println(UUIDUtils.createUUID());
    }

}
