package com.tpAssignment3_3;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by Rory on 2017-03-26.
 */
public class AccConfig {


    @Bean(name="dep")
    public AccountInterface getService(){
        return new SecondAccImpl();
    }

    @Bean(name="newDep")
    public AccountInterface getNewService(){
        return new SecondAccImpl();
    }

}
