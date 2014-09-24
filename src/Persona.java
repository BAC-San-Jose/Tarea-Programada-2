public class Persona {
    
    public String nombre;
    public String correo;
    public String tipoPrioridad;
    
    public Persona(String nombre, String correo, String tipoPrioridad){
        this.nombre = nombre;
        this.correo = correo;
        this.tipoPrioridad = tipoPrioridad;
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
}
