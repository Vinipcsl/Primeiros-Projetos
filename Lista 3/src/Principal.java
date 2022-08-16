import java.util.Scanner;

public class Principal {
	 

			public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);

		Calculo credo = new Calculo();

		double VelVeiculo, VelPermitida;

		System.out.print("Digite a velocidade permitida da rua: ");
		VelPermitida = in.nextDouble();

		System.out.print("Digite a velocidade que foi marcado: ");
		VelVeiculo = in.nextDouble();

		credo.chama(VelVeiculo, VelPermitida);

}
}