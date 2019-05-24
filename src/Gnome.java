public  class Gnome {

    // Instance variables
    public String name;
    public int age;
    public Gnome gnomeBuddy;
    private boolean magical = false;
    protected  double height = 2.6;
    public static final int MAX_HEIGHT = 3; // maximum height

    // Constructors fully parameterized
    public Gnome(String name, int age, Gnome gnomeBuddy, double height) {
        this.name = name;
        this.age = age;
        this.gnomeBuddy = gnomeBuddy;
        this.height = height;
    }


    // default constructor
    public Gnome() {
        name = "Rumple";
        age = 204;
        gnomeBuddy = null;
        height = 2.1;
    }

    // Methods
    public static void makeKing (Gnome h) {
        h.name = "King " +h.getRealName();
        h.magical = true; // Only the Gnome class can reference this field.
    }

    public void makeMeKing() {
        name = "King "+ getRealName();
        magical = true;
    }

    public boolean isMagical() { return magical; }
    public void setHeight(int newHeight ) {
        height = newHeight;
    }

    public String getName() {
        return "I won't tell!";
    }

    public String getRealName() {
        return name;
    }

    public void renameGnome(String s) { name = s;}

    public int getAge() {
        return age;
    }

   // public abstract void setHeight (double newHeight);

}
