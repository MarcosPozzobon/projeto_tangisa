package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class CentralOperacoesTangisaInvestimentos extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        String cssPath = getClass()
                .getResource("style.css").toExternalForm();
        FXMLLoader fxmlLoader = new FXMLLoader(CentralOperacoesTangisaInvestimentos.class.getResource("test.fxml"));
        Scene loginScene = new Scene(fxmlLoader.load(), 600, 400);

        stage.setTitle("Central de Operações Tangisa Investimentos v1.0");
        stage.setScene(loginScene);
        stage.setResizable(false);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}