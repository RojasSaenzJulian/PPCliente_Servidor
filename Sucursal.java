
package pp01clinicaldental;

public class Sucursal {
    private int numSucursal;
    private String provinciaSucursal;
    private String cantonSucursal;
    
    public Sucursal(){
        this.cantonSucursal="";
        this.numSucursal=0;
        this.provinciaSucursal="";
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public void setNumSucursal(int numSucursal) {
        this.numSucursal = numSucursal;
    }

    public String getProvinciaSucursal() {
        return provinciaSucursal;
    }

    public void setProvinciaSucursal(String provinciaSucursal) {
        this.provinciaSucursal = provinciaSucursal;
    }

    public String getCantonSucursal() {
        return cantonSucursal;
    }

    public void setCantonSucursal(String cantonSucursal) {
        this.cantonSucursal = cantonSucursal;
    }
    
    
    
}
