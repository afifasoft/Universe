public class DayTripper {

    public enum Day {MON, TUE, WED, THU, FRI, SAT, SUN };

    public static  void main(String[] args) {
        Day d = Day.MON;
        System.out.println("Initially d is : "+d);

        d = Day.WED;
        System.out.println("Then it is "+ d);

        Day t = Day.valueOf("WED");
        System.out.println("I say d and t are the same: "+ (d == t));
    }


    // Declaring Methods

    /*

        modifiers type name(type0 parameter0, ... , type_n parameter_n) {

            // method body
        }

     */



    // Constructor

    /*
        modifier name(type0 parameter0, ..., type_n-1 parameter_n-1 ) {

            // constructor body
        }

     */
}
