package docs;

import org.junit.jupiter.api.*;

public class JunitExample {

    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("AfterAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("        BeforeEach");
    }

    @AfterEach
    void tearDown() {
        System.out.println("        AfterEach");
    }


    @Test
    void firsTest(){
        System.out.println("            Here is first test");
    }

    @Test
    void secondTest(){
        System.out.println("             Here is second test");
    }
}
