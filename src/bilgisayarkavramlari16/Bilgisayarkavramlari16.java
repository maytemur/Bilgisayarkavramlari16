/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari16;

/**
 *
 * @author maytemur Polymorphism (çok şekillilik) Java ile nesne yönelimli
 * programlama 18 video youtube serisinin 24ncü videosu
 */
public class Bilgisayarkavramlari16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insan ali = new insan();
        muhendis veli = new muhendis();
        veli.boy = 180;
        System.out.println(veli.boy);
        veli.kilo = 90;
        veli.yemek();
        System.out.println(veli.kilo);
        veli.maas = 10000;
//        veli.zam(2000);
        veli.zam((float) 0.50); //burada float gönderip zam yaptık

        System.out.println(veli.maas);
        muhendis comez = new muhendis();
        System.out.println("comez muhendisin maasi " + comez.maas);
        ali.kilo = 80;
        ali.yemek();
        System.out.println(ali.kilo);

        muhendis superMuhendis = new muhendis(23000, 175, 49);
        System.out.println("superMuhendisin maasi boyu kilosu " + superMuhendis.maas);
        System.out.println(superMuhendis.boy);
        System.out.println(superMuhendis.kilo);
    }
}
