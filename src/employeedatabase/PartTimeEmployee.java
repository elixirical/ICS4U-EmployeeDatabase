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
public class PartTimeEmployee extends EmployeeData {
    private double weeks;
    private double perYear;
    private double hourlyWage;
    
    boolean fullTime = true;
    
    public void setPartTimeEmployee(int EN, String FN, String LN, String loc, double deduc, double wage, double week, double year) {
        this.setEmployee(EN, FN, LN, loc, deduc);
        this.hourlyWage = wage;
        this.weeks = week;
        this.perYear = year;
        this.setFullTime(false);
    }
    
    public double getWeeks() {
        return weeks;
    }
    
    public void setWeeks(double weeks) {
        this.weeks = weeks;
    }
    
    public double getPerYear() {
        return perYear;
    }
    
    public void setPerYear(double perYear) {
        this.perYear = perYear;
    }
    
    public double getHourlyWage() {
        return hourlyWage;
    }
    
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}
