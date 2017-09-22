package com.cargo.resource.factories;

import com.cargo.resource.CustomerApiService;
import com.cargo.resource.impl.CustomerApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-22T00:28:15.760-06:00")
public class CustomerApiServiceFactory {
    private final static CustomerApiService service = new CustomerApiServiceImpl();

    public static CustomerApiService getCustomerApi() {
        return service;
    }
}
