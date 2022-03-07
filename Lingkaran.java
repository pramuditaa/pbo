import java.util.Scanner;
public class Lingkaran {

	public static void main(String[] args) {
		Scanner userInput=new Scanner (System.in);
		
		double phi = 3.14d;
		double r, keliling;
		
		System.out.println("Intputkan diameter lingkaran: ");
		r = userInput.nextDouble();
		
		keliling = r * phi ;
		System.out.println("\n Keliling Lingkaran: " + keliling);

	}

}
