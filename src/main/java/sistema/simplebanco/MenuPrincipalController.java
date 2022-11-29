/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sistema.simplebanco;

import Models.User;
import java.io.IOException;
import java.util.HashSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;



/**
 * FXML Controller class
 *
 * @author ShindouAstrea
 */
public class MenuPrincipalController  {

    @FXML
    private Button whitedraw_button;
    @FXML
    private Button ask_button;
    @FXML
    private Button deposit_button;
    @FXML
    private Button moves_button;
    
    User data = User.getInstance();
    
    String usuario = data.getRut();
    

    @FXML
    private void deposit(ActionEvent event) throws IOException {
        App.setRoot("ingresarDeposito");
        
        
    }
    @FXML
    private void whitedraw(ActionEvent event) throws IOException {
        App.setRoot("girarDinero");
    }
    @FXML
    private void ask(ActionEvent event) throws IOException {
        App.setRoot("consultarSaldo");
    }
    @FXML
    private void seeMoves(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Funcionalidad en Mantenimiento");
        alert.setContentText("Lo sentimos , actualmente esta función no está disponible");
        alert.showAndWait();
    }
}
