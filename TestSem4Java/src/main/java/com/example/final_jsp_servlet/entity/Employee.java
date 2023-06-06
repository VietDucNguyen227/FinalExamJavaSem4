package com.example.final_jsp_servlet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "birthday")
    private String birthDay;

    private String address;

    private String position;

    private String department;

    public Employee(String fullName, String birthDay, String address, String position, String department) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.address = address;
        this.position = position;
        this.department = department;
    }
}
