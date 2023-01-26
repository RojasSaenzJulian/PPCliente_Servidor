
package pp01clinicaldental;

public class Pacientes {
    private Persona datosPersonales;
    private char genero;
    private int numeroId;
    
    public Pacientes(){
        this.genero='\0';
        this.numeroId=0;
    }

   public Persona getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(Persona datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    
    
    
}
