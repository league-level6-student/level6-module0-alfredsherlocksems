package _06_payroll;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
    	assertEquals(4, payroll.calculatePaycheck(2, 2));
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        assertEquals(575, payroll.calculateMileageReimbursement(1000));
    }

    @Test
    void itShouldCreateOfferLetter() {
        assertEquals("Hello Bob, We are pleased to offer you an hourly wage of 10.0", payroll.createOfferLetter("Bob", 10));
    }

}