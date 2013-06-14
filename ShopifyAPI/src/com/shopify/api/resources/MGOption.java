/**
 * DO NOT MODIFY THIS CODE
 *
 * Place all of your changes in Option.java
 *
 * It has been machine generated from fixtures and your changes will be
 * lost if anything new needs to be added to the API.
 **/
// Last Generated: 2011-09-26T15:53:49-04:00
package com.shopify.api.resources;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This code has been machine generated by processing the single entry
 * fixtures found from the Shopify API Documentation
 */

public class MGOption extends ShopifyResource {

    @JsonProperty("product_id")
    public int getProductId() {
        Integer value = (Integer)getAttribute("product_id");
        return value != null ? value : 0;
    }
    @JsonProperty("product_id")
    public void setProductId(int _product_id) {
        setAttribute("product_id", _product_id);
    }

	@JsonProperty("name")
	public String getName() {
		return (String)getAttribute("name");
	}
	@JsonProperty("name")
	public void setName(String _name) {
		setAttribute("name", _name);
	}

    @JsonProperty("position")
    public int getPosition() {
        return (Integer)getAttribute("position");
    }
    @JsonProperty("position")
    public void setPosition(int _position) {
        setAttribute("position", _position);
    }

}