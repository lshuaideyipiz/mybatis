package edu.nf.ch01night.util;

import java.util.UUID;

public class UUIDUtils {

    public static String createUUID(){
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-","");
    }

    public static void main(String[] args) {
        System.out.println("HELLO,"+UUIDUtils.createUUID());
    }

}
