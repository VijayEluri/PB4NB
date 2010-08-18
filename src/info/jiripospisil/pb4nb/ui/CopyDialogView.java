/*
 * PB4NB
 *
 * Copyright (c) 2010 Jiri Pospisil (jiripospisil.info)
 *
 * This software is licensed under the New BSD License. See
 * license.txt in the root directory of this software package
 * for more details.
 *
 */
package info.jiripospisil.pb4nb.ui;

import info.jiripospisil.pb4nb.ui.CopyDialogController.CloseButtonListener;
import info.jiripospisil.pb4nb.ui.CopyDialogController.CopyCloseButtonListener;
import javax.swing.JDialog;

/**
 *
 * @author Jiri Pospisil <mekishizufu@gmail.com>
 */
public class CopyDialogView extends JDialog {

    CopyDialogView(String url) {
        initComponents();
        setupComponents();
        initWindow();

        urlField.setText(url);
    }

    private void setupComponents() {
        copyCloseButton.requestFocusInWindow();
        urlField.setEditable(false);
    }

    private void initWindow() {
        setLocationRelativeTo(null);
        setModalityType(JDialog.DEFAULT_MODALITY_TYPE);
    }

    public void closeDialog() {
        setVisible(false);
        dispose();
    }

    void addCopyCloseButtonListener(CopyCloseButtonListener listener) {
        copyCloseButton.addActionListener(listener);
    }

    void addCloseButtonListener(CloseButtonListener listener) {
        closeButton.addActionListener(listener);
    }

    public String getUrlText() {
        return urlField.getText();
    }

    @SuppressWarnings("unchecked")
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        copyCloseButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        urlField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(CopyDialogView.class, "CopyDialogView.Form.title")); // NOI18N

        copyCloseButton.setText(org.openide.util.NbBundle.getMessage(CopyDialogView.class, "CopyDialogView.copyCloseButton.text")); // NOI18N

        closeButton.setText(org.openide.util.NbBundle.getMessage(CopyDialogView.class, "CopyDialogView.closeButton.text")); // NOI18N

        jLabel1.setText(org.openide.util.NbBundle.getMessage(CopyDialogView.class, "CopyDialogView.jLabel1.text")); // NOI18N

        urlField.setText(org.openide.util.NbBundle.getMessage(CopyDialogView.class, "CopyDialogView.urlField.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(urlField, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(copyCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {closeButton, copyCloseButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copyCloseButton)
                    .addComponent(closeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton copyCloseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField urlField;
    // End of variables declaration//GEN-END:variables
}
