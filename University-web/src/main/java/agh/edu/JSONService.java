package agh.edu;

import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class JSONService extends Application {
    public JSONService(){
        init();
    }

    private void init(){
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/University-web/rest");
        beanConfig.setResourcePackage("agh.edu");
        beanConfig.setTitle("Uni api");
        beanConfig.setScan(true);
    }
}
