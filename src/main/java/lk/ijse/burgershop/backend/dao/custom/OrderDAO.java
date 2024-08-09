package lk.ijse.burgershop.backend.dao.custom;

import lk.ijse.burgershop.backend.dao.CrudDAO;
import lk.ijse.burgershop.backend.entity.Order;

import java.sql.SQLException;

public interface OrderDAO extends CrudDAO<Order> {
    String getId() throws SQLException;
}
