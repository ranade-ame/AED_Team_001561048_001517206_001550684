/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CustomerRole;

<<<<<<< Updated upstream
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
=======
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.ItemCatalogue.Items;
import Business.ItemCatalogue.ItemsDirectory;
import Business.Orders.Orders;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
>>>>>>> Stashed changes
import ui.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author bidar
 */
public class EateriesOrderJPanel extends javax.swing.JPanel {

	/**
	 * Creates new form EateriesOrderJPanel
	 */
	private JPanel userProcessContainer;
<<<<<<< Updated upstream
    private EcoSystem system;
	public EateriesOrderJPanel() {
		initComponents();
=======
        private Enterprise enterprise;
        private Customer customer;
        private ItemsDirectory itemsdir;
        private Orders order;
        private ArrayList<Items> orderItems = new ArrayList<Items>();
        private ArrayList<Orders> orderplaced = new ArrayList<Orders>();
	public EateriesOrderJPanel(JPanel userProcessContainer, Enterprise enterprise, Customer customer) {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.enterprise = enterprise;
            this.customer = customer;
            if (enterprise.getItemsDirectory() != null){
                this.itemsdir = enterprise.getItemsDirectory();
            }
            else{
                this.itemsdir = new ItemsDirectory();
                enterprise.setItemsDirectory(itemsdir);
            }
            
            populateMenuTable();
            populateCartTable();
>>>>>>> Stashed changes
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
<<<<<<< Updated upstream
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane3 = new javax.swing.JScrollPane();
                tblMenu = new javax.swing.JTable();
                enterpriseLabel = new javax.swing.JLabel();
                enterpriseLabel1 = new javax.swing.JLabel();
                valueLabel = new javax.swing.JLabel();
                btnAddtoCart = new javax.swing.JButton();
                btnRemovefromCart = new javax.swing.JButton();
                enterpriseLabel2 = new javax.swing.JLabel();
                jScrollPane4 = new javax.swing.JScrollPane();
                tblMenu1 = new javax.swing.JTable();
                requestTestJButton = new javax.swing.JButton();
                backJButton = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();

                tblMenu.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Food Name", "Description", "Price"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane3.setViewportView(tblMenu);

                enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                enterpriseLabel.setText("Food Items");

                enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                enterpriseLabel1.setText("Hi");

                valueLabel.setText("<value>");

                btnAddtoCart.setText("Add Item to Cart");
                btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAddtoCartActionPerformed(evt);
                        }
                });

                btnRemovefromCart.setText("Delete Item from Cart");
                btnRemovefromCart.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRemovefromCartActionPerformed(evt);
                        }
                });

                enterpriseLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
                enterpriseLabel2.setText("Cart Details");

                tblMenu1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Food Name", "Description", "Price"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane4.setViewportView(tblMenu1);

                requestTestJButton.setText("Confirm Order");
                requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                requestTestJButtonActionPerformed(evt);
                        }
                });

                backJButton.setText("<<Back");
                backJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backJButtonActionPerformed(evt);
                        }
                });

                jLabel1.setText("Total Amount");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(enterpriseLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnAddtoCart, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(btnRemovefromCart, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(backJButton)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(requestTestJButton))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(enterpriseLabel1)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(valueLabel))
                                                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(82, 82, 82)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(valueLabel)
                                        .addComponent(enterpriseLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnAddtoCart)
                                                        .addComponent(btnRemovefromCart)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(enterpriseLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(requestTestJButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(backJButton)))
                                .addContainerGap(18, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents
=======
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        menuJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnAddtoCart = new javax.swing.JButton();
        btnRemovefromCart = new javax.swing.JButton();
        enterpriseLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        cartJTable = new javax.swing.JTable();
        btnConfirmOrder = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfTotalPrice = new javax.swing.JTextField();

        menuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Description", "Price", "Available Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(menuJTable);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Items");

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Hi");

        valueLabel.setText("<value>");

        btnAddtoCart.setText("Add Item to Cart");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });

        btnRemovefromCart.setText("Delete Item from Cart");
        btnRemovefromCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovefromCartActionPerformed(evt);
            }
        });

        enterpriseLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel2.setText("Cart Details");

        cartJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(cartJTable);

        btnConfirmOrder.setText("Confirm Order");
        btnConfirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmOrderActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(enterpriseLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddtoCart, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btnRemovefromCart, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterpriseLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valueLabel))
                                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(414, 414, 414))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backJButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnConfirmOrder))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueLabel)
                    .addComponent(enterpriseLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddtoCart)
                            .addComponent(btnRemovefromCart)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(enterpriseLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(backJButton)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
>>>>>>> Stashed changes

        private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
            // TODO add your handling code here:
            int selectedMenuRow = menuJTable.getSelectedRow();
            if(selectedMenuRow<0){
                JOptionPane.showMessageDialog(null,"Select a row","Warning",JOptionPane.WARNING_MESSAGE);
            }
            Items item = itemsdir.getItem(menuJTable.getValueAt(selectedMenuRow, 0).toString());
            orderItems.add(item);
            populateCartTable();
        }//GEN-LAST:event_btnAddtoCartActionPerformed

        private void btnRemovefromCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovefromCartActionPerformed
            // TODO add your handling code here:
            int selectedCartRow = cartJTable.getSelectedRow();
            if(selectedCartRow<0){
                JOptionPane.showMessageDialog(null,"Select a row","Warning",JOptionPane.WARNING_MESSAGE);
            }
            Items item = itemsdir.getItem(menuJTable.getValueAt(selectedCartRow, 0).toString());
            orderItems.remove(item);
            populateCartTable();
        }//GEN-LAST:event_btnRemovefromCartActionPerformed

        private void btnConfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmOrderActionPerformed
            int total = 0;
            for(Items i : orderItems){
                total = total + parseInt(i.getPrice());
            }
            tfTotalPrice.setText(String.valueOf(total));
            order = new Orders(enterprise.getName(), customer.getName(), orderItems, total, customer.getStreetAddress(), enterprise.getStreetaddress());
            orderplaced.add(order);
            customer.setOrderslist(orderplaced);

<<<<<<< Updated upstream
        private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
	userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerWorkAreaJPanel custAreajp = (CustomerWorkAreaJPanel) component;
        

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
=======
        }//GEN-LAST:event_btnConfirmOrderActionPerformed

        private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
//            CustomerWorkAreaJPanel custAreajp = (CustomerWorkAreaJPanel) component;
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
>>>>>>> Stashed changes
                
        }//GEN-LAST:event_backJButtonActionPerformed


<<<<<<< Updated upstream
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton backJButton;
        private javax.swing.JButton btnAddtoCart;
        private javax.swing.JButton btnRemovefromCart;
        private javax.swing.JLabel enterpriseLabel;
        private javax.swing.JLabel enterpriseLabel1;
        private javax.swing.JLabel enterpriseLabel2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JButton requestTestJButton;
        private javax.swing.JTable tblMenu;
        private javax.swing.JTable tblMenu1;
        private javax.swing.JLabel valueLabel;
        // End of variables declaration//GEN-END:variables
=======
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnConfirmOrder;
    private javax.swing.JButton btnRemovefromCart;
    private javax.swing.JTable cartJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable menuJTable;
    private javax.swing.JTextField tfTotalPrice;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

    private void populateMenuTable() {
        DefaultTableModel model = (DefaultTableModel) menuJTable.getModel();
        model.setRowCount(0);
        for(Items i : itemsdir.getItemsList()){
            Object[] row = new Object[4];
            row[0] = i.getName();
            row[1] = i.getDesc();
            row[2] = i.getPrice();
            row[3] = i.getQuantity();
            model.addRow(row);
        }
    }

    private void populateCartTable() {
        DefaultTableModel model = (DefaultTableModel) cartJTable.getModel();
        model.setRowCount(0);
        for(Items i : orderItems){
            Object[] row = new Object[3];
            row[0] = i.getName();
            row[1] = i.getDesc();
            row[2] = i.getPrice();
            
            model.addRow(row);
        }
    }
>>>>>>> Stashed changes
}
