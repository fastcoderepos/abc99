package com.fastcode.abc99.application.core.filmactor.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateFilmActorInput {

  	@NotNull(message = "actorId Should not be null")
  	private Short actorId;
  	
  	@NotNull(message = "filmId Should not be null")
  	private Short filmId;
  	
  	private LocalDateTime lastUpdate;
  	
  	private Long versiono;
  
}

