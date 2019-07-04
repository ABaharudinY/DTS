import java.util.*; //Import = kata kunci liberary

//
public class Algo1{ 
	//class yang memuat metod main(), dan nama file disimpan dengan nama class public
	public static void main(String[] args) 
	{
	 	Scanner sc = new Scanner(System.in); 
	 	//maksudnya perintah diatas =  scanner di gantikan dengan variabel sc
	 	//Scanner untuk menscan inputan yg telah di masukkan
	 	int x = 1;
	 	int y = 1;
	 	int a;
	 
	 	System.out.print("Masukkan Angka = ");
	 	//System.out.println = untuk mencetak
	 	a = sc.nextInt(); 
	 	//nextInt = menampilkan bilangan interger
	 	//nextfloat = menampilkan bilangan float
	 	
	 	while(y !=a ){
	 		//Ketika y bukan sama dengan a 
	 		x = x + 1;//maka cetak x + 1 
	 		y = x * x;//kembali ke langkah 3
	 }
	 System.out.println("Nilai Akar  = "+x);
   }
}


