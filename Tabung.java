import java.util.Scanner;
public class Tabung {

	public static void main(String[] args) {
		Scanner userInput=new Scanner (System.in);
		
		double phi = 3.14d;
		double r, d, t, volume;
		
		
		System.out.println("Intputkan diameter: ");
		d = userInput.nextDouble();
		
		System.out.println("Intputkan tinggi: ");
		t = userInput.nextDouble();
		
		r = d/2;
	
		volume= phi * r * r *t;
		System.out.println("\n Volume tabung: " + volume);

	}

}
