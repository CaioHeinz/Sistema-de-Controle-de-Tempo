package atividadenova;

import javax.swing.JOptionPane;

public class Estadia extends javax.swing.JFrame {
    
    private Responsaveis responsaveis;
    private Criancas criancas;
   
    
    public Estadia (Responsaveis responsaveis, Criancas criancas){
        this.responsaveis = responsaveis;
        this.criancas = criancas;
        initComponents();
        nomeResponsavel.setText(responsaveis.getNome());
        nomeCrianca.setText(criancas.getNome());
    }
    public Estadia() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomeResponsavel = new javax.swing.JTextField();
        nomeCrianca = new javax.swing.JTextField();
        tempoUtilizado = new javax.swing.JTextField();
        botaoFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("MOON GET!", 1, 18)); // NOI18N
        jLabel1.setText("Informações de Uso");

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel2.setText("Responsável:");

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel3.setText("Criança:");

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel4.setText("*Tempo Utilizado:");

        nomeResponsavel.setEnabled(false);

        nomeCrianca.setEnabled(false);

        botaoFinalizar.setText("Calcular e Mostrar Resumo");
        botaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoFinalizar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tempoUtilizado, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nomeCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tempoUtilizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(botaoFinalizar)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarActionPerformed
       try {
           
        if (tempoUtilizado.getText().isEmpty()) {
          JOptionPane.showMessageDialog(this, "Preencha todos os campos para finalizar.", "Alerta", JOptionPane.WARNING_MESSAGE);
          return;
        }
        
        String nomeResponsavelE = responsaveis.getNome();
        String cpfResponsavelE = responsaveis.getCpf();
        String telefoneResponsavelE = responsaveis.getTelefone();
        String emailResponsavelE = responsaveis.getEmail();
        String enderecoResponsavelE = responsaveis.getEndereco();
        String idadeResponsavelE = responsaveis.getIdade();
        
        String nomeCriancaE = criancas.getNome();
        String idadeCriancaE = criancas.getIdade();
        String sexoCriancaE = criancas.getSexo();
        
        int tempo = Integer.parseInt(tempoUtilizado.getText());
        double valorSoma = tempo * 1.5;
        double desconto = 0;
        
        if (tempo > 60){
            desconto = 0.15;
        } else if (tempo > 40){
            desconto = 0.10;
        } else if (tempo > 20){
            desconto = 0.05;
        }
        
        double valorDesconto = valorSoma - (valorSoma * desconto);
        
        StringBuilder resumo = new StringBuilder();
        resumo.append("Resumo da Estadia:\n\n");
        resumo.append("Nome Responsável: ").append(nomeResponsavelE).append("\n");
        resumo.append("CPF Responsável: ").append(cpfResponsavelE).append("\n");
        resumo.append("Telefone Responsável: ").append(telefoneResponsavelE).append("\n");
        resumo.append("Email Responsável: ").append(emailResponsavelE).append("\n");
        resumo.append("Endereço Responsável: ").append(enderecoResponsavelE).append("\n");
        resumo.append("Idade Responsável: ").append(idadeResponsavelE).append("\n");
        resumo.append("Nome Criança: ").append(nomeCriancaE).append("\n");
        resumo.append("Idade Criança: ").append(idadeCriancaE).append("\n");
        resumo.append("Sexo Criança: ").append(sexoCriancaE).append("\n");
        resumo.append("Tempo Utilizado: ").append(tempo).append(" minutos\n");
        resumo.append("Valor Base: R$").append(String.format("%.2f", valorSoma)).append("\n");
        resumo.append("Desconto: ").append(desconto * 100).append("%\n");
        resumo.append("Valor a Pagar: R$").append(String.format("%.2f", valorDesconto)).append("\n");
       
        dispose();
        JOptionPane.showMessageDialog(this, resumo.toString());
      
       } catch (NumberFormatException e){
           JOptionPane.showMessageDialog(this, "Informe o tempo de permanência!", "Alerta", JOptionPane.ERROR_MESSAGE);
       }
        
    }//GEN-LAST:event_botaoFinalizarActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Estadia().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomeCrianca;
    private javax.swing.JTextField nomeResponsavel;
    private javax.swing.JTextField tempoUtilizado;
    // End of variables declaration//GEN-END:variables
}
