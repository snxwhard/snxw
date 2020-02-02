package copia;

/**
 *
 * @author SnxwHard
 */
import javax.swing.JOptionPane;

public class Operacion {

    String opcion;
   
    public int obtenerOpcion() {

        opcion = "Alumnos INA\n";
        opcion += "1.Registrar Alumno\n";
        opcion += "2.editar lista de alumnos\n";
        opcion += "3.Lista de Alumnos\n";
        opcion += "4.Dar de baja a Alumno\n";
        opcion += "5.Salir\n";
        opcion += "Escoja una Opción:\n";
        return Integer.parseInt(JOptionPane.showInputDialog(opcion));
    }

    public String obtenerCarnet() {
        opcion = "Carnet de Alumno\n";
        return JOptionPane.showInputDialog(opcion);
    }

    public String obtenerNombre() {
        opcion = "Introduzca Nombre de Alumno\n";
        return JOptionPane.showInputDialog(opcion);
    }

    public String obtenerApellido() {
        opcion = "Introduzca Apellido de Alumno\n";
        return JOptionPane.showInputDialog(opcion);
    }

    public int obtenerEdad() {
        opcion = "Introduzca Edad de Alumno\n";
        return Integer.parseInt(JOptionPane.showInputDialog(opcion));
    }
    

    public void cerrarPrograma() {

        JOptionPane.showMessageDialog(null, "Gracias por usar este programa bye se te quiere mucho.Bendiciones c:");
        System.exit(0);
    }
}
