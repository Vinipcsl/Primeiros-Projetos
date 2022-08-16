public class Aluno{
    //Atributos: dados comuns para cada objeto da classe
    int matricula;
    String nome;
    double n1;
    double n2;
    double n3;
    int faltas;

    // metodo (funções e procedimentos): comportamento("ações") que os obejtos da classe podem fazer
    // Um método tem a seguinte estrutura:
    //tipoRetorno nomeMetodo( lista de argumentos [ se houver] ){
    // Intruções...   
    //}

    void imprimirDados() {

    System.out.println(
            "Matricula: " + matricula + "\n" +
            "Nome: " + nome + "\n" +
            "N1: " + n1 + "\n" +
            "N2: " + n2 + "\n" +
            "N3: " + n3 + "\n" +
            "Faltas: " + faltas + "\n"

    );
}

}
