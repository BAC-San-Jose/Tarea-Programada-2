public class Clientes {
    
    public String nombre;
    public String correo;
    public String tipoPrioridad;
    public String fecha;
    public String hora;
    
    public Clientes(String nombre, String correo, String tipoPrioridad, String fecha, String hora){
        this.nombre = nombre;
        this.correo = correo;
        this.tipoPrioridad = tipoPrioridad;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public String getTipoPrioridad(){
        return tipoPrioridad;
    }
    
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
