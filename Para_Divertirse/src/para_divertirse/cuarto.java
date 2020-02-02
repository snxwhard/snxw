package para_divertirse;
/**
 *
 * @author SnxwHard
 */
import javax.swing.JOptionPane;
public class cuarto {
    
    public static void main(String[] args) {
        
    
    
        int[] numeros=new int[100];
        
        
        int suma=0;
        double media;
        
        
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
            suma+=numeros[i];
        }
        
        media=(double)suma/numeros.length; 
        JOptionPane.showMessageDialog(null, "La suma es:"+suma); 
        JOptionPane.showMessageDialog(null, "La suma es:"+media); 
        
        
}
    
    
}
