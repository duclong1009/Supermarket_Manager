package DAO;

import javafx.collections.ObservableList;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {
    ObservableList<T> getAll() throws SQLException;

    public void update(T entrie);

    List<T> getList();

    public void insert(T entrie) throws SQLException;

    public void delete(T entrie);


}
