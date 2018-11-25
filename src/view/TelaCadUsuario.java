/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import controller.InserirFuncionario;

public class TelaCadUsuario extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TelaCadUsuario(JFrame jFrame, boolean modal) {
		super(jFrame, modal);
		initComponents();
		setIconImage(new ImageIcon(getClass().getResource("/imagens/HDesk.png")).getImage());
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfMatricula = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfCargo = new javax.swing.JTextField();
        cbDepartamento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblVoltaCadUsuario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbPerfil = new javax.swing.JComboBox<>();
        tfCpf = new javax.swing.JFormattedTextField();
        tfSenha = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help Desk University");
        setMinimumSize(new java.awt.Dimension(424, 570));

        jPanel1.setBackground(new java.awt.Color(152, 202, 239));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("CPF");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Matrícula");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("E-mail");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Departamento");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Cargo");

        tfNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tfMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMatriculaActionPerformed(evt);
            }
        });

        tfEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tfCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cbDepartamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administração", "Diretoria", "Financeiro", "Marketing", "RH", "Vendas" }));
        cbDepartamento.setMinimumSize(new java.awt.Dimension(81, 21));
        cbDepartamento.setPreferredSize(new java.awt.Dimension(81, 21));
        cbDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDepartamentoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Senha de Acesso");

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        lblVoltaCadUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblVoltaCadUsuario.setForeground(new java.awt.Color(0, 51, 255));
        lblVoltaCadUsuario.setText("<< Voltar");
        lblVoltaCadUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltaCadUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVoltaCadUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVoltaCadUsuarioMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Perfil");

        cbPerfil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Técnico", "Usuário", " " }));

        tfCpf.setColumns(11);
        try {
            tfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tfSenha.setColumns(6);
        tfSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfSenha.setMinimumSize(new java.awt.Dimension(6, 6));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVoltaCadUsuario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCargo)
                            .addComponent(tfEmail)
                            .addComponent(tfNome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btnSalvar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbPerfil)
                    .addComponent(cbDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblVoltaCadUsuario)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
           InserirFuncionario insere = new InserirFuncionario(this);
    }//GEN-LAST:event_btnSalvarMouseClicked

	private void lblVoltaCadUsuarioMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblVoltaCadUsuarioMouseExited
		lblVoltaCadUsuario.setForeground(Color.BLUE);
	}// GEN-LAST:event_lblVoltaCadUsuarioMouseExited

	private void lblVoltaCadUsuarioMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblVoltaCadUsuarioMouseEntered
		lblVoltaCadUsuario.setForeground(Color.CYAN);
	}// GEN-LAST:event_lblVoltaCadUsuarioMouseEntered

	private void lblVoltaCadUsuarioMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblVoltaCadUsuarioMouseClicked
		dispose();
	}// GEN-LAST:event_lblVoltaCadUsuarioMouseClicked

	private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfSenhaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_tfSenhaActionPerformed

	private void tfMatriculaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfMatriculaActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_tfMatriculaActionPerformed

	private void tfCpfActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfCpfActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_tfCpfActionPerformed

	private void cbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbDepartamentoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_cbDepartamentoActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		new InserirFuncionario(this);
	}// GEN-LAST:event_jButton1ActionPerformed

	public static void main(String args[]) {
		 /* Create and display the dialog */
		java.awt.EventQueue.invokeLater(() -> {
			TelaCadUsuario dialog = new TelaCadUsuario(new javax.swing.JFrame(), true);
			dialog.addWindowListener(new java.awt.event.WindowAdapter() {
				@Override
				public void windowClosing(java.awt.event.WindowEvent e) {
					System.exit(0);
				}
			});
			dialog.setVisible(true);
		});

	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    public javax.swing.JComboBox<String> cbDepartamento;
    public javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel lblVoltaCadUsuario;
    public javax.swing.JTextField tfCargo;
    public javax.swing.JFormattedTextField tfCpf;
    public javax.swing.JTextField tfEmail;
    public javax.swing.JTextField tfMatricula;
    public javax.swing.JTextField tfNome;
    public javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
