import com.afifasoft.universe.bean.*;
import com.afifasoft.universe.constants.ApplicationConstant;
import com.afifasoft.universe.serviceImpl.GardenServiceImpl;
import com.afifasoft.universe.serviceImpl.WaterCanServiceImpl;

public class CastingExample {

    private int numApples;

    public static void main(String[] args) {

        double d1 = 3.2;
        double d2 = 3.9999;
        int i1 = (int) d1;
        int i2 = (int) d2;
        double d3 = (double) i2;

        System.out.println("d1: "+d1);
        System.out.println("d2: "+d2);
        System.out.println("i1: "+i1);
        System.out.println("i2: "+i2);
        System.out.println("d3: "+d3);


        int i3 = 3;
        int i4 = 6;
        double resul1 = (double) i3 / (double)i4;
        double result2 = i3 / i4;

        System.out.println("result1: "+ resul1);
        System.out.println("result2: "+ result2);


        int iresult, i5 = 3;
        double dresult, d4 = 3.2;

        dresult = i5 / d4;
        iresult = (int) (i5 / d4);
        System.out.println("dresult: "+dresult);
        System.out.println("iresult: "+ iresult);



//      String s = (String) 4.5;  // error

//      String t = "Value = " + (String) 13; // error

//        String u = 22;        // error

        String s = "" + 4.5; // correct, but poor style

        String t = "Value =" + 13; // this is good

        String u = Integer.toString(22);   // this is good


        System.out.println(s + " " + t + " " + u);

        int snowLevel = 7;

        CastingExample castingExample = new CastingExample();
        if (snowLevel < 2) {
            castingExample.goToClass();
            castingExample.comeHome();
        } else if (snowLevel < 5) {
            castingExample.goSledding();
            castingExample.haveSnowballFight();
        } else {
            castingExample.stayAtHome();
        }


        String[] d = {"MON", "TUE", "WED", "THU", "FRI"};

        for (int i = 0; i < d.length; i++) {
            castingExample.isGoodDay(d[i]);
        }
        castingExample.isGoodDay("SAT");
        int n = 10;
        castingExample.testWhileLoop(n);

        Apples apples = new Apples();
        apples.setNumApples(10);
        castingExample.eatApples(apples);

       // castingExample.getUserInput();

        int date = 13;
        boolean birthday = castingExample.checkBDay(date);
        System.out.println("birthday: "+birthday);
        int[][] a = {{1,2,3}, {3, 4, 5}, {3, 2, 3}};
        boolean findZero = castingExample.hasZeroEntry(a);
        System.out.println("findZero: "+findZero);
        int[] b = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440};
        int sumofArray = castingExample.sum(b);
        System.out.println("sumOfArray: "+sumofArray);

    }


    public void goToClass() {
        System.out.println("goToClass()");
    }

    public void comeHome() {
        System.out.println("comeHome()");
    }

    public void goSledding() {
        System.out.println("goSledding()");

    }

    public  void haveSnowballFight() {
        System.out.println("haveSnowballFight()");
    }

    public void stayAtHome() {
        System.out.println("stayAtHome()");
    }

    public void isGoodDay(String d) {

        switch (d) {
            case ApplicationConstant
                    .MONDAY :
                System.out.println("This is tough.");
                break;

            case ApplicationConstant.TUESDAY:
                System.out.println("This is getting better.");
                break;

            case ApplicationConstant.WEDNESDAY:
                System.out.println("Half way there.");
                break;

            case ApplicationConstant.THURSDAY:
                System.out.println("I can see the light.");
                break;

            case ApplicationConstant.FRIDAY:
                System.out.println("Now we are talking.");
                break;

             default:
                 System.out.println("Day off!");
                 break;

        }
    }

    public void testWhileLoop(int n) {
        /*
            while (boolean_exp)
                loop_statement
         */

        while (n != 0) {
            System.out.println("Value of n: "+n);
            n--;
        }
    }

    public void waterCarrots() {
        GardenServiceImpl garden = new GardenServiceImpl();


        Carrot current = garden.findNextCarrot();

        WaterCanServiceImpl waterCan = new WaterCanServiceImpl();

        WaterCan waterCanNew = new WaterCan();
        while (!waterCan.isEmpty()) {
            water(current, waterCanNew);

            current = garden.findNextCarrot();
        }
    }

    public static void water(Carrot current, WaterCan waterCan) {
        System.out.println("Water service");
    }

    public void testForLoop(int n) {
        /*
            for (initialization; condition; increment)
                loop_statement


            the syntax of a for loop is equivalent to the following

            initialization;
            while (condition) {
                loop_statement;
                increment;
            }
         */
    }


    public void eatApples(Apples apples) {
        numApples = apples.getNumApples();
        System.out.println("numApples: "+ numApples);
        for (int x = 0; x < numApples; x++) {
            eatApples(apples.getApples(x));
            System.out.println("x: "+x);
            //spitOutCore();

        }
    }

    public void spitOutCore() {

    }


    public void testDoWhileLoop() {
        /*
            do
                loop_statement
            while (boolean_exp)
         */
    }

    public void getUserInput() {
        String input;

        do {
            input = getInputString();
            handleInput(input);
        } while (input.length() > 0);
    }

    private void handleInput(String input) {

        for(int i = 0; i < input.length(); i++){

            System.out.println("each char: "+input.charAt(i));
        }

    }

    public String getInputString() {
        String name = "Burjuman";
        return name;
    }

    // Check for a specific birthday
    public boolean checkBDay (int date) {
        Birthdays birthdays = new Birthdays();
        if (date == birthdays.MIKES_BDAY) {
            return true;
        }
        // break; // it is used to 'break' out of the innermost switch, for, while, or do-while statement body
        // continue // the continue statement can only be used inside loops ( for, while, and do-while )
        return false; // return statement must be a the last statement executed in a function
    }


    public  boolean hasZeroEntry (int[][] a) {
        boolean foundFlag = false;

        zeroSearch:
            for (int i = 0; i < a.length; i++) {
                for(int j = 0; j < a[i].length; j++) {
                    if (a[i][j] == 0) {
                        foundFlag = true;
                        break zeroSearch;
                    }
                }
            }
            return foundFlag;
    }

    /** Adds all the numbers in an integer array. */
    public int sum(int[] a) {
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            total += a[i];

        }

        return total;
    }



    
}
