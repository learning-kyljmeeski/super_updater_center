package kg.superpuper.fileservice.config;

import lombok.Getter;

@Getter
public class StorageProperties {
    private String location = "upload-dir";

    public void setLocation(String location) {
        this.location = location;
    }
}
