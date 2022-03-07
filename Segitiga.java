import java.util.Scanner;
public class Segitiga {

	public static void main(String[] args) {
		Scanner userInput=new Scanner (System.in);
		
		double a,t, luas;
		
		System.out.println("Intputkan alas: ");
		a = userInput.nextDouble();
		
		System.out.println("Intputkan tinggi: ");
		t = userInput.nextDouble();
		
	
		luas= a * t / 2 ;
		System.out.println("\n Luas Segitiga: " + luas);

	}

}
