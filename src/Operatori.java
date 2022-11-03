public class Operatori {
    public static void main(String[] args) {
        // aritmetici: +, -, *, /, % (restul impartitrii)
        // de comparare: <>, ==, !=, >=, <=
        // logici: && (si si), || (sau sau)

        int a =4;
        int b = 6;
        int c = 8;
        a =b; // a primeste valoarea lui b
        System.out.println(a+b);
        System.out.println(c%a);
        System.out.println(c-b);
        System.out.println(12<c);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(7>a && 8>c);
        System.out.println(2>a || c<10);
        System.out.println(a==4 && (2>a || c<10));
        System.out.println(!(7>b)); // 7>6 - true, !true = false
    }
}
