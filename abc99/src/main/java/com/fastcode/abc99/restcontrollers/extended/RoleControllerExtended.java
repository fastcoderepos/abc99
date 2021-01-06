package com.fastcode.abc99.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abc99.restcontrollers.core.RoleController;
import com.fastcode.abc99.application.extended.authorization.role.IRoleAppServiceExtended;
import com.fastcode.abc99.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.abc99.application.extended.authorization.userrole.IUserroleAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/role/extended")
public class RoleControllerExtended extends RoleController {

		public RoleControllerExtended(IRoleAppServiceExtended roleAppServiceExtended, IRolepermissionAppServiceExtended rolepermissionAppServiceExtended, IUserroleAppServiceExtended userroleAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		roleAppServiceExtended,
    	rolepermissionAppServiceExtended,
    	userroleAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

