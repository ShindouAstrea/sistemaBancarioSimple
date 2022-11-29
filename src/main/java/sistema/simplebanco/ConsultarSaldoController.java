/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sistema.simplebanco;

import Models.CuentaCorriente;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author ShindouAstrea
 */
public class ConsultarSaldoController implements Initializable {

    @FXML
    private Button exit_button;
    @FXML
    private Button volver_button;
    @FXML
    private Label label_monto;
    
    CuentaCorriente cuentaCorriente = CuentaCorriente.getInstance();
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        label_monto.setText(Long.toString(cuentaCorriente.getMoney()));
    }    

    @FXML
    private void exit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void volver(ActionEvent event) throws IOException {
        App.setRoot("menuPrincipal");
    }
    
}
