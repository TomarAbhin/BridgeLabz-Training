package repository;

import model.CompanyEmpWage;
import java.util.*;

public class EmpWageRepositoryImpl implements EmpWageRepository {

    private List<CompanyEmpWage> companyList = new ArrayList<>();
    private Map<String, CompanyEmpWage> companyMap = new HashMap<>();

    public void addCompany(CompanyEmpWage company) {
        companyList.add(company);
        companyMap.put(company.getCompanyName(), company);
    }

    public CompanyEmpWage getCompany(String companyName) {
        return companyMap.get(companyName);
    }

    public List<CompanyEmpWage> getAllCompanies() {
        return companyList;
    }
}

