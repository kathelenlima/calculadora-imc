
package calculadoraimc;
//Importa a classe Scanner para ser utilizada aqui:
import java.util.Scanner;

public class CalculadoraSimples{
    
    public static void main(String [] args){
        
        //Declaração do Scanner:
        Scanner leitor = new Scanner(System.in);
        
        //Declaração das variaveis que serão utilizadas:
        float peso, altura, imc;
        
        //Leitura do teclado:
        //Informacao de instrucoes para o usuario:
        System.out.print("Informe o PESO: ");
        //Le e armazena o valor do peso:
        peso = leitor.nextFloat(); //Le um valor de ponto flutuante
        
        //Le e armazena o valor de altura:
        System.out.print("Informe a ALTURA: ");
        altura = leitor.nextFloat();
        
        //Calcula
        imc = peso / (altura * altura);
        
        //Imprime o resultado
        //Note que pode-se concatenar o resultado com a impressao do texto
        System.out.println("\n\tO IMC desta pessoa é: " + imc + "\n\n");
    }
}
