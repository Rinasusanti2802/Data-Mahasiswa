/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author ASUS
 */
public class MainAPP {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "12345678");
        Mahasiswa mahasiswa2 = new Mahasiswa("Chika", "22345674");
        Mahasiswa mahasiswa3 = new Mahasiswa("Bambang", "22345886");
        System.out.println("Nama Mahasiswa: " + mahasiswa1.getNama() + ", NIM: " + mahasiswa1.getNim());
        System.out.println("Nama Mahasiswa: " + mahasiswa2.getNama() + ", NIM: " + mahasiswa1.getNim());
        System.out.println("Nama Mahasiswa: " + mahasiswa3.getNama() + ", NIM: " + mahasiswa1.getNim());
    }
}

