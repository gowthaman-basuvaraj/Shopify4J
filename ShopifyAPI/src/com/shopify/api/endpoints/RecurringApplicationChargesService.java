/**
*
*
**/
// Generated On: 2011-09-01T02:13:38-04:00
package com.shopify.api.endpoints;

import com.shopify.api.endpoints.BaseShopifyService;
import com.shopify.api.handlers.ShopifyResponseHandler;
import com.shopify.api.resources.RecurringApplicationCharge;
import org.codegist.crest.annotate.*;

import static org.codegist.crest.HttpMethod.*;
import static org.codegist.crest.config.Destination.BODY;

@EndPoint("")
@ContextPath("/admin/recurring_application_charges")
@ResponseHandler(ShopifyResponseHandler.class)
public interface RecurringApplicationChargesService extends BaseShopifyService {

    // GET
    @Path(".json")
    RecurringApplicationCharge[] getRecurringApplicationCharges();

    @Path(".json?{0}")
    RecurringApplicationCharge[] getRecurringApplicationCharges(String queryParams);

    @Path("/{0}.json")
    RecurringApplicationCharge getRecurringApplicationCharge(int id);


    // POST
    @Path(".json")
    @HttpMethod(POST)
    RecurringApplicationCharge createRecurringApplicationCharge(@Destination(BODY) @Name("recurring_application_charge") RecurringApplicationCharge recurringApplicationCharge);

    // POST
    @Path("/{0}/activate.json")
    @HttpMethod(POST)
    void activateRecurringApplicationCharge(int id, @Destination(BODY) @Name("recurring_application_charge") RecurringApplicationCharge recurringApplicationCharge);

    // DELETE
    @Path("/{0}.json")
    @HttpMethod(DELETE)
    void cancelRecurringApplicationCharge(int id);
}
