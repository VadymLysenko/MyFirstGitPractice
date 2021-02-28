package day04_variable_intro;

public class VariableNumingRules {
    public static void main(String[] args){
        //System.out.println("BREAK TILL 4:10 PM EST");
         //int static = 22; -> error, static is reserved by java
        int static2 = 22;
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234;

        int salary = 55;
        //int 1stMonthSalary = 3000; -> error, cannot start with number
        int $ = 10;
        //int _ = 3;
        System.out.println($);
//        System.out.println(_);
        //Above veriables work fine, but not recommended.
        //we should use meaningful variable names
        //number-of-friends = 400; -> ERROR
        int numberOffFriends = 401;
        int number_of_friends = 401; // not convention

        //int num1 = 10;
    }
}
