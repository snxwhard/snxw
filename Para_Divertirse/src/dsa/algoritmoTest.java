package copia;
/**
 *
 * @author SnxwHard
 */
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class algoritmoTest {

    public static void main(String[] Args)  {

        int opcione = 0;
        
        
        List<Alumno> listaDeAlumnos = new ArrayList<Alumno>();
        Operacion opcionesUsuario = new Operacion();

        while (opcione != 5) {

            opcione = opcionesUsuario.obtenerOpcion();
            if (opcione == 1) {
                Alumno INAAlumno = new Alumno();
                INAAlumno.setCarnet(opcionesUsuario.obtenerCarnet());
                
                INAAlumno.setNombre(opcionesUsuario.obtenerNombre());
                
                INAAlumno.setApellido(opcionesUsuario.obtenerApellido());
                
                INAAlumno.setEdad(opcionesUsuario.obtenerEdad());

            }
            
            if (opcione == 2){
                 
                JOptionPane.showMessageDialog(null,"alch nose como poner esto :c");
            
            }
            
             if (opcione == 3){
                 
                JOptionPane.showMessageDialog(null,"tampoco se como poner esto :c");
            
            }
             
             
              if (opcione == 4){
                 
                JOptionPane.showMessageDialog(null,"peor se como poner esto :c");
            
            }
            
            
        }

        opcionesUsuario.cerrarPrograma();

    }

}
