/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.parks.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

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
	TrapServiceImpl trapService = new TrapServiceImpl();

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
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
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
		jButtonAddTrap = new javax.swing.JButton(
				new ImageIcon("images/add.png"));
		jButtonRemoveTrap = new javax.swing.JButton(new ImageIcon(
				"images/delete.png"));
		jButtonEditTrap = new javax.swing.JButton(new ImageIcon(
				"images/edit.png"));
		jButtonMoveUp = new javax.swing.JButton(new ImageIcon(
				"images/go-up.png"));
		jButtonMoveDown = new javax.swing.JButton(new ImageIcon(
				"images/go-down.png"));
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
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(15, 50, 20, 20);
		jPanelForm.add(jLabel6, gridBagConstraints);

		jLabel7.setText("Repeat interval:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.insets = new java.awt.Insets(15, 150, 20, 20);
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

		jListTraps.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jListTrapsMouseClicked(evt);
			}
		});
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

		jTextFieldQuantity.setColumns(3);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(15, -1, 20, 20);
		jPanelForm.add(jTextFieldQuantity, gridBagConstraints);

		jTextFieldSendInterval.setColumns(3);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.insets = new java.awt.Insets(15, -10, 20, 10);
		jPanelForm.add(jTextFieldSendInterval, gridBagConstraints);

		jTextFieldRepeatInterval.setColumns(3);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(15, 45, 20, 15);
		jPanelForm.add(jTextFieldRepeatInterval, gridBagConstraints);

		jButtonAddTrap.setToolTipText("Add Trap");
		jButtonAddTrap.setBorder(null);
		jButtonAddTrap.setBorderPainted(false);
		jButtonAddTrap.setContentAreaFilled(false);
		jButtonAddTrap.setFocusPainted(false);
		jButtonAddTrap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAddTrapActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		jPanelForm.add(jButtonAddTrap, gridBagConstraints);

		jButtonRemoveTrap.setToolTipText("Remove Trap");
		jButtonRemoveTrap.setBorder(null);
		jButtonRemoveTrap.setBorderPainted(false);
		jButtonRemoveTrap.setContentAreaFilled(false);
		jButtonRemoveTrap.setFocusPainted(false);
		jButtonRemoveTrap.setPreferredSize(new java.awt.Dimension(35, 23));
		jButtonRemoveTrap.setRequestFocusEnabled(false);
		jButtonRemoveTrap
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonRemoveTrapActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
		jPanelForm.add(jButtonRemoveTrap, gridBagConstraints);

		jButtonEditTrap.setToolTipText("Edit Trap");
		jButtonEditTrap.setBorder(null);
		jButtonEditTrap.setBorderPainted(false);
		jButtonEditTrap.setContentAreaFilled(false);
		jButtonEditTrap.setFocusPainted(false);
		jButtonEditTrap.setPreferredSize(new java.awt.Dimension(35, 23));
		jButtonEditTrap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonEditTrapActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(60, 0, 0, 0);
		jPanelForm.add(jButtonEditTrap, gridBagConstraints);

		jButtonMoveUp.setToolTipText("Move Up");
		jButtonMoveUp.setBorder(null);
		jButtonMoveUp.setBorderPainted(false);
		jButtonMoveUp.setContentAreaFilled(false);
		jButtonMoveUp.setFocusPainted(false);
		jButtonMoveUp.setPreferredSize(new java.awt.Dimension(35, 23));
		jButtonMoveUp.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonMoveUpActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(90, 0, 0, 0);
		jPanelForm.add(jButtonMoveUp, gridBagConstraints);

		jButtonMoveDown.setToolTipText("Move Down");
		jButtonMoveDown.setBorder(null);
		jButtonMoveDown.setBorderPainted(false);
		jButtonMoveDown.setContentAreaFilled(false);
		jButtonMoveDown.setFocusPainted(false);
		jButtonMoveDown.setPreferredSize(new java.awt.Dimension(35, 23));
		jButtonMoveDown.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonMoveDownActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(120, 0, 0, 0);
		jPanelForm.add(jButtonMoveDown, gridBagConstraints);

		jPanelBorda.add(jPanelForm);

		getContentPane().add(jPanelBorda, java.awt.BorderLayout.CENTER);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonMoveUpActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMoveUpActionPerformed
		if (jListTraps.getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null, "Please select an item",
					"Error", JOptionPane.ERROR_MESSAGE);
		} else if (jListTraps.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "You can't move up this item",
					"Error", JOptionPane.ERROR_MESSAGE);
		} else {
			trapMoveUp();
		}
	}// GEN-LAST:event_jButtonMoveUpActionPerformed

	private void jButtonMoveDownActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMoveDownActionPerformed
		if (jListTraps.getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null, "Please select an item",
					"Error", JOptionPane.ERROR_MESSAGE);
		} else if (jListTraps.getSelectedIndex() == defaultListModelTraps
				.getSize() - 1) {
			JOptionPane.showMessageDialog(null,
					"You can't move down this item", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			trapMoveDown();
		}
	}// GEN-LAST:event_jButtonMoveDownActionPerformed

	private void init() {
		// set traps
		setDefaultListModelTraps(new DefaultListModel());
		jListTraps.setModel(getDefaultListModelTraps());
		for (Trap trap : trapService.getTraps()) {
			defaultListModelTraps.addElement(trap);
		}

		// set NE's
		setDefaultListModelNEs(new DefaultListModel());
		jListNEsIP.setModel(getDefaultListModelNEs());

		// set default data
		jTextFieldQuantity.setText("1");
		jTextFieldRepeatInterval.setText("1");
		jTextFieldSendInterval.setText("1");
	}

	private void jButtonAddTrapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddTrapActionPerformed
		addTrapPanel();
	}// GEN-LAST:event_jButtonAddTrapActionPerformed

	private void addTrapPanel() {
		new TrapPanel(defaultListModelTraps).setVisible(true);
	}

	private void jButtonEditTrapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonEditTrapActionPerformed
		editTrapPanel();
	}// GEN-LAST:event_jButtonEditTrapActionPerformed

	private void editTrapPanel() {
		if (jListTraps.getSelectedValue() != null) {
			new TrapPanel(defaultListModelTraps, jListTraps.getSelectedIndex(),
					jListTraps.getSelectedValue()).setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "You need select an item.",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void jButtonRemoveTrapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRemoveTrapActionPerformed
		removeTrap();
	}// GEN-LAST:event_jButtonRemoveTrapActionPerformed

	private void removeTrap() {
		if (jListTraps.getSelectedValue() != null) {
			String[] optionMessages = { "Yes", "No" };
			int removeYes = JOptionPane.showOptionDialog(
					null,
					"Do you want remove this trap ("
							+ jListTraps.getSelectedValue() + ")?",
					"Attention", JOptionPane.YES_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, optionMessages, null);
			if (removeYes == JOptionPane.YES_OPTION) {
				trapService.removeTrap((Trap) jListTraps.getSelectedValue());
				defaultListModelTraps.removeElement(jListTraps
						.getSelectedValue());
			}
		} else {
			JOptionPane.showMessageDialog(null, "You need select an item.",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

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

	@SuppressWarnings("static-access")
	private void jListTrapsMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jListTrapsMouseClicked
		if (evt.getButton() == evt.BUTTON3) {
			showJListTrapsMenu(evt);
		}

		if (evt.getClickCount() > 1) {
			editTrapPanel();
		}

	}// GEN-LAST:event_jListTrapsMouseClicked

	private void showJListTrapsMenu(java.awt.event.MouseEvent evt) {
		JPopupMenu popup = new JPopupMenu();
		JMenuItem item1 = new JMenuItem("Add Trap");
		item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addTrapPanel();
			}
		});
		popup.add(item1);

		if (jListTraps.getSelectedValue() != null) {
			JMenuItem item2 = new JMenuItem("Edit Trap");
			item2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					editTrapPanel();
				}
			});
			popup.add(item2);

			JMenuItem item3 = new JMenuItem("Remove Trap");
			item3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					removeTrap();
				}
			});
			popup.add(item3);

			if (jListTraps.getSelectedIndex() != 0) {
				JMenuItem item4 = new JMenuItem("Move Up");
				item4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						trapMoveUp();
					}
				});
				popup.add(item4);
			}

			if (jListTraps.getSelectedIndex() != defaultListModelTraps.size() - 1) {
				JMenuItem item4 = new JMenuItem("Move Down");
				item4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						trapMoveDown();
					}
				});
				popup.add(item4);
			}
		}

		popup.show(jListTraps, evt.getX(), evt.getY());
	}

	private void trapMoveUp() {
		int indexA = jListTraps.getSelectedIndex();

		Object objA = defaultListModelTraps.elementAt(indexA);
		Object objB = defaultListModelTraps.elementAt(indexA - 1);

		defaultListModelTraps.set(indexA - 1, objA);
		defaultListModelTraps.set(indexA, objB);
		jListTraps.setSelectedIndex(indexA - 1);
		trapService.saveTraps(getTrapsOnJList());

	}

	private void trapMoveDown() {
		int indexA = jListTraps.getSelectedIndex();

		Object objA = defaultListModelTraps.elementAt(indexA);
		Object objB = defaultListModelTraps.elementAt(indexA + 1);

		defaultListModelTraps.set(indexA + 1, objA);
		defaultListModelTraps.set(indexA, objB);
		jListTraps.setSelectedIndex(indexA + 1);
		trapService.saveTraps(getTrapsOnJList());
	}

	private List<Trap> getTrapsOnJList() {
		List<Trap> traps = new ArrayList<Trap>();
		for (int i = 0; i < defaultListModelTraps.size(); i++) {
			Trap trap = (Trap) defaultListModelTraps.getElementAt(i);
			traps.add(trap);
		}

		return traps;
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
	private javax.swing.JButton jButtonMoveDown;
	private javax.swing.JButton jButtonMoveUp;
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
