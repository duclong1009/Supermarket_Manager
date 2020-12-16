package LogIn;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogIn_Controller {
    @FXML
    private Button DangNhap;

    @FXML
    private TextField Taikhoan;

    @FXML
    private TextField Matkhau;

    public void LogIn (ActionEvent event) throws IOException {
        String taikhoan = Taikhoan.getText();
        String matkhau = Matkhau.getText();
              Parent root = FXMLLoader.load(getClass().getResource(("Admin.fxml")));
              Scene sc  = new Scene(root);
              Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
              window.setScene(sc);
              window.setTitle("Siêu thị Ngọc Long");
              window.show();
    }
}
