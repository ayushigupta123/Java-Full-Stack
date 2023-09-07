package com.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import com.model.Developer;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "developers")
public class DeveloperEndpoint {
	
	private Map<String, Developer> developers = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Developer> developers() {
    	developers.put("developer1", new Developer("Ayushi","IDE","Local","Running"));
    	
        return developers;
    }

    @ReadOperation
    public Developer developer(@Selector String name) {
        return developers.get(name);
    }

    @WriteOperation
    public WebEndpointResponse<Developer> configureDeveloper(String developername,String platformUsed, String serverUsed, String app_life_cycle_status) {
    	Developer developer=new Developer(developername,platformUsed,serverUsed,app_life_cycle_status);
    	developers.put(developername, developer);
    	return new WebEndpointResponse(developers);
    }

    @DeleteOperation
    public void deleteDeveloper(@Selector String name) {
    	developers.remove(name);
    }

}
