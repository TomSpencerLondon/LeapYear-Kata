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
    public void returnsTrueIfYearDivisibleByFour(){
        assertEquals(true, leapYear.isLeapYear(2020));
    }

    @Test
    public void returnsFalseIfYearNotDivisibleByFour(){
        assertEquals(false, leapYear.isLeapYear(2019));
    }

    @Test
    public void returnsFalseIfYearIsCenturyYearNotDivisibleBy400(){
        assertEquals(false, leapYear.isLeapYear(1900));
    }

    @Test
    public void returnsTrueIfYearIsCenturyYearDivisibleBy400(){
        assertEquals(true, leapYear.isLeapYear(2020));
    }
}
