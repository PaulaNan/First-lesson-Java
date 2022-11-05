public class While {
    public static void main(String[] args) {
        // zona de cod care se repeta atata timp cat conditia e true

        // masina merge atata timp cat are benzina
        int litri_benzina = 10;
        while (litri_benzina>0) {
            System.out.println("acceleram");
            // scadem din benzina
            litri_benzina = litri_benzina -1;

            // se aprinde becul la benzina cand se apropie de 0
            if (litri_benzina<=3) {
                System.out.println("se aprinde becul rosu");
            }
        }
        System.out.println("nu mai este benzina");
    }
}
