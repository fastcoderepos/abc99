package com.fastcode.abc99.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abc99.restcontrollers.core.UserController;
import com.fastcode.abc99.application.extended.authorization.user.IUserAppServiceExtended;
import com.fastcode.abc99.application.extended.authorization.userpermission.IUserpermissionAppServiceExtended;
import com.fastcode.abc99.application.extended.authorization.userrole.IUserroleAppServiceExtended;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.fastcode.abc99.security.JWTAppService;
import org.springframework.core.env.Environment;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/user/extended")
public class UserControllerExtended extends UserController {

		public UserControllerExtended(IUserAppServiceExtended userAppServiceExtended, IUserpermissionAppServiceExtended userpermissionAppServiceExtended, IUserroleAppServiceExtended userroleAppServiceExtended,
	    PasswordEncoder pEncoder,JWTAppService jwtAppService, LoggingHelper helper, Environment env) {
		super(
		userAppServiceExtended,
    	userpermissionAppServiceExtended,
    	userroleAppServiceExtended,
	    pEncoder,
	    jwtAppService,
		helper, env);
	}

	//Add your custom code here

}

