import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    void sayHello() {
        HelloWorld helloWorld = new HelloWorld();

        String greeting = helloWorld.sayHello();
        assertEquals(greeting, "Hello");
    }
}
