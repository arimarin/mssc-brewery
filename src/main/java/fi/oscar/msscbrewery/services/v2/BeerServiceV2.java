package fi.oscar.msscbrewery.services.v2;

import fi.oscar.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * Created by Ari on 05.03.2022
 */
public interface BeerServiceV2 {
	BeerDtoV2 getBeerById(UUID beerId);

	BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

	void updateBeer(UUID beerId, BeerDtoV2 beerDto);

	void deleteById(UUID beerId);
}
