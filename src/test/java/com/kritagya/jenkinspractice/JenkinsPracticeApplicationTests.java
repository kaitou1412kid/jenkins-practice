package com.kritagya.jenkinspractice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsPracticeApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testConstructor() {
        JenkinsPracticeApplication application = new JenkinsPracticeApplication();
        JenkinsPracticeApplication application2 = new JenkinsPracticeApplication();
        assertEquals(application.getMessage(), application2.getMessage());
    }

    @Test
    public void testMessage() {
        JenkinsPracticeApplication application = new JenkinsPracticeApplication();
        assertEquals("Hello World!",application.getMessage());
    }

}
