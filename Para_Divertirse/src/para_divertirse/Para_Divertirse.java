package para_divertirse;

import javax.swing.JOptionPane;
/**
 *
 * @author SnxwHard
 */
public class Para_Divertirse {

    public static void main(String[] args) {
        
        int tam =11;
        int num[]=new int[tam];
        
        
        rellenarArray(num);
        mostrarArray(num);
       
    }
 
    
    public static void rellenarArray(int lista[]){
        
        
        JOptionPane.showMessageDialog(null,"por favor digite 10 numeros");
        for(int i=0;i<lista.length;i++){
            int Num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            lista[i]=(Num);
        }
    }
 
    public static void mostrarArray(int lista[]){
        System.out.println("Los 11 numeros que digito son:");
        for(int i=0;i<1;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
            JOptionPane.showMessageDialog(null,"el primer numero que ingreso es");
        }
        for(int i=1;i<2;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
            JOptionPane.showMessageDialog(null,"el segundo  numero que ingreso es");
        }
        for(int i=2;i<3;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
            JOptionPane.showMessageDialog(null,"el tercer numero que ingreso es");
            
        }    
        for(int i=3;i<4;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
            JOptionPane.showMessageDialog(null,"el cuarto numero que ingreso es");
            
        }    
        for(int i=4;i<5;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
            JOptionPane.showMessageDialog(null,"el quinto numero que ingreso es");
            
        }    
        for(int i=5;i<6;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
            JOptionPane.showMessageDialog(null,"el sexto numero que ingreso es");
            
        }    
        for(int i=6;i<7;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
            JOptionPane.showMessageDialog(null,"el septimo numero que ingreso es");
            
        }    
        for(int i=7;i<8;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
            JOptionPane.showMessageDialog(null,"el octavo numero que ingreso es");
            
        }    
        for(int i=9;i<10;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
            JOptionPane.showMessageDialog(null,"el noveno numero que ingreso es");
            
        }    
        for(int i=10;i<11;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
            JOptionPane.showMessageDialog(null,"el decimo numero que ingreso es");
            
        }    
            JOptionPane.showMessageDialog(null,"tenkiuh");
        
    }
}
        
        
   
