package LogIn;

import DAO.SP_Dao;
import LogIn.windows;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import tacnhan.SanPham;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class XemTatspController {
    @FXML
    private TableView<SanPham> table;

    @FXML
    private TableColumn<SanPham, Integer> c_masp;
    @FXML
    private TableColumn<SanPham, String> c_tensp;
//    @FXML
//    private TableColumn<SanPham, String> c_ncc;
    @FXML
    private TableColumn<SanPham, Integer> c_soluong;
    @FXML
    private TableColumn<SanPham, String> c_vitri;
    @FXML
    private TableColumn<SanPham, Integer> c_giaban;
    @FXML
    private TableColumn<SanPham, String> c_hsd;
//    @FXML
//    private TableColumn<SanPham, String> c_ngaynhap;

    private static ObservableList<SanPham> spList;
    @FXML
    private TextField masp;
    @FXML
    private TextField tsp;
//    @FXML
//    private TextField hsd;
//    @FXML
//    private TextField sl;
    @FXML
    private TextField giatien;

    @FXML
    private  Button tim;

    @FXML
    private Button back;



    public void initialize(URL url, ResourceBundle resourceBundle) {
        SP_Dao s = new SP_Dao();
        spList = FXCollections.observableArrayList();
        c_soluong.setCellValueFactory(new PropertyValueFactory<SanPham,Integer>("soLuong"));
        c_masp.setCellValueFactory(new PropertyValueFactory<SanPham,Integer>("maSP"));
        c_tensp.setCellValueFactory(new PropertyValueFactory<SanPham,String>("tenSP"));
        c_hsd.setCellValueFactory(new PropertyValueFactory<SanPham,String>("HSD"));
        c_vitri.setCellValueFactory(new PropertyValueFactory<SanPham,String>("vitri"));
        try {
            spList = s.getAll();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        table.setItems(spList);


    }
    public void setTim (ActionEvent event) throws  IOException  {

    }

    public void setBack (ActionEvent event)throws IOException {
        windows w = new windows();
        Stage window = w.setStage("Admin", event);
        window.show();
    }
}
