import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean resa = positive(a);
        boolean resb = positive(b);
        boolean resc = positive(c);

        System.out.println((resa && !resb && !resc) ||
                (!resa && resb && !resc) ||
                (!resa && !resb && resc));
    }
    public static boolean positive(int x){
        return x > 0;
    }
}