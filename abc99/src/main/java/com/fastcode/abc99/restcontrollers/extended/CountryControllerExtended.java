package com.fastcode.abc99.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abc99.restcontrollers.core.CountryController;
import com.fastcode.abc99.application.extended.country.ICountryAppServiceExtended;
import com.fastcode.abc99.application.extended.city.ICityAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/country/extended")
public class CountryControllerExtended extends CountryController {

		public CountryControllerExtended(ICountryAppServiceExtended countryAppServiceExtended, ICityAppServiceExtended cityAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		countryAppServiceExtended,
    	cityAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

