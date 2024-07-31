package me.afibarra.configuration;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

public class MariaDbConfig {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:mariadb://127.0.0.1:3306/sakila");
        dataSourceBuilder.username("dvdrental");
        dataSourceBuilder.password("p455w0rd");
        dataSourceBuilder.driverClassName("org.mariadb.jdbc.Driver");

        return dataSourceBuilder.build();
    }
}
