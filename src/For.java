public class For {
    public static void main(String[] args) {
        // de unde incepem, pana unde mergem, pasul
        for (int i = 1; i<= 101; i++) {
            System.out.println("dalmatianul cu nr: " + i);
        }
        int[] numere = {3, 7, 30,17, 30};
        for (int i = 0; i< numere.length; i++) {
            System.out.println("elementul are index " + i + " si valoarea" + numere[i]);
            // printam din 2 in 2
        }
        for (int i = 0; i< numere.length; i=i+2) {
                System.out.println("elementul are index " + i + " si valoarea" + numere[i]);
        }
        // for each parcurge elementele si ajunge la valoare
        for (int numar : numere) {
            System.out.println("Numarul este: " + numar);
        }
        // array culori
        String[] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori) {
            System.out.println("culoarea actuala este: " + culoare);
        }
        // suma numerelor din array
        int s = 0;
        for (int numar : numere) {
            s = s+numar;
            System.out.println(s);
        }
        System.out.println(s);
    }
}
