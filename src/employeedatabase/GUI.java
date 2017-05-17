package employeedatabase;

public class GUI extends javax.swing.JFrame {
    
    public GUI() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fullTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Last Name", "First Name", "Location", "Employee Number", "Full Time?", "Salary", "Deduction Rate", "Hourly Pay", "Hours/Week", "Weeks/Year"
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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
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
        jScrollPane4.setViewportView(searchTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addEmployeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeEmployeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(saveDatabaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadDatabaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if (jTabbedPane1.isEnabledAt(1)) {
            if (fullTable.getSelectedRow() > -1) {
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) fullTable.getModel();
                int employeeNumber = (Integer) model.getValueAt(fullTable.getSelectedRow(), 3);
                Primary.bigList.removeFromTable(employeeNumber);
                model.removeRow(fullTable.getSelectedRow());
                if (searchTable.getModel().getRowCount() > 0) {
                    for (int n = 0; n < searchTable.getModel().getRowCount(); n++) {
                        int compareNumber = (Integer) model.getValueAt(n, 3);
                        if (employeeNumber == compareNumber) {
                            javax.swing.table.DefaultTableModel otherModel = (javax.swing.table.DefaultTableModel) searchTable.getModel();
                            otherModel.removeRow(n);
                        }
                    }
                }
            }
        } else if (jTabbedPane1.isEnabledAt(2)) {
            if (searchTable.getSelectedRow() > -1) {
                javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) searchTable.getModel();
                int employeeNumber = (Integer) model.getValueAt(searchTable.getSelectedRow(), 3);
                Primary.bigList.removeFromTable(employeeNumber);
                model.removeRow(searchTable.getSelectedRow());
                if (fullTable.getModel().getRowCount() > 0) {
                    for (int n = 0; n < fullTable.getModel().getRowCount(); n++) {
                        int compareNumber = (Integer) model.getValueAt(n, 3);
                        if (employeeNumber == compareNumber) {
                            javax.swing.table.DefaultTableModel otherModel = (javax.swing.table.DefaultTableModel) fullTable.getModel();
                            otherModel.removeRow(n);
                        }
                    }
                }
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
        // TODO add your handling code here:
    }//GEN-LAST:event_loadDatabaseButtonActionPerformed

    private void saveDatabaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDatabaseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveDatabaseButtonActionPerformed
    
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        /*javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) searchTable.getModel();
        if (Primary.bigList.getEmployeeFromNumber(Integer.parseInt(searchField.getText())).getFullTime()) {
            FullTimeEmployee employeeVar = Primary.bigList.getEmployeeFromNumber(Integer.parseInt(searchField.getText()));
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
        } else if (!employeeVar.getFullTime()) {
            Object[] row = {employeeVar.getFirstName(), 
                            employeeVar.getLastName(), 
                            employeeVar.getLocation(), 
                            employeeVar.getEmpNumber(), 
                            false, 
                            null, 
                            employeeVar.getDeduction(),
                            employeeVar.getHourlyWage(),
                            employeeVar.getWeeks(),
                            employeeVar.getPerYear()};
            model.addRow(row);
        }*/
    }//GEN-LAST:event_searchButtonActionPerformed
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton addEmployeesButton;
    public static javax.swing.JTable fullTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loadDatabaseButton;
    private javax.swing.JButton removeEmployeesButton;
    private javax.swing.JButton saveDatabaseButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    public static javax.swing.JTable searchTable;
    // End of variables declaration//GEN-END:variables
}
