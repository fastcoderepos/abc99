package com.fastcode.abc99.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abc99.restcontrollers.core.FilmController;
import com.fastcode.abc99.application.extended.film.IFilmAppServiceExtended;
import com.fastcode.abc99.application.extended.filmactor.IFilmActorAppServiceExtended;
import com.fastcode.abc99.application.extended.filmcategory.IFilmCategoryAppServiceExtended;
import com.fastcode.abc99.application.extended.inventory.IInventoryAppServiceExtended;
import com.fastcode.abc99.application.extended.language.ILanguageAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/film/extended")
public class FilmControllerExtended extends FilmController {

		public FilmControllerExtended(IFilmAppServiceExtended filmAppServiceExtended, IFilmActorAppServiceExtended filmActorAppServiceExtended, IFilmCategoryAppServiceExtended filmCategoryAppServiceExtended, IInventoryAppServiceExtended inventoryAppServiceExtended, ILanguageAppServiceExtended languageAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		filmAppServiceExtended,
    	filmActorAppServiceExtended,
    	filmCategoryAppServiceExtended,
    	inventoryAppServiceExtended,
    	languageAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

