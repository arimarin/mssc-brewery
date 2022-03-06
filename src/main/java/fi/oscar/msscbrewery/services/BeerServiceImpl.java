package fi.oscar.msscbrewery.services;

import fi.oscar.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Ari on 05.03.2022
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
	@Override
	public BeerDto getBeerById(UUID beerId) {
		log.debug("Getting beer " + beerId + " ....");

		return BeerDto.builder().id(beerId)
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale")
				.build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		UUID beerId = UUID.randomUUID();
		log.debug("Saving beer " + beerId + " ....");

		return BeerDto.builder().id(beerId)
				.build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		// TODO: impl - would add a real impl to update beer!
		log.debug("Updating a beer " + beerId + " ....");
	}

	@Override
	public void deleteById(UUID beerId) {
		// TODO: impl - would add a real impl to delete beer!
		log.debug("Deleting a beer " + beerId + " ....");
	}
}
