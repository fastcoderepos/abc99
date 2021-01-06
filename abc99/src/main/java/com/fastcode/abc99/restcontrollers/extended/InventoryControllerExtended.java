package com.fastcode.abc99.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abc99.restcontrollers.core.InventoryController;
import com.fastcode.abc99.application.extended.inventory.IInventoryAppServiceExtended;
import com.fastcode.abc99.application.extended.film.IFilmAppServiceExtended;
import com.fastcode.abc99.application.extended.rental.IRentalAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/inventory/extended")
public class InventoryControllerExtended extends InventoryController {

		public InventoryControllerExtended(IInventoryAppServiceExtended inventoryAppServiceExtended, IFilmAppServiceExtended filmAppServiceExtended, IRentalAppServiceExtended rentalAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		inventoryAppServiceExtended,
    	filmAppServiceExtended,
    	rentalAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

