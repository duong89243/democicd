import org.junit.jupiter.api.*; // Thư viện JUnit 5

public class Lifecyecle_Junit5 {

    // Chạy duy nhất 1 lần trước tất cả các test trong class
    @BeforeAll
    static void initAll() {
        System.out.println("BeforeAll - run before all methods once");
    }

    // Chạy trước mỗi phương thức test
    @BeforeEach
    void init() {
        System.out.println("BeforeEach - run before each method");
    }

    // Phương thức test đầu tiên được thực thi
    @DisplayName("Fist Test") // Gán tên hiển thị tùy chỉnh cho test
    @Test
    void testMethod1() {
        System.out.println("testMethod1");
    }

    // Phương thức test này sẽ bị bỏ qua (không chạy) vì có @Disabled
    @Test
    @Disabled
    void testMethod2() {
        System.out.println("testMethod2");
    }

    // Phương thức test thứ hai sẽ được thực thi
    @Test
    void testMethod3() {
        System.out.println("testMethod3");
    }

    // Chạy sau mỗi phương thức test
    @AfterEach
    void tearDown() {
        System.out.println("AfterEach - run after each method");
    }

    // Chạy duy nhất 1 lần sau tất cả các test trong class
    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll - run after all methods once");
    }
}
