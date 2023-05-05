/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bilgisayarkavramlari16;

/**
 *
 * @author maytemur
 */
public class insan {

    int boy;
    int kilo;

    public insan() {

    }

    public insan(int boy, int kilo) {
        if (boy > 0 & kilo > 0) {
            this.boy = boy;
            this.kilo = kilo;
            
            System.out.println("boyu kilosu olan yeni bir insan oluştu");
        }
    }

    void yemek() {
        kilo++;
    }
}
