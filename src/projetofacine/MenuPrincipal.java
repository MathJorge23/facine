
package projetofacine;


public class MenuPrincipal extends javax.swing.JFrame {
    private costrutorCadastro cadastro;
    private MySQL conexao;
    FilmeEscolhido envia_filme; 
    FilmeEscolhido envia_email;

    public MenuPrincipal() {
        initComponents();
        email_logado.setEditable(false);
        initComplementos();
    }
    
        public void initComplementos(){
        this.setLocationRelativeTo(null);
    }
    
public void recebendo (String recebe){
    email_logado.setText(recebe);
   
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        buttonFilme2 = new javax.swing.JButton();
        buttonFilme3 = new javax.swing.JButton();
        buttonFilme4 = new javax.swing.JButton();
        buttonFilme5 = new javax.swing.JButton();
        buttonFilme6 = new javax.swing.JButton();
        buttonFilme1 = new javax.swing.JButton();
        email_logado = new javax.swing.JTextField();
        nome_filme1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nome_filme2 = new javax.swing.JLabel();
        nome_filme3 = new javax.swing.JLabel();
        nome_filme4 = new javax.swing.JLabel();
        nome_filme5 = new javax.swing.JLabel();
        nome_filme6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(236, 240, 241));
        jLabel14.setText("Selecione o Filme que deseja assistir:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 33, -1, -1));

        buttonFilme2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonFilme2.setText("Selecionar");
        buttonFilme2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFilme2MouseClicked(evt);
            }
        });
        buttonFilme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFilme2ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonFilme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        buttonFilme3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonFilme3.setText("Selecionar");
        buttonFilme3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFilme3MouseClicked(evt);
            }
        });
        buttonFilme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFilme3ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonFilme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, -1));

        buttonFilme4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonFilme4.setText("Selecionar");
        buttonFilme4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFilme4MouseClicked(evt);
            }
        });
        buttonFilme4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFilme4ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonFilme4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, -1, -1));

        buttonFilme5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonFilme5.setText("Selecionar");
        buttonFilme5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFilme5MouseClicked(evt);
            }
        });
        buttonFilme5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFilme5ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonFilme5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, -1, -1));

        buttonFilme6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonFilme6.setText("Selecionar");
        buttonFilme6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFilme6MouseClicked(evt);
            }
        });
        buttonFilme6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFilme6ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonFilme6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 630, -1, -1));

        buttonFilme1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonFilme1.setText("Selecionar");
        buttonFilme1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFilme1MouseClicked(evt);
            }
        });
        buttonFilme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFilme1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonFilme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        email_logado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_logadoActionPerformed(evt);
            }
        });
        jPanel1.add(email_logado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 151, -1));

        nome_filme1.setText("Taxi Driver");
        jPanel1.add(nome_filme1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 60, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetofacine/imagens/Laranja mecânica cortado.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetofacine/imagens/taxi-driver cortado.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetofacine/imagens/Coração Valente cortado.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetofacine/imagens/Hellraiser cortado.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetofacine/imagens/Indiana Jones cortado.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetofacine/imagens/bons amigos.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        nome_filme2.setText("Laranja Mecanica");
        jPanel1.add(nome_filme2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 100, 20));

        nome_filme3.setText("BraveHeart");
        jPanel1.add(nome_filme3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 60, -1));

        nome_filme4.setText("Hell Raiser");
        jPanel1.add(nome_filme4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 60, -1));

        nome_filme5.setText("Indiana jones");
        jPanel1.add(nome_filme5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 80, -1));

        nome_filme6.setText("Good Fellas");
        jPanel1.add(nome_filme6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFilme6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilme6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFilme6ActionPerformed

    private void buttonFilme5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilme5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFilme5ActionPerformed

    private void buttonFilme4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilme4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFilme4ActionPerformed

    private void buttonFilme3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilme3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFilme3ActionPerformed

    private void buttonFilme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilme2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFilme2ActionPerformed

    private void buttonFilme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilme1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFilme1ActionPerformed

    private void buttonFilme1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFilme1MouseClicked

     
     envia_email= new FilmeEscolhido();
     envia_email.setVisible(true);
     envia_email.setState(FilmeEscolhido.NORMAL);


     envia_email.recebeEmail(email_logado.getText());    
     envia_email.carregaTabela("Laranja Mecanica");
     this.setVisible(false);
     
    }//GEN-LAST:event_buttonFilme1MouseClicked

    private void buttonFilme2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFilme2MouseClicked
       envia_email= new FilmeEscolhido();
     envia_email.setVisible(true);
     envia_email.setState(FilmeEscolhido.NORMAL);
    


     envia_email.recebeEmail(email_logado.getText());    
     envia_email.carregaTabela("Coração Valente");
     this.setVisible(false);
    }//GEN-LAST:event_buttonFilme2MouseClicked

    private void buttonFilme3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFilme3MouseClicked
        envia_email= new FilmeEscolhido();
     envia_email.setVisible(true);
     envia_email.setState(FilmeEscolhido.NORMAL);


     envia_email.recebeEmail(email_logado.getText());    
     envia_email.carregaTabela("Hell Raiser");
     this.setVisible(false);
    }//GEN-LAST:event_buttonFilme3MouseClicked

    private void buttonFilme4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFilme4MouseClicked
     envia_email= new FilmeEscolhido();
     envia_email.setVisible(true);
     envia_email.setState(FilmeEscolhido.NORMAL);


     envia_email.recebeEmail(email_logado.getText());    
     envia_email.carregaTabela("Indiana Jones e a Última Cruzada");
     this.setVisible(false);
    }//GEN-LAST:event_buttonFilme4MouseClicked

    private void buttonFilme5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFilme5MouseClicked
     envia_email= new FilmeEscolhido();
     envia_email.setVisible(true);
     envia_email.setState(FilmeEscolhido.NORMAL);


     envia_email.recebeEmail(email_logado.getText());    
     envia_email.carregaTabela("Os Bons Companheiros");
     this.setVisible(false);
    }//GEN-LAST:event_buttonFilme5MouseClicked

    private void buttonFilme6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFilme6MouseClicked
     envia_email= new FilmeEscolhido();
     envia_email.setVisible(true);
     envia_email.setState(FilmeEscolhido.NORMAL);


     envia_email.recebeEmail(email_logado.getText());    
     envia_email.carregaTabela("Taxi Drive");
     this.setVisible(false);
    }//GEN-LAST:event_buttonFilme6MouseClicked

    private void email_logadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_logadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_logadoActionPerformed



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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFilme1;
    private javax.swing.JButton buttonFilme2;
    private javax.swing.JButton buttonFilme3;
    private javax.swing.JButton buttonFilme4;
    private javax.swing.JButton buttonFilme5;
    private javax.swing.JButton buttonFilme6;
    private javax.swing.JTextField email_logado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nome_filme1;
    private javax.swing.JLabel nome_filme2;
    private javax.swing.JLabel nome_filme3;
    private javax.swing.JLabel nome_filme4;
    private javax.swing.JLabel nome_filme5;
    private javax.swing.JLabel nome_filme6;
    // End of variables declaration//GEN-END:variables
}
