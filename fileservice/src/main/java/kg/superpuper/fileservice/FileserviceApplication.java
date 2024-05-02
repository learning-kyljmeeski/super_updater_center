package kg.superpuper.fileservice;

import kg.superpuper.fileservice.config.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class FileserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileserviceApplication.class, args);
	}

}
