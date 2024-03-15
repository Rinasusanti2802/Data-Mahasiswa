/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    private String nama;
    private String nim;

    // Constructor
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk NIM
    public String getNim() {
        return nim;
    }
}
