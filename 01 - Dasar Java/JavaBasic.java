public class JavaBasic {
	public static void main(String [] arg){
		// Operator Aritmatika
		int jml = 100 + 400;		// Operasi penjumlahan
		int kurang = 300 - 100;		// Operasi pengurangan
		double bagi = 50 / 7;		// Operasi pembagian
		double kali = 8.42 * 2.34;	// Operasi perkalian

		System.out.println("Hasil Penjumlahan: " + jml);
		System.out.println("Hasil Pengurangan: " + kurang);
		System.out.println("Hasil Pembagian: " + bagi);
		System.out.println("Hasil Perkalian: " + kali);

		int luaspersegipanjang;
		int luassegitigaint;
		double luassegitigadouble;

		luaspersegipanjang = jml * kurang;
		System.out.println("Luas Persegi Panjang: " + luaspersegipanjang);

		System.out.println("Luas Segitiga: " + jml * kurang / 2);

		// Konversi operasi aritmatika double menjadi integer
		luassegitigaint = (int)(bagi * kali / 2);
		System.out.println("Luas Segitiga Int: " + luassegitigaint);

		// Konversi variabel kurang menjadi double
		luassegitigadouble = kali * Double.valueOf(kurang) / 2;
		System.out.println("Luas Segitiga double: " + luassegitigadouble);

	}
}
