package test.com.project;

import main.com.project.Main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void helperFunction() {
        Assertions.assertTrue(Main.helperFunction());
    }

}