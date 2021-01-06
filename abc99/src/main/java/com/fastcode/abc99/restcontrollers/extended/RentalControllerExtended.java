package com.fastcode.abc99.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abc99.restcontrollers.core.RentalController;
import com.fastcode.abc99.application.extended.rental.IRentalAppServiceExtended;
import com.fastcode.abc99.application.extended.customer.ICustomerAppServiceExtended;
import com.fastcode.abc99.application.extended.inventory.IInventoryAppServiceExtended;
import com.fastcode.abc99.application.extended.payment.IPaymentAppServiceExtended;
import com.fastcode.abc99.application.extended.staff.IStaffAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abc99.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/rental/extended")
public class RentalControllerExtended extends RentalController {

		public RentalControllerExtended(IRentalAppServiceExtended rentalAppServiceExtended, ICustomerAppServiceExtended customerAppServiceExtended, IInventoryAppServiceExtended inventoryAppServiceExtended, IPaymentAppServiceExtended paymentAppServiceExtended, IStaffAppServiceExtended staffAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		rentalAppServiceExtended,
    	customerAppServiceExtended,
    	inventoryAppServiceExtended,
    	paymentAppServiceExtended,
    	staffAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

