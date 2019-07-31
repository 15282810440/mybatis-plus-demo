//package com.onfish.yshyheartbeatcollectionreport.config;
//
//import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
//import com.baomidou.mybatisplus.core.injector.ISqlInjector;
//import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//
//@Configuration
//@Component
//public class MybatisConfig {
//
////    @Bean("iSqlInjector")
////    public ISqlInjector getISqlInjector(){
////        return new DefaultSqlInjector();
////    }
//
//
//    @Bean("sqlSessionFactory")
//    @Primary
//    public SqlSessionFactory sqlSessionFactory(@Autowired @Qualifier("dataSource") DataSource dataSource) throws Exception {
//
//        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
//
////        Interceptor interceptor = new PageInterceptor();
////        Properties properties = new Properties();
////        properties.setProperty("helperDialect", "sqlserver");
////        properties.setProperty("offsetAsPageNum", "true");
////        properties.setProperty("rowBoundsWithCount", "true");
////        properties.setProperty("reasonable", "false");
////        interceptor.setProperties(properties);
////        sqlSessionFactoryBean.setPlugins(new Interceptor[] {interceptor});
//
//
//        return sqlSessionFactoryBean.getObject();
//
//    }
//
//}
