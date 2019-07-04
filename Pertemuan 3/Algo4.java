import java.util.*; //Import = kata kunci liberary

//
public class Algo4
{ 
	//class yang memuat metod main(), dan nama file disimpan dengan nama class public
	public static void main(String[] args) 
	{
	 	Scanner input = new Scanner(System.in); 
	 	//Scanner untuk menscan inputan yg telah di masukkan
	 	
	 	int x,y; 

	 	System.out.print("Masukkan Bilangan 1 = ");
	 	x = input.nextInt();
	 	System.out.print("Masukkan Bilangan 2 = ");
	 	y = input.nextInt();
	 	
	 	if(x > y )
	 	{
	 		System.out.println("Bilangan "+x+" Lebih Besar dari "+y);
	 	}else if (x < y) {
	 		System.out.println("Bilangan "+x+" Lebih Kecil dari "+y);
	 	}else{
	 		System.out.println("Bilangan "+x+" Sama Dengan "+y);
	 	}
	 }
}
	