public class Functii {

        // functia este logica delimitata care poate fi refolosita
        // nu folosim spatii in nume
        // nu putem defini o functie in alta functie
        // apelam functia prin paramentru oferind argumente

        // nu are parametri, dar are return


        public static double piValue() {
            //double pi = 3.14;
            //return 3.14;
            // constanta(se scrie cu litere mari))care nu poate fi suprascrisa
            final double PI = 3.14;
            return PI;
        }

        public static double media(double a, double b, double c) {
            double media = (a+b+c) /3;
            return media;
    }
        public static void prinGreetingByName(String nume, String prenume){
            System.out.println("Buna ziua!" + nume + " " + prenume );
        }
        public static void prinGreeting() {
            System.out.println("Buna ziua!");


         }
        public static void main(String[] args) {
            prinGreeting(); // se apeleaza functia
            prinGreetingByName("Paula","Ion");

            System.out.println(media(3,3,3));
            double media1 = media(3122, 4255, 55);
            double media2 = media(1255, 2589, 487);
            System.out.println("media 1 este: " + media1);
            System.out.println("media 2 este: "+ media2);

            System.out.println(piValue());
            System.out.println();


        }

}
