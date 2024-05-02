package kg.superpuper.fileservice.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
@Getter
public class StorageProperties {
    private String location = "upload-dir";

    public void setLocation(String location) {
        this.location = location;
    }
}
