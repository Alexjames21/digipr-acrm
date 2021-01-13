/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.moviereview.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import rocks.process.moviereview.data.domain.Customer;
import rocks.process.moviereview.data.repository.CustomerRepository;

import javax.validation.Valid;
import java.util.List;

@Service
@Validated
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AgentService agentService;


	public void deleteCustomer(Long customerId)
	{
		customerRepository.deleteById(customerId);
	}
	
	public Customer findCustomerById(Long customerId) throws Exception {
		List<Customer> customerList = customerRepository.findByIdAndAgentId(customerId, agentService.getCurrentAgent().getId());
		if(customerList.isEmpty()){
			throw new Exception("No customer with ID "+customerId+" found.");
		}
		return customerList.get(0);
	}

	public List<Customer> findAllCustomers() {
		return customerRepository.findByAgentId(agentService.getCurrentAgent().getId());
	}
	
}
