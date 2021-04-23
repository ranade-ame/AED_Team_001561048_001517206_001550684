/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[7];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();
                row[3] = enterprise.getStreetaddress();
                row[4] = enterprise.getCountry();
                row[5] = enterprise.getCity();
                row[6] = enterprise.getZipcode();

                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfPhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfStreetAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfCountry = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfCity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfZipcode = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseJTable.setBackground(new java.awt.Color(255, 255, 255));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Type", "Street Address", "Country", "City", "Zipcode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel1.setText("Network");

        networkJComboBox.setBackground(new java.awt.Color(0, 102, 204));
        networkJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Name");

        jLabel3.setText("Enterprise Type");

        enterpriseTypeJComboBox.setBackground(new java.awt.Color(0, 102, 204));
        enterpriseTypeJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });

        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/file_light-07-512-2.png"))); // NOI18N
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/93634-2.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Email Address :");

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone Number :");

        tfPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneNumberActionPerformed(evt);
            }
        });

        jLabel6.setText("Street Address:");

        tfStreetAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStreetAddressActionPerformed(evt);
            }
        });

        jLabel9.setText("Country:");

        tfCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCountryActionPerformed(evt);
            }
        });

        jLabel10.setText("City:");

        tfCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCityActionPerformed(evt);
            }
        });

        jLabel11.setText("Zipcode:");

        tfZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfZipcodeActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/delete-1432400-1211078-2.png"))); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/group Enterprise.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(87, 87, 87)
                                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(tfEmail))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(tfPhoneNumber))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(tfStreetAddress))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(100, 100, 100)
                                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(134, 134, 134)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(tfZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfCountry, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfCity, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                .addGap(0, 59, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nameJTextField, tfCity, tfCountry, tfEmail, tfPhoneNumber, tfStreetAddress, tfZipcode});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEmail)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPhoneNumber)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(tfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(tfZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = nameJTextField.getText();
        String streetaddress = tfStreetAddress.getText();
        String emailaddress = tfEmail.getText();
        String country = tfCountry.getText();
        String city = tfCity.getText();
        int zipcode = parseInt(tfZipcode.getText());
        String phone = tfPhoneNumber.getText();

        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, streetaddress, city, country, zipcode, emailaddress, type, phone);
	JOptionPane.showMessageDialog(nameJTextField, "Enterprise Added Successfully");

        populateTable();

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
//        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
//        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

        private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_tfEmailActionPerformed

        private void tfPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneNumberActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_tfPhoneNumberActionPerformed

        private void tfStreetAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStreetAddressActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_tfStreetAddressActionPerformed

        private void tfCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCountryActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_tfCountryActionPerformed

        private void tfCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCityActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_tfCityActionPerformed

        private void tfZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfZipcodeActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_tfZipcodeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow = enterpriseJTable.getSelectedRow();
        String name = enterpriseJTable.getValueAt(selectedrow, 0).toString();
        for (Network n : system.getNetworkList()){
            Enterprise e = n.getEnterpriseDirectory().getEnterprise(name);
            n.getEnterpriseDirectory().removeEnterprise(e);
        }
        populateTable();

    }//GEN-LAST:event_btnDeleteActionPerformed

        private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField tfCity;
    private javax.swing.JTextField tfCountry;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfPhoneNumber;
    private javax.swing.JTextField tfStreetAddress;
    private javax.swing.JTextField tfZipcode;
    // End of variables declaration//GEN-END:variables
}
