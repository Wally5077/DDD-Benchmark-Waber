package tw.waterball.ddd.waber.springboot.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tw.waterball.ddd.waber.springboot.commons.annotations.WaberApplication;

/**
 * @author - johnny850807@gmail.com (Waterball)
 */
@EnableEurekaClient
@WaberApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
