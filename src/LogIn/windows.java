package LogIn;

import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.TouchPoint;
import javafx.stage.Stage;

import java.io.IOException;

public class windows {
    public Stage setStage(String x, ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource((x+".fxml")));
        Scene sc  = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(sc);
        return window;
    }
}
