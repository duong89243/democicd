import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTestDemo {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testIsPositive(int number) {
        assertTrue(number > 0);
    }
    @Test
    void testWithAssertAll() {
        assertAll(
                "Group of assertions",
                () -> assertTrue("Junit5".contains("Junit")),
                () -> assertEquals(2, 1 + 1),
                () -> assertFalse("hello".isEmpty())
        ) ;
    }
}
