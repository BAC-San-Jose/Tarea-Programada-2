import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;


public class EmailClientes {
    String usuarioCorreo;
    String password;
    String rutaArchivo;
    String nombreArchivo;
    String asunto;
    String destinatario;
    
    public EmailClientes(String usuarioCorreo, String password, String rutaArchivo, String nombreArchivo, String asunto){
        this.usuarioCorreo = usuarioCorreo;
        this.password = password;
        this.rutaArchivo = rutaArchivo;
        this.nombreArchivo = nombreArchivo;
        this.asunto = asunto;
    }   

    public boolean sendMail(String caja, String cliente, String destinatario){
        this.destinatario = destinatario;
        try
        {
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", usuarioCorreo);
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props, null);
            BodyPart texto = new MimeBodyPart();
            texto.setText( "Estimado cliente "+cliente+" por favor pase a la " + caja);

            BodyPart adjunto = new MimeBodyPart();
            if (!rutaArchivo.equals("")){
                 adjunto.setDataHandler(
                    new DataHandler(new FileDataSource(rutaArchivo)));
                adjunto.setFileName(nombreArchivo);                
            }

            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            if (!rutaArchivo.equals("")){
                multiParte.addBodyPart(adjunto);
            }

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(usuarioCorreo));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(destinatario));
                message.setSubject(asunto);
            message.setContent(multiParte);

            Transport t = session.getTransport("smtp");
            t.connect(usuarioCorreo, password);
            t.sendMessage(message, message.getAllRecipients());
            t.close();
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }        
    }
    /*
    public static void main(String[] args){
        String clave = "AAAaaa123"; 
        EmailClientes e = new EmailClientes("tecbanco67@gmail.com",clave,"C:\\uno.jpg","TROLL","mell9413@hotmail.com","PRUEBA","TROLL!!");
        if (e.sendMail("hola")){
            JOptionPane.showMessageDialog(null,"El email se mandó correctamente");
        }else{
            JOptionPane.showMessageDialog(null,"El email no se mandó correctamente");
        }
    }
    */
}
