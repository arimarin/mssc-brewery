package fi.oscar.msscbrewery.services;

import fi.oscar.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Ari on 05.03.2022
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder().id(UUID.randomUUID())
				.customerName("John Doe")
				.build();
	}
}
