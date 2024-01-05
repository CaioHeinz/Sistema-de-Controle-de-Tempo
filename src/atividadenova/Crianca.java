package atividadenova;

import javax.swing.JOptionPane;

public class Crianca extends javax.swing.JFrame {
    
    private Responsaveis responsaveis;
    
    public Crianca(Responsaveis responsaveis){
        this.responsaveis = responsaveis;
        initComponents();
        
        nomeResponsavel.setText(responsaveis.getNome());
    }

    public Crianca() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeResponsavel = new javax.swing.JTextField();
        nomeCrianca = new javax.swing.JTextField();
        idadeCrianca = new javax.swing.JTextField();
        sexoCrianca = new javax.swing.JTextField();
        avancarNovamente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("MOON GET!", 0, 18)); // NOI18N
        jLabel1.setText("Dados da Criaça");

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel2.setText("Responsável:");

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel3.setText("*Nome:");

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel4.setText("*Idade:");

        jLabel5.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel5.setText("*Sexo:");

        nomeResponsavel.setEnabled(false);

        avancarNovamente.setText("Avançar");
        avancarNovamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarNovamenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeResponsavel)
                    .addComponent(nomeCrianca)
                    .addComponent(idadeCrianca)
                    .addComponent(sexoCrianca, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(avancarNovamente)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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
                    .addComponent(idadeCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sexoCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(avancarNovamente)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avancarNovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarNovamenteActionPerformed
        if (nomeCrianca.getText().isEmpty() || idadeCrianca.getText().isEmpty() || sexoCrianca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos referente a criança para avançar.", "Alerta", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        Criancas c = new Criancas();
        //Responsaveis r = new Responsaveis();
        c.setNome(nomeCrianca.getText());
        c.setIdade(idadeCrianca.getText());
        c.setSexo(sexoCrianca.getText());
        
        
        try {
            int idade = Integer.parseInt(idadeCrianca.getText());
            if (idade <= 10) {
                Estadia e = new Estadia(responsaveis,c);
                e.setVisible(true);
                dispose(); 
        } else {
             JOptionPane.showMessageDialog(this,"A idade da criança deve ser menor ou igual a 10 anos", "Importante", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e){
            
        }
        
        
       
    }//GEN-LAST:event_avancarNovamenteActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avancarNovamente;
    private javax.swing.JTextField idadeCrianca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeCrianca;
    private javax.swing.JTextField nomeResponsavel;
    private javax.swing.JTextField sexoCrianca;
    // End of variables declaration//GEN-END:variables

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            new Crianca().setVisible(true);
        }
    }
}
