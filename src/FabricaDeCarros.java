import java.util.Scanner;
public class FabricaDeCarros {

    public static void main(String[] args){

            Scanner scan = new Scanner(System.in);
            int custoFabrica;
            int distribuidor;
            int porcentagemdistribuidor;
            int percentualImpostos;

            //Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

            System.out.println("Entre com o custo de Fabrica: " );
            custoFabrica = scan.nextInt();
            System.out.println("Entre com a porcentagem do distribuidor: ");
            porcentagemdistribuidor = scan.nextInt();
            System.out.println("Entre com o valor dos impostos: ");
            percentualImpostos = scan.nextInt();

            distribuidor = custoFabrica + (((custoFabrica * porcentagemdistribuidor) / 100) +((custoFabrica * percentualImpostos)/ 100));


            System.out.println("O valor do novo carro é: " + distribuidor);

    }
}
