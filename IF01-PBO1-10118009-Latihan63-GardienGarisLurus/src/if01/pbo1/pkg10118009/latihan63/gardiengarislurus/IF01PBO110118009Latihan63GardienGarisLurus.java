/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan63.gardiengarislurus;

/**
 *Nama : Tassyakur Pasya
 *NIM : 10118009
 *Kelas : IF-01
 *Deskripsi Program : Gradien Garis Lurus
 * @author Lenovo
 */
public class IF01PBO110118009Latihan63GardienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Koordinat k1 = new Koordinat(2, 10, 5, 7);
         Koordinat k2 = new Koordinat(5, 1, 3, 12);
         
         System.out.println("Garis yang melalui titik (" +k1.getX1()+ ","+k1.getY1()+ ") dan ("+k1.getX2()+ ","+k1.getY2()+ ") Memiliki gradien sebesar " +k1.hitungGradien());
         System.out.println("Garis yang melalui titik (" +k2.getX1()+ ","+k2.getY1()+ ") dan ("+k2.getX2()+ ","+k2.getY2()+ ") Memiliki gradien sebesar " +k2.hitungGradien());
    }
    
    
}
