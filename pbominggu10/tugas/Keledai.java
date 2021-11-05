/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu10.tugas;

/**
 *
 * @author LENOVO
 */
public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;

    public Keledai(String suara, String warnaBulu, String nama, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("=======================================");
        System.out.println("Ini adalah binatang KELEDAI");
    }

    @Override
    public void displayMakan() {
        System.out.println("Keledai adalah binatang pemamakan TUMBUHAN");
    }
        public void displayData(){
        System.out.println("Nama binatang = " + nama);
        System.out.println("Jumlah kaki   =" + jmlKaki);
        System.out.println("Suara         = " + suara);
        System.out.println("Wana bulu     = " + warnaBulu);
        System.out.println("=========================================");
        
    }
}
