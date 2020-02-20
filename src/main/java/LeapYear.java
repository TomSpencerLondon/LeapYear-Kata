public class LeapYear {
    public boolean isLeapYear(int year){
        if(year % 100 == 0 && year % 400 != 0){
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
}
