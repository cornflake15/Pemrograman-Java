package com.tutorial;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // instansiasi atau membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa(); // Pakai constructor tanpa argumen
        System.out.println("Nama Mahasiswa: " + mahasiswa1.nama);
        System.out.println("NIM Mahasiswa: " + mahasiswa1.nim);
        System.out.println("Prodi Mahasiswa: " + mahasiswa1.prodi);
        System.out.println("IPK Mahasiswa: " + mahasiswa1.ipk);
        System.out.println("Umur Mahasiswa: " + mahasiswa1.umur);

        System.out.println("\n");
        Mahasiswa mahasiswa2 = new Mahasiswa("Ucup", "200010111", "Sistem Komputer", 3.3, 20);
        System.out.println("Nama Mahasiswa: " + mahasiswa2.nama);
        System.out.println("NIM Mahasiswa: " + mahasiswa2.nim);
        System.out.println("Prodi Mahasiswa: " + mahasiswa2.prodi);
        System.out.println("IPK Mahasiswa: " + mahasiswa2.ipk);
        System.out.println("Umur Mahasiswa: " + mahasiswa2.umur);

        System.out.println("Memulai Proses Perkuliahan");

        mahasiswa2.setStatusKelas("Malam");
        mahasiswa2.setStatusPerwalian(false);

        System.out.println("Status Kelas Mahasiswa: " + mahasiswa2.getStatusKelas());
        System.out.println("Status Perwalian Mahasiswa: " + mahasiswa2.getStatusPerwalian());

    }
}