import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 * Clase encargada de conocer la hora y fecha actuales
 */
public class Reloj extends Thread {
    public JLabel hora;
    /**
     * Metodo constructor
     * @param hora 
     */
    public Reloj (JLabel hora){
        this.hora = hora;
    }
    /**
     * Metodo que hace correr al reloj
     */
    public void run (){
        while (true){
            Date hoy = new Date();
            SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
            hora.setText(s.format(hoy));
        try {
            sleep(1000);
        }catch (Exception ex){
        
        }
        }
        
    }
}
