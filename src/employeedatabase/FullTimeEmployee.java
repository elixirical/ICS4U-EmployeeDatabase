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
public class FullTimeEmployee {

    private double salary;

    public void setFullTimeEmployee(int EN, String FN, String LN, String loc, double deduc, double sal) {
        EmployeeData blah = new EmployeeData(EN, FN, LN, loc, deduc);
        this.salary = sal;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
