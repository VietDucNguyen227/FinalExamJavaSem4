package com.example.final_jsp_servlet.repo;

import com.example.final_jsp_servlet.entity.Employee;
import com.example.final_jsp_servlet.util.PersistenceUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class EmployeeRepo {
    EntityManager entityManager;
    EntityTransaction entityTransaction;

    public EmployeeRepo() {
        entityManager = PersistenceUtil.getEntityManagerFactory().createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    public void insertEmployee(Employee employee){
        try {
            entityTransaction.begin();
            entityManager.persist(employee);
            entityTransaction.commit();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            entityTransaction.rollback();
        }
    }

    public List<Employee> getAll() {
        try {
            Query query = entityManager.createQuery("select a from Employee as a");
            return query.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
