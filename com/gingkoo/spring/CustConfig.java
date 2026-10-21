package com.gingkoo.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gingkoo.gal.api.core.annotation.NotScan;
import com.gingkoo.gal.api.orm.mybatis.annotation.Mapper;

@Configuration
@ComponentScan(
        basePackages = {
                "com.gingkoo.cust",
        },
        excludeFilters = @ComponentScan.Filter(NotScan.class)
)
@MapperScan(
        basePackages = "com.gingkoo.cust",
        annotationClass = Mapper.class,
        sqlSessionTemplateRef = "sqlSessionTemplate"
)
public class CustConfig {
}
