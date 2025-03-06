package in.shriram.dreambiketwowheelerloan.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class TwoWheelerLoanLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoWheelerLoanLoginApplication.class, args);
	}
	
	@Bean
	 RestTemplate rt() {
		
		return new RestTemplate();
	}
	


}
