package fi.oscar.msscbrewery.services.v2;

import fi.oscar.msscbrewery.services.BeerService;
import fi.oscar.msscbrewery.web.model.BeerDto;
import fi.oscar.msscbrewery.web.model.v2.BeerDtoV2;
import fi.oscar.msscbrewery.web.model.v2.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Ari on 05.03.2022
 */
@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
	@Override
	public BeerDtoV2 getBeerById(UUID beerId) {
		return BeerDtoV2.builder().id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerStyle(BeerStyle.ALE)
				.build();
	}

	@Override
	public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
		return BeerDtoV2.builder().id(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
		// TODO: impl - would add a real impl to update beer!
		log.debug("Updating a beer....");
	}

	@Override
	public void deleteById(UUID beerId) {
		// TODO: impl - would add a real impl to delete beer!
		log.debug("Deleting a beer....");
	}
}
