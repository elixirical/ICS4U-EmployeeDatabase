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
public class EmployeeData {

    private int empNumber;
    private String firstName;
    private String lastName;
    private String location;
    private double deduction;

    public EmployeeData(int EN, String FN, String LN, String loc, double deduc) {
        setEmpNumber(EN);
        setFirstName(FN);
        setLastName(LN);
        setLocation(loc);
        setDeduction(deduc);
    }

    public EmployeeData() {
    } // creates an employee data with null values

    public void setEmployee(int EN, String FN, String LN, String loc, double deduc) {
        empNumber = EN;
        firstName = FN;
        lastName = LN;
        location = loc;
        deduction = deduc;
    }

    public void setEmployee(EmployeeData replace) {
        empNumber = replace.empNumber;
        firstName = replace.firstName;
        lastName = replace.lastName;
        location = replace.location;
        deduction = replace.deduction;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public double getDeduction() {
        return deduction;
    }
    
    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
    
    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }
}
