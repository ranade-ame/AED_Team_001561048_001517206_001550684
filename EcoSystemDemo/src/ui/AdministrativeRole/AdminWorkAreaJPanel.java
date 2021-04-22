

package ui.AdministrativeRole;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
        if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Service")){
            btnMenu.setText("Manage Services");
            btnManageOrders.setText("Manage Requests");
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                btnOrgAdmin = new javax.swing.JButton();
                btnNanageOrganization = new javax.swing.JButton();
                valueLabel = new javax.swing.JLabel();
                btnManageOrders = new javax.swing.JButton();
                btnInventory = new javax.swing.JButton();
                btnMenu = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();

                setBackground(new java.awt.Color(255, 255, 255));
                setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 102, 204));
                jLabel1.setText("Welcome ");
                add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

                btnOrgAdmin.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnOrgAdmin.setForeground(new java.awt.Color(0, 102, 204));
                btnOrgAdmin.setText("Manage Org Admin");
                btnOrgAdmin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnOrgAdminActionPerformed(evt);
                        }
                });
                add(btnOrgAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 160, -1));

                btnNanageOrganization.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnNanageOrganization.setForeground(new java.awt.Color(0, 102, 204));
                btnNanageOrganization.setText("Manage Organization");
                btnNanageOrganization.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNanageOrganizationActionPerformed(evt);
                        }
                });
                add(btnNanageOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 160, -1));

                valueLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                valueLabel.setForeground(new java.awt.Color(0, 102, 204));
                valueLabel.setText("<value>");
                add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 400, -1));

                btnManageOrders.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnManageOrders.setForeground(new java.awt.Color(0, 102, 204));
                btnManageOrders.setText("Manage Orders");
                btnManageOrders.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnManageOrdersActionPerformed(evt);
                        }
                });
                add(btnManageOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 160, -1));

                btnInventory.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnInventory.setForeground(new java.awt.Color(0, 102, 204));
                btnInventory.setText("Inventory");
                btnInventory.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnInventoryActionPerformed(evt);
                        }
                });
                add(btnInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 160, -1));

                btnMenu.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
                btnMenu.setForeground(new java.awt.Color(0, 102, 204));
                btnMenu.setText("Manage Menu");
                btnMenu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMenuActionPerformed(evt);
                        }
                });
                add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 160, -1));

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Icons/manageEmployee700px.png"))); // NOI18N
                add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 770, 480));
        }// </editor-fold>//GEN-END:initComponents

    private void btnOrgAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgAdminActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrgAdminActionPerformed

    private void btnNanageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNanageOrganizationActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNanageOrganizationActionPerformed

        private void btnManageOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrdersActionPerformed
            // TODO add your handling code here:
            if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Service")){
                ManageRequests manageRequests = new ManageRequests(userProcessContainer, enterprise);
                userProcessContainer.add("manageRequests", manageRequests);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            else{
                if(enterprise.getOrders() == null){
                    JOptionPane.showMessageDialog(null,"No Orders","Warning",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    ManageOrdersJPanel manageOrdersJPanel = new ManageOrdersJPanel(userProcessContainer, enterprise);
                    userProcessContainer.add("manageOrdersJPanel", manageOrdersJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            }
        }//GEN-LAST:event_btnManageOrdersActionPerformed

        private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
            // TODO add your handling code here:
            ManageSuppliesJPanel managesuppliesJPanel = new ManageSuppliesJPanel(userProcessContainer, enterprise);
            userProcessContainer.add("manageOrdersJPanel", managesuppliesJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }//GEN-LAST:event_btnInventoryActionPerformed

        private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
            // TODO add your handling code here:
            
            if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Service")){
                ManageServices manageServices = new ManageServices(userProcessContainer, enterprise);
                userProcessContainer.add("manageServices", manageServices);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            else{
                ManageMenuJPanel managemenuJPanel = new ManageMenuJPanel(userProcessContainer, enterprise);
                userProcessContainer.add("managemenuJPanel", managemenuJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }//GEN-LAST:event_btnMenuActionPerformed
    
    
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnInventory;
        private javax.swing.JButton btnManageOrders;
        private javax.swing.JButton btnMenu;
        private javax.swing.JButton btnNanageOrganization;
        private javax.swing.JButton btnOrgAdmin;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel valueLabel;
        // End of variables declaration//GEN-END:variables
    
}
