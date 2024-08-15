#Without using function
class HelloWorld {
    public static void main(String[] args) {
        int[] a={12,32,43,34,44,54,76,98,65,78,99};
        int m=a[0];
         for (int i = 1; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
         }
        System.out.println("max no is: "+m);
    }
}

#With using function
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        int[] a={12,32,43,34,44,54,76,98,65,78,99};
        int m=Arrays.stream(a).max().orElseThrow();;
        System.out.println("max no is: "+m);
    }
}
