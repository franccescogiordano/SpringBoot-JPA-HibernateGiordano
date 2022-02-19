package com.sofka.CrudYJPAGiordano.repository;

import com.sofka.CrudYJPAGiordano.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EmployeeJpaRepositoyTest {
    @Autowired
    private IEmployeeJpaRepository repoEmpl;


    @Test
    public void saveEmployee(){
        Employee john = new Employee("John", "Smith", "empl123");
        Employee claire = new Employee("Claire", "Simpson", "empl124");

        repoEmpl.save(john);
        repoEmpl.save(claire);
        repoEmpl.flush();
        assertEquals(2, repoEmpl.findAll().size());
    }
}
