package examplee2;

import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	
		int[] myArray1 = new int[7];
		int[] myArray2 = new int[7];
		
		randomAssignArray(myArray1);
		assignArray(myArray2);
		disPlayArray(myArray1);
		System.out.println("\n------------------------");
		
		disPlayArray(myArray2);
		System.out.println("\n------------------------");
		checkArray(myArray1, myArray2);
		
		
		
	}
	public static void disPlayArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + "\t");
		}
	}
	public static void randomAssignArray(int [] array1) {
		
		Random r = new Random();
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = r.nextInt(10);
		}
	}
	public static void assignArray(int[] array2) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz :");
		int sayi = input.nextInt();
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sayi * (i+1);
		}
		input.close();
	}
	public static void checkArray(int[] array1, int[] array2) {
		
		for (int i = 0; i < array1.length; i++) {
			
			if (array1[i] == array2[i]) {
				continue;
			}
			else {
				asa1Test(array1[i]);
				asa1Test(array2[i]);
			}
		}
	}
	public static void asa1Test(int sayi) {
		
		int sayac = 0;
		
		for (int j = 1; j <= sayi; j++) {
			if (sayi % j == 0) {
				sayac++;
			}
		}
		if (sayac == 2) {
			System.out.println(sayi + " Sayisi Asaldir.");
		}
		else {
			System.out.println(sayi + " Sayisi Asal Degildir.");
		}
	}
	
}
/*Soru 2
7 boyutlu iki ayrı dizi oluşturunuz. İlk diziyi, 0 ila 10 arasında (0 ila 10 dahil) rastgele sayılar ile doldurunuz.
İkinci dizinin ilk elamanını, kullanıcının belirleyeceği sayının,
çarpım tablosunda ifade edilen ilk 7 lik kısmı ile doldurunuz. Örneğin; kullanıcının gireceği sayı 5 ise,
dizinin ilk elamanı 5 (5X1), ikinci elamanı 10 (5X2), ücüncü elamanı 15 (5X3) şeklindeki değerler ile doldurulmalıdır.
İki dizinin birbirine eşit elamanları aynı indiste yer alıyor ise,
aynı indiste yer almayan elemanların asal sayı olup olmadığını bulunuz.
*/
