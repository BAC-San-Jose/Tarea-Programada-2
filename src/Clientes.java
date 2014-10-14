
/**
 * Clase Cliente para gestionar los clientes
 */
public class Clientes {
    
    /**
     * Declaracion de variables a utilizar
     */
    public String nombre;
    public String correo;
    public String tipoPrioridad;
    public String fecha;
    public String hora;
    
    /**
     * Constructor de la clase
     * Se asignan los datos de los clientes 
     */
    public Clientes(String nombre, String correo, String tipoPrioridad, String fecha, String hora){
        this.nombre = nombre;
        this.correo = correo;
        this.tipoPrioridad = tipoPrioridad;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    /**
     * Metodo utilizado para obtener el nombre del cliente
     * @return nombre del cliente
     */
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Metodo utilizado para obtener el correo del cliente
     * @return correo del cliente
     */
    public String getCorreo(){
        return correo;
    }
    
    /**
     * Metodo utilizado para obtener el tipo de prioridad del cliente
     * @return tipo de prioridad del cliente
     */
    public String getTipoPrioridad(){
        return tipoPrioridad;
    }
    
    /**
     * Utilizado para definir la prioridad de un cliente
     * @param prioridad 
     */
    public void setTipoPrioridad(String prioridad){
        this.tipoPrioridad = prioridad;
    }
    
    
    public String getFecha(){
        return fecha;
    }
    
    public String getHora(){
        return hora;
    }
}
