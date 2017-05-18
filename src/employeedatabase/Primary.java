/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedatabase;

/**
 *
 * @author Alvin
 */

public class Primary {
    
    static EmployeeTable bigList = new EmployeeTable(10);
    
    public static EmployeeTable getTable() {
        return bigList;
    }

    public static void main(String args[]) {
        GUI thing = new GUI();
        thing.setTitle("Employee Database");
    }
    
}
