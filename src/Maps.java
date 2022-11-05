import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class Maps {
    public static void main(String[] args) {
        // reprezenare de date in sistem cheie: valoare
        // declaram un map
        Map<String, Integer> note_elevi = new HashMap<String, Integer>();

        // adaugam elemente
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 8);
        note_elevi.put("Marcel", 9);

        // aflu notele
        System.out.println("Gigel are nota: " + note_elevi.get("Gigel"));

        // suprascriere
        note_elevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la: " + note_elevi.get("Costel"));

        // aflam dimensiunea
        System.out.println(note_elevi.size());

        // stergem valori
        note_elevi.remove("Marcel");
        System.out.println(note_elevi.get("Marcel"));

        // declaram si initializam
        // nu este ordonat
        Map<String, Integer> luni = new HashMap<String, Integer>();

            luni.put("January", 1);
            luni.put("February", 2);
            luni.put("March", 3);
            luni.put("April", 4);


        System.out.println(luni.size());
        System.out.println(luni);

    }
}
