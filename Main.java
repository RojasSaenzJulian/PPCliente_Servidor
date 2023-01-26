package pp01clinicaldental;
import javax.swing.JOptionPane;
/*Utilizando como tema central una Clínica Dental, cree un proyecto que contenga al
menos cinco clases con al menos tres atributos cada clase.
• Cree un constructor para predefinir los datos de un objeto.
• Cree los métodos encapsuladores: getters y setters.
• Adicionalmente, cree un objeto más para ingresar información personalizada.
• Realice todos los llamados necesarios en el método principal (Main).*/

//Julián Samuel Rojas Sáenz

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Pacientes pa=new Pacientes();
        Persona p=new Persona();
        Persona p02=new Persona();
        Doctores d=new Doctores();
        Servicios se=new Servicios();
        Sucursal s=new Sucursal();
        
        JOptionPane.showMessageDialog(null, "Bienvenido@ a la Clínica Dental\n"
                + "Complete la siguiente información: ");
        p.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del doctor/doctora: "));
        p.setApellidos(JOptionPane.showInputDialog("Ingrese los apellidos del/la doctor/a: "));
        p.setEdad(Byte.parseByte(JOptionPane.showInputDialog("Ingrese la edad del/la doctor/a: ")));
        d.setDatosPersonales(p);
        d.setGenero(JOptionPane.showInputDialog("Ingrese el género(m/f): ").charAt(0));
        d.setEspecialidad(JOptionPane.showInputDialog("Ingrese la especialidad del/la doctor/a: "));
        
        s.setProvinciaSucursal(JOptionPane.showInputDialog("Digite la provincia donde se encuentra la sucursal: "));
        s.setCantonSucursal(JOptionPane.showInputDialog("Digite el cantón en donde se ubica la sucursal: "));
        s.setNumSucursal(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la sucursal")));
        
        p02.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del paciente:"));
        p02.setApellidos(JOptionPane.showInputDialog("Ingrese los apellidos del paciente: "));
        p02.setEdad(Byte.parseByte(JOptionPane.showInputDialog("Ingrese la edad del paciente: ")));
        pa.setDatosPersonales(p02);
        pa.setGenero(JOptionPane.showInputDialog("Ingrese el género del paciente (m/f)").charAt(0));
        pa.setNumeroId(Integer.parseInt(JOptionPane.showInputDialog("Digíte el ID del paciente: ")));
    
        se.setTipoServicio(JOptionPane.showInputDialog("Ingrese el servicio que solicita el paciente: "));
        se.setNumSesiones(Byte.parseByte(JOptionPane.showInputDialog("Digite el número de sesiones que requiere el servicio: ")));
        se.setPrecioServicio(Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del servicio: ")));
        
        JOptionPane.showMessageDialog(null,"En la sucursal número "+s.getNumSucursal()+ " del cantón "+s.getCantonSucursal()+
                " en la provincia de "+s.getProvinciaSucursal()+", será atendido/a el/la paciente "+pa.getDatosPersonales().getNombre()+" "+pa.getDatosPersonales().getApellidos()+", cuya edad es"
                        + " de "+pa.getDatosPersonales().getEdad()+" años, género "+pa.getGenero()+" con el ID "+pa.getNumeroId()+"\n"
        +"Se le asignó al/la doctor/a "+d.getDatosPersonales().getNombre()+" "+d.getDatosPersonales().getApellidos()+" con la edad de "+d.getDatosPersonales().getEdad()
        +" años, género "+d.getGenero()+" y con la especiales de "+d.getEspecialidad()+". El/la paciente "+pa.getDatosPersonales().getNombre()+" "+pa.getDatosPersonales().getApellidos()+
                " ha solicitado el siguiente servicio llamado ( "+se.getTipoServicio()+" ) que consta de las siguientes caracteristicas: \n\n"
        +"*Número de sesiones: "+se.getNumSesiones()+"\n"+"*Precio del servicio: "+se.getPrecioServicio());
    
    }
    
    
}
