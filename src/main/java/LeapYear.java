public class LeapYear {
    public boolean isLeapYear(int year){

        if(isDivisibleBy100(year) && !isDivisibleByFourHundred(year)){
            return false;
        }

        if(isDivisibleByFour(year)){
            return true;
        }
        return false;
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
