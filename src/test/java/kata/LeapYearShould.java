package kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LeapYearShould {
    @Test
    void return_false_when_3_is_passed()
    {
        var LeapYear = new LeapYear();
        var result = LeapYear.isLeapYear(3);
        assertEquals(false, result);
    }
}