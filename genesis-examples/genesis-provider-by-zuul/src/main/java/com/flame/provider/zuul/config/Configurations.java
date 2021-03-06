package com.flame.provider.zuul.config;

import com.flame.provider.zuul.filters.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {serviceId}-{version}  -> /{route}/{version}
 * <p>
 * Created by sungang on 2016/12/20.
 */
@Configuration
public class Configurations {


//    @Bean
//    @ConditionalOnMissingBean(ServiceRouteMapper.class)
//    public PatternServiceRouteMapper serviceRouteMapper() {
//        return new PatternServiceRouteMapper("(?<serviceId>^.+)/(?<version>v.+$)", "${serviceId}/${version}");
//    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

}
