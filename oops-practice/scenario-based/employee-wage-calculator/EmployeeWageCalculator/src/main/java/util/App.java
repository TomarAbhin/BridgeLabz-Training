package util;

import service.EmpWageBuilderService;
import service.IEmpWageBuilder;

public class App {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        IEmpWageBuilder builder = new EmpWageBuilderService();

        builder.addCompany("HCLTech", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 120);

        builder.computeWages();

        System.out.println("HCLTech Total Wage = " + builder.getTotalWage("HCLTech"));
        System.out.println("Infosys Total Wage = " + builder.getTotalWage("Infosys"));
    }
}

