package com.fastcode.abc99.application.extended.authorization.user;

import org.springframework.stereotype.Service;
import com.fastcode.abc99.application.core.authorization.user.UserAppService;

import com.fastcode.abc99.domain.extended.authorization.user.IUserRepositoryExtended;
import com.fastcode.abc99.domain.core.authorization.userpreference.IUserpreferenceRepository;
import com.fastcode.abc99.addons.reporting.domain.dashboardversion.*;
import com.fastcode.abc99.addons.reporting.domain.dashboardversionreport.*;
import com.fastcode.abc99.addons.reporting.domain.reportversion.*;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@Service("userAppServiceExtended")
public class UserAppServiceExtended extends UserAppService implements IUserAppServiceExtended {

	public UserAppServiceExtended(IDashboardversionRepository dashboardversionRepository,IReportversionRepository reportversionRepository,IDashboardversionreportRepository reportDashboardRepository,IUserRepositoryExtended userRepositoryExtended,
				IUserpreferenceRepository userpreferenceRepository,IUserMapperExtended mapper,LoggingHelper logHelper) {

		super(dashboardversionRepository,reportversionRepository,reportDashboardRepository,userRepositoryExtended,
		userpreferenceRepository,mapper,logHelper);

	}

 	//Add your custom code here
 
}

