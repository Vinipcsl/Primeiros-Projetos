import java.util.Scanner;

public class Media {
	 public static void main (String[] args) {
		 Scanner in = new Scanner(System.in);

	float media1;
		 float media2;
		 float mediaM1;
		 float mediaM2;
		 
		 media1 = (8+9+7) / 3;
		 media2 = (4+5+6) / 3;
	 mediaM1 = media1 + media2; 
	mediaM2 = (media1 + media2) / 2; 
	 System.out.printf("A media da soma entre 8, 9 e 7, � igual �, %.2f%n", media1);
	 
	 System.out.printf("A media da soma entre 4, 5 e 6 � igual �, %.2f%n", media2);
	 
	 System.out.printf("O valor da soma entre a primeira m�dia e a segunda m�dia � de, %f%n", mediaM1);
	 
	 System.out.printf("A media da soma entre as duas m�dias � igual �, %f%n", mediaM2);
	 
	 }
}
