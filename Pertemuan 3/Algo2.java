import java.util.*; //Import = kata kunci liberary

//
public class Algo2
{ 
	//class yang memuat metod main(), dan nama file disimpan dengan nama class public
	public static void main(String[] args) 
	{
	 	Scanner sc = new Scanner(System.in); 
	 	//Scanner untuk menscan inputan yg telah di masukkan
	 	int a;
	 
	 	System.out.println("Masukkan Angka = ");
	 	//System.out.println = untuk mencetak
	 	a = sc.nextInt();

	 	//nextInt = menampilkan bilangan interger
	 	//nextfloat = menampilkan bilangan float
	 	if ((a % 2 ) == 0 )
	 	{
	 		System.out.println("Bilangan Genap = "+a);
	 	}else{
	 		System.out.println("Bilangan Ganjil = "+a);
	 	}
	 }
}
	