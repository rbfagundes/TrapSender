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
import br.com.parks.varbind.Varbind;

/**
 * 
 * @author User
 */
@SuppressWarnings("serial")
public class TrapPanel extends javax.swing.JFrame {

	private DefaultListModel varbindListModel;
	private DefaultListModel trapListModel;
	private int index;
	private boolean edit = false;

	/**
	 * Creates new form TrapPanel
	 */
	public TrapPanel() {
		initComponents();
		init();
	}

	public TrapPanel(DefaultListModel trapListModel) {
		initComponents();
		init();
		this.trapListModel = trapListModel;
	}

	@SuppressWarnings("deprecation")
	public TrapPanel(DefaultListModel trapListModel, int index,
			Object varbindObject) {
		initComponents();
		init();
		this.edit = true;
		this.trapListModel = trapListModel;
		this.index = index;
		this.setTitle("Edit Trap");

		Trap trap = (Trap) varbindObject;
		jTextFieldNome.setText(trap.getName());
		jTextFieldOID.setText(trap.getOID());
		jTextFieldOID.disable();
		jPasswordFieldComunity.setText(trap.getComunity());
		for (Varbind varbind : trap.getVarbinds()) {
			varbindListModel.addElement(varbind);
		}
		jListVarbinds.setFixedCellWidth(250);
		jListVarbinds.setFixedCellHeight(15);
		jButtonAddTrap.setText("Update Trap");

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
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPanelBorda = new javax.swing.JPanel();
		jPanelForm = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextFieldNome = new javax.swing.JTextField();
		jTextFieldOID = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jListVarbinds = new javax.swing.JList();
		jLabel4 = new javax.swing.JLabel();
		jButtonAddVarbind = new javax.swing.JButton(new ImageIcon(
				"images/add.png"));
		jButtonEditVarbind = new javax.swing.JButton(new ImageIcon(
				"images/edit.png"));
		jButtonAddTrap = new javax.swing.JButton();
		jPasswordFieldComunity = new javax.swing.JPasswordField();
		jButtonRemoveVarbind = new javax.swing.JButton(new ImageIcon(
				"images/delete.png"));
		jButtonMoveUp = new javax.swing.JButton(new ImageIcon(
				"images/go-up.png"));
		jButtonMoveDown = new javax.swing.JButton(new ImageIcon(
				"images/go-down.png"));

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Add Trap");

		jPanelBorda.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Trap"));

		jPanelForm.setLayout(new java.awt.GridBagLayout());

		jLabel1.setText("Name:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(15, 5, 20, 20);
		jPanelForm.add(jLabel1, gridBagConstraints);

		jLabel2.setText("OID:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
		jPanelForm.add(jLabel2, gridBagConstraints);

		jTextFieldNome.setColumns(20);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(15, 0, 20, 20);
		jPanelForm.add(jTextFieldNome, gridBagConstraints);

		jTextFieldOID.setColumns(20);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
		jPanelForm.add(jTextFieldOID, gridBagConstraints);

		jLabel3.setText("Varbinds:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
		jPanelForm.add(jLabel3, gridBagConstraints);

		jListVarbinds
				.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		jListVarbinds.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jListVarbindsMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jListVarbinds);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 30;
		gridBagConstraints.ipady = 25;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 1.0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
		jPanelForm.add(jScrollPane1, gridBagConstraints);

		jLabel4.setText("Comunity:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
		jPanelForm.add(jLabel4, gridBagConstraints);

		jButtonAddVarbind.setToolTipText("Add Varbind");
		jButtonAddVarbind.setBorder(null);
		jButtonAddVarbind.setBorderPainted(false);
		jButtonAddVarbind.setContentAreaFilled(false);
		jButtonAddVarbind.setFocusPainted(false);
		jButtonAddVarbind
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonAddVarbindActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(8, 0, 60, 10);
		jPanelForm.add(jButtonAddVarbind, gridBagConstraints);

		jButtonEditVarbind.setToolTipText("Edit Varbind");
		jButtonEditVarbind.setBorder(null);
		jButtonEditVarbind.setBorderPainted(false);
		jButtonEditVarbind.setContentAreaFilled(false);
		jButtonEditVarbind.setFocusPainted(false);
		jButtonEditVarbind
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonEditVarbindActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(68, 0, 0, 10);
		jPanelForm.add(jButtonEditVarbind, gridBagConstraints);

		jButtonAddTrap.setText("Add Trap");
		jButtonAddTrap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAddTrapActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.ipadx = 25;
		jPanelForm.add(jButtonAddTrap, gridBagConstraints);

		jPasswordFieldComunity.setColumns(20);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
		jPanelForm.add(jPasswordFieldComunity, gridBagConstraints);

		jButtonRemoveVarbind.setToolTipText("Remove Varbind");
		jButtonRemoveVarbind.setBorder(null);
		jButtonRemoveVarbind.setBorderPainted(false);
		jButtonRemoveVarbind.setContentAreaFilled(false);
		jButtonRemoveVarbind.setFocusPainted(false);
		jButtonRemoveVarbind
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonRemoveVarbindActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(38, 0, 35, 10);
		jPanelForm.add(jButtonRemoveVarbind, gridBagConstraints);

		jButtonMoveUp.setToolTipText("Move Up");
		jButtonMoveUp.setBorder(null);
		jButtonMoveUp.setBorderPainted(false);
		jButtonMoveUp.setContentAreaFilled(false);
		jButtonMoveUp.setFocusPainted(false);
		jButtonMoveUp.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonMoveUpActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(98, 0, 0, 10);
		jPanelForm.add(jButtonMoveUp, gridBagConstraints);

		jButtonMoveDown.setToolTipText("Move Down");
		jButtonMoveDown.setBorder(null);
		jButtonMoveDown.setBorderPainted(false);
		jButtonMoveDown.setContentAreaFilled(false);
		jButtonMoveDown.setFocusPainted(false);
		jButtonMoveDown.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonMoveDownActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(128, 0, 0, 10);
		jPanelForm.add(jButtonMoveDown, gridBagConstraints);

		jPanelBorda.add(jPanelForm);

		getContentPane().add(jPanelBorda, java.awt.BorderLayout.CENTER);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	@SuppressWarnings("static-access")
	private void jListVarbindsMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jListVarbindsMouseClicked
		if (evt.getButton() == evt.BUTTON3) {
			showJListVarbindsMenu(evt);
		}

		if (evt.getClickCount() > 1) {
			editVarbindPanel();
		}
	}// GEN-LAST:event_jListVarbindsMouseClicked

	private void showJListVarbindsMenu(java.awt.event.MouseEvent evt) {
		JPopupMenu popup = new JPopupMenu();
		JMenuItem item1 = new JMenuItem("Add Varbind");
		item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addVarbindPanel();
			}
		});
		popup.add(item1);

		if (jListVarbinds.getSelectedValue() != null) {
			JMenuItem item2 = new JMenuItem("Edit Varbind");
			item2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					editVarbindPanel();
				}
			});
			popup.add(item2);

			JMenuItem item3 = new JMenuItem("Remove Varbind");
			item3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					removeVarbind();
				}
			});
			popup.add(item3);

			if (jListVarbinds.getSelectedIndex() != 0) {
				JMenuItem item4 = new JMenuItem("Move Up");
				item4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						varbindMoveUp();
					}
				});
				popup.add(item4);
			}

			if (jListVarbinds.getSelectedIndex() != varbindListModel.size() - 1) {
				JMenuItem item4 = new JMenuItem("Move Down");
				item4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						varbindMoveDown();
					}
				});
				popup.add(item4);
			}
		}

		popup.show(jListVarbinds, evt.getX(), evt.getY());
	}

	private void jButtonMoveDownActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMoveDownActionPerformed
		if (jListVarbinds.getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null, "Please select an item",
					"Error", JOptionPane.ERROR_MESSAGE);
		} else if (jListVarbinds.getSelectedIndex() == varbindListModel
				.getSize() - 1) {
			JOptionPane.showMessageDialog(null,
					"You can't move down this item", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			varbindMoveDown();
		}
	}// GEN-LAST:event_jButtonMoveDownActionPerformed

	private void jButtonMoveUpActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMoveUpActionPerformed
		if (jListVarbinds.getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null, "Please select an item",
					"Error", JOptionPane.ERROR_MESSAGE);
		} else if (jListVarbinds.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "You can't move up this item",
					"Error", JOptionPane.ERROR_MESSAGE);
		} else {
			varbindMoveUp();
		}
	}// GEN-LAST:event_jButtonMoveUpActionPerformed

	private void jButtonAddTrapActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddTrapActionPerformed
		TrapServiceImpl trapService = new TrapServiceImpl();
		if (verificarCampos()) {
			List<Varbind> varbinds = new ArrayList<Varbind>();
			for (int i = 0; i < jListVarbinds.getModel().getSize(); i++) {
				varbinds.add((Varbind) jListVarbinds.getModel().getElementAt(i));
			}

			Trap trap = new Trap(jTextFieldNome.getText(),
					jTextFieldOID.getText(), jPasswordFieldComunity
							.getPassword().toString(), varbinds);
			if (!edit) {
				trapService.addTrap(trap);
				trapListModel.addElement(trap);

				JOptionPane.showMessageDialog(null, "Trap added", "Success",
						JOptionPane.INFORMATION_MESSAGE);
				dispose();
			} else {
				trapService.editTrap(trap);
				trapListModel.set(index, trap);
				JOptionPane.showMessageDialog(null, "Trap edited", "Success",
						JOptionPane.INFORMATION_MESSAGE);
			}

			dispose();
		}

	}// GEN-LAST:event_jButtonAddTrapActionPerformed

	private void init() {
		setVarbindListModel(new DefaultListModel());
		jListVarbinds.setModel(getVarbindListModel());
	}

	private void jButtonAddVarbindActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddVarbindActionPerformed
		addVarbindPanel();
	}// GEN-LAST:event_jButtonAddVarbindActionPerformed

	private void addVarbindPanel() {
		new VarbindPanel(varbindListModel).setVisible(true);
	}

	private void jButtonEditVarbindActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonEditVarbindActionPerformed
		editVarbindPanel();
	}// GEN-LAST:event_jButtonEditVarbindActionPerformed

	private void editVarbindPanel() {
		if (jListVarbinds.getSelectedValue() != null) {
			new VarbindPanel(varbindListModel,
					jListVarbinds.getSelectedIndex(),
					jListVarbinds.getSelectedValue()).setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "You need select an item.",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void jButtonRemoveVarbindActionPerformed(
			java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRemoveVarbindActionPerformed
		removeVarbind();
	}// GEN-LAST:event_jButtonRemoveVarbindActionPerformed

	public void removeVarbind() {
		if (jListVarbinds.getSelectedValue() != null) {
			String[] optionMessages = { "Yes", "No" };
			int removeYes = JOptionPane.showOptionDialog(
					null,
					"Do you want remove this varbind ("
							+ jListVarbinds.getSelectedValue() + ")?",
					"Attention", JOptionPane.YES_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, optionMessages, null);
			if (removeYes == JOptionPane.YES_OPTION) {
				varbindListModel
						.removeElement(jListVarbinds.getSelectedValue());
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
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TrapPanel.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TrapPanel.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TrapPanel.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TrapPanel.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TrapPanel().setVisible(true);
			}
		});
	}

	private boolean verificarCampos() {
		if (jTextFieldNome.getText().isEmpty()
				|| jTextFieldNome.getText().trim().length() == 0) {
			JOptionPane.showMessageDialog(null, "Name is empty", "Error",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		if (jTextFieldOID.getText().isEmpty()
				|| jTextFieldOID.getText().trim().length() == 0) {
			JOptionPane.showMessageDialog(null, "OID is empty", "Error",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		if (jListVarbinds.getModel().getSize() == 0) {
			JOptionPane.showMessageDialog(null, "Varbinds list is empty",
					"Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		if (jPasswordFieldComunity.getPassword().length == 0) {
			JOptionPane.showMessageDialog(null, "Comunity is empty", "Error",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		return true;
	}

	private void varbindMoveUp() {
		int indexA = jListVarbinds.getSelectedIndex();

		Object objA = varbindListModel.elementAt(indexA);
		Object objB = varbindListModel.elementAt(indexA - 1);

		varbindListModel.set(indexA - 1, objA);
		varbindListModel.set(indexA, objB);
		jListVarbinds.setSelectedIndex(indexA - 1);
		// trapService.saveTraps(getTrapsOnJList());
	}

	private void varbindMoveDown() {
		int indexA = jListVarbinds.getSelectedIndex();

		Object objA = varbindListModel.elementAt(indexA);
		Object objB = varbindListModel.elementAt(indexA + 1);

		varbindListModel.set(indexA + 1, objA);
		varbindListModel.set(indexA, objB);
		jListVarbinds.setSelectedIndex(indexA + 1);
		// trapService.saveTraps(getTrapsOnJList());
	}

	public DefaultListModel getVarbindListModel() {
		return varbindListModel;
	}

	public void setVarbindListModel(DefaultListModel varbindListModel) {
		this.varbindListModel = varbindListModel;
	}

	public DefaultListModel getTrapListModel() {
		return trapListModel;
	}

	public void setTrapListModel(DefaultListModel trapListModel) {
		this.trapListModel = trapListModel;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonAddTrap;
	private javax.swing.JButton jButtonAddVarbind;
	private javax.swing.JButton jButtonEditVarbind;
	private javax.swing.JButton jButtonMoveDown;
	private javax.swing.JButton jButtonMoveUp;
	private javax.swing.JButton jButtonRemoveVarbind;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JList jListVarbinds;
	private javax.swing.JPanel jPanelBorda;
	private javax.swing.JPanel jPanelForm;
	private javax.swing.JPasswordField jPasswordFieldComunity;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jTextFieldNome;
	private javax.swing.JTextField jTextFieldOID;
	// End of variables declaration//GEN-END:variables
}
