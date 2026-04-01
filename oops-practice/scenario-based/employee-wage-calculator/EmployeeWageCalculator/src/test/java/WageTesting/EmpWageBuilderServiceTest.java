package WageTesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.EmpWageBuilderService;
import service.IEmpWageBuilder;

import static org.junit.jupiter.api.Assertions.*;

class EmpWageBuilderServiceTest {

    private IEmpWageBuilder builder;

    @BeforeEach
    void setup() {
        builder = new EmpWageBuilderService();
    }

    
    @Test
    void shouldComputeTotalWageForCompany() {

        builder.addCompany("HCLTech", 20, 20, 100);
        builder.computeWages();

        int totalWage = builder.getTotalWage("HCLTech");

        assertTrue(totalWage >= 0);
        assertTrue(totalWage <= 20 * 100);
    }

    @Test
    void shouldReturnCorrectCompanyWage() {

        builder.addCompany("Infosys", 25, 20, 100);
        builder.computeWages();

        int wage = builder.getTotalWage("Infosys");

        assertNotNull(wage);
        assertTrue(wage >= 0);
    }


    @Test
    void shouldHandleMultipleCompanies() {

        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Wipro", 30, 20, 100);

        builder.computeWages();

        int tcsWage = builder.getTotalWage("TCS");
        int wiproWage = builder.getTotalWage("Wipro");

        assertNotEquals(tcsWage, -1);
        assertNotEquals(wiproWage, -1);
    }

    @Test
    void shouldThrowExceptionWhenCompanyNotFound() {

        builder.addCompany("TCS", 20, 20, 100);
        builder.computeWages();

        assertThrows(RuntimeException.class, () -> {
            builder.getTotalWage("Unknown");
        });
    }
}

