import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestCacultor {
    private Calculator calculator;
    // phuong thuc nay chay truoc khi kiem thu
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    // kiem thu phep cong
    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(3, 2), "3 + 2 = 5");
    }
    //kiem thu phep tru
    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 = 1");
    }
    //kiem thu phep nhan
    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(3, 2), "3 * 2 = 6");
    }
    //kiem thu phep chia
    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 = 2");
        // truong hop chia so 0
        assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0), "can not divide by 0");
    }
}