package fi.oscar.msscbrewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by Ari on 05.03.2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {
	private UUID id;
	private String beerName;
	private BeerStyle beerStyle;
	private Long upc;
}
