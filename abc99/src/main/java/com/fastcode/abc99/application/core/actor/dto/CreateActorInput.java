package com.fastcode.abc99.application.core.actor.dto;

import java.time.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateActorInput {

  	@NotNull(message = "firstName Should not be null")
  	@Length(max = 45, message = "firstName must be less than 45 characters")
  	private String firstName;
  
  	@NotNull(message = "lastName Should not be null")
  	@Length(max = 45, message = "lastName must be less than 45 characters")
  	private String lastName;
  
  	private LocalDateTime lastUpdate;
  

}

