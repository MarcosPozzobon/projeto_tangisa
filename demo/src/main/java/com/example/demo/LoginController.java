package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button campoLogin;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private TextField campoUsuario;

    @FXML
    void userLogin(ActionEvent event) {

        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();
        if(usuario.equals("marcos") && senha.equals("senha")){
            System.out.println("Login realizado com sucesso.");
        }else{
            System.out.println("Falha ao realizar login.");
        }
    }
}
