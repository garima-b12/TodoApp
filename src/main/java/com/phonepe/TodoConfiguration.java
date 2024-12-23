package com.phonepe;

import io.dropwizard.core.Configuration;
import io.dropwizard.db.DataSourceFactory;
import io.github.cdimascio.dotenv.Dotenv;

public class TodoConfiguration extends Configuration {
   private static final Dotenv dotenv = Dotenv.load();

   public DataSourceFactory getDataSourceFactory(){
       DataSourceFactory dataSourceFactory = new DataSourceFactory();
       dataSourceFactory.setDriverClass(dotenv.get("DB_DRIVER"));
       dataSourceFactory.setUser(dotenv.get("DB_USER"));
       dataSourceFactory.setPassword(dotenv.get("DB_PASSWORD"));
       dataSourceFactory.setUrl(dotenv.get("DB_URL"));
       return dataSourceFactory;
   }
}
