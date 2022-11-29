/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sistema.simplebanco;

import Models.CuentaCorriente;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ShindouAstrea
 */
public class IngresarDepositoController  {

    
    
    @FXML
    private TextField deposit_field;
    @FXML
    private Button deposit_button;
    
    
    @FXML
    private Button volver_button;
    
    CuentaCorriente cuentaCorriente = CuentaCorriente.getInstance();

    @FXML
    private void deposit(ActionEvent event) throws IOException {
        long montoADepositar = Long.parseLong(deposit_field.getText());
        long montoActual = cuentaCorriente.getMoney();
        cuentaCorriente.setMoney(montoADepositar+montoActual);
        mostrarAlertInfo();
    }

    @FXML
    private void volver(ActionEvent event) throws IOException {
        App.setRoot("menuPrincipal");
    }
    @FXML
    private void mostrarAlertInfo() throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Info");
        alert.setContentText("Dinero Depositado Exitosamente");
        alert.showAndWait();
        App.setRoot("menuPrincipal");
    }
    @FXML
    private void mostrarAlertConfirmation() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmacion");
        alert.setContentText("¿Deseas hacer otra accion?");
        alert.showAndWait();
       
    }
}
