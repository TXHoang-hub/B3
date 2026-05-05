package com.vd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    // Khởi tạo Logger cho class App
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public int add(int a, int b) {
        logger.info("Thực hiện phép tính cộng: {} + {}", a, b);
        return a + b;
    }

    public int divide(int a, int b) {
        logger.info("Thực hiện phép tính chia: {} / {}", a, b);
        if (b == 0) {
            logger.error("Lỗi: Chia cho số 0!");
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        App app = new App();
        logger.info("Ứng dụng bắt đầu chạy...");
        System.out.println("Result: " + app.add(10, 5));
    }
}