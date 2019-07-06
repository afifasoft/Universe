import javax.xml.bind.SchemaOutputResolver;

public class ArrayTest {


    public static void main(String[] args) {

        int[] a = {22, 23, 24, 25, 26, 27, 22, 24, 24, 22, 22, 22};
        int k = 22;
        int count = findCount(a, k);
        System.out.println("count : "+count);


        /**
         * One way to declare and initialize an array is
         *
         *  element_type[] array_name = { init_val_0, init_val_1, ..., init_val_N-1 };
         *  */

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};


        /**
         * declare an array variable without initializing it.
         *
         *  element_type[] array_name;
         *
         *  initialized with all zeros - if the array type is a number type
         *  Arrays of objects are initialized to all null references
         *
         *
         *    new element_type[length];   // length - is a positive integer
         * */

        double[] d;

        d = new double[10];
        for (int j = 0; j < d.length; j++) {
            d[j] = 1.0;
            System.out.println(d[j]);
        }


        int[] l = {10, 20, 30, 40, 50};
        int[] m = l;

        m[3] = 5;

        for (int i = 0; i < m.length; i++) {
            System.out.println("m = l : "+m[i]);
        }

        for (int i = 0; i < l.length; i++) {
            System.out.println("now l : "+ l[i]);
        }

        for (int i = 0; i < l.length; i++) {
            for(int j = 0; j < m.length; j++) {
                if (l[i] == m[j]) {
                    System.out.println("all elements are equal");
                }
            }
        }

        if (l == m) {
            System.out.println("true");
        }

        /**
         * Cloning an Array
         *   create an
         * */

        int[] o = {10, 20, 30, 40};
        int[] p = o.clone();

        p[3] = 3;

        for (int i = 0; i < o.length; i++) {
            System.out.println("o : after cloning and cloned array modified "+ o[i]);
        }

        for (int i = 0; i < p.length; i++) {
            System.out.println("p : clone() from a : " + p[i]);
        }

        System.out.print("Java values: ");
        System.out.print(3.1415);
        System.out.print(',');
        System.out.print(15);
        System.out.println(" (double, char, int). ");


    }


    /** Counts the number of times an integer appears in an array
     *
     *  out of bounds - buffer overflow attack
     * */
    public static int findCount(int[] a, int k) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if ((i >= 0) && (i < a.length) &&(a[i] == k)) {        // check if the current element equals k
                count++;
            }


            // if ( (i >= 0) && (i < a.length) && (a[i] == k)) // will never generate an index out-of-bounds error
        }

        return count;

    }




}
