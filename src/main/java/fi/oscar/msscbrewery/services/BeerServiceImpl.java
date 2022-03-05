package fi.oscar.msscbrewery.services;

import fi.oscar.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Ari on 05.03.2022
 */
@Service
public class BeerServiceImpl implements BeerService {
	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale")
				.build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		return BeerDto.builder().id(UUID.randomUUID())
				.build();
	}
}
