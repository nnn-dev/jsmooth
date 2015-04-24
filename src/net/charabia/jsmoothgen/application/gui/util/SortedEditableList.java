/*
  JSmooth: a VM wrapper toolkit for Windows
  Copyright (C) 2003 Rodrigo Reyes <reyes@charabia.net>

  This program is free software; you can redistribute it and/or modify
  it under the terms of the GNU General Public License as published by
  the Free Software Foundation; either version 2 of the License, or
  (at your option) any later version.

  This program is distributed in the hope that it will be useful,
  but WITHOUT ANY WARRANTY; without even the implied warranty of
  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  GNU General Public License for more details.

  You should have received a copy of the GNU General Public License
  along with this program; if not, write to the Free Software
  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.

 */

package net.charabia.jsmoothgen.application.gui.util;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class SortedEditableList extends javax.swing.JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8617535398966274353L;
	private boolean m_editableItems = true;
	private Editor m_editor;

	private DefaultListModel m_model = new DefaultListModel();

	public interface Editor {
		public Object createNewItem(SortedEditableList selist);

		public Object editItem(SortedEditableList selist, Object item);

		public boolean removeItem(SortedEditableList selist, Object item);
	}

	public class StringEditor implements SortedEditableList.Editor {
		public Object createNewItem(SortedEditableList selist) {
			String result = JOptionPane
					.showInputDialog(selist, "Type a string");
			return result;
		}

		public Object editItem(SortedEditableList selist, Object item) {
			String result = JOptionPane.showInputDialog(selist,
					"Type a string", item.toString());
			return result;
		}

		public boolean removeItem(SortedEditableList selist, Object item) {
			return true;
		}
	}

	/** Creates new form BeanForm */
	public SortedEditableList() {
		m_editor = new SortedEditableList.StringEditor();
		initComponents();
		m_itemList.setModel(m_model);
	}

	public void setEditor(SortedEditableList.Editor editor) {
		m_editor = editor;
	}

	public void setData(Object[] items) {
		m_model.removeAllElements();
		for (int i = 0; i < items.length; i++)
			m_model.addElement(items[i]);
	}

	public Object[] getData() {
		return m_model.toArray();
	}

	public int dataSize() {
		return m_model.size();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents()// GEN-BEGIN:initComponents
	{
		java.awt.GridBagConstraints gridBagConstraints;

		jScrollPane1 = new javax.swing.JScrollPane();
		m_itemList = new javax.swing.JList();
		m_buttonAdd = new javax.swing.JButton();
		m_buttonRemove = new javax.swing.JButton();
		m_buttonEdit = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();
		m_buttonUp = new javax.swing.JButton();
		m_buttonDown = new javax.swing.JButton();

		setLayout(new java.awt.GridBagLayout());

		jScrollPane1.setViewportView(m_itemList);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridwidth = 4;
		gridBagConstraints.gridheight = 8;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 1.0;
		add(jScrollPane1, gridBagConstraints);

		m_buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/icons/stock_insert-element.png")));
		m_buttonAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonAddActionPerformed(evt);
			}
		});

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		add(m_buttonAdd, gridBagConstraints);

		m_buttonRemove.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/icons/stock_remove-element.png")));
		m_buttonRemove.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonRemoveActionPerformed(evt);
			}
		});

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		add(m_buttonRemove, gridBagConstraints);

		m_buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/icons/stock_edit.png")));
		m_buttonEdit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonEditActionPerformed(evt);
			}
		});

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		add(m_buttonEdit, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.weighty = 1.0;
		gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
		add(jSeparator1, gridBagConstraints);

		m_buttonUp.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/icons/stock_up.png")));
		m_buttonUp.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonUpActionPerformed(evt);
			}
		});

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
		add(m_buttonUp, gridBagConstraints);

		m_buttonDown.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/icons/stock_down.png")));
		m_buttonDown.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonDownActionPerformed(evt);
			}
		});

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridy = 7;
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
		add(m_buttonDown, gridBagConstraints);

	}// GEN-END:initComponents

	private void buttonDownActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_buttonDownActionPerformed
	{// GEN-HEADEREND:event_buttonDownActionPerformed
		// Add your handling code here:
		int max = m_model.size();
		int index = m_itemList.getSelectedIndex();
		if ((index + 1) < max) {
			Object o = m_model.remove(index);
			m_model.add(index + 1, o);
			m_itemList.setSelectedIndex(index + 1);
		}
		modelChanged();
	}// GEN-LAST:event_buttonDownActionPerformed

	private void buttonUpActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_buttonUpActionPerformed
	{// GEN-HEADEREND:event_buttonUpActionPerformed
		// Add your handling code here:
		int index = m_itemList.getSelectedIndex();
		if (index > 0) {
			Object o = m_model.remove(index);
			m_model.add(index - 1, o);
			m_itemList.setSelectedIndex(index - 1);
		}
		modelChanged();
	}// GEN-LAST:event_buttonUpActionPerformed

	public void setEditableItems(boolean b) {
		m_editableItems = b;
		m_buttonEdit.setEnabled(b);
		m_buttonAdd.setEnabled(b);
		m_buttonRemove.setEnabled(b);
	}

	public boolean getEditableItems() {
		return m_editableItems;
	}

	private void buttonEditActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_buttonEditActionPerformed
	{// GEN-HEADEREND:event_buttonEditActionPerformed
		// Add your handling code here:
		int index = m_itemList.getSelectedIndex();
		if (index >= 0) {
			Object o = m_model.get(index);
			Object n = m_editor.editItem(this, o);
			if (n != null) {
				m_model.removeElementAt(index);
				m_model.add(index, n);
				m_itemList.setSelectedIndex(index);
			}
		}
		modelChanged();
	}// GEN-LAST:event_buttonEditActionPerformed

	private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_buttonRemoveActionPerformed
	{// GEN-HEADEREND:event_buttonRemoveActionPerformed
		// Add your handling code here:

		Object[] items = m_itemList.getSelectedValues();
		for (int i = 0; i < items.length; i++) {
			Object o = items[i];
			if (o != null) {
				if (m_editor.removeItem(this, o))
					m_model.removeElement(o);
			}
		}
		modelChanged();
	}// GEN-LAST:event_buttonRemoveActionPerformed

	private void buttonAddActionPerformed(java.awt.event.ActionEvent evt)// GEN-FIRST:event_buttonAddActionPerformed
	{// GEN-HEADEREND:event_buttonAddActionPerformed
		// Add your handling code here:
		Object item = m_editor.createNewItem(this);
		if (item != null) {
			System.out.println("IsArray: " + item.getClass() + " == "
					+ item.getClass().isArray());
			if (item.getClass().isArray()) {
				for (int i = 0; i < java.lang.reflect.Array.getLength(item); i++) {
					Object o = java.lang.reflect.Array.get(item, i);
					if (m_model.contains(o) == false)
						m_model.addElement(o);
				}
			} else {
				if (m_model.contains(item) == false)
					m_model.addElement(item);
			}
			modelChanged();
		}
	}// GEN-LAST:event_buttonAddActionPerformed

	protected void modelChanged() {
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JButton m_buttonAdd;
	private javax.swing.JButton m_buttonDown;
	private javax.swing.JButton m_buttonEdit;
	private javax.swing.JButton m_buttonRemove;
	private javax.swing.JButton m_buttonUp;
	private javax.swing.JList m_itemList;
	// End of variables declaration//GEN-END:variables

}
