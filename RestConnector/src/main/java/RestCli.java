import  javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class RestCli {

    public static void main(String[] args){
        Client x = ClientBuilder.newClient();
        String entity = x.target("http://localhost:8080/University-web/rest")
                .path("/subjects").request(MediaType.APPLICATION_JSON).get(String.class);

        System.out.println(entity);
    }
}
