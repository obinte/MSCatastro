/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acosux.MSCatastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 *
 * @author Carol
 */
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class MSCatastroAplication {

    public static void main(String[] args) {
        SpringApplication.run(MSCatastroAplication.class, args);
    }

}
