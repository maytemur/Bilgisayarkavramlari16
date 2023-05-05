/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bilgisayarkavramlari16;

/**
 *
 * @author maytemur
 */
public class muhendis extends insan {
    int maas;
    public muhendis(){
        this.maas = 7000;
        //bir mühendis tanımlandığında otomatik olarak maaşı 7000 olarak tanımlanmış oldu 
    }
    public muhendis(int maas){
        if (maas>0) {
            this.maas = maas;            
        } else {
            this.maas = 7000;
        }
    }
    public muhendis(int maas,int boy,int kilo){
        super(boy,kilo); //inheritence da üzerimizde olan class lar super altımızda olanlar subclasstır
        //burada insan olan ve boy kilosu olan üst class'ı çağırmış oluyoruz
        this.maas = maas;
    }
    int zam(){
        maas++;
        return maas;
        }
    //overloading
    int zam(int zamMiktari){
        maas += zamMiktari;
        return maas;
    }
    int zam(float zamOrani){
        maas *= (1+zamOrani);
        return maas;
    }
    //overriding
    void yemek(){
        kilo = kilo+2;
    }
    void yemek(int kilo){
        this.kilo +=kilo;
    }
}
