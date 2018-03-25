package ru.torgcrm.jee.filters;

import io.jsonwebtoken.Jwts;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.Level;
import ru.torgcrm.jee.security.Secured;

import javax.annotation.Priority;
import javax.crypto.spec.SecretKeySpec;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.security.Key;

/**
 * @author Ilya Durdyev, funbanji@gmail.com
 */
@Provider
@Secured
@Priority(Priorities.AUTHENTICATION)
@Log4j
public class JwtTokenFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        String authorizationHeader = containerRequestContext
                .getHeaderString(HttpHeaders.AUTHORIZATION);
        if (authorizationHeader != null) {
            String token = authorizationHeader.substring("Bearer".length()).trim();
            try {
                Key key = generateKey();
                Jwts.parser().setSigningKey(key).parseClaimsJws(token);
            } catch (Exception e) {
                log.log(Level.ERROR, "#### invalid token : " + token);
                containerRequestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
            }
        } else {
            containerRequestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
        }
    }

    public Key generateKey() {
        String keyString = "simplekey";
        Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "DES");
        return key;
    }

}
