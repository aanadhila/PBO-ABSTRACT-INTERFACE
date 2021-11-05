/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu10.interfaceLatihan;

/**
 *
 * @author LENOVO
 */
public class PascaSarjana extends Mahasiswa implements ICumlaude,IBerprestasi{

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }

    public PascaSarjana(String nama) {
        super(nama);
    }
    
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan THESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
    
}
