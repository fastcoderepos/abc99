package com.fastcode.abc99.application.extended.film;

import org.springframework.stereotype.Service;
import com.fastcode.abc99.application.core.film.FilmAppService;

import com.fastcode.abc99.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.abc99.domain.extended.language.ILanguageRepositoryExtended;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@Service("filmAppServiceExtended")
public class FilmAppServiceExtended extends FilmAppService implements IFilmAppServiceExtended {

	public FilmAppServiceExtended(IFilmRepositoryExtended filmRepositoryExtended,
				ILanguageRepositoryExtended languageRepositoryExtended,IFilmMapperExtended mapper,LoggingHelper logHelper) {

		super(filmRepositoryExtended,
		languageRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

