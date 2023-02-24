
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre_alumno = "Dino",
           apellido_paterno = "Amieva",
           apellido_materno = "Garza";
    int numero_cuenta = 2271009;
    String semestre = "segundo";
    String materias = "Programacion/12:30/13:00/";
    
    
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre_alumno +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su numero de cuenta es: " +numero_cuenta);
        System.out.println("El semestre que cursa es: " + semestre);
        System.out.println("Las materias y horarios que cursa es: " + materias);
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
