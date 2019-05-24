public class Example {


    public static void main(String[] args) {
        Counter c;

        Counter d = new Counter();

        c = new Counter();

        d = c;

        String s = "dino" + "saur";

        System.out.println(s);


        Oven oven = new Oven();

        oven.cookDinner();
        oven.cookDinner("Biriyani");
        oven.cookDinner("Special Biriyani: ", "Eid Season");


        Gnome gnome = new Gnome();


        gnome.name = "Professor Smythe";
        gnome.age  = 132;

        System.out.println(gnome.getName());
        System.out.println(gnome.getAge());
    }
}
