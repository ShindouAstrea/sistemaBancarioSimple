/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sistema.simplebanco;

import Models.User;
import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;




/**
 * FXML Controller class
 *
 * @author ShindouAstrea
 */
public class LoginController  {

    @FXML
    private Button login_button;
    @FXML
    private Button exit_button;
    @FXML
    private TextField user_field;
    @FXML
    private TextField pass_field;
    User data = User.getInstance();

    @FXML
    private void login(ActionEvent event) throws IOException {
        String rut = user_field.getText();
        int pass = Integer.parseInt(pass_field.getText());
        data.setPassword(pass);
        data.setRut(rut);
        App.setRoot("menuPrincipal");
    }

    @FXML
    private void exit(ActionEvent event) {
        Platform.exit();
    }
    @FXML
    private void mostrarAlertConfirmation(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmacion");
        alert.setContentText("¿Deseas realmente confirmar?");
        alert.showAndWait();
    }
    
    
}
