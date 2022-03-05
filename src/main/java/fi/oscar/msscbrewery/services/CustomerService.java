package fi.oscar.msscbrewery.services;

import fi.oscar.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by Ari on 05.03.2022
 */
public interface CustomerService {
	CustomerDto getCustomerById(UUID customerId);
}
