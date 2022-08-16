import java.util.Scanner;
public class salariominimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 
		 float salarioMinimo1; // salario minimo base
		 float salario; // salario do cliente
		float salariototal; // numero de salarios minimos
		
		salarioMinimo1 = (float) 1045.00;
		
		
		System.out.printf("Digite o seu salario ");
		 salario =  in.nextFloat();
		
		 salariototal = (float) (salario / 1045.00);
		 
		System.out.printf(" Você ganha um total de, %.1f salario minimo" ,salariototal);
	
	
		
		
		
		
		
		
	}

}
