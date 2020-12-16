package LogIn;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TaoTk_C implements Initializable {
    @FXML
    private  Label label;

    @FXML
    private TableView<Account> table;

    @FXML
    private TableColumn<Account, Integer> c_manv;

    @FXML
    private TableColumn<Account, String> c_tendangnhap;

    @FXML
    private TableColumn<Account, String> c_mk;

    @FXML
    private TableColumn<Account, String> c_tennv;

    @FXML
    private TableColumn<Account, String> c_chucvu;

    @FXML
    private TextField tendangnhap;

    @FXML
    private TextField matkhau;

    @FXML
    private TextField hoten;

    @FXML
    private TextField sdt;

    @FXML
    private TextField manv;

    @FXML
    private ComboBox<String> chucvu;

    @FXML
    private Button taotk;

    @FXML
    private Button reset;

    @FXML
    private Button back;

    @FXML
    private  TextField ngay;

    @FXML
    private  TextField nam;

    @FXML
    private  TextField thang;

    @FXML
    ObservableList<String> listChucvu = FXCollections.observableArrayList("Nhân viên","Quản lý kho","Quản lý gian hàng","Admin");



    private ObservableList<Account> accountsList;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        chucvu.setItems(listChucvu);
        accountsList = FXCollections.observableArrayList();

        // chưa liên kết column, table
//        c_manv.setCellFactory(new PropertyValueFactory<Account,Integer>("Chức vụ"));
//        c_chucvu.setCellFactory(new PropertyValueFactory<Account,String>("chucvu"));
    }
    public void taoTK (ActionEvent event) throws IOException {
        Account ac = new Account();
        ac.setChucvu(chucvu.getValue());
        ac.setMaNV(Integer.parseInt(manv.getText()));
        ac.setNgay(Integer.parseInt(ngay.getText()));
        ac.setThang(Integer.parseInt(thang.getText()));
        ac.setNam(Integer.parseInt(nam.getText()));
        ac.setPass(matkhau.getText());
        ac.setSdt(Integer.parseInt(sdt.getText()));
        ac.setTenTK(tendangnhap.getText());
        ac.setTen(hoten.getText());

        this.setReset(event);


    }

    public void setReset(ActionEvent event) throws  IOException {
        windows w = new windows();
        Stage window = w.setStage("TaoTk", event);
        window.show();
    }

    public void setBack(ActionEvent event) throws  IOException {
        windows w = new windows();
        Stage window = w.setStage("Admin", event);
        window.show();
    }
}