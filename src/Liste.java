import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram lista
        List<String> fructe = new ArrayList<>();

        // adaugam elemente
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //cum luam elemente din lista
        System.out.println(fructe.get(0));

        // cum aflam indexul
        System.out.println(fructe.indexOf("banana"));

        System.out.println(fructe.isEmpty()); // intrebam daca lista e goala.

        if (!fructe.isEmpty()) {    // daca nu e goala...
            System.out.println("mergem la piata");
        } else {
            System.out.println("nu mergem la piata");
        }

        // eliminan elementele
        //fructe.clear();

        // scoatem elemente
        fructe.remove("mar");

        // printam elementele
        System.out.println(fructe);

        // dimensiunea listei
        System.out.println(fructe.size());

        // declaram si initializam o lista imutabila
        List<Integer> lista = Arrays.asList(new Integer[]{1, 33, 77});
        System.out.println(lista);

        // declaram o lista dinamica
        String[] flowers = {"Lalea", "Trandafir", "Ghiocel", "Zambila"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        System.out.println(flowerList);

        // aflam unde este un element - Trandafir
        int trandafir_index = flowerList.indexOf("Trandafir");

        // stergem din lista
        flowerList.remove(trandafir_index);
        System.out.println(flowerList);


    }
}
