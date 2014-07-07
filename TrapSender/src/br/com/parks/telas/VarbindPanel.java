package br.com.parks.telas;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.PlainDocument;

import br.com.parks.util.LimitedNumberTextFielDocument;
import br.com.parks.varbind.Varbind;
import br.com.parks.varbind.VarbindType;

/**
 * 
 * @author User
 */
@SuppressWarnings("serial")
public class VarbindPanel extends javax.swing.JFrame {

	private DefaultListModel defaultListModel;
	private int index;
	private boolean edit = false;

	/**
	 * Creates new form VarbindPanel
	 */
	public VarbindPanel() {
		initComponents();
		init();
	}

	public VarbindPanel(DefaultListModel defaultListModel) {
		initComponents();
		init();
		this.defaultListModel = defaultListModel;
	}

	public VarbindPanel(DefaultListModel defaultListModel, int index,
			Object varbindObject) {
		initComponents();
		init();
		this.edit = true;
		this.defaultListModel = defaultListModel;
		this.index = index;
		this.setTitle("Edit Varbind");
		Varbind varbind = (Varbind) varbindObject;
		jComboBoxType.getModel().setSelectedItem(varbind.getType());
		jComboBoxType.setSelectedIndex(getIndexByType(varbind.getType()));
		jTextFieldValue.setText(varbind.getValue());
		jButtonAdd.setText("Update");
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
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPanelBorda = new javax.swing.JPanel();
		jPanelForm = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jComboBoxType = new javax.swing.JComboBox();
		jLabel3 = new javax.swing.JLabel();
		jTextFieldValue = new javax.swing.JTextField();
		jButtonAdd = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Add Varbind");

		jPanelBorda.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Varbind"));

		jPanelForm.setLayout(new java.awt.GridBagLayout());

		jLabel1.setText("Type:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 25);
		jPanelForm.add(jLabel1, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 25);
		jPanelForm.add(jLabel2, gridBagConstraints);

		jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "INTEGER", "GAUGE", "STRING", "TIMETICKS" }));
		jComboBoxType.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				jComboBoxTypeItemStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 10);
		jPanelForm.add(jComboBoxType, gridBagConstraints);

		jLabel3.setText("Value:");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 25);
		jPanelForm.add(jLabel3, gridBagConstraints);

		jTextFieldValue.setColumns(20);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 10);
		jPanelForm.add(jTextFieldValue, gridBagConstraints);

		jButtonAdd.setText("Add");
		jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAddActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.ipadx = 25;
		jPanelForm.add(jButtonAdd, gridBagConstraints);

		jPanelBorda.add(jPanelForm);

		getContentPane().add(jPanelBorda, java.awt.BorderLayout.CENTER);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jComboBoxTypeItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_jComboBoxTypeItemStateChanged
		if (jComboBoxType.getSelectedItem().equals("INTEGER")
				|| jComboBoxType.getSelectedItem().equals("TIMETICKS"))
			jTextFieldValue.setDocument(new LimitedNumberTextFielDocument(10));
		else
			jTextFieldValue.setDocument(new PlainDocument());
	}// GEN-LAST:event_jComboBoxTypeItemStateChanged

	private void init() {
		this.setLocationRelativeTo(null);
		jTextFieldValue.setDocument(new LimitedNumberTextFielDocument(10));
	}

	private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		if (jTextFieldValue.getText().isEmpty()
				|| jTextFieldValue.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "Value is empty", "Error",
					JOptionPane.ERROR_MESSAGE);
			jTextFieldValue.requestFocus();
			jTextFieldValue
					.setBorder(BorderFactory.createLineBorder(Color.red));
		} else {
			if (!edit) {
				defaultListModel.addElement(new Varbind(getType(),
						jTextFieldValue.getText()));
				JOptionPane.showMessageDialog(null, "Varbind added", "Success",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				defaultListModel.set(index, new Varbind(getType(),
						jTextFieldValue.getText()));
				JOptionPane.showMessageDialog(null, "Varbind edited",
						"Success", JOptionPane.INFORMATION_MESSAGE);
			}
			dispose();
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private VarbindType getType() {
		switch (jComboBoxType.getSelectedIndex()) {
		case 0:
			return VarbindType.INTEGER;
		case 1:
			return VarbindType.GAUGE;
		case 2:
			return VarbindType.STRING;
		default:
			return VarbindType.TIMETICKS;
		}
	}

	private int getIndexByType(VarbindType type) {
		if (VarbindType.INTEGER.equals(type)) {
			return 0;
		} else if (VarbindType.GAUGE.equals(type)) {
			return 1;
		} else if (VarbindType.STRING.equals(type)) {
			return 2;
		} else {
			return 3;
		}
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonAdd;
	private javax.swing.JComboBox jComboBoxType;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanelBorda;
	private javax.swing.JPanel jPanelForm;
	private javax.swing.JTextField jTextFieldValue;
	// End of variables declaration//GEN-END:variables
}
