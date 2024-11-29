/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainPackage;
import Database.Database;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author reizi
 */
public class signIn extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public signIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pop_up_form = new javax.swing.JPanel();
        sign_in = new javax.swing.JLabel();
        usernameTf = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        passwordTf = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        signBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        background.setBackground(new java.awt.Color(153, 153, 153));

        pop_up_form.setBackground(new java.awt.Color(204, 204, 204));
        pop_up_form.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sign_in.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sign_in.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sign_in.setText("SIGN IN");
        sign_in.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        usernameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTfActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        username.setText("Username");

        passwordTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTfActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        password.setText("Password");

        signBtn.setBackground(new java.awt.Color(51, 51, 255));
        signBtn.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        signBtn.setForeground(new java.awt.Color(255, 255, 255));
        signBtn.setText("Sign In");
        signBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signBtnActionPerformed(evt);
            }
        });

        signUpBtn.setBackground(new java.awt.Color(0, 204, 0));
        signUpBtn.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("Create New Account");
        signUpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pop_up_formLayout = new javax.swing.GroupLayout(pop_up_form);
        pop_up_form.setLayout(pop_up_formLayout);
        pop_up_formLayout.setHorizontalGroup(
            pop_up_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pop_up_formLayout.createSequentialGroup()
                .addGroup(pop_up_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pop_up_formLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pop_up_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username)
                            .addComponent(password)
                            .addComponent(passwordTf, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                            .addComponent(usernameTf)))
                    .addGroup(pop_up_formLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(sign_in, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pop_up_formLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(signUpBtn))
                    .addGroup(pop_up_formLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(signBtn)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pop_up_formLayout.setVerticalGroup(
            pop_up_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pop_up_formLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(sign_in)
                .addGap(18, 18, 18)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(signBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signUpBtn)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pop_up_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pop_up_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTfActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_usernameTfActionPerformed

    private void signBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signBtnActionPerformed
        // TODO add your handling code here:
        
        String username = usernameTf.getText();
        String password = passwordTf.getText();
        
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username atau Password tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Database db = new Database();
        String role = db.getUser(username, password);
        
        if ("admin".equals(role)) {
        JOptionPane.showMessageDialog(this, "Login berhasil sebagai Admin!", "Informasi", JOptionPane.INFORMATION_MESSAGE);

        // Redirect ke mainPageAdmin
        mainPageAdmin adminPage = new mainPageAdmin();
        adminPage.setVisible(true);
        this.dispose();
        } else if ("pembeli".equals(role)) {
        JOptionPane.showMessageDialog(this, "Login berhasil sebagai Pembeli!", "Informasi", JOptionPane.INFORMATION_MESSAGE);

        // Redirect ke mainPagePembeli
        mainPagePembeli pembeliPage = new mainPagePembeli();
        pembeliPage.setVisible(true);
        this.dispose();
        } else {
        // Jika username atau password salah
        JOptionPane.showMessageDialog(this, "Username atau Password salah!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_signBtnActionPerformed

    private void passwordTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTfActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // TODO add your handling code here:
        new signUp().setVisible(true);
        setVisible(false);
        
        
    }//GEN-LAST:event_signUpBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel password;
    private javax.swing.JTextField passwordTf;
    private javax.swing.JPanel pop_up_form;
    private javax.swing.JButton signBtn;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JLabel sign_in;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables
}
