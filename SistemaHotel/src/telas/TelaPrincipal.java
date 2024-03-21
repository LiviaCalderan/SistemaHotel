/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author Liv_c
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        menuCadHospede = new javax.swing.JMenuItem();
        menuConsHospede = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        menuCadQuarto = new javax.swing.JMenuItem();
        menuConstQuarto = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        menuCadProduto = new javax.swing.JMenuItem();
        menuConstProduto = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        menuCadFuncionário = new javax.swing.JMenuItem();
        menuConstFuncionário = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        menuCadFornecedor = new javax.swing.JMenuItem();
        menuConstFornecedor = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        menuCadServicos = new javax.swing.JMenuItem();
        menuConstServico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCadReserva = new javax.swing.JMenuItem();
        menuConsReserva = new javax.swing.JMenuItem();
        menuFimReserva = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuServicos = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        menuCadPagar = new javax.swing.JMenuItem();
        menuConsPagar = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        menuCadReceber = new javax.swing.JMenuItem();
        menuConsReceber = new javax.swing.JMenuItem();
        menuBalancoFinanceiro = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrosIcone.png"))); // NOI18N
        jMenu1.setText("Cadastros");

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/do-utilizador.png"))); // NOI18N
        jMenu9.setText("Hóspedes");

        menuCadHospede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar (1).png"))); // NOI18N
        menuCadHospede.setText("Cadastrar");
        jMenu9.add(menuCadHospede);

        menuConsHospede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        menuConsHospede.setText("Consultar");
        menuConsHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsHospedeActionPerformed(evt);
            }
        });
        jMenu9.add(menuConsHospede);

        jMenu1.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cama-alt.png"))); // NOI18N
        jMenu10.setText("Quartos");

        menuCadQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar (1).png"))); // NOI18N
        menuCadQuarto.setText("Cadastrar");
        jMenu10.add(menuCadQuarto);

        menuConstQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        menuConstQuarto.setText("Consultar");
        jMenu10.add(menuConstQuarto);

        jMenu1.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/codigo-de-barras-lido.png"))); // NOI18N
        jMenu11.setText("Produtos");

        menuCadProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar (1).png"))); // NOI18N
        menuCadProduto.setText("Cadastrar");
        jMenu11.add(menuCadProduto);

        menuConstProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        menuConstProduto.setText("Consultar");
        jMenu11.add(menuConstProduto);

        jMenu1.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios-alt.png"))); // NOI18N
        jMenu12.setText("Funcionários");

        menuCadFuncionário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar (1).png"))); // NOI18N
        menuCadFuncionário.setText("Cadastrar");
        menuCadFuncionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadFuncionárioActionPerformed(evt);
            }
        });
        jMenu12.add(menuCadFuncionário);

        menuConstFuncionário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        menuConstFuncionário.setText("Consultar");
        jMenu12.add(menuConstFuncionário);

        jMenu1.add(jMenu12);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/caminhoes-em-movimento.png"))); // NOI18N
        jMenu13.setText("Fornecedores");

        menuCadFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar (1).png"))); // NOI18N
        menuCadFornecedor.setText("Cadastrar");
        jMenu13.add(menuCadFornecedor);

        menuConstFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        menuConstFornecedor.setText("Consultar");
        menuConstFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConstFornecedorActionPerformed(evt);
            }
        });
        jMenu13.add(menuConstFornecedor);

        jMenu1.add(jMenu13);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mao-segurando-medico.png"))); // NOI18N
        jMenu14.setText("Serviços");

        menuCadServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar (1).png"))); // NOI18N
        menuCadServicos.setText("Cadastrar");
        jMenu14.add(menuCadServicos);

        menuConstServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        menuConstServico.setText("Consultar");
        jMenu14.add(menuConstServico);

        jMenu1.add(jMenu14);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/reservasIcone.png"))); // NOI18N
        jMenu2.setText("Reservas   ");

        menuCadReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar (1).png"))); // NOI18N
        menuCadReserva.setText("Cadastrar Reserva");
        menuCadReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadReservaActionPerformed(evt);
            }
        });
        jMenu2.add(menuCadReserva);

        menuConsReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        menuConsReserva.setText("Consultar Reserva");
        jMenu2.add(menuConsReserva);

        menuFimReserva.setText("Finalizar Reserva");
        jMenu2.add(menuFimReserva);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/consumoIcone1.png"))); // NOI18N
        jMenu3.setText("Vendas   ");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/codigo-de-barras-lido.png"))); // NOI18N
        jMenuItem1.setText("Produtos");
        jMenu3.add(jMenuItem1);

        menuServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mao-segurando-medico.png"))); // NOI18N
        menuServicos.setText("Serviços");
        jMenu3.add(menuServicos);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/financeiroIcone.png"))); // NOI18N
        jMenu5.setText("Financeiro   ");

        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transferencia-de-contas-em-dinheiro.png"))); // NOI18N
        jMenu15.setText("Contas a Pagar");

        menuCadPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar (1).png"))); // NOI18N
        menuCadPagar.setText("Cadastrar");
        jMenu15.add(menuCadPagar);

        menuConsPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        menuConsPagar.setText("Consultar");
        jMenu15.add(menuConsPagar);

        jMenu5.add(jMenu15);

        jMenu16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transferencia-de-contas-em-dinheiro.png"))); // NOI18N
        jMenu16.setText("Contas a Receber");

        menuCadReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/adicionar (1).png"))); // NOI18N
        menuCadReceber.setText("Cadastrar");
        jMenu16.add(menuCadReceber);

        menuConsReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        menuConsReceber.setText("Consultar");
        jMenu16.add(menuConsReceber);

        jMenu5.add(jMenu16);

        menuBalancoFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dinheiro-cheque-editar.png"))); // NOI18N
        menuBalancoFinanceiro.setText("Balanço");
        jMenu5.add(menuBalancoFinanceiro);

        jMenuBar1.add(jMenu5);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatoriosIcone.png"))); // NOI18N
        jMenu4.setText("Relatórios   ");

        jMenu17.setText("Financeiro");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transferencia-de-contas-em-dinheiro.png"))); // NOI18N
        jMenuItem2.setText("Contas a Pagar");
        jMenu17.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transferencia-de-contas-em-dinheiro.png"))); // NOI18N
        jMenuItem3.setText("Contas a receber");
        jMenu17.add(jMenuItem3);

        jMenu4.add(jMenu17);

        jMenu18.setText("Reservas");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeQuartos.png"))); // NOI18N
        jMenuItem4.setText("Quartos Disponíveis");
        jMenu18.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconeQuartos.png"))); // NOI18N
        jMenuItem5.setText("Quartos Ocupados");
        jMenu18.add(jMenuItem5);

        jMenuItem6.setText("Reservas Futuras");
        jMenu18.add(jMenuItem6);

        jMenu4.add(jMenu18);

        jMenu19.setText("Vendas");
        jMenu4.add(jMenu19);

        jMenuItem7.setText("Hospedes");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Funcionários");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Fornecedores");
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/segurancaIcone.png"))); // NOI18N
        jMenu6.setText("Segurança   ");

        jMenuItem10.setText("Fazer Backup");
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Restaurar Backup");
        jMenu6.add(jMenuItem11);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ferramentasIcone2.png"))); // NOI18N
        jMenu7.setText("Ferramentas   ");

        jMenu20.setText("Tela de Fundo");

        jMenuItem12.setText("Add Imagem");
        jMenu20.add(jMenuItem12);

        jMenuItem13.setText("Remover Imagem");
        jMenu20.add(jMenuItem13);

        jMenuItem14.setText("Restaurar Padrão");
        jMenu20.add(jMenuItem14);

        jMenu7.add(jMenu20);

        jMenuItem15.setText("Sobre o Sistema");
        jMenu7.add(jMenuItem15);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sairIcone.png"))); // NOI18N
        jMenu8.setText("Sair");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 881, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuConsHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsHospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConsHospedeActionPerformed

    private void menuCadFuncionárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadFuncionárioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadFuncionárioActionPerformed

    private void menuConstFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConstFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuConstFornecedorActionPerformed

    private void menuCadReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadReservaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem menuBalancoFinanceiro;
    private javax.swing.JMenuItem menuCadFornecedor;
    private javax.swing.JMenuItem menuCadFuncionário;
    private javax.swing.JMenuItem menuCadHospede;
    private javax.swing.JMenuItem menuCadPagar;
    private javax.swing.JMenuItem menuCadProduto;
    private javax.swing.JMenuItem menuCadQuarto;
    private javax.swing.JMenuItem menuCadReceber;
    private javax.swing.JMenuItem menuCadReserva;
    private javax.swing.JMenuItem menuCadServicos;
    private javax.swing.JMenuItem menuConsHospede;
    private javax.swing.JMenuItem menuConsPagar;
    private javax.swing.JMenuItem menuConsReceber;
    private javax.swing.JMenuItem menuConsReserva;
    private javax.swing.JMenuItem menuConstFornecedor;
    private javax.swing.JMenuItem menuConstFuncionário;
    private javax.swing.JMenuItem menuConstProduto;
    private javax.swing.JMenuItem menuConstQuarto;
    private javax.swing.JMenuItem menuConstServico;
    private javax.swing.JMenuItem menuFimReserva;
    private javax.swing.JMenuItem menuServicos;
    // End of variables declaration//GEN-END:variables
}
