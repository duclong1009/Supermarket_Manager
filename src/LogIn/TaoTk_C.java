package LogIn;

import DAO.Account_DAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import tacnhan.Account;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
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
    private TableColumn<Account, String> c_sdt;

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
        try {
            accountsList = new Account_DAO().getAll();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        c_tennv.setCellValueFactory(new PropertyValueFactory<Account,String>("ten"));
        c_mk.setCellValueFactory(new PropertyValueFactory<Account,String>("pass"));
        c_tendangnhap.setCellValueFactory(new PropertyValueFactory<Account,String>("tenTK"));
        c_manv.setCellValueFactory(new PropertyValueFactory<Account,Integer>("maNV"));
        c_chucvu.setCellValueFactory(new PropertyValueFactory<Account,String>("chucvu"));
        c_sdt.setCellValueFactory(new PropertyValueFactory<Account,String>("sdt"));
        table.setItems(accountsList);
    }
    public void taoTK (ActionEvent event) throws IOException {
        Account_DAO acc = new Account_DAO();
        Account ac = new Account();
        ac.setChucvu(chucvu.getValue());
        ac.setMaNV(manv.getText());
        Date tmp = new Date(Integer.parseInt(nam.getText()),Integer.parseInt(thang.getText()),Integer.parseInt(ngay.getText()));
        ac.setPass(matkhau.getText());
        ac.setSdt(sdt.getText());
        ac.setTenTK(tendangnhap.getText());
        ac.setTen(hoten.getText());
        try {
            acc.insert(ac);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        accountsList.add(ac);


    }

    public void setXoa(ActionEvent event) throws  IOException {
        Account_DAO d = new Account_DAO();
        Account sp = table.getSelectionModel().getSelectedItem();
        try {
            d.delete(sp);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        accountsList.remove(sp);
    }

    public void setBack(ActionEvent event) throws  IOException {
        windows w = new windows();
        Stage window = w.setStage("Admin", event);
        window.show();
    }
}