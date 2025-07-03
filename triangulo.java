package triangulo;
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int ladoA_int, ladoB_int, ladoC_int;
        
        //Entrada de dados
        System.out.print("Digite o tamamnho do lado A: ");
        ladoA_int = leitor.nextInt();
        System.out.print("Digite o tamamnho do lado B: ");
        ladoB_int = leitor.nextInt();
        System.out.print("Digite o tamamnho do lado C: ");
        ladoC_int = leitor.nextInt();
        
        //Processamento e saída de informações
        
        if (ladoA_int >= (ladoB_int + ladoC_int) || ladoB_int >= (ladoA_int + ladoC_int) || ladoC_int >= (ladoA_int + ladoB_int)){
            System.out.println("Sua figura não é um triângulo");
        }
            else if(ladoA_int == ladoB_int && ladoA_int == ladoC_int && ladoB_int == ladoC_int){
                System.out.println("Seu triângulo é equilátero");
            }
            else if(ladoA_int == ladoB_int || ladoB_int == ladoC_int || ladoA_int == ladoC_int){
                System.out.println("Seu triângulo é isósceles");//O usuário será informado que seu triângulo é isósceles
            }
            else if(!(ladoA_int == ladoB_int) && !(ladoA_int == ladoC_int) || !(ladoB_int == ladoC_int) && !(ladoB_int == ladoA_int) || !(ladoC_int == ladoA_int) && !(ladoC_int == ladoB_int)){
                System.out.println("Seu triângulo é escaleno");//Então o usuário será informado que seu triângulo é escaleno
            }
    }            
}
