import org.junit.jupiter.api.Test;

import com.vd.App;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private final App app = new App();

    @Test
    @DisplayName("Test phép cộng cơ bản")
    void testAdd() {
        assertEquals(15, app.add(10, 5), "10 + 5 phải bằng 15");
    }

    @Test
    @DisplayName("Test lỗi chia cho 0")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            app.divide(10, 0);
        }, "Phải ném ra ngoại lệ ArithmeticException khi chia cho 0");
    }

    @Test
    @DisplayName("Test gây lỗi để kiểm tra CI")
    void testFailure() {
        int result = app.add(10, 10);
        assertEquals(20, result, "Phép tính này dùng để verify CI hoạt động");
    }
}