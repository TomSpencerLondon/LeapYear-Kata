public class LeapYear {
    public boolean isLeapYear(int year){
        return !(isNotGregorianLeapYear(year) || !isDivisibleByFour(year));
    }

    private boolean isNotGregorianLeapYear(int year){
        return isDivisibleBy100(year) && !isDivisibleByFourHundred(year);
    }

    private boolean isDivisibleByFour(int year){
        return year % 4 == 0;
    }

    private boolean isDivisibleByFourHundred(int year){
        return year % 400 == 0;
    }

    private boolean isDivisibleBy100(int year){
        return year % 100 == 0;
    }
}
