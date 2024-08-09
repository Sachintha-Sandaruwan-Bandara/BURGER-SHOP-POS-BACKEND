package lk.ijse.burgershop.backend.bo.custom;

import lk.ijse.burgershop.backend.bo.SuperBO;
import lk.ijse.burgershop.backend.dto.OrderDetailDTO;

import java.sql.SQLException;
import java.util.List;

public interface OrderDetailBO extends SuperBO {
    List<OrderDetailDTO> getAllOrderDetails() throws SQLException;
}
