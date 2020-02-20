import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;


public class LeapYearShould {

    private LeapYear leapYear;

    @BeforeEach
    void setUp() {
        leapYear = new LeapYear();
    }

    @Test
    public void returnsFalseIfYearNotDivisibleByFour(){

        assertEquals(false, leapYear.isLeapYear(2020));
    }
}
