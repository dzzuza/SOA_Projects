package agh.edu;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import static javax.ws.rs.core.HttpHeaders.AUTHORIZATION;
import static javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.Status.UNAUTHORIZED;

@Path("/users")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_FORM_URLENCODED)
@Transactional
public class UserEndpoint {

    @Context
    private UriInfo uriInfo;

    @Inject
    private KeyGenerator keyGenerator;

    /*@PersistenceContext
    private EntityManager em;
*/
    @POST
    @Path("/login")
    @Consumes(APPLICATION_FORM_URLENCODED)
    public Response authenticateUser(@FormParam("login") String login,
                                     @FormParam("password") String password) {

        try {

            // Authenticate the user using the credentials provided
            authenticate(login, password);

            // Issue a token for the user
            String token = issueToken(login);

            // Return the token on the response
            return Response.ok().header(AUTHORIZATION, "Bearer " + token).build();

        } catch (Exception e) {
            return Response.status(UNAUTHORIZED).build();
        }
    }

    private void authenticate(String login, String password) throws Exception {
        if(login.equals("zuzanna") && password.equals("dziedzic")){

        }else {
            throw new SecurityException("Invalid user/password");
        }
        /*TypedQuery<User> query = em.createNamedQuery(User.FIND_BY_LOGIN_PASSWORD, User.class);
        query.setParameter("login", login);
        query.setParameter("password", Password.digestPassword(password));
        User user = query.getSingleResult();
        if (user == null)
            ;*/
    }

    private String issueToken(String login) {
        Key key = keyGenerator.generateKey();
        String jwtToken = Jwts.builder()
                .setSubject(login)
                .setIssuer(uriInfo.getAbsolutePath().toString())
                .setIssuedAt(new Date())
                .setExpiration(toDate(LocalDateTime.now().plusMinutes(15L)))
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
        return jwtToken;

    }
/*
    @POST
    public Response create(User user) {
        em.persist(user);
        return Response.created(uriInfo.getAbsolutePathBuilder().path(user.getId()).build()).build();
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") String id) {
        User user = em.find(User.class, id);

        if (user == null)
            return Response.status(NOT_FOUND).build();

        return Response.ok(user).build();
    }

    @GET
    public Response findAllUsers() {
        TypedQuery<User> query = em.createNamedQuery(User.FIND_ALL, User.class);
        List<User> allUsers = query.getResultList();

        if (allUsers == null)
            return Response.status(NOT_FOUND).build();

        return Response.ok(allUsers).build();
    }

    @DELETE
    @Path("/{id}")
    public Response remove(@PathParam("id") String id) {
        em.remove(em.getReference(User.class, id));
        return Response.noContent().build();
    }
*/

    private Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}