/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package01;

/**
 *
 * @author ALUNOS
 */
public class Tela01 extends javax.swing.JFrame {

    public Tela01() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Conversão de Moedas");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Digite o valor em Real:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Converter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double real = Double.valueOf(jTextField1.getText());
        double dolarusa = real*4.07;
        double dolaraus = real*2.82;
        double libra = real*6.20;
        double coroa = real*0.48;
        double peso = real*0.43;
        double euro = real*4.57;
        double franco = real*4.18;
        double iene = real*0.34;
        
        Tela02 t2 = new Tela02();
        t2.setVisible(true);
        //t2.DolarAmericano.setText("Dólar Americano: "+ dolarusa);
        if (real>dolaraus){
           t2.DolarAmericano.setText("Dólar Americano: "+ dolarusa+" - Mais barato que o Real"); 
        }else{
           t2.DolarAmericano.setText("Dólar Americano: "+ dolarusa+" - Mais caro que o Real");
        }
        //t2.DolarAustraliano.setText("Dólar Australiano: "+dolaraus);
        if (real>dolaraus){
           t2.DolarAustraliano.setText("Dólar Australiano: "+dolaraus+" - Mais barato que o Real"); 
        }else{
           t2.DolarAustraliano.setText("Dólar Australiano: "+dolaraus+" - Mais caro que o Real");
        }
        //t2.LibraEsterlina.setText("Libra Esterlina: "+libra);
        if (real>libra){
           t2.LibraEsterlina.setText("Libra Esterlina: "+libra+" - Mais barato que o Real"); 
        }else{
           t2.LibraEsterlina.setText("Libra Esterlina: "+libra+" - Mais caro que o Real");
        }
        //t2.CoroaSueca.setText("Coroa Sueca: "+coroa);
        if (real>coroa){
           t2.CoroaSueca.setText("Coroa Sueca: "+coroa+" - Mais barato que o Real"); 
        }else{
           t2.CoroaSueca.setText("Coroa Sueca: "+coroa+" - Mais caro que o Real");
        }
        //t2.PesoArgentino.setText("Peso Argentino: "+peso);
        if (real>peso){
           t2.PesoArgentino.setText("Peso Argentino: "+peso+" - Mais barato que o Real"); 
        }else{
           t2.PesoArgentino.setText("Peso Argentino: "+peso+" - Mais caro que o Real");
        }
        //t2.Euro.setText("Euro: "+euro);
        if (real>euro){
           t2.Euro.setText("Euro: "+euro+" - Mais barato que o Real"); 
        }else{
           t2.Euro.setText("Euro: "+euro+" - Mais caro que o Real");
        }
        //t2.FrancoSuico.setText("Franco Suiço: "+franco);
        if (real>franco){
           t2.FrancoSuico.setText("Franco Suiço: "+franco+" - Mais barato que o Real"); 
        }else{
           t2.FrancoSuico.setText("Franco Suiço: "+franco+" - Mais caro que o Real");
        }
        //t2.Iene.setText("Iene: "+iene);
        if (real>iene){
           t2.Iene.setText("Iene: "+iene+" - Mais barato que o Real"); 
        }else{
           t2.Iene.setText("Iene: "+iene+" - Mais caro que o Real");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
