package application;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void login() {
        // Méthode de gestion de la connexion
        // Vous pouvez implémenter ici la logique de validation des identifiants
        // et la navigation vers d'autres parties de l'application en cas de succès
    }
}
