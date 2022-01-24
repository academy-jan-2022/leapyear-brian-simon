package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearShould {
    @Test
    void return_false_when_3_is_passed()
    {
        var LeapYear = new LeapYear();
        var result = LeapYear.isLeapYear(3);
        assertFalse(result);
    }

    @Test
    void return_true_when_4_is_passed()
    {
        var LeapYear = new LeapYear();
        var result = LeapYear.isLeapYear(4);
        assertTrue(result);
    }

    @Test
    void return_true_when_400_is_passed()
    {
        var LeapYear = new LeapYear();
        var result = LeapYear.isLeapYear(400);
        assertTrue(result);
    }

    @Test
    void return_false_when_1997_is_passed()
    {
        var LeapYear = new LeapYear();
        var result = LeapYear.isLeapYear(1997);
        assertFalse(result);
    }

    @Test
    void return_true_when_1996_is_passed()
    {
        var LeapYear = new LeapYear();
        var result = LeapYear.isLeapYear(1996);
        assertTrue(result);
    }

    @Test
    void return_true_when_1600_is_passed()
    {
        var LeapYear = new LeapYear();
        var result = LeapYear.isLeapYear(1600);
        assertTrue(result);
    }

    @Test
    void return_false_when_1800_is_passed()
    {
        var LeapYear = new LeapYear();
        var result = LeapYear.isLeapYear(1800);
        assertFalse(result);
    }

    @Test
    void return_false_when_500_is_passed()
    {
        var LeapYear = new LeapYear();
        var result = LeapYear.isLeapYear(500);
        assertFalse(result);
    }

    @Test
    void return_false_when_1000_is_passed()
    {
        var LeapYear = new LeapYear();
        var result = LeapYear.isLeapYear(1000);
        assertFalse(result);
    }
}
