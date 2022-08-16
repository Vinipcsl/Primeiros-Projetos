public class programa {

public static void main(String[] args) {
    //Criar um objeto da classe Aluno
    //NomeClasse nomeObjeto = New NomeClasse();
    Aluno fulano = new Aluno();
    // acessar os tributos do objeto ( fulano ) com o operador ponto .
   
    fulano.matricula = 2;
    fulano.nome = "Fulano";
    fulano.n1 = 8.0;
    fulano.n2 = 9.0;
    fulano.faltas = 3;

    fulano.imprimirDados();
    
}

}
