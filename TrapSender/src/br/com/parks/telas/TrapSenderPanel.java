/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.parks.telas;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import br.com.parks.service.TrapServiceImpl;
import br.com.parks.trap.Trap;

/**
 * 
 * @author User
 */
@SuppressWarnings("serial")
public class TrapSenderPanel extends javax.swing.JFrame {

	private DefaultListModel defaultListModelTraps;
	private DefaultListModel defaultListModelNEs;

	TrapServiceImpl trapServiceImpl = new TrapServiceImpl();

	/**
	 * Creates new form TrapSenderPanel
	 */
	public TrapSenderPanel() {
		initComponents();
		init();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPanelBorda = new javax.swing.JPanel();
		jPanelForm = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextFieldManagerIP = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jTextFieldPort = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jListNEsIP = new javax.swing.JList();
		jScrollPane2 = new javax.swing.JScrollPane();
		jListTraps = new javax.swing.JList();
		jTextFieldQuantity = new javax.swing.JTextField();
		jTextFieldSendInterval = new javax.swing.JTextField();
		jTextFieldRepeatInterval = new javax.swing.JTextField();
		jButtonAddTrap = new javax.swing.JButton();
		jButtonEditTrap = new javax.swing.JButton();
		jButtonRemoveTrap = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Trap Sender");

		jPanelBorda.setBorder(javax.swing.BorderFactory
				.createTitledBorder(javax.swing.BorderFactory
						.createTitledBorder("TrapSender")));

		jPanelForm.setLayout(new java.awt.GridBagLayout());

		jLabel1.setText("IP Manager:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(15, 5, 20, 20);
		jPanelForm.add(jLabel1, gridBagConstraints);

		jTextFieldManagerIP.setColumns(15);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.ipadx = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(15, 0, 20, 20);
		jPanelForm.add(jTextFieldManagerIP, gridBagConstraints);

		jLabel2.setText("Port:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(15, 100, 20, 20);
		jPanelForm.add(jLabel2, gridBagConstraints);

		jLabel3.setText("IP's NE:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
		jPanelForm.add(jLabel3, gridBagConstraints);

		jLabel4.setText("Traps:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
		jPanelForm.add(jLabel4, gridBagConstraints);

		jLabel5.setText("Quantity:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(15, 5, 20, 20);
		jPanelForm.add(jLabel5, gridBagConstraints);

		jLabel6.setText("Send interval:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(15, 5, 20, 20);
		jPanelForm.add(jLabel6, gridBagConstraints);

		jLabel7.setText("Repeat interval:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(15, 5, 20, 20);
		jPanelForm.add(jLabel7, gridBagConstraints);

		jTextFieldPort.setColumns(1);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.ipadx = 53;
		gridBagConstraints.insets = new java.awt.Insets(0, 200, 0, 0);
		jPanelForm.add(jTextFieldPort, gridBagConstraints);

		jScrollPane1.setViewportView(jListNEsIP);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.ipadx = 30;
		gridBagConstraints.ipady = 25;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 1.0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
		jPanelForm.add(jScrollPane1, gridBagConstraints);

		jScrollPane2.setViewportView(jListTraps);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.ipadx = 30;
		gridBagConstraints.ipady = 25;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 1.0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
		jPanelForm.add(jScrollPane2, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.ipadx = 53;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(15, 0, 20, 20);
		jPanelForm.add(jTextFieldQuantity, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.ipadx = 53;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(15, 0, 20, 20);
		jPanelForm.add(jTextFieldSendInterval, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.ipadx = 53;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(15, 0, 20, 20);
		jPanelForm.add(jTextFieldRepeatInterval, gridBagConstraints);

		jButtonAddTrap.setText("Add ");
		jButtonAddTrap.setPreferredSize(new java.awt.Dimension(81, 23));
		jButtonAddTrap.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAddTrapActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		jPanelForm.add(jButtonAddTrap, gridBagConstraints);

		jButtonEditTrap.setText("Edit ");
		jButtonEditTrap.setPreferredSize(new java.awt.Dimension(81, 23));
		jButtonEditTrap.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonEditTrapActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
		jPanelForm.add(jButtonEditTrap, gridBagConstraints);

		jButtonRemoveTrap.setText("Remove");
		jButtonRemoveTrap.setPreferredSize(new java.awt.Dimension(81, 23));
		jButtonRemoveTrap
				.addActionListener(new java.awt.event.ActionListener() {
					@Override
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonRemoveTrapActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(60, 0, 0, 0);
		jPanelForm.add(jButtonRemoveTrap, gridBagConstraints);

		jPanelBorda.add(jPanelForm);

		getContentPane().add(jPanelBorda, java.awt.BorderLayout.CENTER);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void init() {
		// set traps
		setDefaultListModelTraps(new DefaultListModel());
		jListTraps.setModel(getDefaultListModelTraps());
		for (Trap trap : trapServiceImpl.getTraps()) {
			defaultListModelTraps.addElement(trap);
		}

		// set NE's
		setDefaultListModelNEs(new DefaultListModel());
		jListNEsIP.setModel(getDefaultListModelNEs());

	}

	private void jButtonAddTrapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddTrapActionPerformed
		new TrapPanel(defaultListModelTraps).setVisible(true);
	}// GEN-LAST:event_jButtonAddTrapActionPerformed

	private void jButtonEditTrapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonEditTrapActionPerformed
		if (jListTraps.getSelectedValue() != null) {
			new TrapPanel(defaultListModelTraps, jListTraps.getSelectedIndex(),
					jListTraps.getSelectedValue()).setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "You need select an item.",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_jButtonEditTrapActionPerformed

	private void jButtonRemoveTrapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRemoveTrapActionPerformed
		if (jListTraps.getSelectedValue() != null) {
			trapServiceImpl.removeTrap((Trap) jListTraps.getSelectedValue());
			defaultListModelTraps.removeElement(jListTraps.getSelectedValue());
		} else {
			JOptionPane.showMessageDialog(null, "You need select an item.",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_jButtonRemoveTrapActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			javax.swing.UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TrapSenderPanel.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TrapSenderPanel.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TrapSenderPanel.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TrapSenderPanel.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TrapSenderPanel().setVisible(true);
			}
		});
	}

	public DefaultListModel getDefaultListModelTraps() {
		return defaultListModelTraps;
	}

	public void setDefaultListModelTraps(DefaultListModel defaultListModelTraps) {
		this.defaultListModelTraps = defaultListModelTraps;
	}

	public DefaultListModel getDefaultListModelNEs() {
		return defaultListModelNEs;
	}

	public void setDefaultListModelNEs(DefaultListModel defaultListModelNEs) {
		this.defaultListModelNEs = defaultListModelNEs;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonAddTrap;
	private javax.swing.JButton jButtonEditTrap;
	private javax.swing.JButton jButtonRemoveTrap;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JList jListNEsIP;
	private javax.swing.JList jListTraps;
	private javax.swing.JPanel jPanelBorda;
	private javax.swing.JPanel jPanelForm;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextField jTextFieldManagerIP;
	private javax.swing.JTextField jTextFieldPort;
	private javax.swing.JTextField jTextFieldQuantity;
	private javax.swing.JTextField jTextFieldRepeatInterval;
	private javax.swing.JTextField jTextFieldSendInterval;
	// End of variables declaration//GEN-END:variables
}
