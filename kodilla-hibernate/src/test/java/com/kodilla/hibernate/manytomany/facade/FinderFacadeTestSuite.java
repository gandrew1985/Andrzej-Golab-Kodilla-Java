package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class FinderFacadeTestSuite {

    @Autowired
    private FinderFacade finderFacade;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void testFindEmployeeByAnyLetter() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        //When
        List<Employee> findByAnyLetter = finderFacade.findEmployee("val");
        System.out.println("size list is:" + findByAnyLetter.size());

        //Then
        assertEquals(1, findByAnyLetter.size());
    }

    @Test
    public void testFindCompanyByLetter() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMasters);
        companyDao.save(greyMatter);

        int softwareId = softwareMachine.getId();
        int dataId = dataMasters.getId();
        int greyId = greyMatter.getId();

        //When
        List<Company> companies = finderFacade.findCompany("war");
        //Then
        assertEquals(0, companies.size());
        //Clean up
        companyDao.deleteById(softwareId);
        companyDao.deleteById(dataId);
        companyDao.deleteById(greyId);
    }
}