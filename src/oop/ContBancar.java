package oop;

public class ContBancar {
    // oop = programare orientata pe obiect
    // clasa este definitia unui concept

    // obiectul e instanta unei clase, implementarea ei (obiect de tip "numele clasei)

    // contine fields = atribute = variabile

    // metodele sunt actiuni ce pot fi facute de obiecte

    //atributele contului
    String titulatCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercariActivare = 0;

    // constructorul are roulu de a impune date de start (obligatorii)


    public ContBancar(String titulatCont, String iban) {
        this.titulatCont = titulatCont;
        this.iban = iban;

    }

    // mtode = actiunile clasei
    public void interogareSold() {
        System.out.println("Iban: " + " " + this.iban);
        System.out.println("Titular" + " " +this.titulatCont);
        System.out.println("Activ: " + this.activ);
        System.out.println("Sold: " + this.sold);
        System.out.println("nr incercari gresite " +this.incercariActivare);
        System.out.println("............................");
    }

    public void activareCont(int pinUtilizator) {
        // modifica activ in true
        System.out.println("Buna " + this.titulatCont);
        if (pinUtilizator == this.pin) {
            this.activ = true;
            System.out.println("activat cu succes");
        } else {
            System.out.println("pin gresit");
            this.incercariActivare++;

        }

    }
    public void alimentareCont(double suma_depusa) {
        this.sold = suma_depusa + this.sold;
        System.out.println("Buna " + this.titulatCont);
        System.out.println("Ati depus cu succes suma de" + suma_depusa  + " aveti in cont suma de : " + this.sold );
    }

    public  void plataCard(double suma_cheltuita) {
        System.out.println("Buna " + this.titulatCont);
        // pot cheltui doar ce e in sold
        if (suma_cheltuita <= this.sold) {
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit suma " + suma_cheltuita);
            System.out.println("Mai ai " + this.sold);
        } else  {
            System.out.println("Sold insuficient");
        }

    }
}

