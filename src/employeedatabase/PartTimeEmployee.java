/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedatabase;

/**
 *
 * @author Haichen
 */
public class PartTimeEmployee {
    private int weeks;
    private double perYear;
    private double hourlyWage;
    
    public void setPartTimeEmployee(int EN, String FN, String LN, String loc, double deduc, int weeks, double year, double wage) {
        EmployeeData blah = new EmployeeData(EN, FN, LN, loc, deduc);
        this.weeks = weeks;
        this.perYear = year;
        this.hourlyWage = wage;
    }
    
    public double getWeeks() {
        return weeks;
    }
    
    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }
    
    public double getPerYear() {
        return perYear;
    }
    
    public void setSalary(double perYear) {
        this.perYear = perYear;
    }
    
    public double getHourlyWage() {
        return hourlyWage;
    }
    
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}
