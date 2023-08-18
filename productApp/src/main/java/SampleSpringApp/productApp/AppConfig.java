package SampleSpringApp.productApp;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;

import com.mybean.Product;

@Configuration
public class AppConfig {
	
	@Bean(name="coffee")
	public Product getProduct() {
		Product product = new Product("coffee",23,100);
		return product;
	}
}
