package com.cargo.resource.factories;

import com.cargo.resource.UserApiService;
import com.cargo.resource.impl.UserApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-22T00:28:15.760-06:00")
public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    public static UserApiService getUserApi() {
        return service;
    }
}
