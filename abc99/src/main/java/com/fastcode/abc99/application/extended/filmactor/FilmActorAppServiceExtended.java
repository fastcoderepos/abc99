package com.fastcode.abc99.application.extended.filmactor;

import org.springframework.stereotype.Service;
import com.fastcode.abc99.application.core.filmactor.FilmActorAppService;

import com.fastcode.abc99.domain.extended.filmactor.IFilmActorRepositoryExtended;
import com.fastcode.abc99.domain.extended.actor.IActorRepositoryExtended;
import com.fastcode.abc99.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@Service("filmActorAppServiceExtended")
public class FilmActorAppServiceExtended extends FilmActorAppService implements IFilmActorAppServiceExtended {

	public FilmActorAppServiceExtended(IFilmActorRepositoryExtended filmActorRepositoryExtended,
				IActorRepositoryExtended actorRepositoryExtended,IFilmRepositoryExtended filmRepositoryExtended,IFilmActorMapperExtended mapper,LoggingHelper logHelper) {

		super(filmActorRepositoryExtended,
		actorRepositoryExtended,filmRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

