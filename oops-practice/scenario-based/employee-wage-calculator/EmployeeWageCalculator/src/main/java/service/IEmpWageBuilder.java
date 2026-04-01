package service;

public interface IEmpWageBuilder {
    void addCompany(String name, int wagePerHour, int days, int hours);
    void computeWages();
    int getTotalWage(String companyName);
}

