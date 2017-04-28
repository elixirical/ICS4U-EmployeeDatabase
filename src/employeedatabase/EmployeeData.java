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

    public EmployeeData(int EN, String FN) {
        setEmpNumber(EN);
        setFirstName(FN);
    }

    public EmployeeData() {
    } // creates an employee data with null values

    public void setEmployee(int EN, String FN) {
        empNumber = EN;
        firstName = FN;
    }

    public void setEmployee(EmployeeData replace) {
        empNumber = replace.empNumber;
        firstName = replace.firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }
}
