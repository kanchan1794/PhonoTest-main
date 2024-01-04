package runner;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSend {
    public static void main(String[] args) {
        sendEmail("Kpranav123@gmail.com","TEST","TEST");
    }
    public static void sendEmail(String recipient, String subject, String body) {
        // Set up mail server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com"); // Replace with your SMTP host
        properties.put("mail.smtp.port", "465"); // Replace with your SMTP port
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true"); // Enable authentication if required
        //properties.put("mail.smtp.starttls.enable", "true"); // Enable TLS

        // Set up authentication (if required)
        Authenticator authenticator = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("kanchan@clingmultisolutions.org", "Sammit@1113"); // Replace with your email and password
            }
        };

        // Create session with authentication
        Session session = Session.getInstance(properties, authenticator);

        try {
            // Create a default MimeMessage object
            MimeMessage message = new MimeMessage(session);

            // Set From: header field
            message.setFrom(new InternetAddress("kanchan@clingmultisolutions.org")); // Replace with your email

            // Set To: header field
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));

            // Set Subject: header field
            message.setSubject(subject);

            // Set the actual message
            message.setText(body);

            // Send message
            Transport.send(message);
            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
