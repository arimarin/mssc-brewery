package fi.oscar.msscbrewery.services;

import fi.oscar.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Ari on 05.03.2022
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		log.debug("Getting customer " + customerId + " ....");
		return CustomerDto.builder().id(customerId)
				.customerName("John Doe")
				.build();
	}

	@Override
	public CustomerDto saveNewCustomer(CustomerDto customerDto) {
		UUID customerId = UUID.randomUUID();
		log.debug("Saving customer " + customerId + " ....");
		return CustomerDto.builder().id(customerId).build();
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		// TODO: impl - would add a real impl to update customer!
		log.debug("Updating a customer " + customerId + " ....");
	}

	@Override
	public void deleteById(UUID customerId) {
		// TODO: impl - would add a real impl to delete customer!
		log.debug("Deleting a customer " + customerId + " ....");
	}
}
