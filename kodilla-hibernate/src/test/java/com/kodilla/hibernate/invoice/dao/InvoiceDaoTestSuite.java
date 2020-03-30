package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item bread = new Item(new BigDecimal(12), 5, new BigDecimal(60));
        Item flour = new Item(new BigDecimal(5), 12, new BigDecimal(60));
        Item bike = new Item(new BigDecimal(720), 2, new BigDecimal(1440));
        Item satNav = new Item(new BigDecimal(350), 3, new BigDecimal(1050));

        Invoice one = new Invoice("1");
        Invoice two = new Invoice("2");

        one.getItems().add(bread);
        one.getItems().add(flour);
        two.getItems().add(bike);
        two.getItems().add(satNav);

        bread.setInvoice(one);
        flour.setInvoice(one);
        bike.setInvoice(two);
        satNav.setInvoice(two);

        //When
        invoiceDao.save(one);
        int oneId = one.getId();
        invoiceDao.save(two);
        int twoId = two.getId();

        //Then
        assertNotEquals(0, oneId);
        assertNotEquals(0, twoId);

        //CleanUp
        //invoiceDao.deleteById(oneId);
        //invoiceDao.deleteById(twoId);
    }
}