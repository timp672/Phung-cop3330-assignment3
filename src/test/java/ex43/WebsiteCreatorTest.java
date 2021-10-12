package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteCreatorTest {
    @Test
    void createWebsite() {
        WebsiteCreator w = new WebsiteCreator();

        w.path = "src/main/java/ex43/";
        w.siteName = "testwebsite.com";
        w.author = "Max Power";

        String expected = "src/main/java/ex43/testwebsite.com";
        String actual = w.createWebsite();

        assertEquals(expected, actual);
    }

    @Test
    void createJS() {
        WebsiteCreator w = new WebsiteCreator();

        w.path = "src/main/java/ex43/";
        w.siteName = "testwebsite.com";
        w.author = "Max Power";

        String expected = "src/main/java/ex43/testwebsite.com/js";
        String actual = w.createJS();

        assertEquals(expected, actual);
    }

    @Test
    void createCSS() {
        WebsiteCreator w = new WebsiteCreator();

        w.path = "src/main/java/ex43/";
        w.siteName = "testwebsite.com";
        w.author = "Max Power";

        String expected = "src/main/java/ex43/testwebsite.com/css";
        String actual = w.createCSS();

        assertEquals(expected, actual);
    }

    @Test
    void createHTML() {
        WebsiteCreator w = new WebsiteCreator();

        w.path = "src/main/java/ex43/";
        w.siteName = "testwebsite.com";
        w.author = "Max Power";

        String expected = "src/main/java/ex43/testwebsite.com/index.html";
        String actual = w.createHTML();

        assertEquals(expected, actual);
    }
}