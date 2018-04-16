package org;

import javax.ejb.Stateless;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Gabriel
 */
@Stateless
@Path("generic")
public class ConverterResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String binaryConverter(@QueryParam("decimal") int decimal) {
        return binaryConverterAux(decimal);
    }

    private String binaryConverterAux(int decimal) {
        if (decimal <= 1) {
            return Integer.toString(decimal);
        } else {
            return binaryConverterAux(decimal/2) + decimal % 2;
        }
    }
}
