package net.sunofbeach.taobao;


import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import net.sunofbeach.taobao.utils.Constants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


    @Bean
    public TaobaoClient getTaobaoClient() {
        TaobaoClient client = new DefaultTaobaoClient(
                Constants.SERVER_URL,
                Constants.APP_KEY,
                Constants.APP_SECRET);
        return client;
    }

    @Bean
    public Random getRandom() {
        return new Random();
    }
}
