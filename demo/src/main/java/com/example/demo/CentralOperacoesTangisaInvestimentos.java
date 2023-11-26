package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CentralOperacoesTangisaInvestimentos extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CentralOperacoesTangisaInvestimentos.class.getResource("test.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        // Adicione o arquivo CSS à cena

        stage.setTitle("Central de Operações Tangisa Investimentos v1.0");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}