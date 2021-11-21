
package Calculadora;


public class ClauladoraBasica extends javax.swing.JFrame {
    
   
    public ClauladoraBasica() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        lbl_valor1 = new javax.swing.JLabel();
        lbl_valor2 = new javax.swing.JLabel();
        ct_valor1 = new javax.swing.JTextField();
        ct_valor2 = new javax.swing.JTextField();
        lbl_op = new javax.swing.JLabel();
        cb_op = new javax.swing.JComboBox<>();
        bt_executar = new javax.swing.JButton();
        lbl_resul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_titulo.setText("Calculadora Basica");

        lbl_valor1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_valor1.setText("Valor01");

        lbl_valor2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_valor2.setText("Valor02");

        ct_valor1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ct_valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct_valor1ActionPerformed(evt);
            }
        });

        ct_valor2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ct_valor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct_valor2ActionPerformed(evt);
            }
        });

        lbl_op.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_op.setText("OperaÃ§Ãµes");

        cb_op.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cb_op.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Somar ", "Subtrair ", "Dividir", "Multiplicar", " " }));
        cb_op.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bt_executar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bt_executar.setText("Executar");
        bt_executar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_executarActionPerformed(evt);
            }
        });

        lbl_resul.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_resul.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_executar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(145, 145, 145)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl_valor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_valor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(133, 133, 133)
                                    .addComponent(lbl_op))))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_op, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ct_valor1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addComponent(ct_valor2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lbl_resul, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ct_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(ct_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_op)
                            .addComponent(cb_op, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_valor2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(bt_executar)
                .addGap(54, 54, 54)
                .addComponent(lbl_resul)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Interface I = new Interface();
     private void print(String texto){
        lbl_resul.setText(texto);
    }
    private void bt_executarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_executarActionPerformed
      
        I.setN1(Double.parseDouble(ct_valor1.getText()));
        I.setN2(Double.parseDouble(ct_valor2.getText()));
        
        int op = cb_op.getSelectedIndex();

             switch(op){
                case 0:
                    //Selecionar
                   break;  
                case 1:
                    //Somar
                    if(I.n1 != 0 && I.n2 != 0){
                    
                     
                    I.Somar = (I.n1 + I.n2);
                     }
                    print("Resultado = " + I.Somar);
                        break;
                case 2:
                    //Subtrair
                     if(I.n1 != 0 && I.n2 != 0){
                    
                     I.setSubtrair((I.n1 - I.n2)); 
                     }  
                     print("Resultado = " + I.Subtrair);
                     break;
                
                case 3:
                        //Dividir
                     if(I.n1 != 0 && I.n2 != 0){
                    
                     I.Dividir = (I.n1 / I.n2);
                     }
                     print("Resultado = " + I.Dividir);
                        break;
                        
                default:  
                        //Multiplicar
                      if(I.n1 != 0 && I.n2 != 0){
                                         
                    I.Multiplicar = (I.n1 * I.n2);
                     }
                     print("Resultado = " + I.Multiplicar);
                         break;           
                }
           
       
        
    }//GEN-LAST:event_bt_executarActionPerformed

   
   
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
            java.util.logging.Logger.getLogger(ClauladoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClauladoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClauladoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClauladoraBasica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClauladoraBasica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_executar;
    private javax.swing.JComboBox<String> cb_op;
    private javax.swing.JTextField ct_valor1;
    private javax.swing.JTextField ct_valor2;
    private javax.swing.JLabel lbl_op;
    private javax.swing.JLabel lbl_resul;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_valor1;
    private javax.swing.JLabel lbl_valor2;
    // End of variables declaration//GEN-END:variables
}
