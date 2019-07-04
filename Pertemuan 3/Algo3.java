import java.util.*; //Import = kata kunci liberary

//
public class Algo3
{ 
	//class yang memuat metod main(), dan nama file disimpan dengan nama class public
	public static void main(String[] args) 
	{
	 	Scanner input = new Scanner(System.in); 
	 	//Scanner untuk menscan inputan yg telah di masukkan
	 	double r;
	 	double l,k;
	 	double phi = 3.14;
	 	//float sama dengan double 

	 	System.out.print("Masukkan Jari-jari = ");
	 	//System.out.println = untuk mencetak
	 	r = input.nextInt();
	 	l=phi*r*r;
	 	k=2*phi*r;

	 	System.out.println("Luas Lingkaran     = "+l);
	 	System.out.println("Keliling Lingkaran = "+k);
	 }
}
	