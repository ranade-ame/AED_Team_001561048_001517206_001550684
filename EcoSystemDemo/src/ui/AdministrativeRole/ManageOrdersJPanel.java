/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

/**
 *
 * @author bidar
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

	/**
	 * Creates new form ManageOrdersJPanel
	 */
	public ManageOrdersJPanel() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                tblOrderDetail = new javax.swing.JTable();
                btnViewOrder = new javax.swing.JButton();
                btnAssignDeliveryMan = new javax.swing.JButton();
                btnRefresh = new javax.swing.JButton();
                btnBack = new javax.swing.JButton();

                tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "OrderID", "Customer", "Store Name", "StoreID", "Delivery Location", "Total Amount", "Status"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, true, true, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(tblOrderDetail);

                btnViewOrder.setBackground(new java.awt.Color(0, 0, 0));
                btnViewOrder.setText("View Order");
                btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnViewOrderActionPerformed(evt);
                        }
                });

                btnAssignDeliveryMan.setBackground(new java.awt.Color(0, 0, 0));
                btnAssignDeliveryMan.setText("Assign Delivery Man to Order");
                btnAssignDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAssignDeliveryManActionPerformed(evt);
                        }
                });

                btnRefresh.setBackground(new java.awt.Color(0, 0, 0));
                btnRefresh.setText("Refresh");
                btnRefresh.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRefreshActionPerformed(evt);
                        }
                });

                btnBack.setBackground(new java.awt.Color(0, 0, 0));
                btnBack.setText("<<Back");
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnBack)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnViewOrder)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(btnAssignDeliveryMan)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnRefresh)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAssignDeliveryMan)
                                        .addComponent(btnViewOrder)
                                        .addComponent(btnRefresh))
                                .addGap(18, 18, 18)
                                .addComponent(btnBack)
                                .addContainerGap(143, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
                // TODO add your handling code here:
                
        }//GEN-LAST:event_btnViewOrderActionPerformed

        private void btnAssignDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryManActionPerformed
                // TODO add your handling code here:
                
        }//GEN-LAST:event_btnAssignDeliveryManActionPerformed

        private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
                // TODO add your handling code here:
                
        }//GEN-LAST:event_btnRefreshActionPerformed

        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
                // TODO add your handling code here:userProcessContainer.remove(this);
                
        }//GEN-LAST:event_btnBackActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnAssignDeliveryMan;
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnRefresh;
        private javax.swing.JButton btnViewOrder;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tblOrderDetail;
        // End of variables declaration//GEN-END:variables
}
