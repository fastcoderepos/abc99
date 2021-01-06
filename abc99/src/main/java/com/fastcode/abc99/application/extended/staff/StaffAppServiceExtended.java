package com.fastcode.abc99.application.extended.staff;

import org.springframework.stereotype.Service;
import com.fastcode.abc99.application.core.staff.StaffAppService;

import com.fastcode.abc99.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.abc99.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.abc99.domain.extended.store.IStoreRepositoryExtended;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@Service("staffAppServiceExtended")
public class StaffAppServiceExtended extends StaffAppService implements IStaffAppServiceExtended {

	public StaffAppServiceExtended(IStaffRepositoryExtended staffRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,IStoreRepositoryExtended storeRepositoryExtended,IStaffMapperExtended mapper,LoggingHelper logHelper) {

		super(staffRepositoryExtended,
		addressRepositoryExtended,storeRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

