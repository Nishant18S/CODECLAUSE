import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmailClientApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI components
        TextField toField = new TextField();
        toField.setPromptText("To");

        TextField subjectField = new TextField();
        subjectField.setPromptText("Subject");

        TextArea bodyArea = new TextArea();
        bodyArea.setPromptText("Body");

        Button sendButton = new Button("Send");

        // Set up event handling for sending emails
        sendButton.setOnAction(e -> {
            String to = toField.getText();
            String subject = subjectField.getText();
            String body = bodyArea.getText();

            // Replace with your email and password
            EmailSender sender = new EmailSender("heynew0000234@gmail.com", "Test_Mail");
            try {
                sender.sendEmail(to, subject, body, null); // Change 'null' to attachment path if needed
                showAlert(Alert.AlertType.INFORMATION, "Email Sent", "Your email was sent successfully.");
            } catch (Exception ex) {
                showAlert(Alert.AlertType.ERROR, "Email Sending Failed", "An error occurred while sending the email.");
            }
        });

        // Layout setup
        VBox vbox = new VBox(10, toField, subjectField, bodyArea, sendButton);
        vbox.setPadding(new Insets(15));

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Email Client");
        primaryStage.show();
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
