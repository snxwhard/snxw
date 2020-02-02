package para_divertirse;

import javax.swing.JOptionPane;
/**
 *
 * @author SnxwHard
 */
public class segundo {
     
    public static void main(String[] args) {
     
        String texto=JOptionPane.showInputDialog("pon el numero de arreglo que deseas:");
        int num[]=new int[Integer.parseInt(texto)];
 
            rellenar(num,1,10);
            mostrar(num);
    }
 
    public static void rellenar(int Arra[], int a, int b){
        
        for(int i=0;i<Arra.length;i++){
            Arra[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void mostrar(int lista[]){
        JOptionPane.showMessageDialog(null, "Los Arreglos Apareceran en la consola");
        for(int i=0;i<lista.length;i++){
            System.out.println("Posicion "+i+" esta el numero "+lista[i]);
        }
    }
}





