public class Calculator {
    // Phép cộng
    public int add(int a, int b) {
        return a + b;
    }

    // Phép trừ
    public int subtract(int a, int b) {
        return a - b;
    }

    // Phép nhân
    public int multiply(int a, int b) {
        return a * b;
    }

    // Phép chia
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");//nem loi so hoc khong chia so 0
        }
        return (double) a / b;
    }
}
