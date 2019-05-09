/*
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import  javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@ApplicationScoped
@ManagedBean
public class RClient{

    public static void main(String[] args) {
        Client x = ClientBuilder.newClient();
        String entity = x.target("http://localhost:8080/University-web/rest")
                .path("/hello").request(MediaType.TEXT_PLAIN_TYPE).get(String.class);

        System.out.println(entity);
    }

}
*/
