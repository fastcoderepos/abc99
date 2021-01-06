package com.fastcode.abc99.application.extended.language;

import org.springframework.stereotype.Service;
import com.fastcode.abc99.application.core.language.LanguageAppService;

import com.fastcode.abc99.domain.extended.language.ILanguageRepositoryExtended;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@Service("languageAppServiceExtended")
public class LanguageAppServiceExtended extends LanguageAppService implements ILanguageAppServiceExtended {

	public LanguageAppServiceExtended(ILanguageRepositoryExtended languageRepositoryExtended,
				ILanguageMapperExtended mapper,LoggingHelper logHelper) {

		super(languageRepositoryExtended,
		mapper,logHelper);

	}

 	//Add your custom code here
 
}

