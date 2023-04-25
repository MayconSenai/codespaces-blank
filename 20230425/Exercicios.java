/**
 * Exercicios
 */
public class Exercicios {

public void Exercicio08() {
    //ler idade e altura de 5 pessoas
    String[] pessoas = new String[5];
    int idade[] = new int[5];
    double altura[] = new double[5];
    for (int i = 0; i < altura.length; i++) {
        System.out.println("Informe o Nome: ");
        pessoas[i]=sc.next();
        System.out.println("Informe a idade: ");
        idade[i]=sc.nextInt(i);
        System.out.println("Informe a altura: ");
        altura[i]=sc.nextDouble();
        System.out.println("===================");
    }
    for (int i = 4; i >= 0; i--) {
        System.out.println("nome: "+pessoas[i] + " tem " + ", Idade: "+idade[i]+" Altura: "+altura[i]);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
public void Exercicio09() {
    //soma dos quadrados dos elementos do vetor
    int vetor[] = new int[]{1,2,3,4,5,6,7,8,9,10};
    int soma = 0;
    for (int i = 0; i < vetor.length; i++) {
        soma+=vetor[i]*vetor[i];
    }
    System.out.println("A soma dos quadrados dos elementos do vetor é: "+soma);
    }
}