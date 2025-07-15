package test.java.com.demo.service;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.demo.domain.Order;

public class EmailServiceTest {
    com.demo.service.EmailService emailService;
    Order order;

    @Before
    public void setup() {
        this.emailService = com.demo.service.EmailService.getInstance();
        this.order = new Order(11, "Pizza", 1000.00);
    }

    @Test(expected = RuntimeException.class)
    public void test_sendEmail() {
        emailService.sendEmail(order);
    }

    @Test
    public void test_sendEmail_with_cc() {
        String cc = "Nikhil";
        boolean isCustomerNotified = emailService.sendEmail(order, cc);
        assertTrue(isCustomerNotified);
    }
}