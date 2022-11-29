/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sistema.simplebanco;


import Models.CuentaCorriente;
import java.io.IOException;
import javafx.application.Platform;
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
public class GirarDineroController {

    @FXML
    private Button girar_buton;
    @FXML
    private Button volver_button;

    CuentaCorriente cuentaCorriente = CuentaCorriente.getInstance();
    @FXML
    private TextField withedraw_field;

    @FXML
    private void girar(ActionEvent event) throws IOException {
        long montoAGirar = Long.parseLong(withedraw_field.getText());
        long montoActual = cuentaCorriente.getMoney();
        if(montoActual<montoAGirar){
            mostrarAlertError();
        }else{
            cuentaCorriente.setMoney(montoActual-montoAGirar);
            mostrarAlertInfo();
        }
        
    }

    @FXML
    private void volver(ActionEvent event) throws IOException {
        App.setRoot("menuPrincipal") ;
    }
    @FXML
    private void mostrarAlertInfo() throws IOException {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setHeaderText(null);
    alert.setTitle("Info");
    alert.setContentText("Dinero Sacado Exitosamente");
    alert.showAndWait();
    App.setRoot("menuPrincipal");
        
    }
    @FXML
    private void mostrarAlertError() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("No posees fondos suficientes para hacer este retiro, verifica tu saldo o ingresa un monto menor");
        alert.showAndWait();
    }
}
