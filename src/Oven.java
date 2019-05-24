public class Oven {

    public Oven() {

    }

    public void cookDinner() {
        System.out.println("cookDinner()");
    }

    public  void cookDinner(String food) {

        System.out.println("cookDinner(food)");
        System.out.println("Food Name: "+food);
    }


    public  void cookDinner(String food, String seasoning) {
        System.out.println("cookDinner(food, seasoning)");
        System.out.println("Food Name: " + food);
        System.out.println("Seasoning: "+ seasoning);
    }

}
