package com.fastcode.abc99.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abc99.restcontrollers.core.CategoryController;
import com.fastcode.abc99.application.extended.category.ICategoryAppServiceExtended;
import com.fastcode.abc99.application.extended.filmcategory.IFilmCategoryAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/category/extended")
public class CategoryControllerExtended extends CategoryController {

		public CategoryControllerExtended(ICategoryAppServiceExtended categoryAppServiceExtended, IFilmCategoryAppServiceExtended filmCategoryAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		categoryAppServiceExtended,
    	filmCategoryAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

