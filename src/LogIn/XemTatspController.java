package LogIn;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class XemTatspController {
    Button back ;


    public void setBack (ActionEvent event)throws IOException {
        windows w = new windows();
        Stage window = w.setStage("Admin", event);
        window.show();
    }
}
