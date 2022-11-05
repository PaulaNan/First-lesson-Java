public class Array {
    public static void main(String[] args) {
        String[] elevi = {"Ana", "Maria", "Ioana", "Marian", "Ion"};
        // contine elemente de acelasi tip
        // are dimensiune fixa, nu putem adauga elemente

        System.out.println(elevi[2]);
        System.out.println(elevi.length);
        elevi[2] = "Seby";
        System.out.println(elevi[2]);
        System.out.println(elevi[0] + ", " + elevi[1]);
        System.out.println(elevi.length + 2); //5+2 = 7
        System.out.println("last place " + elevi[elevi.length-1]);// cum aflam ultima valoare fara sa stim care este lungimea

        //doar initializare
        int[] note = new int[5]; // int are valoare 0 by default
        System.out.println(note[1]); // printeaza 0
        // declarare
        note[1] = 10;
        System.out.println(note[1]); // printeaza 10


    }

}
