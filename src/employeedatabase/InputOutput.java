/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Haichen Main
 */
public class InputOutput {

    private BufferedWriter bw = null;
    private BufferedReader br = null;
    private String CVSSplit = ",";
    private String line = "";
    private ArrayList<EmployeeData> allData;

    public void writeToFile() {
        try {
            bw = new BufferedWriter(new FileWriter(new File("DatabaseData.csv")));
            allData = Primary.bigList.displayContents();
            EmployeeData[] list = allData.toArray(new EmployeeData[Primary.bigList.getNumItems()]);
            for (int i = 0; i < Primary.bigList.getNumItems(); i++) {
                if (list[i].getFullTime() == true) {
                    FullTimeEmployee var = (FullTimeEmployee) list[i];
                    bw.write(String.valueOf(var.getFullTime()));
                    bw.write(String.valueOf(var.getEmpNumber()));
                    bw.write(var.getFirstName());
                    bw.write(var.getLastName());
                    bw.write(var.getLocation());
                    bw.write(String.valueOf(var.getDeduction()));
                    bw.write(String.valueOf(var.getSalary()));
                    bw.write("");
                    bw.write("");
                    bw.write("");
                } else {
                    PartTimeEmployee var = (PartTimeEmployee) list[i];
                    bw.write(String.valueOf(var.getFullTime()));
                    bw.write(String.valueOf(var.getEmpNumber()));
                    bw.write(var.getFirstName());
                    bw.write(var.getLastName());
                    bw.write(var.getLocation());
                    bw.write(String.valueOf(var.getDeduction()));
                    bw.write("");
                    bw.write(String.valueOf(var.getHourlyWage()));
                    bw.write(String.valueOf(var.getPerYear()));
                    bw.write(String.valueOf(var.getWeeks()));
                }
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile() {
        try {
            br = new BufferedReader(new FileReader("DatabaseData.csv"));
            while ((line = br.readLine()) != null) {
                String[] item = line.split(CVSSplit);
                if (Boolean.parseBoolean(item[0]) == true) {
                    FullTimeEmployee blah = new FullTimeEmployee();
                    blah.setFullTimeEmployee(
                            Integer.parseInt(item[1]),
                            item[2],
                            item[3],
                            item[4],
                            Double.parseDouble(item[5]),
                            Double.parseDouble(item[6])
                    );
                    System.out.println(blah.getFirstName());
                    Primary.bigList.addToTable(blah);

                    Object[] row = {blah.getFirstName(),
                        blah.getLastName(),
                        blah.getLocation(),
                        blah.getEmpNumber(),
                        true,
                        blah.getSalary(),
                        blah.getDeduction(),
                        null,
                        null,
                        null};
                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) GUI.fullTable.getModel();
                    model.addRow(row);
                } else if (Boolean.parseBoolean(item[0]) == false) {
                    PartTimeEmployee blah = new PartTimeEmployee();
                    blah.setPartTimeEmployee(
                            Integer.parseInt(item[1]),
                            item[2],
                            item[3],
                            item[4],
                            Double.parseDouble(item[5]),
                            Double.parseDouble(item[7]),
                            Integer.parseInt(item[8]),
                            Double.parseDouble(item[9])
                    );
                    System.out.println(blah.getFirstName());
                    Primary.bigList.addToTable(blah);

                    Object[] row = {blah.getFirstName(),
                        blah.getLastName(),
                        blah.getLocation(),
                        blah.getEmpNumber(),
                        false,
                        (blah.getHourlyWage() * blah.getPerYear() * blah.getWeeks()),
                        blah.getDeduction(),
                        blah.getHourlyWage(),
                        blah.getWeeks(),
                        blah.getPerYear()};
                    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) GUI.fullTable.getModel();
                    model.addRow(row);
                }
                br.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
