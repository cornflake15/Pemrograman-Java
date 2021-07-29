public class JavaArray{
	public static void main(String [] args){
		// Latihan Array
		int[] kumpulanangka = {10, 20, 33, 90, 57, 11, 30, 67};

		// Hitung nilai rata-rata dari array kumpulanangka
		int jml = 0;
		for(int angka: kumpulanangka){
			jml += angka;
		}

		System.out.println("Jumlah total nilai: " + jml);
		System.out.println("Rata-rata nilai: " + jml/kumpulanangka.length);
	}
}