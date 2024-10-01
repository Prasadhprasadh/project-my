package com.example.crud.Service;

import java.util.List;

import com.example.crud.DTO.CustomerDTO;
import com.example.crud.DTO.CustomerSaveDTO;
import com.example.crud.DTO.CustomerUpdateDTO;
import com.example.crud.entity.Customer;

public interface CustomerService {
	public String addCustomer(CustomerSaveDTO customersaveDTO);

	public List<CustomerDTO> getallCustomers();

	public String updateCustomer(CustomerUpdateDTO customerUpdateDTO);

}
