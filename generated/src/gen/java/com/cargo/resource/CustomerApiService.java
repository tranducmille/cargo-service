package com.cargo.resource;

import com.cargo.handler.*;
import com.cargo.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.cargo.model.Customer;
import com.cargo.model.SuccessResponse;

import java.util.List;
import com.cargo.resource.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-22T00:28:15.760-06:00")
public abstract class CustomerApiService {
    public abstract Response createCustomer(SuccessResponse body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteCustomerById(Long id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllCustomers(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCustomerById(Long id,SecurityContext securityContext) throws NotFoundException;
}
