package com.cargo.resource;

import com.cargo.model.*;
import com.cargo.resource.UserApiService;
import com.cargo.resource.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.cargo.model.User;
import com.cargo.model.UserResponse;

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

@Path("/user")


@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-22T00:28:15.760-06:00")
public class UserApi  {
   private final UserApiService delegate = UserApiServiceFactory.getUserApi();

    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class) })
    public Response createUser(@ApiParam(value = "Created user object" ,required=true) User body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createUser(body,securityContext);
    }
    @GET
    @Path("/displayAll")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Logs user into the system", notes = "", response = User.class, responseContainer = "List", tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = User.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username/password supplied", response = User.class, responseContainer = "List") })
    public Response getAllUsers(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllUsers(securityContext);
    }
    @GET
    @Path("/login")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Logs user into the system", notes = "", response = UserResponse.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = UserResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username/password supplied", response = UserResponse.class) })
    public Response loginUser(@ApiParam(value = "The user name for login",required=true) @QueryParam("username") String username
,@ApiParam(value = "The password for login in clear text",required=true) @QueryParam("password") String password
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.loginUser(username,password,securityContext);
    }
    @GET
    @Path("/logout")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Logs out current logged in user session", notes = "", response = void.class, tags={ "user", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = void.class) })
    public Response logoutUser(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.logoutUser(securityContext);
    }
}
