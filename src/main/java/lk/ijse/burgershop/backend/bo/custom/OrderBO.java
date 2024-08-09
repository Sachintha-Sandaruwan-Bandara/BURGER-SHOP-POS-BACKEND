package lk.ijse.burgershop.backend.bo.custom;

import lk.ijse.burgershop.backend.bo.SuperBO;
import lk.ijse.burgershop.backend.dto.OrderDTO;
import java.sql.SQLException;

public interface OrderBO extends SuperBO {
    boolean placeOrder(OrderDTO order) throws SQLException;
    String getOrderId() throws SQLException;
}
