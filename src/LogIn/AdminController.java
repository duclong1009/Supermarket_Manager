package LogIn;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import LogIn.QLTK.*;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    @FXML
    private Button back;

    @FXML
    private ComboBox<String> comboBox1;

    @FXML
    private ComboBox<String>comboBox2;

    @FXML
    private ComboBox<String>comboBox3;

    @FXML
    private ComboBox<String>comboBox4;

    @FXML
    private ComboBox<String>comboBox5;


    @FXML
    ObservableList<String> list1 = FXCollections.observableArrayList("Xem tất cả sản phẩm","Xem giao hàng","Xem kho","Xem sản phẩm bán gần đây");
    ObservableList<String> list2 = FXCollections.observableArrayList("Nhập kho","Xuất kho","Bán hàng","Giảm giá");
    ObservableList<String> list3 = FXCollections.observableArrayList("Xem hóa đơn bán hàng","Xem hóa đơn xuất kho","Xem hóa đơn nhập kho","Xem danh mục giảm giá");
    ObservableList<String> list4 = FXCollections.observableArrayList("Tạo hóa đơn bán hàng","Tạo danh mục xuất kho","Tạo hóa đơn nhập kho","Tạo danh mục giảm giá");
    ObservableList<String> list5 = FXCollections.observableArrayList("Cập nhật thông tin tài khoảng nhân viên","Tạo tài khoản nhân viên mới");
    public void setBack (ActionEvent event)throws IOException {
        windows w = new windows();
        Stage window = w.setStage("Login", event);
        window.show();
    }

    public void initialize (URL location, ResourceBundle resource) {
        comboBox1.setItems(list1);
        comboBox2.setItems(list2);
        comboBox3.setItems(list3);
        comboBox4.setItems(list4);
        comboBox5.setItems(list5);
    }


    public void comboBoxXemTCSP(ActionEvent event) throws IOException {
        HashMap<String, String> hc = new HashMap<String, String>();
        hc.put("Xem tất cả sản phẩm", "XemTatCaSanPham");
        hc.put("Xem giao hàng", "XemGiaoHang");
        hc.put("Xem kho", "XemGiaoHang");
        hc.put("Xem sản phẩm bán gần đây", "XemTatCaSanPham");
        String choice = comboBox1.getValue();
        windows w = new windows();
        Stage window = w.setStage(hc.get(choice), event);
        window.show();
    }

    public void comboBoxTaoTk(ActionEvent event) throws IOException {
        HashMap<String, String> hc = new HashMap<String, String>();
        hc.put("Cập nhật thông tin tài khoảng nhân viên", "XemTatCaSanPham");
        hc.put("Tạo tài khoản nhân viên mới", "TaoTK");
        String choice = comboBox5.getValue();
        windows w = new windows();
        Stage window = w.setStage(hc.get(choice), event);
        window.show();
    }

    public void quanlyHH(ActionEvent event) throws IOException {
        HashMap<String, String> hc = new HashMap<String, String>();
        hc.put("Nhập kho", "NhapKho");
        hc.put("Xuất kho", "XuatKho");
        hc.put("Bán hàng", "XemGiaoHang");
        hc.put("Giảm giá", "XemTatCaSanPham");
        String choice = comboBox2.getValue();
        windows w = new windows();
        Stage window = w.setStage(hc.get(choice), event);
        window.show();
    }

    public void xemDon(ActionEvent event) throws IOException {
        HashMap<String, String> hc = new HashMap<String, String>();
        hc.put("Xem hóa đơn bán hàng", "XemTatCaSanPham");
        hc.put("Xem hóa đơn xuất kho", "XemGiaoHang");
        hc.put("Xem hóa đơn nhập kho", "XemGiaoHang");
        hc.put("Xem danh mục giảm giá", "XemTatCaSanPham");
        String choice = comboBox3.getValue();
        windows w = new windows();
        Stage window = w.setStage(hc.get(choice), event);
        window.show();
    }

    public void taoDon(ActionEvent event) throws IOException {
        HashMap<String, String> hc = new HashMap<String, String>();
        hc.put("Tạo hóa đơn bán hàng", "XemTatCaSanPham");
        hc.put("Tạo danh mục xuất kho", "XemGiaoHang");
        hc.put("Tạo hóa đơn nhập kho","XemGiaoHang");
        hc.put("Tạo danh mục giảm giá", "XemTatCaSanPham");
        String choice = comboBox4.getValue();
        windows w = new windows();
        Stage window = w.setStage(hc.get(choice), event);
        window.show();
    }


}
