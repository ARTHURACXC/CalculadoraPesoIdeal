
package calculadorapesoideal;


import java.util.Scanner;

/**
 *
 * @author ARTHUR CASTRO
 */
public class CalculadoraPesoIdeal {

    public static void main(String[] args)  {
     
    /*ENTRADA DE DADOS*/
    
    int i = 1;
    double ideal=0;
    String resp;
    Scanner teclado = new Scanner(System.in);
    
     do   {
         
   
        System.out.println("Nome: ");
        String nome = teclado.next();
        
        System.out.println("Peso: ");
        double peso = teclado.nextDouble();
        
        System.out.println("Altura: ");
        double altura = teclado.nextDouble();
        
        System.out.println("\n SEXO\n1-Masculino\n2-Feminino");
        int sexo = teclado.nextInt();
        
        /*PROCESSAMENTO*/
        
        switch (sexo) {
            case 1:
                {
                    ideal = ((72.7*altura)- 58);
                    break;
                }
            case 2:
                {
                    ideal = ((62.1*altura)-44.7);
                    break;
                }
            default:
                System.out.println("Escolha invalida!!!");
                break;
        }
            
        /*SAIDA DE DADOS*/
        
        if (peso>ideal){
            System.out.printf("\nSeu peso ideal: %.2f kg\nVoce esta acima do peso!\n", ideal);
        }else {
            System.out.printf("\nSeu peso ideal: %.2f kg\nVoce esta com o peso adequado!\n", ideal);
        }
        
         System.out.println("\nDeseja realizar um novo calculo? [S/N]");
         resp = teclado.next();
        
     } while (resp.equals("S")||resp.equals("s"));
       
                 
    
    }
    
}
