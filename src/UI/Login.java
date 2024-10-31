package UI;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Login = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Uname = new javax.swing.JLabel();
        UserNameTextfield = new javax.swing.JTextField();
        PasswordTextfield = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 51));
        Login.setText("Login");
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        Password.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 0, 0));
        Password.setText("Password");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        Uname.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Uname.setForeground(new java.awt.Color(0, 0, 0));
        Uname.setText("User Name");
        jPanel1.add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        UserNameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTextfieldActionPerformed(evt);
            }
        });
        jPanel1.add(UserNameTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 160, -1));
        jPanel1.add(PasswordTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 160, -1));

        jButtonLogin.setBackground(new java.awt.Color(153, 255, 255));
        jButtonLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTextfieldActionPerformed

    }//GEN-LAST:event_UserNameTextfieldActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String username; //sasi
        String Password; //123
        
        username = UserNameTextfield.getText();
        Password = PasswordTextfield.getText();
        
        if (username.equals("Sasi") && Password.equals("123")){
            MainFrame m1 =  new MainFrame ();
            this.hide();
            m1.setVisible(true);
        }
        
        else{
            JOptionPane.showMessageDialog(null,"Check username or password");
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordTextfield;
    private javax.swing.JLabel Uname;
    private javax.swing.JTextField UserNameTextfield;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
