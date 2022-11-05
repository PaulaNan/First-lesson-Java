package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // initializam obiecte
        ContBancar cont1 = new ContBancar("Paula", "ro001");
        ContBancar cont2 = new ContBancar("maria", "ro002");


        cont1.activareCont(7777);

        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);


        cont1.alimentareCont(300.5);
        cont1.interogareSold();


        cont2.alimentareCont(770);
        cont2.alimentareCont(150);
        cont2.interogareSold();

        cont1.plataCard(500);
        cont2.plataCard(450.5);



    }
}

