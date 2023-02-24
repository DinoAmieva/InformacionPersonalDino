
package informacionpersonal;

/**
 *
 * @author maryse
 * 
 * Programa para imprimir cadenas en Java 
 * 
 */

public class InformacionPersonal {

    String nombre = "Maritza",
           apellido_paterno = "Flores",
           apellido_materno = "Domínguez";
    int edad = 30;
    String fecha_nacimiento = "18/Julio/2008";
    String hobbies = "Leer";
    
    
    public void Informacion(){        
        System.out.println("El nombre completo de la persona es: " + nombre +" "+ apellido_paterno +" "+ apellido_materno );
        System.out.println("Su edad es: " + edad +" años ");
        System.out.println("Su fecha de nacimiento es: " + fecha_nacimiento);
        System.out.println("Su pasatiempo es: " + hobbies);
    }
    
    public static void main(String[] args) {
        InformacionPersonal informacion= new InformacionPersonal();
        informacion.Informacion();
                
    }
    
}
