import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitExample {

    @BeforeAll
    static void beforeAll(){
        System.out.println("before All");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("    before Each");
    }

    @Test
    void firsTest(){
        System.out.println("        Here is first test");
    }

    @Test
    void secondTest(){
        System.out.println("        Here is second test");
    }
}
