package com.prabhanshu.tinyurl.utils;

public class TinyURLUtils {
    final static char[] characterMap = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    public static String idToShortURL(int n) {
        StringBuilder shortURL = new StringBuilder();
        while (n > 0) {
            shortURL.append(characterMap[n % 62]);
            n = n / 62;
        }
        return shortURL.reverse().toString();
    }
}
