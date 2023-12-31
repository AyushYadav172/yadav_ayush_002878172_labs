 /*
 * CreateProductJPanel.java
 *
 */
package ui.supplier;

import model.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Feature;
import model.Supplier;
import model.SupplierDirectory;

/**
 *
 * @author Rushabh
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    JPanel workArea;
    Product product;
    SupplierDirectory supplierDirectory;
    /**
     * Creates new form CreateProductJPanel
     */
    public ViewProductDetailJPanel(JPanel workArea, Product product,SupplierDirectory supplierDirectory) {
        initComponents();
        this.workArea = workArea;
        this.product = product;
        this.supplierDirectory = supplierDirectory;
        txtName.setText(this.product.getName());
        txtId.setText(String.valueOf(this.product.getId()));
        txtPrice.setText(String.valueOf(this.product.getPrice()));
        if (product.getLogoImage() != null) {
            imgLogo.setIcon(product.getLogoImage());
        } else {
            imgLogo.setText("No Logo Posted");
        }
        refreshTable();
        populateExistingFeatures();
    }
    
     public void populateExistingFeatures() {
       optionsExistingFeature.removeAllItems();
      for(Supplier s : supplierDirectory.getSupplierList()){
          for(Product p : s.getProductCatalog().getProductCatalog()){
              for(Feature f: p.getFeatures()){
                  optionsExistingFeature.addItem(f.getName());
              }
          }
      }
     
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFeatures = new javax.swing.JTable();
        btnAddFeature = new javax.swing.JButton();
        btnRemoveFeature = new javax.swing.JButton();
        optionsExistingFeature = new javax.swing.JComboBox<>();
        btnAddSelectedFeature = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setText("View Product Details");

        lblName.setText("Product Name:");

        txtName.setEditable(false);

        lblPrice.setText("Price:");

        txtPrice.setEditable(false);

        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        txtId.setEditable(false);

        lblId.setText("ID:");

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblFeatures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Feature Name", "Value"
            }
        ));
        tblFeatures.setEnabled(false);
        jScrollPane1.setViewportView(tblFeatures);

        btnAddFeature.setText("Add Feature");
        btnAddFeature.setEnabled(false);
        btnAddFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFeatureActionPerformed(evt);
            }
        });

        btnRemoveFeature.setText("Remove Feature");
        btnRemoveFeature.setEnabled(false);
        btnRemoveFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFeatureActionPerformed(evt);
            }
        });

        optionsExistingFeature.setEnabled(false);

        btnAddSelectedFeature.setText("Add Selected Feature");
        btnAddSelectedFeature.setEnabled(false);
        btnAddSelectedFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSelectedFeatureActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Existing Feature:");

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddFeature)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemoveFeature)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton1)
                                .addGap(38, 38, 38)
                                .addComponent(lblTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(optionsExistingFeature, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(lblId)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                        .addComponent(lblPrice)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddSelectedFeature)
                                    .addComponent(txtPrice))))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSave, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(backButton1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPrice)
                        .addComponent(lblId)
                        .addComponent(lblName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionsExistingFeature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddSelectedFeature)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddFeature)
                    .addComponent(btnRemoveFeature)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addGap(194, 194, 194))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtId, txtPrice});

    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEditable(true);
        txtPrice.setEditable(true);
        btnSave.setEnabled(true);
        tblFeatures.setEnabled(true);
        btnAddFeature.setEnabled(true);
        btnRemoveFeature.setEnabled(true);
        optionsExistingFeature.setEnabled(true);
        btnAddSelectedFeature.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void backAction() {
        Component component;
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        if(componentArray[componentArray.length - 1] instanceof ManageProductCatalogJPanel){
            System.out.println("here here here here here here ");
            component = componentArray[componentArray.length - 1];
            ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
            manageProductCatalogJPanel.refreshTable();
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.previous(workArea);
        }else{
            component = componentArray[componentArray.length - 2];
            ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
            manageProductCatalogJPanel.refreshTable();
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.previous(workArea);
            layout.previous(workArea);
        }
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        product.setPrice(Integer.parseInt(txtPrice.getText()));
        product.setName(txtName.getText());
        saveFeatures();
        
        txtName.setEditable(false);
        txtPrice.setEditable(false);
        btnSave.setEnabled(false);
        tblFeatures.setEnabled(false);
        btnAddFeature.setEnabled(false);
        btnRemoveFeature.setEnabled(false);
        
        JOptionPane.showMessageDialog(this,"Product Information Saved.", "Information", JOptionPane.INFORMATION_MESSAGE);
        refreshTable();
        populateExistingFeatures();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void saveFeatures() {
       DefaultTableModel model = (DefaultTableModel) tblFeatures.getModel();
       
       for(int i=0; i < model.getRowCount(); i++){
           Feature currentFeature = product.getFeatures().get(i);
           currentFeature.setName(tblFeatures.getValueAt(i, 0).toString());
           currentFeature.setValue(tblFeatures.getValueAt(i, 1));
       }
    }

    private void btnAddFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFeatureActionPerformed
        // TODO add your handling code here:
        Feature newFeature = product.addNewFeature();
        newFeature.setName("New Feature");
        newFeature.setValue("Type Value here");
        
        saveFeatures();
        refreshTable();
       
    }//GEN-LAST:event_btnAddFeatureActionPerformed

    private void btnRemoveFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFeatureActionPerformed
        // TODO add your handling code here:
        saveFeatures();
        
        int selectedRow = tblFeatures.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select a row from the table first","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
       product.getFeatures().remove(selectedRow);
       refreshTable(); 
    }//GEN-LAST:event_btnRemoveFeatureActionPerformed

    private void btnAddSelectedFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSelectedFeatureActionPerformed
        // TODO add your handling code here:
        Feature newFeature = product.addNewFeature();
        newFeature.setName(String.valueOf(optionsExistingFeature.getSelectedItem()));
        newFeature.setValue("Type Value here");
        
        saveFeatures();
        refreshTable();
        
    }//GEN-LAST:event_btnAddSelectedFeatureActionPerformed

    public void refreshTable() {

        DefaultTableModel model = (DefaultTableModel) tblFeatures.getModel();
        model.setRowCount(0);
        
        for(Feature f: product.getFeatures()){
            Object row[] = new Object[2];
            row[0] = f;
            row[1] = f.getValue() == null ? "Empty" : f.getValue().toString();
            model.addRow(row);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JButton btnAddFeature;
    private javax.swing.JButton btnAddSelectedFeature;
    private javax.swing.JButton btnRemoveFeature;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JComboBox<String> optionsExistingFeature;
    private javax.swing.JTable tblFeatures;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
