package com.cargo.resource.impl;

import com.cargo.resource.ApiResponseMessage;
import com.cargo.resource.CustomerApiService;
import com.cargo.resource.NotFoundException;
import com.cargo.db.entity.DBCustomer;
import com.cargo.db.service.CustomerService;
import com.cargo.handler.*;
import com.cargo.model.*;

import com.cargo.model.Customer;
import com.cargo.model.SuccessResponse;

import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-22T00:28:15.760-06:00")
public class CustomerApiServiceImpl extends CustomerApiService {
	@Autowired(required = true)
	CustomerService customerService;
    @Override
    public Response createCustomer(SuccessResponse body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteCustomerById(Long id, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAllCustomers(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
    	List<DBCustomer> customers = new ArrayList<DBCustomer>() ;
		try {
			customers = customerService.getCustomerList();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return Response.ok().entity(customers).build();
    }
    @Override
    public Response getCustomerById(Long id, SecurityContext securityContext) throws NotFoundException {
    	DBCustomer customer = null;
    	try {
			customer = customerService.getCustomer(id.intValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
       	return Response.ok().entity(customer).build();
    }
}
