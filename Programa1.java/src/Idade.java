import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	
	int ano;
	int mes;
	int dia;
	int totaldias;
	
	System.out.println("Escreva sua idade em anos");
	ano = input.nextInt();
	
	System.out.println("Escreva o mês");
	mes = input.nextInt();
	
	System.out.println("Escreva o dia");
	dia= input.nextInt();
	
	totaldias = (ano*365) + (mes*30) + dia;
	
	System.out.printf("Sua idade total em dias é, %d%n", totaldias);
	}

}
