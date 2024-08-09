package lk.ijse.burgershop.backend.bo.custom;

import lk.ijse.burgershop.backend.bo.SuperBO;
import lk.ijse.burgershop.backend.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.List;

public interface CustomerBO extends SuperBO {
    boolean saveCustomer(CustomerDTO customerDTO) throws SQLException;
    boolean deleteCustomer(String customerId) throws SQLException;
    boolean updateCustomer(String customerId, CustomerDTO customerDTO) throws SQLException;
    List<CustomerDTO> getAllCustomers() throws SQLException;
}
