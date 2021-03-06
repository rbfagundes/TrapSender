/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.parks.telas;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import br.com.parks.service.TrapGroupServiceImpl;
import br.com.parks.trapgroup.TrapGroup;

/**
 * 
 * @author User
 */
@SuppressWarnings("serial")
public class TrapGroupPanel extends javax.swing.JFrame {

	private DefaultListModel groupListModel;
	TrapGroupServiceImpl groupService = new TrapGroupServiceImpl();
	private boolean edit = false;
	private int index;
	private long groupId;
	TrapSenderPanel trapSenderPanel;
	TrapPanel trapPanel;

	/**
	 * Creates new form TrapGroupPanel
	 */
	public TrapGroupPanel(DefaultListModel groupListModel,
			TrapSenderPanel trapSenderPanel, TrapPanel trapPanel) {
		initComponents();
		init();

		this.groupListModel = groupListModel;
		this.trapSenderPanel = trapSenderPanel;
		this.trapPanel = trapPanel;
	}

	public TrapGroupPanel(DefaultListModel groupListModel, int index,
			Object groupObject, TrapSenderPanel trapSenderPanel,
			TrapPanel trapPanel) {
		initComponents();
		init();

		this.groupListModel = groupListModel;
		this.edit = true;
		this.index = index;
		this.setTitle("Edit Group");
		TrapGroup group = (TrapGroup) groupObject;
		jTextFieldName.setText(group.getName());
		jButtonAddGroup.setText("Update");
		this.groupId = group.getId();
		this.trapSenderPanel = trapSenderPanel;
		this.trapPanel = trapPanel;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPanelBorda = new javax.swing.JPanel();
		jPanelForm = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextFieldName = new javax.swing.JTextField();
		jButtonAddGroup = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Add Group");

		jPanelBorda.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Group"));
		jPanelBorda
				.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

		jPanelForm.setLayout(new java.awt.GridBagLayout());

		jLabel1.setText("Name:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 25);
		jPanelForm.add(jLabel1, gridBagConstraints);

		jTextFieldName.setColumns(5);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.ipadx = 160;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 10);
		jPanelForm.add(jTextFieldName, gridBagConstraints);

		jButtonAddGroup.setText("Add");
		jButtonAddGroup.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAddGroupActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 2;
		jPanelForm.add(jButtonAddGroup, gridBagConstraints);

		jPanelBorda.add(jPanelForm);

		getContentPane().add(jPanelBorda, java.awt.BorderLayout.CENTER);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void init() {
		// set componente no meio da tela
		this.setLocationRelativeTo(null);
	}

	private void jButtonAddGroupActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAddGroupActionPerformed
		if (jTextFieldName.getText().isEmpty()
				|| jTextFieldName.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "Name is empty", "Error",
					JOptionPane.ERROR_MESSAGE);
			jTextFieldName.requestFocus();
			jTextFieldName.setBorder(BorderFactory.createLineBorder(Color.red));
		} else {
			TrapGroup group = new TrapGroup();
			group.setId(this.groupId);
			group.setName(jTextFieldName.getText());

			if (!edit) {
				groupService.addGroup(group);
				groupListModel.addElement(new TrapGroup(jTextFieldName
						.getText()));
				JOptionPane.showMessageDialog(null, "Group added", "Success",
						JOptionPane.INFORMATION_MESSAGE);

				trapSenderPanel.updateGroups();
				if (trapPanel != null)
					trapPanel.updateGroups(group);

			} else {
				groupService.editGroup(group);
				groupListModel.set(index,
						new TrapGroup(jTextFieldName.getText()));
				trapSenderPanel.updateGroups();
				if (trapPanel != null)
					trapPanel.updateGroups(group);
				JOptionPane.showMessageDialog(null, "Group edited", "Success",
						JOptionPane.INFORMATION_MESSAGE);
			}
			dispose();
		}
	}// GEN-LAST:event_jButtonAddGroupActionPerformed
		// Variables declaration - do not modify//GEN-BEGIN:variables

	private javax.swing.JButton jButtonAddGroup;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanelBorda;
	private javax.swing.JPanel jPanelForm;
	private javax.swing.JTextField jTextFieldName;
	// End of variables declaration//GEN-END:variables
}
