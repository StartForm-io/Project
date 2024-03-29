package io.startform.parent.configuration;

import io.startform.parent.library.hibernate5.naming.EnhancementPhysicalNamingStrategy;
import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static io.startform.parent.Constants.ENTITY_PACKAGE_TO_SCAN;

@Configuration
//@EnableTransactionManagement
@EntityScan(ENTITY_PACKAGE_TO_SCAN)
public class HibernateConfiguration {

    @Bean
    public PhysicalNamingStrategy physicalNamingStrategy() {
        return new EnhancementPhysicalNamingStrategy();
    }

    @Bean
    public ImplicitNamingStrategy implicitNamingStrategy() {
        return new ImplicitNamingStrategyLegacyJpaImpl();
    }

}
