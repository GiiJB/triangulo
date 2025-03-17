package triangulo;

/**
 *
 * @author Giovanna Jesus Borba
 * Data de edição 16/03/2025
 * Objetivo: Identificar se a figura é um triângulo através do tamanho de seus lados. Caso a figura seja um triângulo, também será identificado se ele é um triângulo equilátero, escaleno ou isósceles
 */

import java.util.Scanner;//Importação da classe Scanner

public class Triangulo {

    public static void main(String[] args) {
        //Criando objeto leitor que vai receber as informações digitadas pelo usuário
        Scanner leitor = new Scanner (System.in);
        
        //Declaração das variáveis que vão armazenar o tamanho dos lados
        int ladoA_int, ladoB_int, ladoC_int;
        
        //Entrada de dados
        System.out.print("Digite o tamamnho do lado A: ");
        ladoA_int = leitor.nextInt();
        System.out.print("Digite o tamamnho do lado B: ");
        ladoB_int = leitor.nextInt();
        System.out.print("Digite o tamamnho do lado C: ");
        ladoC_int = leitor.nextInt();
        
        //Processamento e saída de informações
        
        //Se um dos lados for maior que a soma dos dois outros lados
        if (ladoA_int >= (ladoB_int + ladoC_int) || ladoB_int >= (ladoA_int + ladoC_int) || ladoC_int >= (ladoA_int + ladoB_int)){
            System.out.println("Sua figura não é um triângulo");//O usuário será informado que a figura não corresponde a um triângulo
        }
            //Se todos os lados forem iguais
            else if(ladoA_int == ladoB_int && ladoA_int == ladoC_int && ladoB_int == ladoC_int){
                System.out.println("Seu triângulo é equilátero");//O usuário será informado que seu triângulo é equilátero
            }
            //Se dois lados forem iguais 
            else if(ladoA_int == ladoB_int || ladoB_int == ladoC_int || ladoA_int == ladoC_int){
                System.out.println("Seu triângulo é isósceles");//O usuário será informado que seu triângulo é isósceles
            }
            //Se não, significa que seus lados são diferentes 
            else if(!(ladoA_int == ladoB_int) && !(ladoA_int == ladoC_int) || !(ladoB_int == ladoC_int) && !(ladoB_int == ladoA_int) || !(ladoC_int == ladoA_int) && !(ladoC_int == ladoB_int)){
                System.out.println("Seu triângulo é escaleno");//Então o usuário será informado que seu triângulo é escaleno
            }
    }            
}
