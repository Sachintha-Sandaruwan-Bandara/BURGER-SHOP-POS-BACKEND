package lk.ijse.burgershop.backend.bo.custom;

import lk.ijse.burgershop.backend.bo.SuperBO;
import lk.ijse.burgershop.backend.dto.ItemDTO;

import java.sql.SQLException;
import java.util.List;

public interface ItemBO extends SuperBO {
    boolean saveItem(ItemDTO item) throws SQLException;

    boolean deleteItem(String itemId) throws SQLException;

    ItemDTO searchItem(String itemId) throws SQLException;

    boolean updateItem(String itemId, ItemDTO item) throws SQLException;

    List<ItemDTO> getAllItems() throws SQLException;
}
