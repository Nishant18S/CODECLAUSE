import javax.mail.*;
import javax.mail.internet.InternetAddress;
import java.util.Properties;

public class EmailReceiver {

    private final String username;
    private final String password;

    public EmailReceiver(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void receiveEmails() throws MessagingException {
        Properties props = new Properties();
        props.put("mail.store.protocol", "imaps");
        props.put("mail.imap.host", "imap.example.com");
        props.put("mail.imap.port", "993");

        Session session = Session.getInstance(props, null);
        Store store = session.getStore("imaps");
        store.connect(username, password);

        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);

        Message[] messages = inbox.getMessages();
        for (Message message : messages) {
            System.out.println("Subject: " + message.getSubject());
            System.out.println("From: " + InternetAddress.toString(message.getFrom()));
            System.out.println("Content: " + message.getContent().toString());
        }

        inbox.close(false);
        store.close();
    }
}
