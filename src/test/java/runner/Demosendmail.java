package runner;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message.RecipientType;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Demosendmail {

    public static void main(String[] args) throws Exception {

        Properties props = new Properties();
        // Assuming you are sending email from localhost
        String host = "localhost";
          // Setup mail server
        props.put("mail.smtp.host", "127.0.0.1");
        props.put("mail.smtp.port", "25");
        props.put("mail.debug", "true");
        props.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress("kanchan@gmail.com"));
        message.setRecipient(RecipientType.TO, new InternetAddress("kpranav123@gmail.com"));
        message.setSubject("Notification");
        message.setText("Successful!", "UTF-8"); // as "text/plain"
        message.setSentDate(new Date());
        Transport.send(message);
    }

}

