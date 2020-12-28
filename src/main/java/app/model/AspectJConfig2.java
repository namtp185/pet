package app.model;

import org.aspectj.lang.Aspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspectJConfig2 {
    @Bean
    public ServiceImpl getAutowireCapableServiceImpl() {
        return Aspects.aspectOf(ServiceImpl.class);
    }
}
