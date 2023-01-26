package pp01clinicaldental;

public class Servicios {
    private String tipoServicio;
    private double precioServicio;
    private byte numSesiones;

    public Servicios(){
        this.numSesiones=0;
        this.tipoServicio="";
        this.precioServicio=0.00;
    }
    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public double getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(double precioServicio) {
        this.precioServicio = precioServicio;
    }

    public byte getNumSesiones() {
        return numSesiones;
    }

    public void setNumSesiones(byte numSesiones) {
        this.numSesiones = numSesiones;
    }
    
    
    
}
