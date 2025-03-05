package br.boticário.view;

import br.boticario.entity.Perfume;
import java.util.Collections;
import javax.swing.JOptionPane;

public class CadastoPerfume extends javax.swing.JFrame {

    public CadastoPerfume() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInserir = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostra = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btInserir = new javax.swing.JButton();
        bnRemover = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInserirActionPerformed(evt);
            }
        });

        txtMostra.setColumns(20);
        txtMostra.setRows(5);
        txtMostra.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        txtMostra.setEnabled(false);
        jScrollPane1.setViewportView(txtMostra);

        jLabel1.setText("Insira o nome do Perfume");

        btInserir.setText("Inserir");
        btInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        bnRemover.setText("Remover");
        bnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnRemoverActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Quantidade");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ordenar ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Sair");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtInserir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btInserir)
                            .addComponent(bnRemover))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInserirActionPerformed
    Perfume perfume = new Perfume(); 

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        String nomePerfume = txtInserir.getText();

        if (!nomePerfume.isEmpty()) {
            Perfume perfume = new Perfume();
            perfume.salvar(nomePerfume);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < Perfume.getListaPerfumes().size(); i++) {
                sb.append((i + 1) + "° " + Perfume.getListaPerfumes().get(i)).append("\n");
            }
            txtMostra.setText(sb.toString()); 
            txtInserir.setText(""); 
        } else {
            JOptionPane.showMessageDialog(this, "Insira um nome de perfume!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btInserirActionPerformed

    private void bnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnRemoverActionPerformed
        String nomePerfume = txtInserir.getText(); 

        if (!nomePerfume.isEmpty()) {
            perfume.remover(nomePerfume);  
            atualizarTxtMostrar();  
        } else {
            JOptionPane.showMessageDialog(this, "Insira um nome de perfume para remover!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bnRemoverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nomePerfume = txtInserir.getText(); 

        if (!nomePerfume.isEmpty()) {
            boolean encontrado = false;

            for (int i = 0; i < Perfume.getListaPerfumes().size(); i++) {
                String perfume = Perfume.getListaPerfumes().get(i);
                if (perfume.equalsIgnoreCase(nomePerfume)) {
                    String indiceOrdinal = (i + 1) + "º ";
                    JOptionPane.showMessageDialog(this, "Perfume encontrado: " + indiceOrdinal + nomePerfume,
                            "Resultado da Busca", JOptionPane.INFORMATION_MESSAGE);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "Perfume não encontrado!", "Resultado da Busca", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Insira um nome de perfume para buscar!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nomeAntigo = txtInserir.getText();  
        if (!nomeAntigo.isEmpty()) {
            boolean encontrado = false;
            for (int i = 0; i < Perfume.getListaPerfumes().size(); i++) {
                if (Perfume.getListaPerfumes().get(i).equalsIgnoreCase(nomeAntigo)) {
                    String novoNome = JOptionPane.showInputDialog(this, "Digite o novo nome do perfume:");

                    if (novoNome != null && !novoNome.trim().isEmpty()) {
                        Perfume.getListaPerfumes().set(i, novoNome);
                        encontrado = true;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "Nome inválido!", "Aviso", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }

            if (encontrado) {
                JOptionPane.showMessageDialog(this, "Perfume alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Perfume não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < Perfume.getListaPerfumes().size(); i++) {
                sb.append((i + 1) + "° " + Perfume.getListaPerfumes().get(i)).append("\n");
            }
            txtMostra.setText(sb.toString());  
            txtInserir.setText(""); 
        } else {
            JOptionPane.showMessageDialog(this, "Insira o nome do perfume para editar!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int quantidade = Perfume.getListaPerfumes().size();  
        JOptionPane.showMessageDialog(this, "Quantidade de perfumes cadastrados: " + quantidade,
                "Quantidade de Perfumes", JOptionPane.INFORMATION_MESSAGE);    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Collections.sort(Perfume.getListaPerfumes());  
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < Perfume.getListaPerfumes().size(); i++) {
        sb.append((i + 1) + "° " + Perfume.getListaPerfumes().get(i)).append("\n");
    }
    txtMostra.setText(sb.toString());    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     this.dispose();

    }//GEN-LAST:event_jButton5ActionPerformed
    public void atualizarTxtMostrar() {
        StringBuilder sb = new StringBuilder();
        for (String perfume : Perfume.getListaPerfumes()) {  
            sb.append(perfume).append("\n");
        }
        txtMostra.setText(sb.toString());  
    }

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastoPerfume().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnRemover;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInserir;
    private javax.swing.JTextArea txtMostra;
    // End of variables declaration//GEN-END:variables
}
