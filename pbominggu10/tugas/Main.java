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
public class Main {
    public static void main(String[] args) {
        Singa sg = new Singa("RAWR..","Kuning","SINGA",4);
        Keledai kd = new Keledai("Oik..","Abu-abu","Keledai",4);
        Gorilla gr = new Gorilla("Huhuhaha","Hitam","Gorilla",2);
        
        sg.displayBinatang();
        sg.displayMakan();
        sg.displayData();
        
        kd.displayBinatang();
        kd.displayMakan();
        kd.displayData();
        
        gr.displayBinatang();
        gr.displayMakan();
        gr.displayData();
    }
}
