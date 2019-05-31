public class Rect {


    private int length;
    private int breadth;

    public Rect(int length, int breadth) {
        System.out.println("ctr called");
        this.length = length;
        this.breadth = breadth;
    }


   /* public void area() {
        System.out.println(length * breadth);
    }*/

    public int area() {
        return  length * breadth;
    }


    public void change_length(int length) {
        this.length = length;
    }

    public void change_breadth(int breadth) {
        this.breadth = breadth;
    }
}
