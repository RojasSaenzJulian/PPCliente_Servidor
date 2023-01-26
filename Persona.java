
package pp01clinicaldental;

public class Persona {
    private String nombre;
    private String apellidos;
    private byte edad;
    
    // Contructor
    public Persona(){
        this.nombre="";
        this.apellidos="";
        this.edad=0;
    } 
    
    //Get and Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
}
