package com.LanguageApp;

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class SayHello {
    public static void main(String[] args) throws IOException {
        String language = args[0];

        InputStream resourceStraem = SayHello.class.getClassLoader().getResourceAsStream(language + ".txt");
        assert resourceStraem != null;
        BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(resourceStraem, StandardCharsets.UTF_8));

        System.out.println(bufferedInputStream.readLine());
    }
}