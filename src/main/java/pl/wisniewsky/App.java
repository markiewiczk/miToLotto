package pl.wisniewsky;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/main_scene_layout.fxml"));
        Scene mainScene = new Scene(root);

        stage.setScene(mainScene);
        stage.setTitle("Nasza Apliakcja Graficzna");
        stage.show();
    }
}
