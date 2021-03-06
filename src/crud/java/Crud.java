package crud.java;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Crud extends javax.swing.JFrame {
    
    private Cliente cliente;
    private final ClienteDAO dao;
    private String nome;
    private int codigo;
    
    public Crud() {
        
        dao = new ClienteDAO();
        codigo = 0;
        initComponents();
        this.setLocationRelativeTo(null);
        
        atualizarTabela();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        bNovo = new javax.swing.JButton();
        bSalvar = new javax.swing.JButton();
        jSplitPane2 = new javax.swing.JSplitPane();
        bDeletar = new javax.swing.JButton();
        bPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtNasc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        bNovo.setText("Novo");
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });
        jSplitPane1.setLeftComponent(bNovo);

        bSalvar.setText("Salvar");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
            }
        });
        jSplitPane1.setRightComponent(bSalvar);

        bDeletar.setText("Deletar");
        bDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeletarActionPerformed(evt);
            }
        });
        jSplitPane2.setRightComponent(bDeletar);

        bPesquisar.setText("Buscar");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });
        jSplitPane2.setLeftComponent(bPesquisar);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Nascimento:");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "C??digo", "Nome", "CPF", "Nascimento"
            }
        ));
        Tabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(txtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtNasc))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSplitPane1)
                    .addComponent(jSplitPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        
        atribuirCliente(new Cliente());
        atualizarTabela();
        
    }//GEN-LAST:event_bNovoActionPerformed

    private void atribuirCliente(Cliente c){
        
        codigo = c.getCodigo();
        txtNome.setText(c.getNome());
        txtCpf.setText(c.getCpf());
        txtNasc.setText(c.getNascimento());
        
    }
    
    private Cliente obterCliente(){
        
        cliente = new Cliente();
        cliente.setCodigo(codigo);
        cliente.setNome(txtNome.getText());
        cliente.setCpf(txtCpf.getText());
        cliente.setNascimento(txtNasc.getText());
        
        return cliente;
        
    }
    
    private void atualizarTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
        
        
        for (int i = modelo.getRowCount() - 1; i >= 0; i--){
            modelo.removeRow(i);
        }
        
        List<Cliente> clientes = dao.todos();
        
        clientes.forEach(c -> {
            modelo.addRow(new Object[]{
                c.getCodigo(),
                c.getNome(),
                c.getCpf(),
                c.getNascimento()
            });
        });
    }
    
    private void atualizarTabelaPesquisar(){
        
        DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
        
        for (int i = modelo.getRowCount() - 1; i >= 0; i--){
            modelo.removeRow(i);
        }
        
        List<Cliente> clientes = dao.pesquisar(nome);
        
        clientes.forEach(c -> {
            modelo.addRow(new Object[]{
                c.getCodigo(),
                c.getNome(),
                c.getCpf(),
                c.getNascimento()
            });
        });
    }
    
    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        
        Cliente c = obterCliente();
        String erro = dao.salvar(c);
        
        if ("".equals(erro)){ 
            JOptionPane.showMessageDialog(this, "Salvo com sucesso", "cliente", JOptionPane.INFORMATION_MESSAGE);
            atribuirCliente(new Cliente());
        } else {
            JOptionPane.showMessageDialog(this, erro, "Falha ao salvar ", JOptionPane.ERROR_MESSAGE);
        }
        
        atualizarTabela();
    }//GEN-LAST:event_bSalvarActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        
       int linha = Tabela.getSelectedRow();
       
       if (linha != -1){
           int codigo = (int) Tabela.getValueAt(linha, 0);
           Cliente c = dao.obter(codigo);
           atribuirCliente(c);
       } else {
           JOptionPane.showMessageDialog(this, "Selecione uma linha!", "Alerta", JOptionPane.ERROR_MESSAGE);
       }
        
    }//GEN-LAST:event_TabelaMouseClicked

    private void bDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeletarActionPerformed
        
        int linha = Tabela.getSelectedRow();
        System.out.println(linha);
        
        if (linha != -1){
            int retorno = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?", "Aten????o", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (retorno == 0){
                int codigo = (int)Tabela.getValueAt(linha, 0);
                String erro = dao.excluir(codigo);
                if ("".equals(erro)){
                    JOptionPane.showMessageDialog(this, "Exclu??do com sucesso", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    atualizarTabela();
                } else {
                    JOptionPane.showMessageDialog(this, erro, "Alerta", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para exclus??o!", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_bDeletarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
       
    }//GEN-LAST:event_formMouseClicked

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        
        nome = txtNome.getText();
        
        if ("".equals(nome)){
            JOptionPane.showMessageDialog(this, "Insira um nome para consultar", "Aten????o", JOptionPane.INFORMATION_MESSAGE);
        }
        
        atualizarTabelaPesquisar();
       
    }//GEN-LAST:event_bPesquisarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Crud().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton bDeletar;
    private javax.swing.JButton bNovo;
    private javax.swing.JButton bPesquisar;
    public javax.swing.JButton bSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNasc;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
