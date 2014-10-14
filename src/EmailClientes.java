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

/**
 * Clase usada para mandar los emails
 */
public class EmailClientes {
    String usuarioCorreo;
    String password;
    String rutaArchivo;
    String nombreArchivo;
    String asunto;
    String destinatario;
    
    /**
     * Metodo constructor de la clase
     * @param usuarioCorreo usuario del correo con el que se mandan los correos
     * @param password contraseña del correo electronico del banco
     * @param rutaArchivo ruta de la imagen del banco
     * @param nombreArchivo nombre del archivo de la imagen del banco
     * @param asunto asunto del correo
     */
    public EmailClientes(String usuarioCorreo, String password, String rutaArchivo, String nombreArchivo, String asunto){
        this.usuarioCorreo = usuarioCorreo;
        this.password = password;
        this.rutaArchivo = rutaArchivo;
        this.nombreArchivo = nombreArchivo;
        this.asunto = asunto;
    }   
    
    /**
     * Metodo que envia un email al cliente que confirma su llegada al banco y sus datos
     * @param cliente nombre del cliente
     * @param destinatario correo del cliente
     * @param Fecha fecha en que se atendio al cliente
     * @param Hora hora en que se atendio al cliente
     * @return boolean  sobre si se mando el mail
     */
    public boolean sendMail(String cliente, String destinatario, String Fecha, String Hora){
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
            texto.setText( "Estimado cliente "+cliente+" este es un correo de confirmacion de su llegada al banco el "
            + Fecha + " a las " + Hora);

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
    
    /**
     * Metodo que envia al cliente un email cuando es su turno de pasar a la caja
     * @param caja a la que tiene que pasar el cliente
     * @param cliente nombre del cliente
     * @param destinatario correo del cliente
     * @return boolean de si se mando el mail o no
     */
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
}
