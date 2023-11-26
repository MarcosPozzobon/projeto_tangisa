package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private TextField campoUsuario;

    @FXML
    private Button loginButton;


    @FXML
    void userLogin(ActionEvent event) throws IOException {

        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();
        if(usuario.equals("marcos") && senha.equals("senha")){
            //Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
            Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else{
            System.out.println("Falha ao realizar login.");
        }

    }
}
