package ex41;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex41Test extends TestCase {



    public void testOutputNames() throws IOException {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Ling, Mai");
        expected.add("Johnson, Jim");
        expected.add("Zarnecki, Sabrina");
        expected.add("Jones, Chris");
        expected.add("Jones, Aaron");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");


    }

    @Test
    void readFile() {
    }

    @Test
    void outputNames() {
    }
}