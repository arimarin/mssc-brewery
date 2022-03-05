package fi.oscar.msscbrewery.services;

import fi.oscar.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by Ari on 05.03.2022
 */
public interface BeerService {
	BeerDto getBeerById(UUID beerId);

	BeerDto saveNewBeer(BeerDto beerDto);

	void updateBeer(UUID beerId, BeerDto beerDto);

	void deleteById(UUID beerId);
}
