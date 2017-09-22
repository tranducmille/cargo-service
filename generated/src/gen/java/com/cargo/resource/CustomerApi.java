package com.cargo.resource;

import com.cargo.model.*;
import com.cargo.resource.CustomerApiService;
import com.cargo.resource.factories.CustomerApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.cargo.model.Customer;
import com.cargo.model.SuccessResponse;

import java.util.List;
import com.cargo.resource.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/customer")


@io.swagger.annotations.Api(description = "the customer API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-22T00:28:15.760-06:00")
public class CustomerApi  {
   private final CustomerApiService delegate = CustomerApiServiceFactory.getCustomerApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create Customer", notes = "This can only be done by the logged in user.", response = void.class, tags={ "customer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class) })
    public Response createCustomer(@ApiParam(value = "Created customer object" ,required=true) SuccessResponse body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCustomer(body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "deletes a single customer based on the ID supplied", response = SuccessResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = SuccessResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "customer deleted", response = SuccessResponse.class) })
    public Response deleteCustomerById(@ApiParam(value = "ID of customer to delete",required=true) @PathParam("id") Long id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteCustomerById(id,securityContext);
    }
    @GET
    @Path("/displayAll")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all customer in system", notes = "", response = Customer.class, responseContainer = "List", tags={ "customer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Customer.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username/password supplied", response = Customer.class, responseContainer = "List") })
    public Response getAllCustomers(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllCustomers(securityContext);
    }
    @POST
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create Customer", notes = "This can only be done by the logged in user.", response = Customer.class, tags={ "customer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Customer.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Customer.class) })
    public Response getCustomerById(@ApiParam(value = "ID of customer id",required=true) @PathParam("id") Long id
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCustomerById(id,securityContext);
    }
}
