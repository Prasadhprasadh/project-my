package com.example.crud.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.DTO.CustomerDTO;
import com.example.crud.DTO.CustomerSaveDTO;
import com.example.crud.DTO.CustomerUpdateDTO;
import com.example.crud.Repo.CustomerRepo;
import com.example.crud.entity.Customer;

@Service
public class CustomerServiceIMPL implements CustomerService{
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public String addCustomer(CustomerSaveDTO customersaveDTO) {
		
		Customer customer=new Customer(
				customersaveDTO.getCustomername(),
				customersaveDTO.getCustomeraddress(),
				customersaveDTO.getMobile()
				);
		customerRepo.save(customer);
		return customer.getCustomername();
	}
	
	public List<CustomerDTO> getallCustomers(){
		List<Customer> getcustomer=customerRepo.findAll();
		List<CustomerDTO> customerdtolist=new ArrayList<>();
		for(Customer x:getcustomer) {
			
			CustomerDTO customerDTO=new CustomerDTO(
					x.getCustomerid(),
					x.getCustomername(),
					x.getCustomeraddress(),
					x.getMobile()
					);
			customerdtolist.add(customerDTO);
		}
		return customerdtolist;
	}
	
	public String updateCustomer(CustomerUpdateDTO customerUpdateDTO) {
		return null;
	}


}
