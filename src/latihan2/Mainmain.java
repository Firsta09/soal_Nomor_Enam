/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Firsta
 */
public class Mainmain {
    public static void main(String[] args) {
        Mahasiswa mm = new Mahasiswa();
        mm.setName("Lusi");
        mm.setUniversity("Universitas Islam Negeri");
        mm.setJurusan("Tekniik Informatika");
        mm.University= "Univ Mana";
        System.out.println("Mahasiswa :" +mm.getName() +"\nKuliah di :" +mm.getUniversity() 
                           +"\nMengambil jurusan:" +mm.getJurusan());
    }
}
