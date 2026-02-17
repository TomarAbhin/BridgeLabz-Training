package service;

import model.CompanyEmpWage;
import repository.EmpWageRepository;
import repository.EmpWageRepositoryImpl;

public class EmpWageBuilderService implements IEmpWageBuilder {

    private static final int IS_ABSENT = 0;
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    private static final int FULL_TIME_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;

    private EmpWageRepository repository = new EmpWageRepositoryImpl();

    public void addCompany(String name, int wagePerHour, int days, int hours) {
        repository.addCompany(new CompanyEmpWage(name, wagePerHour, days, hours));
    }

    public void computeWages() {

        for (CompanyEmpWage company : repository.getAllCompanies()) {

            int totalHours = 0;
            int totalDays = 0;
            int totalWage = 0;

            while (totalHours < company.getMaxWorkingHours()
                    && totalDays < company.getMaxWorkingDays()) {

                totalDays++;

                int empCheck = (int) (Math.random() * 3);
                int empHours;

                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHours = FULL_TIME_HOUR;
                        break;
                    case IS_PART_TIME:
                        empHours = PART_TIME_HOUR;
                        break;
                    default:
                        empHours = 0;
                }

                totalHours += empHours;
                int dailyWage = empHours * company.getWagePerHour();
                company.addDailyWage(dailyWage);
                totalWage += dailyWage;
            }

            company.setTotalWage(totalWage);
        }
    }

    public int getTotalWage(String companyName) {
        return repository.getCompany(companyName).getTotalWage();
    }
}
