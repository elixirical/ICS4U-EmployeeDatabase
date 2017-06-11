package employeedatabase;

public class GUI extends javax.swing.JFrame {
    
    public GUI() {
        super("Employee Database"); 
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        fullTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        addEmployeesButton = new javax.swing.JButton();
        removeEmployeesButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        loadDatabaseButton = new javax.swing.JButton();
        saveDatabaseButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        editEmployeeButton = new javax.swing.JButton();
        refreshListButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fullTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Location", "Employee Number", "Full Time?", "Salary", "Deduction Rate", "Hourly Pay", "Hours/Week", "Weeks/Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fullTable.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(fullTable);
        fullTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        jTabbedPane1.addTab("Employee List", jPanel2);

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Location", "Employee Number", "Full Time?", "Salary", "Deduction Rate", "Hourly Pay", "Hours/Week", "Weeks/Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchTable.setCellSelectionEnabled(true);
        jScrollPane4.setViewportView(searchTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Search Results", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        addEmployeesButton.setText("Add Employees");
        addEmployeesButton.setActionCommand("Add Employee");
        addEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeesButtonActionPerformed(evt);
            }
        });

        removeEmployeesButton.setText("Remove Employee");
        removeEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmployeesButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        searchField.setText("Search");
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        loadDatabaseButton.setText("Load Database");
        loadDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDatabaseButtonActionPerformed(evt);
            }
        });

        saveDatabaseButton.setText("Save Database");
        saveDatabaseButton.setActionCommand("Add Employee");
        saveDatabaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDatabaseButtonActionPerformed(evt);
            }
        });

        searchButton.setText("✓");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        editEmployeeButton.setText("Edit Employee");
        editEmployeeButton.setActionCommand("Add Employee");
        editEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeButtonActionPerformed(evt);
            }
        });

        refreshListButton.setText("Refresh List");
        refreshListButton.setActionCommand("Add Employee");
        refreshListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addEmployeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeEmployeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(saveDatabaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(loadDatabaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(editEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(refreshListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addEmployeesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeEmployeesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editEmployeeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshListButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveDatabaseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loadDatabaseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExitButton))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void addEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeesButtonActionPerformed
        AddEmployee newPopup = new AddEmployee();
        newPopup.setVisible(true);
    }//GEN-LAST:event_addEmployeesButtonActionPerformed

    private void removeEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmployeesButtonActionPerformed
        Primary.bigList.displayContents();
        if (jTabbedPane1.getSelectedIndex() == 0) {
            if (fullTable.getSelectedRow() > -1) {
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) fullTable.getModel();
                int employeeNumber = (Integer) model.getValueAt(fullTable.getSelectedRow(), 3);
                Primary.bigList.removeFromTable(employeeNumber);
                Primary.employeeNumbers.remove(new Integer(employeeNumber));
                model.removeRow(fullTable.getSelectedRow());
                
                javax.swing.table.DefaultTableModel searchModel = (javax.swing.table.DefaultTableModel) searchTable.getModel();
                searchModel.removeRow(0);
                
                //remove from the other fucking table figure this out ahhhhh
            }
        } else if (jTabbedPane1.getSelectedIndex() == 1) {
            if (searchTable.getSelectedRow() > -1) {
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) searchTable.getModel();
                System.out.println(searchTable.getSelectedRow());
                int employeeNumber = (Integer) model.getValueAt(searchTable.getSelectedRow(), 3);
                Primary.bigList.removeFromTable(employeeNumber);
                Primary.employeeNumbers.remove(new Integer(employeeNumber));
                model.removeRow(searchTable.getSelectedRow());
                
                javax.swing.table.DefaultTableModel fullModel = (javax.swing.table.DefaultTableModel) fullTable.getModel();
                fullModel.setRowCount(0);
                Primary.bigList.hashToTable();
                
                jTabbedPane1.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_removeEmployeesButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void loadDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDatabaseButtonActionPerformed
        InputOutput thing = new InputOutput();
        thing.readFromFile();

    }//GEN-LAST:event_loadDatabaseButtonActionPerformed

    private void saveDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDatabaseButtonActionPerformed
        InputOutput thing = new InputOutput();
        thing.writeToFile();

    }//GEN-LAST:event_saveDatabaseButtonActionPerformed
    
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        int searchValue = Integer.parseInt(searchField.getText());
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) searchTable.getModel();
        if (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        if (Primary.bigList.getEmployeeFromNumber(searchValue).getFullTime()) {
            FullTimeEmployee employeeVar = (FullTimeEmployee) Primary.bigList.getEmployeeFromNumber(searchValue);
            Object[] row = {employeeVar.getFirstName(), 
                            employeeVar.getLastName(), 
                            employeeVar.getLocation(), 
                            employeeVar.getEmpNumber(), 
                            true, 
                            employeeVar.getSalary(), 
                            employeeVar.getDeduction(),
                            null, 
                            null, 
                            null};
            model.addRow(row);
        } else if (!Primary.bigList.getEmployeeFromNumber(searchValue).getFullTime()) {
            PartTimeEmployee employeeVar = (PartTimeEmployee) Primary.bigList.getEmployeeFromNumber(searchValue);
            Object[] row = {employeeVar.getFirstName(), 
                            employeeVar.getLastName(), 
                            employeeVar.getLocation(), 
                            employeeVar.getEmpNumber(), 
                            false, 
                            (employeeVar.getHourlyWage()*employeeVar.getPerYear()*employeeVar.getWeeks()), 
                            employeeVar.getDeduction(),
                            employeeVar.getHourlyWage(),
                            employeeVar.getWeeks(),
                            employeeVar.getPerYear()}; 
            model.addRow(row);
        }
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void editEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeButtonActionPerformed
        int employeeNumber = -1;
        if (jTabbedPane1.getSelectedIndex() == 0) {
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) fullTable.getModel();
            employeeNumber = (Integer) model.getValueAt(fullTable.getSelectedRow(), 3);
        } else if (jTabbedPane1.getSelectedIndex() == 1) {
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) searchTable.getModel();
            employeeNumber = (Integer) model.getValueAt(searchTable.getSelectedRow(), 3);
        }
        EditEmployee editPopup = new EditEmployee(Primary.bigList.getEmployeeFromNumber(employeeNumber));
        editPopup.setVisible(true);
    }//GEN-LAST:event_editEmployeeButtonActionPerformed

    private void refreshListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshListButtonActionPerformed
        refreshList();
    }//GEN-LAST:event_refreshListButtonActionPerformed
    
    public void refreshList() {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) searchTable.getModel();
        model.setRowCount(0);
        model = (javax.swing.table.DefaultTableModel) fullTable.getModel();
        model.setRowCount(0);
        Primary.bigList.hashToTable();
        jTabbedPane1.setSelectedIndex(0);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(
            javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
                
            }
        });
    }
    
    public javax.swing.table.AbstractTableModel getSearchTableAbstractTableModel() {
        javax.swing.table.AbstractTableModel model = (javax.swing.table.AbstractTableModel) searchTable.getModel();
        return model;
    }
    
    public javax.swing.JTabbedPane getJTabbedPane1() {
        return jTabbedPane1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton addEmployeesButton;
    private javax.swing.JButton editEmployeeButton;
    public static javax.swing.JTable fullTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loadDatabaseButton;
    private javax.swing.JButton refreshListButton;
    private javax.swing.JButton removeEmployeesButton;
    private javax.swing.JButton saveDatabaseButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    public static javax.swing.JTable searchTable;
    // End of variables declaration//GEN-END:variables
}
