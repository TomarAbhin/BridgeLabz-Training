package repository;

import model.CompanyEmpWage;
import java.util.List;

public interface EmpWageRepository {
    void addCompany(CompanyEmpWage company);
    CompanyEmpWage getCompany(String companyName);
    List<CompanyEmpWage> getAllCompanies();
}

