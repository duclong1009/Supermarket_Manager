package LogIn.QLySP;

import DAO.SP_Dao;
import LogIn.windows;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import tacnhan.SanPham;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Nhapkho implements Initializable {
    @FXML
    private Label label;

    @FXML
    private TableView<SanPham> table;

    @FXML
    private TableColumn<SanPham, Integer> c_masp;
    @FXML
    private TableColumn<SanPham, String> c_tensp;
    @FXML
    private TableColumn<SanPham, String> c_ncc;
    @FXML
    private TableColumn<SanPham, Integer> c_soluong;
    @FXML
    private TableColumn<SanPham, Integer> c_gianhap;
    @FXML
    private TableColumn<SanPham, String> c_hsd;
    @FXML
    private TableColumn<SanPham, String> c_ngaynhap;

    private static ObservableList<SanPham> spList;
    @FXML
    private TextField masp;
    @FXML
    private TextField tsp;
    @FXML
    private TextField nhacc;
    @FXML
    private TextField sl;
    @FXML
    private TextField gia;
    @FXML
    private TextField n1;
    @FXML
    private TextField t1;
    @FXML
    private TextField nam1;
    @FXML
    private TextField n2;
    @FXML
    private TextField t2;
    @FXML
    private TextField nam2;
    @FXML
    private TextField mncc;



    public void initialize(URL url, ResourceBundle resourceBundle) {
        spList = FXCollections.observableArrayList();
        try {
            spList = new SP_Dao().getAll();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        c_soluong.setCellValueFactory(new PropertyValueFactory<SanPham,Integer>("soLuong"));
        c_masp.setCellValueFactory(new PropertyValueFactory<SanPham,Integer>("maSP"));
        c_ncc.setCellValueFactory(new PropertyValueFactory<SanPham,String>("tenNCC"));
        c_tensp.setCellValueFactory(new PropertyValueFactory<SanPham,String>("tenSP"));
        c_gianhap.setCellValueFactory(new PropertyValueFactory<SanPham,Integer>("giaNhap"));
        c_ngaynhap.setCellValueFactory(new PropertyValueFactory<SanPham,String>("soLuong"));
        c_hsd.setCellValueFactory(new PropertyValueFactory<SanPham,String>("HSD"));
        table.setItems(spList);


    }

    public void setThem (ActionEvent event) throws IOException {
        SP_Dao ss = new SP_Dao();
        SanPham sanPham = new SanPham();
        sanPham.setMaSP(masp.getText());
        sanPham.setTenSP(tsp.getText());
        sanPham.setSoLuong(Integer.parseInt(sl.getText()));
        sanPham.setGiaNhap(Integer.parseInt(gia.getText()));
        sanPham.setHSD(new Date(Integer.parseInt(n1.getText()),Integer.parseInt(t1.getText()),Integer.parseInt(nam1.getText())));
        sanPham.setNgayNhap(new Date(Integer.parseInt(n2.getText()),Integer.parseInt(t2.getText()),Integer.parseInt(nam2.getText())));
        sanPham.setMaNCC(mncc.getText());
        sanPham.setVitri("Kho");
        sanPham.setGiaBan(0);
        try {
            ss.insert(sanPham);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        spList.add(sanPham);
    }

    public void setXoa(ActionEvent event) throws  IOException {
        SanPham sp = table.getSelectionModel().getSelectedItem();
        spList.remove(sp);
    }

    public void setBack(ActionEvent event) throws  IOException {
        windows w = new windows();
        Stage window = w.setStage("Admin", event);
        window.show();
    }

}
