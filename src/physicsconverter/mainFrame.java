/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physicsconverter;

/**
 *
 * @author Sunbeam
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        forceField.setEnabled(false);
        areaField.setEnabled(false);
        distanceField.setEnabled(false);
        displacementField.setEnabled(false);
        tempField.setEnabled(false);
        errorLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        forceLabel = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        distanceLabel = new javax.swing.JLabel();
        displacementLabel = new javax.swing.JLabel();
        tempLabel = new javax.swing.JLabel();
        forceField = new javax.swing.JTextField();
        areaField = new javax.swing.JTextField();
        distanceField = new javax.swing.JTextField();
        displacementField = new javax.swing.JTextField();
        tempField = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        tempButton = new javax.swing.JRadioButton();
        pressureButton = new javax.swing.JRadioButton();
        torqueButton = new javax.swing.JRadioButton();
        workButton = new javax.swing.JRadioButton();
        output = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();
        siUnits = new javax.swing.JRadioButton();
        imperialUnits = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Physics Conversion Program Alpha Build v. STA");

        forceLabel.setText("Force");

        areaLabel.setText("Area");

        distanceLabel.setText("Distance");

        displacementLabel.setText("Displacement");

        tempLabel.setText("Temp");

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        buttonGroup1.add(tempButton);
        tempButton.setText("Temperature");
        tempButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(pressureButton);
        pressureButton.setText("Pressure");
        pressureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressureButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(torqueButton);
        torqueButton.setText("Torque");
        torqueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torqueButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(workButton);
        workButton.setText("Work");
        workButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workButtonActionPerformed(evt);
            }
        });

        output.setEditable(false);

        errorLabel.setText("Not a integer or double input*");

        buttonGroup2.add(siUnits);
        siUnits.setText("SI Units");
        siUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siUnitsActionPerformed(evt);
            }
        });

        buttonGroup2.add(imperialUnits);
        imperialUnits.setText("Imperial Units");
        imperialUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imperialUnitsActionPerformed(evt);
            }
        });

        jLabel1.setText("Note: All units imputed are in \"Imperial/Customary/US\" form ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(imperialUnits)
                    .addComponent(siUnits)
                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(areaLabel)
                                    .addComponent(forceLabel)
                                    .addComponent(distanceLabel))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(areaField)
                                    .addComponent(forceField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(distanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displacementLabel)
                                    .addComponent(tempLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tempField)
                                    .addComponent(displacementField))))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tempButton)
                                .addComponent(workButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pressureButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(torqueButton, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(calculate))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forceLabel)
                    .addComponent(forceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel)
                    .addComponent(areaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pressureButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distanceLabel)
                    .addComponent(distanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workButton))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displacementLabel)
                    .addComponent(displacementField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torqueButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempLabel)
                    .addComponent(tempField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siUnits)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imperialUnits)
                .addGap(8, 8, 8)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorLabel)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        if(this.isEnabled()){
            try{
            if (tempButton.isSelected()){
                String temperature = tempField.getText();
                double temperature1 = Double.parseDouble(temperature);
                tempFormula(temperature1);
                tempField.setEnabled(false);
                tempField.setText("");
            }} catch(NumberFormatException hi){
                errorLabel.setVisible(true);
                tempField.setEnabled(false);
                tempField.setText("");
            }
            try{
            if (pressureButton.isSelected()){
                String force = forceField.getText();
                double force1 = Double.parseDouble(force);
                String area = areaField.getText();
                double area1 = Double.parseDouble(area);
                pressureFormula(force1, area1);
                forceField.setEnabled(false);
                areaField.setEnabled(false);
                forceField.setText("");
                areaField.setText("");
            }} catch(NumberFormatException hi){
                errorLabel.setVisible(true);
                forceField.setEnabled(false);
                areaField.setEnabled(false);
                forceField.setText("");
                areaField.setText("");
            }
            try{
            if (workButton.isSelected()){
                String force = forceField.getText();
                double force1 = Double.parseDouble(force);
                String displacement = displacementField.getText();
                double displacement1 = Double.parseDouble(displacement);
                workFormula(force1, displacement1);
                forceField.setEnabled(false);
                displacementField.setEnabled(false);
                forceField.setText("");
                displacementField.setText("");
            }} catch(NumberFormatException hi){
                errorLabel.setVisible(true);
                forceField.setEnabled(false);
                displacementField.setEnabled(false);
                forceField.setText("");
                displacementField.setText("");
            }
            try{
            if (torqueButton.isSelected()){
                String force = forceField.getText();
                double force1 = Double.parseDouble(force);
                String distance = distanceField.getText();
                double distance1 = Double.parseDouble(distance);
                torqueFormula(force1, distance1);
                forceField.setEnabled(false);
                distanceField.setEnabled(false);
                forceField.setText("");
                distanceField.setText("");
            }} catch(NumberFormatException hi){
                errorLabel.setVisible(true);
                forceField.setEnabled(false);
                distanceField.setEnabled(false);
                forceField.setText("");
                distanceField.setText("");
            }
        }
    }//GEN-LAST:event_calculateActionPerformed

    private void tempButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempButtonActionPerformed
        if (tempButton.isSelected()){
            errorLabel.setVisible(false);
            tempField.setEnabled(true);
            forceField.setEnabled(false);
            areaField.setEnabled(false);
            distanceField.setEnabled(false);
            displacementField.setEnabled(false);
            output.setText("");
        }
    }//GEN-LAST:event_tempButtonActionPerformed

    private void pressureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pressureButtonActionPerformed
        if (pressureButton.isSelected()){
            errorLabel.setVisible(false);
            forceField.setEnabled(true);
            areaField.setEnabled(true);
            tempField.setEnabled(false);
            distanceField.setEnabled(false);
            displacementField.setEnabled(false);
            output.setText("");
        }
    }//GEN-LAST:event_pressureButtonActionPerformed

    private void workButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workButtonActionPerformed
        if (workButton.isSelected()){
            errorLabel.setVisible(false);
            forceField.setEnabled(true);
            displacementField.setEnabled(true);
            areaField.setEnabled(false);
            tempField.setEnabled(false);
            distanceField.setEnabled(false);
            output.setText("");
        }
    }//GEN-LAST:event_workButtonActionPerformed

    private void torqueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torqueButtonActionPerformed
        if (torqueButton.isSelected()){
            errorLabel.setVisible(false);
            forceField.setEnabled(true);
            distanceField.setEnabled(true);
            displacementField.setEnabled(false);
            areaField.setEnabled(false);
            tempField.setEnabled(false);
            output.setText("");
        }
    }//GEN-LAST:event_torqueButtonActionPerformed

    private void siUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siUnitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siUnitsActionPerformed

    private void imperialUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imperialUnitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imperialUnitsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
            
        });
        
        
    }
//    public void PhysFormula(double force, double area, double distance, double displacement, double temp){
//         if (tempButton.isEnabled()){
//                    String temperature = tempField.getText();
//                    double temperature1 = Double.parseDouble(temperature);
//                    double temperature2 = 5.0/9.0 * (temperature1 - 32);
//                    String temperatureFinal = String.valueOf(temperature2);
//                    output.setText(temperatureFinal);
//                }       
//            }
        public void tempFormula(double temp){
            try{
            if(siUnits.isSelected()){
                    String temperature = tempField.getText();
                    double temperature1 = Double.parseDouble(temperature);
                    double temperature2 = 5.0/9.0 * (temperature1 - 32);
                    int temperature3 = (int)temperature2;
                    double temperature4 = temperature3 + 273;
                    int temperature5 = (int)temperature4;
                    String temperatureFinal = String.valueOf(temperature5);
                    output.setText(temperatureFinal);
            }if(imperialUnits.isSelected()){
                String temperature = tempField.getText();
                double temperature1 = Double.parseDouble(temperature);
                double temperature2 = 5.0/9.0 * (temperature1 - 32);
                int temperature3 = (int)temperature2;
                String temperatureFinal = String.valueOf(temperature3);
                output.setText(temperatureFinal);
            }
            }catch(NumberFormatException hi){
                errorLabel.setVisible(true);
                tempField.setEnabled(false);
                tempField.setText("");
            }
        }
        public void pressureFormula(double pressureForce, double pressureArea){
            try{
                if(siUnits.isSelected()){
                    String force = forceField.getText();
                    double force1 = Double.parseDouble(force);
                    String area = areaField.getText();
                    double area1 = Double.parseDouble(area);
                    double pressure = force1/area1;
                    int pressure2 = (int)pressure;
                    double pressure3 = pressure2 * 6894.75729;
                    int pressure4 = (int)pressure3;
                    String pressureFinal = String.valueOf(pressure4);
                    output.setText(pressureFinal);
                }if(imperialUnits.isSelected()){
                    String force = forceField.getText();
                    double force1 = Double.parseDouble(force);
                    String area = areaField.getText();
                    double area1 = Double.parseDouble(area);
                    double pressure = force1/area1;
                    int pressure2 = (int)pressure;
                    String pressureFinal = String.valueOf(pressure2);
                    output.setText(pressureFinal);
                }else{
                    errorLabel.setVisible(true);
                    forceField.setEnabled(false);
                    areaField.setEnabled(false);
                    forceField.setText("");
                    areaField.setText("");
                }
            }
            catch(NumberFormatException hi){
                errorLabel.setVisible(true);
                forceField.setEnabled(false);
                areaField.setEnabled(false);
                forceField.setText("");
                areaField.setText("");
            }
        }
        public void workFormula(double workForce, double workDisplacement){
            try{
                if(siUnits.isSelected()){
                    String force = forceField.getText();
                    double force1 = Double.parseDouble(force);
                    String displacement = displacementField.getText();
                    double displacement1 = Double.parseDouble(displacement);
                    double work = force1 * displacement1;
                    int work1 = (int)work;
                    double work2 = work1 * 1.3558179483314;
                    int work3 = (int)work2;
                    String workFinal = String.valueOf(work3);
                    output.setText(workFinal);
                }if(imperialUnits.isSelected()){
                    String force = forceField.getText();
                    double force1 = Double.parseDouble(force);
                    String displacement = displacementField.getText();
                    double displacement1 = Double.parseDouble(displacement);
                    double work = force1 * displacement1;
                    String workFinal = String.valueOf(work);
                    output.setText(workFinal);
                }else{
                    errorLabel.setVisible(true);
                    forceField.setEnabled(false);
                    areaField.setEnabled(false);
                    forceField.setText("");
                    areaField.setText("");
                }
            }
            catch(NumberFormatException hi){
                errorLabel.setVisible(true);
                forceField.setEnabled(false);
                areaField.setEnabled(false);
                forceField.setText("");
                areaField.setText("");
            }
        }
        public void torqueFormula(double torqueForce, double torqueDistance){
            try{
                if(siUnits.isSelected()){
                    String force = forceField.getText();
                    double force1 = Double.parseDouble(force);
                    String distance = distanceField.getText();
                    double distance1 = Double.parseDouble(distance);
                    double torque = force1 * distance1;
                    int torque1 = (int)torque;
                    double torque2 = torque1 * 1.355818;
                    int torque3 = (int)torque2;
                    String torqueFinal = String.valueOf(torque3);
                    output.setText(torqueFinal);
                }if(imperialUnits.isSelected()){
                    String force = forceField.getText();
                    double force1 = Double.parseDouble(force);
                    String distance = distanceField.getText();
                    double distance1 = Double.parseDouble(distance);
                    double torque = force1 * distance1;
                    String torqueFinal = String.valueOf(torque);
                    output.setText(torqueFinal);
                }else{
                    errorLabel.setVisible(true);
                    forceField.setEnabled(false);
                    areaField.setEnabled(false);
                    forceField.setText("");
                    areaField.setText("");
                }
            }catch(NumberFormatException hi){
                errorLabel.setVisible(true);
                forceField.setEnabled(false);
                areaField.setEnabled(false);
                forceField.setText("");
                areaField.setText("");
            }
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaField;
    private javax.swing.JLabel areaLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField displacementField;
    private javax.swing.JLabel displacementLabel;
    private javax.swing.JTextField distanceField;
    private javax.swing.JLabel distanceLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField forceField;
    private javax.swing.JLabel forceLabel;
    private javax.swing.JRadioButton imperialUnits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField output;
    private javax.swing.JRadioButton pressureButton;
    private javax.swing.JRadioButton siUnits;
    private javax.swing.JRadioButton tempButton;
    private javax.swing.JTextField tempField;
    private javax.swing.JLabel tempLabel;
    private javax.swing.JRadioButton torqueButton;
    private javax.swing.JRadioButton workButton;
    // End of variables declaration//GEN-END:variables
}
