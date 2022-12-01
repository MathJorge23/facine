
package projetofacine;

public class Pagamento extends javax.swing.JFrame {
    private costrutorCadastro cadastro;
    private MySQL conexao;
    Confirmacao envia_email;
  
    
    
    public Pagamento() {
        cadastro = new costrutorCadastro();
        conexao = new MySQL();
        initComponents();
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

        jOptionPane1 = new javax.swing.JOptionPane();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numero_cartao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vencimento_cartao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nome_cartao = new javax.swing.JTextField();
        box_pagamento = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cod_seguranca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        buttonSeguinte = new javax.swing.JButton();
        email_logado = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número do cartão:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(236, 240, 241));
        jLabel15.setText("Escolha a forma de pagamento:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome impresso no cartão:");

        numero_cartao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        numero_cartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_cartaoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data de vencimento:");

        vencimento_cartao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        vencimento_cartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vencimento_cartaoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Forma de pagamento:");

        nome_cartao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nome_cartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_cartaoActionPerformed(evt);
            }
        });

        box_pagamento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        box_pagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de Crédito", "Cartão de Débito" }));
        box_pagamento.setToolTipText("");
        box_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_pagamentoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número do cartão:");

        cod_seguranca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cod_seguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_segurancaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Código de segurança:");

        buttonVoltar.setBackground(new java.awt.Color(152, 18, 19));
        buttonVoltar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        buttonVoltar.setText("Voltar");
        buttonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVoltarMouseClicked(evt);
            }
        });
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        buttonSeguinte.setBackground(new java.awt.Color(152, 18, 19));
        buttonSeguinte.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonSeguinte.setForeground(new java.awt.Color(255, 255, 255));
        buttonSeguinte.setText("Seguinte");
        buttonSeguinte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonSeguinte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSeguinteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(buttonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSeguinte)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vencimento_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numero_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cod_seguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277)))
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(email_logado, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(email_logado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel15)
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vencimento_cartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod_seguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSeguinte)
                    .addComponent(buttonVoltar))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero_cartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_cartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_cartaoActionPerformed

    private void vencimento_cartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vencimento_cartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vencimento_cartaoActionPerformed

    private void nome_cartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_cartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_cartaoActionPerformed

    private void box_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_pagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_pagamentoActionPerformed

    private void cod_segurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_segurancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_segurancaActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed

    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVoltarMouseClicked

    }//GEN-LAST:event_buttonVoltarMouseClicked

    private void buttonSeguinteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSeguinteMouseClicked
        cadastro.setNumero_cartao(numero_cartao.getText());
        cadastro.setNome_cartao(nome_cartao.getText());
        cadastro.setForma_pagamento(String.valueOf(box_pagamento.getSelectedItem()));
        cadastro.setVencimento(vencimento_cartao.getText());
        cadastro.setCod_seguranca(cod_seguranca.getText());
        
        conexao.conectaBanco();
        String query = ("INSERT INTO cartao ("
            + "numero_cartao,"
            + "nome_cartao,"
            + "forma_pagamento,"
            + "vencimento,"
            + "cod_seguranca"
            + ") VALUES ("
            + "'" + cadastro.getNumero_cartao() + "',"
            + "'" + cadastro.getNome_cartao() + "',"
            + "'" + cadastro.getForma_pagamento() + "',"
            + "'" + cadastro.getVencimento() + "',"
            + "'" + cadastro.getCod_seguranca() + "'"
            + ");");
        conexao.insertSQL(query);
        conexao.fechaBanco();
        
             if ( envia_email == null){
             envia_email= new Confirmacao();
             envia_email.setVisible(true);
             envia_email.carregaTabela(email_logado.getText());
             this.setVisible(false);
             } else{
             envia_email.setVisible(true);
             envia_email.setState(MenuPrincipal.NORMAL);
             envia_email.carregaTabela(email_logado.getText());
             this.setVisible(false);
             }
    }//GEN-LAST:event_buttonSeguinteMouseClicked

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
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_pagamento;
    private javax.swing.JButton buttonSeguinte;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField cod_seguranca;
    private javax.swing.JTextField email_logado;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nome_cartao;
    private javax.swing.JTextField numero_cartao;
    private javax.swing.JTextField vencimento_cartao;
    // End of variables declaration//GEN-END:variables
}
