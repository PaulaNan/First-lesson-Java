import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // evalueaza conditii si bifurca codul in functie de rezultat
        System.out.println("pornim radio");
        boolean piesa_frumoasa = false;
        if (piesa_frumoasa == true) {
            System.out.println("dau mai tare");
            System.out.println("incep sa cant");
        }
        System.out.println("oprim radio");
        // este nr par?
        int nr = 4;
        if (nr % 2 == 0) {
            System.out.println("numar par");
        } else {
            System.out.println("numar impar");
        }

        // este pozitiv?

        if (nr>0){
            System.out.println("este numar pozitiv");
        } else {
            System.out.println("nu este numar pozitiv");
        }

        // else, if else, else
        // luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu ora ");
        int ora = sc.nextInt();
        if (ora <0) {
            System.out.println("ora invalida");
        } else if (ora <=11) {
            System.out.println("Buna dimineata!");
        } else if (ora <= 18) {
            System.out.println("Buna ziua!");
        } else if (ora <= 22) {
            System.out.println("Buna seara");
        } else if (ora <= 24) {
            System.out.println("Noapte buna!");
        } else {
            System.out.println("Ora invalida");
        }

        // robot telefonic
        System.out.println("alege o optiune");
        int optiune = sc.nextInt();
        switch (optiune){
            case 0:
                System.out.println("meniul anterior");
                break;
            case 1:
                System.out.println("ai ales romana");
                break;
            case 2:
                System.out.println("ai ales engleza");
                break;
            default:
                System.out.println("optiune invalida");
        }
    }
}
