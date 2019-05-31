public class ClientRect {

    public static void main(String[] args) {
        Rect r  = new Rect(3, 4);
        System.out.println("area: "+r.area());
        r.change_length(5);
        System.out.println("area: "+r.area());
        r.change_breadth(6);
        System.out.println("area: "+r.area());

    }

}
