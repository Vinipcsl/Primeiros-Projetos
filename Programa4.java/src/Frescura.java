import java.util.Scanner;
public class Frescura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 
		int num;
		int antecessor;
		int sucessor;
				
		System.out.println("Digite um numero "); 
		 num = in.nextInt();
	
		 antecessor = num-1;
			sucessor =  num+1;
		
		 System.out.printf("O antecessor do seu numero é %d%n", antecessor);
		 
		 System.out.printf("O sucessor do seu numero é %d%n", sucessor);
}
}