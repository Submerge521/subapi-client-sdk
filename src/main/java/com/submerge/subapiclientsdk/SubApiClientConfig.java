package com.submerge.subapiclientsdk;

import com.submerge.subapiclientsdk.client.SubApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: SubApiClientConfig
 * Package: com.submerge.subapiclientsdk
 * Description: client配置
 *
 * @Author Submerge--WangDong
 * @Create 2024-03-19 16:12
 * @Version 1.0
 */
@Configuration
@ConfigurationProperties("subapi.client")
@ComponentScan
@Data
public class SubApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public SubApiClient subapiClient() {
        return new SubApiClient(accessKey, secretKey);
    }
}
