package com.kodilla.hibernate.manytomany;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedQuery(
        name = "Employee.findEmployeeByAnyLetter",
        query = "FROM Employee WHERE lastName LIKE CONCAT('%', :LASTNAME,'%')"
)
@NamedQuery(
        name = "Employee.findEmployeeByLastName",
        query = "FROM Employee WHERE lastName = :LASTNAME"
)
@Entity
@Table(name = "EMPLOYEES")
@Service
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private List<Company> companies = new ArrayList<>();

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee() {
    }

    @Column(name = "EMPLOYEE_ID", unique = true)
    @GeneratedValue
    @Id
    @NotNull
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstName() {
        return firstName;
    }

    @NotNull
    @Column(name = "LASTNAME")
    public String getLastName() {
        return lastName;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_EMPLOYEES_COMPANIES",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")}
    )
    public List<Company> getCompanies() {
        return companies;
    }

    private void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
