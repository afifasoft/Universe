public class Universe {

    public static  void main(String[] args) {
        System.out.println("Hello Universe");

        Counter c = new Counter();
        System.out.println(c.getCount());
        c.incrementCount();
        c.decrementCount();
        System.out.println(c.getCount());
    }
}
