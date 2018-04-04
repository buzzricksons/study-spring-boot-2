package com.example.spring_boot.foo;

import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class SampleControllerTests {
    @Test
    public void testSampleController() {
        open("localhost:11080");

    }
}
