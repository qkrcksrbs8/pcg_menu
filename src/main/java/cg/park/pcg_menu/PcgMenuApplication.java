package cg.park.pcg_menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class PcgMenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcgMenuApplication.class, args);
	}

}
