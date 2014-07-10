/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.parks.telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;

import br.com.parks.service.TrapGroupServiceImpl;
import br.com.parks.service.TrapServiceImpl;
import br.com.parks.trap.Trap;
import br.com.parks.trapgroup.TrapGroup;
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
	private TrapGroupServiceImpl groupService = new TrapGroupServiceImpl();
	private TrapSenderPanel trapSenderPanel;
	private DefaultComboBoxModel comboBoxModel;
	private long trapId;

	/**
	 * Creates new form TrapPanel
	 */
	public TrapPanel() {
		initComponents();
		init();
	}

	public TrapPanel(DefaultListModel trapListModel, Object groupObject,
			TrapSenderPanel trapSenderPanel) {
		initComponents();
		init();
		this.trapListModel = trapListModel;
		this.trapSenderPanel = trapSenderPanel;

		updateGroups(groupObject);
	}

	@SuppressWarnings("deprecation")
	public TrapPanel(DefaultListModel trapListModel, int index,
			Object trapObject, Object groupObject,
			TrapSenderPanel trapSenderPanel) {
		initComponents();
		init();
		this.edit = true;
		this.trapListModel = trapListModel;
		this.index = index;
		this.setTitle("Edit Trap");
		this.trapSenderPanel = trapSenderPanel;

		Trap trap = (Trap) trapObject;
		this.trapId = trap.getId();
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

		updateGroups(groupObject);

	}

	public void updateGroups(Object groupObject) {
		comboBoxModel.removeAllElements();
		for (TrapGroup group : groupService.getGroups()) {
			comboBoxModel.addElement(group);
		}

		if (groupObject != null) {
			DefaultComboBoxModel comboModel = (DefaultComboBoxModel) jComboBoxTrapGroup
					.getModel();
			comboModel.setSelectedItem(groupObject);
		}
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
		jButtonAddTrap = new javax.swing.JButton();
		jPasswordFieldComunity = new javax.swing.JPasswordField();
		jLabel5 = new javax.swing.JLabel();
		jComboBoxTrapGroup = new javax.swing.JComboBox();
		jPanelBotoesTraps = new javax.swing.JPanel();
		jButtonAddVarbind = new javax.swing.JButton(new ImageIcon(
				"images/add.png"));
		jButtonRemoveVarbind = new javax.swing.JButton(new ImageIcon(
				"images/delete.png"));
		jButtonEditVarbind = new javax.swing.JButton(new ImageIcon(
				"images/edit.png"));
		jButtonMoveUp = new javax.swing.JButton(new ImageIcon(
				"images/go-up.png"));
		jButtonMoveDown = new javax.swing.JButton(new ImageIcon(
				"images/go-down.png"));
		jButtonTrapGroup = new javax.swing.JButton(new ImageIcon(
				"images/group.png"));

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Add Trap");

		jPanelBorda.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Trap"));

		jPanelForm.setLayout(new java.awt.GridBagLayout());

		jLabel1.setText("Name:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
		jPanelForm.add(jLabel1, gridBagConstraints);

		jLabel2.setText("OID:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
		jPanelForm.add(jLabel2, gridBagConstraints);

		jTextFieldNome.setColumns(20);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
		jPanelForm.add(jTextFieldNome, gridBagConstraints);

		jTextFieldOID.setColumns(20);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
		jPanelForm.add(jTextFieldOID, gridBagConstraints);

		jLabel3.setText("Varbinds:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
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
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 30;
		gridBagConstraints.ipady = 25;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 1.0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
		jPanelForm.add(jScrollPane1, gridBagConstraints);

		jLabel4.setText("Comunity:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 20, 20);
		jPanelForm.add(jLabel4, gridBagConstraints);

		jButtonAddTrap.setText("Add Trap");
		jButtonAddTrap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAddTrapActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.ipadx = 25;
		jPanelForm.add(jButtonAddTrap, gridBagConstraints);

		jPasswordFieldComunity.setColumns(20);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
		jPanelForm.add(jPasswordFieldComunity, gridBagConstraints);

		jLabel5.setText("Group:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
		gridBagConstraints.insets = new java.awt.Insets(15, 5, 20, 20);
		jPanelForm.add(jLabel5, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new java.awt.Insets(15, 0, 20, 0);
		jPanelForm.add(jComboBoxTrapGroup, gridBagConstraints);

		jPanelBotoesTraps.setLayout(new java.awt.GridBagLayout());

		jButtonAddVarbind.setToolTipText("Add Trap");
		jButtonAddVarbind.setBorder(null);
		jButtonAddVarbind.setBorderPainted(false);
		jButtonAddVarbind.setContentAreaFilled(false);
		jButtonAddVarbind.setFocusPainted(false);
		jButtonAddVarbind.setMargin(new java.awt.Insets(50, 14, 2, 14));
		jButtonAddVarbind
				.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
		jButtonAddVarbind
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonAddVarbindActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 0);
		jPanelBotoesTraps.add(jButtonAddVarbind, gridBagConstraints);

		jButtonRemoveVarbind.setToolTipText("Remove Trap");
		jButtonRemoveVarbind.setBorder(null);
		jButtonRemoveVarbind.setBorderPainted(false);
		jButtonRemoveVarbind.setContentAreaFilled(false);
		jButtonRemoveVarbind.setFocusPainted(false);
		jButtonRemoveVarbind.setPreferredSize(new java.awt.Dimension(35, 23));
		jButtonRemoveVarbind.setRequestFocusEnabled(false);
		jButtonRemoveVarbind
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonRemoveVarbindActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.insets = new java.awt.Insets(5, 0, 8, 0);
		jPanelBotoesTraps.add(jButtonRemoveVarbind, gridBagConstraints);

		jButtonEditVarbind.setToolTipText("Edit Trap");
		jButtonEditVarbind.setBorder(null);
		jButtonEditVarbind.setBorderPainted(false);
		jButtonEditVarbind.setContentAreaFilled(false);
		jButtonEditVarbind.setFocusPainted(false);
		jButtonEditVarbind.setPreferredSize(new java.awt.Dimension(35, 23));
		jButtonEditVarbind
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonEditVarbindActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.insets = new java.awt.Insets(5, 0, 8, 0);
		jPanelBotoesTraps.add(jButtonEditVarbind, gridBagConstraints);

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
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.insets = new java.awt.Insets(5, 0, 8, 0);
		jPanelBotoesTraps.add(jButtonMoveUp, gridBagConstraints);

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
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.insets = new java.awt.Insets(5, 0, 8, 0);
		jPanelBotoesTraps.add(jButtonMoveDown, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
		jPanelForm.add(jPanelBotoesTraps, gridBagConstraints);

		jButtonTrapGroup.setBorder(null);
		jButtonTrapGroup.setBorderPainted(false);
		jButtonTrapGroup.setContentAreaFilled(false);
		jButtonTrapGroup.setFocusPainted(false);
		jButtonTrapGroup.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonTrapGroupActionPerformed(evt);
			}
		});
		jPanelForm.add(jButtonTrapGroup, new java.awt.GridBagConstraints());

		jPanelBorda.add(jPanelForm);

		getContentPane().add(jPanelBorda, java.awt.BorderLayout.CENTER);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void init() {
		this.setLocationRelativeTo(null);

		setVarbindListModel(new DefaultListModel());
		jListVarbinds.setModel(getVarbindListModel());

		setComboBoxModel(new DefaultComboBoxModel());
		jComboBoxTrapGroup.setModel(getComboBoxModel());
	}

	private void jButtonTrapGroupActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonTrapGroupActionPerformed
		new ManagerGroupPanel(trapSenderPanel, this).setVisible(true);
	}// GEN-LAST:event_jButtonTrapGroupActionPerformed

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

			JMenuItem item5 = new JMenuItem("Copy Varbind");
			item5.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					copyVarbind();
				}
			});
			popup.add(item5);

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

	private void copyVarbind() {
		Varbind varbind = (Varbind) jListVarbinds.getSelectedValue();
		Varbind copyVarbind = new Varbind(varbind.getType(), varbind.getValue());
		copyVarbind.setName(varbind.getName() + "_copy");
		JOptionPane.showMessageDialog(null, "Copy added", "Success",
				JOptionPane.INFORMATION_MESSAGE);
		varbindListModel.addElement(copyVarbind);
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

			TrapGroup group = (TrapGroup) jComboBoxTrapGroup.getSelectedItem();

			Trap trap = new Trap(jTextFieldNome.getText(),
					jTextFieldOID.getText(), jPasswordFieldComunity
							.getPassword().toString(), varbinds,
					groupService.getIdByName(group.getName()));
			if (!edit) {
				trapService.addTrap(trap);
				trapListModel.addElement(trap);

				JOptionPane.showMessageDialog(null, "Trap added", "Success",
						JOptionPane.INFORMATION_MESSAGE);
				dispose();
			} else {
				trap.setId(getTrapId());
				trapService.editTrap(trap);
				trapListModel.set(index, trap);
				JOptionPane.showMessageDialog(null, "Trap edited", "Success",
						JOptionPane.INFORMATION_MESSAGE);
				trapSenderPanel.updateGroups();
			}

			dispose();
		}

	}// GEN-LAST:event_jButtonAddTrapActionPerformed

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

	private boolean verificarCampos() {
		if (jComboBoxTrapGroup.getSelectedItem() == null) {
			JOptionPane.showMessageDialog(null, "Group is empty.", "Error",
					JOptionPane.ERROR_MESSAGE);
			jComboBoxTrapGroup.setBorder(BorderFactory
					.createLineBorder(Color.red));
			return false;
		}

		if (jTextFieldNome.getText().isEmpty()
				|| jTextFieldNome.getText().trim().length() == 0) {
			JOptionPane.showMessageDialog(null, "Name is empty", "Error",
					JOptionPane.ERROR_MESSAGE);
			jTextFieldNome.requestFocus();
			jTextFieldNome.setBorder(BorderFactory.createLineBorder(Color.red));
			return false;
		} else {
			jTextFieldNome.setBorder(UIManager.getBorder("TextField.border"));
		}

		if (jTextFieldOID.getText().isEmpty()
				|| jTextFieldOID.getText().trim().length() == 0) {
			JOptionPane.showMessageDialog(null, "OID is empty", "Error",
					JOptionPane.ERROR_MESSAGE);
			jTextFieldOID.requestFocus();
			jTextFieldOID.setBorder(BorderFactory.createLineBorder(Color.red));
			return false;
		} else {
			jTextFieldOID.setBorder(UIManager.getBorder("TextField.border"));
		}

		if (jListVarbinds.getModel().getSize() == 0) {
			JOptionPane.showMessageDialog(null, "Varbinds list is empty",
					"Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}

		if (jPasswordFieldComunity.getPassword().length == 0) {
			JOptionPane.showMessageDialog(null, "Comunity is empty", "Error",
					JOptionPane.ERROR_MESSAGE);
			jPasswordFieldComunity.requestFocus();
			jPasswordFieldComunity.setBorder(BorderFactory
					.createLineBorder(Color.red));
			return false;
		} else {
			jPasswordFieldComunity.setBorder(UIManager
					.getBorder("TextField.border"));
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

	public DefaultComboBoxModel getComboBoxModel() {
		return comboBoxModel;
	}

	public void setComboBoxModel(DefaultComboBoxModel comboBoxModel) {
		this.comboBoxModel = comboBoxModel;
	}

	public long getTrapId() {
		return trapId;
	}

	public void setTrapId(long trapId) {
		this.trapId = trapId;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonAddTrap;
	private javax.swing.JButton jButtonAddVarbind;
	private javax.swing.JButton jButtonEditVarbind;
	private javax.swing.JButton jButtonMoveDown;
	private javax.swing.JButton jButtonMoveUp;
	private javax.swing.JButton jButtonRemoveVarbind;
	private javax.swing.JButton jButtonTrapGroup;
	private javax.swing.JComboBox jComboBoxTrapGroup;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JList jListVarbinds;
	private javax.swing.JPanel jPanelBorda;
	private javax.swing.JPanel jPanelBotoesTraps;
	private javax.swing.JPanel jPanelForm;
	private javax.swing.JPasswordField jPasswordFieldComunity;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jTextFieldNome;
	private javax.swing.JTextField jTextFieldOID;
	// End of variables declaration//GEN-END:variables
}
