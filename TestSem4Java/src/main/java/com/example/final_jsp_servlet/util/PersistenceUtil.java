package com.example.final_jsp_servlet.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil {
    private static EntityManagerFactory entityManagerFactory;
    public static EntityManagerFactory getEntityManagerFactory(){
        if (entityManagerFactory == null){
            entityManagerFactory = Persistence.createEntityManagerFactory("finalJspServlet");
        }
        return entityManagerFactory;
    }
}
