/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        for (Type type : Organization.Type.values()){
            if (!type.getValue().equals(Type.Admin.getValue()))
                organizationJComboBox.addItem(type);
        }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[7];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            row[2] = organization.getPhone();
            row[3] = organization.getCity();
            row[4] = organization.getStreetaddress();
            row[5] = organization.getCountry();
            row[6] = organization.getZipcode();
            
            model.addRow(row);
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
                organizationJTable = new javax.swing.JTable();
                addJButton = new javax.swing.JButton();
                organizationJComboBox = new javax.swing.JComboBox();
                jLabel1 = new javax.swing.JLabel();
                backJButton = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                tfFullName = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
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
                jLabel4 = new javax.swing.JLabel();

                setBackground(new java.awt.Color(255, 255, 255));

                organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "ID", "Name", "Contact Number", "City", "StreetAddress", "Country", "Zipcode"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, true, false, false, true, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(organizationJTable);
                if (organizationJTable.getColumnModel().getColumnCount() > 0) {
                        organizationJTable.getColumnModel().getColumn(0).setResizable(false);
                        organizationJTable.getColumnModel().getColumn(1).setResizable(false);
                }

                addJButton.setBackground(new java.awt.Color(0, 102, 204));
                addJButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
                addJButton.setForeground(new java.awt.Color(255, 255, 255));
                addJButton.setText("Add Organization");
                addJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addJButtonActionPerformed(evt);
                        }
                });

                organizationJComboBox.setBackground(new java.awt.Color(0, 102, 204));
                organizationJComboBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
                organizationJComboBox.setForeground(new java.awt.Color(255, 255, 255));
                organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                organizationJComboBoxActionPerformed(evt);
                        }
                });

                jLabel1.setForeground(new java.awt.Color(0, 102, 204));
                jLabel1.setText("Organization Type ");

                backJButton.setBackground(new java.awt.Color(255, 255, 255));
                backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/93634-2.png"))); // NOI18N
                backJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backJButtonActionPerformed(evt);
                        }
                });

                jLabel2.setForeground(new java.awt.Color(0, 102, 204));
                jLabel2.setText("Organization Name :");

                tfFullName.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tfFullNameActionPerformed(evt);
                        }
                });

                jLabel3.setForeground(new java.awt.Color(0, 102, 204));
                jLabel3.setText("Email Address :");

                tfEmail.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tfEmailActionPerformed(evt);
                        }
                });

                jLabel5.setForeground(new java.awt.Color(0, 102, 204));
                jLabel5.setText("Phone Number :");

                tfPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tfPhoneNumberActionPerformed(evt);
                        }
                });

                jLabel6.setForeground(new java.awt.Color(0, 102, 204));
                jLabel6.setText("Street Address:");

                tfStreetAddress.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tfStreetAddressActionPerformed(evt);
                        }
                });

                jLabel9.setForeground(new java.awt.Color(0, 102, 204));
                jLabel9.setText("Country:");

                tfCountry.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tfCountryActionPerformed(evt);
                        }
                });

                jLabel10.setForeground(new java.awt.Color(0, 102, 204));
                jLabel10.setText("City:");

                tfCity.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tfCityActionPerformed(evt);
                        }
                });

                jLabel11.setForeground(new java.awt.Color(0, 102, 204));
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

                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/department128x.png"))); // NOI18N

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel1))
                                                                .addGap(37, 37, 37)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(organizationJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(tfStreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                                                                .addComponent(tfCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                                                                .addComponent(tfCity, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                                                                .addComponent(tfFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                                                                .addComponent(tfZipcode, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                                                                .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                                                                .addComponent(tfPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))))
                                                .addGap(328, 328, Short.MAX_VALUE))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel4))
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(addJButton)))
                                .addContainerGap(61, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        
        String name = tfFullName.getText();
        String streetaddress = tfStreetAddress.getText();
        String emailaddress = tfEmail.getText();
        String country = tfCountry.getText();
        String city = tfCity.getText();
        int zipcode = parseInt(tfZipcode.getText());
        String phone = tfPhoneNumber.getText();
        Type type = (Type) organizationJComboBox.getSelectedItem();
        directory.createOrganization(type, name, streetaddress, city, country, zipcode, emailaddress, phone);
	JOptionPane.showMessageDialog(addJButton, "Organization Added!");
        populateTable();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

        private void tfFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFullNameActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_tfFullNameActionPerformed

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
        int selectedRow = organizationJTable.getSelectedRow();
        String name = organizationJTable.getValueAt(selectedRow, 1).toString();
        Organization org = directory.getOrganization(name);
        directory.removeOrganization(org);
	    JOptionPane.showMessageDialog(addJButton, "Selected Organization deleted");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addJButton;
        private javax.swing.JButton backJButton;
        private javax.swing.JButton btnDelete;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JComboBox organizationJComboBox;
        private javax.swing.JTable organizationJTable;
        private javax.swing.JTextField tfCity;
        private javax.swing.JTextField tfCountry;
        private javax.swing.JTextField tfEmail;
        private javax.swing.JTextField tfFullName;
        private javax.swing.JTextField tfPhoneNumber;
        private javax.swing.JTextField tfStreetAddress;
        private javax.swing.JTextField tfZipcode;
        // End of variables declaration//GEN-END:variables
}
