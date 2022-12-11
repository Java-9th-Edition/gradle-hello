package com.LanguageApp;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestSayHello {
    @Test
    public void testSayHello() throws IOException {
        SayHello.main(new String[]{"en"});
    }
}