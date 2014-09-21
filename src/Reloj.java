import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Reloj extends Thread {
    public JLabel hora;
    
    public Reloj (JLabel hora){
        this.hora = hora;
    }
    
    public void run (){
        while (true){
            Date hoy = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
            hora.setText(s.format(hoy));
        try {
            sleep(1000);
        }catch (Exception ex){
        
        }
        }
        
    }
}
