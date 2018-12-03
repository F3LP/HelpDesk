/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.BuscarFuncionario;
import controller.LimparTela;
import model.dao.FuncionarioDao;

public class TelaExcluirUsuario extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TelaExcluirUsuario(JFrame jFrame, boolean modal) {
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
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfCargo = new javax.swing.JTextField();
        cbDepartamento = new javax.swing.JComboBox<>();
        btnExclui = new javax.swing.JButton();
        lblVoltaCadUsuario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbPerfil = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        tfMatricula = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help Desk University");
        setMinimumSize(new java.awt.Dimension(424, 570));

        jPanel1.setBackground(new java.awt.Color(152, 202, 239));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Matrícula");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("E-mail");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Departamento");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Cargo");

        tfNome.setEditable(false);
        tfNome.setBackground(new java.awt.Color(255, 255, 255));
        tfNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNome.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        tfEmail.setEditable(false);
        tfEmail.setBackground(new java.awt.Color(255, 255, 255));
        tfEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfEmail.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        tfCargo.setEditable(false);
        tfCargo.setBackground(new java.awt.Color(255, 255, 255));
        tfCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCargo.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        cbDepartamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administração", "Diretoria", "Financeiro", "Marketing", "RH", "TI", "Vendas" }));
        cbDepartamento.setEnabled(false);
        cbDepartamento.setMinimumSize(new java.awt.Dimension(81, 21));
        cbDepartamento.setPreferredSize(new java.awt.Dimension(81, 21));

        btnExclui.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExclui.setText("Excluir");
        btnExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluiActionPerformed(evt);
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
        cbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Técnico", "Usuário" }));
        cbPerfil.setEnabled(false);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        try {
            tfMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMatriculaKeyPressed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnLimpar)
                        .addGap(34, 34, 34)
                        .addComponent(btnExclui))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblVoltaCadUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addComponent(tfCargo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(cbDepartamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(cbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addGap(13, 13, 13)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPerfil))
                .addGap(18, 18, 18)
                .addComponent(lblVoltaCadUsuario)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExclui)
                    .addComponent(btnLimpar))
                .addGap(62, 62, 62))
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

	private void tfMatriculaKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tfMatriculaKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			BuscarFuncionario buscar = new BuscarFuncionario(this, Long.parseLong(this.tfMatricula.getText()));
		}
	}// GEN-LAST:event_tfMatriculaKeyPressed

	private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLimparActionPerformed
		LimparTela limpar = new LimparTela(this);
	}// GEN-LAST:event_btnLimparActionPerformed

	private void btnExcluiActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluiActionPerformed
		try {
			FuncionarioDao dao = new FuncionarioDao();
			dao.removeFuncionario(Long.parseLong(tfMatricula.getText()));	
			LimparTela limpar = new LimparTela(this);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O registro não pôde ser excluído.");

		}
		
	}// GEN-LAST:event_btnExcluiActionPerformed

	private void tfCargoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfCargoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_tfCargoActionPerformed

	private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBuscarActionPerformed
		try {
			BuscarFuncionario buscar = new BuscarFuncionario(this, Long.parseLong(this.tfMatricula.getText()));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite uma matrícula válida.");

		}
	}// GEN-LAST:event_btnBuscarActionPerformed

	private void lblVoltaCadUsuarioMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblVoltaCadUsuarioMouseExited
		lblVoltaCadUsuario.setForeground(Color.BLUE);
	}// GEN-LAST:event_lblVoltaCadUsuarioMouseExited

	private void lblVoltaCadUsuarioMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblVoltaCadUsuarioMouseEntered
		lblVoltaCadUsuario.setForeground(Color.CYAN);
	}// GEN-LAST:event_lblVoltaCadUsuarioMouseEntered

	private void lblVoltaCadUsuarioMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lblVoltaCadUsuarioMouseClicked
		dispose();
		super.getParent().setVisible(true);
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

	public static void main(String args[]) {
		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(() -> {
			TelaExcluirUsuario dialog = new TelaExcluirUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExclui;
    private javax.swing.JButton btnLimpar;
    public javax.swing.JComboBox<String> cbDepartamento;
    public javax.swing.JComboBox<String> cbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel lblVoltaCadUsuario;
    public javax.swing.JTextField tfCargo;
    public javax.swing.JTextField tfEmail;
    public javax.swing.JFormattedTextField tfMatricula;
    public javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
