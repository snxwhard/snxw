package para_divertirse;
import java.util.Scanner;
/**
 *
 * @author SnxwHard
 */
public class sexta {
    public static void main(String[] args) {
         
        Scanner sn=new Scanner(System.in);
         
       
        System.out.println("Pon La Palabra");
         
        
        String frase=sn.nextLine(); 
         
        
        
        char caracteres[]=frase.toCharArray();
         
       
        for(int i=0;i<frase.length();i++){
            System.out.println(caracteres[i]);
        }
         
    }
}
