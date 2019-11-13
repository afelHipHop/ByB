/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byb;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author afelr
 */
public class ByBGrafico extends javax.swing.JFrame {
    
    private ByB b;    
    
    private ArrayList<JTextField> txt;
    private ArrayList<JTextField> txtFO;
    private ArrayList<JComboBox> cb;
    private ArrayList<JLabel> lblSol;
    private int cantRestricciones;
    private int cantVariables; 
    


    /**
     * Creates new form ByBGrafico
     */
    public ByBGrafico() {
        initComponents();
        cmbFO.removeAllItems();
        cmbFO.setEnabled(false);
        btnSolucion.setEnabled(false);
        btnLimpiar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenerar = new javax.swing.JButton();
        lblRestricciones = new javax.swing.JLabel();
        lblVariables = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlPanel = new javax.swing.JPanel();
        btnSolucion = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        pnlFO = new javax.swing.JPanel();
        cmbFO = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        pnlSol = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        txtVariables = new javax.swing.JTextField();
        txtRestricciones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        lblRestricciones.setText("Restricciones:");

        lblVariables.setText("Variables:");

        javax.swing.GroupLayout pnlPanelLayout = new javax.swing.GroupLayout(pnlPanel);
        pnlPanel.setLayout(pnlPanelLayout);
        pnlPanelLayout.setHorizontalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );
        pnlPanelLayout.setVerticalGroup(
            pnlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(pnlPanel);

        btnSolucion.setText("Encontrar solucion");
        btnSolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucionActionPerformed(evt);
            }
        });

        cmbFO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlFOLayout = new javax.swing.GroupLayout(pnlFO);
        pnlFO.setLayout(pnlFOLayout);
        pnlFOLayout.setHorizontalGroup(
            pnlFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );
        pnlFOLayout.setVerticalGroup(
            pnlFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbFO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(pnlFO);

        javax.swing.GroupLayout pnlSolLayout = new javax.swing.GroupLayout(pnlSol);
        pnlSol.setLayout(pnlSolLayout);
        pnlSolLayout.setHorizontalGroup(
            pnlSolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        pnlSolLayout.setVerticalGroup(
            pnlSolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        jScrollPane5.setViewportView(pnlSol);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtVariables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVariablesActionPerformed(evt);
            }
        });
        txtVariables.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVariablesKeyTyped(evt);
            }
        });

        txtRestricciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRestriccionesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(lblRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSolucion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblVariables)
                    .addComponent(btnGenerar)
                    .addComponent(lblRestricciones)
                    .addComponent(txtVariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRestricciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolucion)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if(txtRestricciones.getText().equals("") || txtVariables.getText().equals("") || txtRestricciones.getText().equals("0") || txtVariables.getText().equals("0")){
            JOptionPane.showMessageDialog(rootPane, "Campos de variables o restriccion incompletos");
        }else{
            cantRestricciones = Integer.parseInt(txtRestricciones.getText());
            cantVariables = Integer.parseInt(txtVariables.getText());
            txt = new ArrayList<>();
            txtFO = new ArrayList<>();
            cb = new ArrayList<>();
            lblSol = new ArrayList<>();
            generarCamposFO(cantVariables);
            generarCampos(cantRestricciones,cantVariables);
            generarCamposSol(cantVariables);
            actualizarPaneles();
            btnSolucion.setEnabled(true);
            btnGenerar.setEnabled(false);
            txtRestricciones.setEnabled(false);
            txtVariables.setEnabled(false);
        }
        

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnSolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucionActionPerformed
        if(verificarCampos()){
            try {
                b = new ByB(problema(), cantVariables);
                mostrarResultado();
            } catch (Exception ex) {
                Logger.getLogger(ByBGrafico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Todos los campos deben estar completos, si alguna variable no tiene valor en alguna restriccion por favor completar con un 0");
        }
    }//GEN-LAST:event_btnSolucionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarPaneles();
        actualizarPaneles();
        cmbFO.removeAllItems();
        btnSolucion.setEnabled(false);
        btnGenerar.setEnabled(true);
        txtRestricciones.setEnabled(true);
        txtVariables.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtVariablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVariablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVariablesActionPerformed

    private void txtVariablesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVariablesKeyTyped
        char caracter = evt.getKeyChar();
            if(((caracter < '0') || (caracter > '9'))){
                evt.consume();
            }
    }//GEN-LAST:event_txtVariablesKeyTyped

    private void txtRestriccionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRestriccionesKeyTyped
         char caracter = evt.getKeyChar();
            if(((caracter < '0') || (caracter > '9'))){
                evt.consume();
            }
    }//GEN-LAST:event_txtRestriccionesKeyTyped

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
            java.util.logging.Logger.getLogger(ByBGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ByBGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ByBGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ByBGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ByBGrafico().setVisible(true);
            }
        });
    }

    public void limpiarPaneles(){
        pnlFO.removeAll();
        pnlPanel.removeAll();
        pnlSol.removeAll();
    }
    
    public void actualizarPaneles(){
        pnlFO.updateUI();
        pnlPanel.updateUI();
        pnlSol.updateUI();
    }
    
    public void generarCampos(int r, int v){
        v = (v*2)+2;
        GridLayout gl = new GridLayout(r,v);
        pnlPanel.setLayout(gl);
        for (int i = 0; i<r;i++){
            int x=1;
            for (int j = 0; j<v;j++){
                if(j%(v-2)==0 && j!=0){
                    crearComboBox();
                }else{
                    if(j%2==0 || j%(v-1)==0){
                        crearTextField(pnlPanel,txt);
                    }else{
                        crearLabel(pnlPanel,"X"+x);
                        x++;
                    }
                }
            }
        }
    }
    
    public void generarCamposFO(int v){
        v=(v*2);
        GridLayout glr = new GridLayout(1,v+2);
        pnlFO.setLayout(glr);
        cmbFO.addItem("min");
        cmbFO.addItem("max");
        pnlFO.add(cmbFO);
        pnlFO.add(new JLabel("Z = "));
        int x=1;
        for (int i = 0; i<v;i++){
            if(i%2==0){
                crearTextField(pnlFO,txtFO);
            }else{
                crearLabel(pnlFO,"X"+x);
                x++;
            }        
        }
        cmbFO.setEnabled(true);
    }
    
    public void generarCamposSol(int v){
        v+=2;
        GridLayout gls = new GridLayout(v,1);
        pnlSol.setLayout(gls);
        for (int i = 0; i<v;i++){
            crearLabel(pnlSol,"");
        }
    }
    
    public void mostrarResultado() throws Exception{
        if(b.getFactible()){
            for(int i = 0;i<lblSol.size();i++){
                if(i==0){
                    lblSol.get(i).setText("Problema factible, si se puede resolver");
                }else{
                    if(i==1){
                        lblSol.get(i).setText("Z= "+b.getResultado());
                    }else{
                        llenarLabel(i);
                    }
                }
            }
        }else{
            lblSol.get(0).setText("No es posible resolver, no es factible");
        }
        pnlSol.updateUI();
    }
    
    public void llenarLabel(int i){
        lblSol.get(i).setText(b.getNombreVariables().get(i-2)+" = "+b.getValorVariables().get(i-2));
    }
    
    public void crearTextField(JPanel panel, ArrayList list){
        final JTextField tf = new JTextField();
        tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e){
                char caracter = e.getKeyChar();
                if(caracter == '-' && tf.getText().equals("")){

                }else{
                    if(((caracter < '0') || (caracter > '9'))){
                        e.consume();
                    }
                }
            }
        });
        panel.add(tf);
        list.add(tf);
    }
    
    public void crearLabel(JPanel panel, String msg){
        JLabel lb = new JLabel(msg);
        panel.add(lb);
        if(panel.equals(pnlSol))
            lblSol.add(lb); 
    }
    
    public void crearComboBox(){
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("<=");
        comboBox.addItem(">=");
        comboBox.addItem("=");
        pnlPanel.add(comboBox);
        cb.add(comboBox);
    }
    
    public ArrayList<String> recogerDatosFO(){
        ArrayList<String> funcion = new ArrayList<>();
        for(JTextField f: txtFO){
            funcion.add(f.getText());
        }
        return funcion;
    }
    
    public ArrayList recogerDatosCB(){
        ArrayList<String> simbolos = new ArrayList<>();
        for(JComboBox s: cb){
            simbolos.add((String)s.getSelectedItem());
        }
        return simbolos;
    }
    
    public ArrayList<String> recogerDatosRes(){
        ArrayList<String> restricciones = new ArrayList<>();
        for(int i = 1;i<=txt.size();i++){
            if(i%(cantVariables+1)==0&&i!=0){
                //iRestricciones.add(txt.get(i-1).getText());
            }else{
                restricciones.add(txt.get(i-1).getText());
            }
        }
        return restricciones;
    }
    
    public ArrayList<String> recogerDatosIRes(){
        ArrayList<String> iRestricciones = new ArrayList<>();
        for(int i = 1;i<=txt.size();i++){
            if(i%(cantVariables+1)==0&&i!=0){
                iRestricciones.add(txt.get(i-1).getText());
            }
        }
        return iRestricciones;
    }
    
    public Boolean verificarCampos(){
        for(String s: recogerDatosFO()){
            if(s.equals("") || s.equals("-")){
                return false;
            }
        }
        for(String s: recogerDatosRes()){
            if(s.equals("") || s.equals("-")){
                return false;
            }
        }
        for(String s: recogerDatosIRes()){
            if(s.equals("") || s.equals("-")){
                return false;
            }
        }
        return true;
    }
    
    public String problema(){
        return new Interprete().interpretar(recogerDatosFO(), recogerDatosRes(), (String)cmbFO.getSelectedItem(), recogerDatosCB(), recogerDatosIRes(),cantVariables);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSolucion;
    private javax.swing.JComboBox<String> cmbFO;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblRestricciones;
    private javax.swing.JLabel lblVariables;
    private javax.swing.JPanel pnlFO;
    private javax.swing.JPanel pnlPanel;
    private javax.swing.JPanel pnlSol;
    private javax.swing.JTextField txtRestricciones;
    private javax.swing.JTextField txtVariables;
    // End of variables declaration//GEN-END:variables
}
