package com.tutorial;

public class Mahasiswa {
	String nama;
    String nim;
    String prodi;
    double ipk;
    int umur;
	String statuskelas;
	String statusperwalian;
	int skkm = 0;

	public Mahasiswa(){	// Constructor tanpa argumen
		// Variabel default
		this.nama = "Belum ada";
		this.nim = "000000000";
		this.prodi = "Belum ada";
		this.ipk = 0.0;
		this.umur = 0;
	}

	// Overloading constructor dengan argumen
	public Mahasiswa(String nama, String nim, String prodi, double ipk, int umur){
		// Varibel default
		this.nama = nama;
		this.nim = nim;
		this.prodi = prodi;
		this.ipk = ipk;
		this.umur = umur;
	}

	public void setStatusKelas(String statuskelas){
		if(statuskelas == "Pagi"){
			this.statuskelas = statuskelas;
		}
		else if(statuskelas == "Malam"){
			this.statuskelas = statuskelas;
		}

	}

	public void setStatusPerwalian(Boolean statusperwalian){
		if(statusperwalian == true){
			this.statusperwalian = "Sudah Perwalian";
		}
		else{
			this.statusperwalian = "Belum Perwalian";
		}

	}

	public String getStatusKelas(){
		return this.statuskelas;
	}

	public String getStatusPerwalian(){
		return this.statusperwalian;
	}

}
