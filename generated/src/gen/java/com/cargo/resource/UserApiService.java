package com.cargo.resource;

import com.cargo.resource.*;
import com.cargo.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.cargo.model.User;

import java.util.List;
import com.cargo.resource.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-21T23:23:26.788-06:00")
public abstract class UserApiService {
    public abstract Response createUser(User body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllUsers(SecurityContext securityContext) throws NotFoundException;
    public abstract Response loginUser( @NotNull String username, @NotNull String password,SecurityContext securityContext) throws NotFoundException;
    public abstract Response logoutUser(SecurityContext securityContext) throws NotFoundException;
}
