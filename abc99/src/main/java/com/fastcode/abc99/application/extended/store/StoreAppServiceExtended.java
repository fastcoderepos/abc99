package com.fastcode.abc99.application.extended.store;

import org.springframework.stereotype.Service;
import com.fastcode.abc99.application.core.store.StoreAppService;

import com.fastcode.abc99.domain.extended.store.IStoreRepositoryExtended;
import com.fastcode.abc99.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.abc99.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@Service("storeAppServiceExtended")
public class StoreAppServiceExtended extends StoreAppService implements IStoreAppServiceExtended {

	public StoreAppServiceExtended(IStoreRepositoryExtended storeRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,IStaffRepositoryExtended staffRepositoryExtended,IStoreMapperExtended mapper,LoggingHelper logHelper) {

		super(storeRepositoryExtended,
		addressRepositoryExtended,staffRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

