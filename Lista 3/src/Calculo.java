
public class Calculo {
	public void chama(double VelVeiculo1, double VelPermitida1) {
	
		if (VelVeiculo1 <= VelPermitida1) {
			System.out.println("Não haverá multa");
		}
		
	if (VelVeiculo1 >  VelPermitida1 && VelVeiculo1 <= VelPermitida1+10) {
		System.out.println("A multa é de R$ 50,00 de malandro");
		
	}
		if (VelVeiculo1 >= VelPermitida1+ 11 && VelVeiculo1 <= VelPermitida1+30 ) {
			System.out.println("A multa é de R$ 100,00 de malandro");
		}
		if (VelVeiculo1 >= VelPermitida1+31) {
			System.out.println("A multa é de R$ 300,00 de malandro");
		}
	}
	
	
}
