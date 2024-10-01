package com.example.crud.customerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.DTO.CustomerDTO;
import com.example.crud.DTO.CustomerSaveDTO;
import com.example.crud.DTO.CustomerUpdateDTO;
import com.example.crud.Service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("api/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerservice;
	
	@PostMapping("/save")
	public String saveCustomer(@RequestBody CustomerSaveDTO customersaveDTO) {
		String id=customerservice.addCustomer(customersaveDTO);
				return id;
	}
	
	@GetMapping("/getallcustomer")
	public List<CustomerDTO> getallcusromer() {
			List<CustomerDTO> allcustomers=customerservice.getallCustomers();
			return allcustomers;
	}
	
	@PostMapping("/update")
	public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO) {
		String id=customerservice.updateCustomer(customerUpdateDTO);
				return id;
	}
}
