/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Rudy Rachman
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setTitle("Login");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HEADER = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        isi = new javax.swing.JPanel();
        scrollpaneUser = new javax.swing.JScrollPane();
        username = new javax.swing.JEditorPane();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HEADER.setBackground(new java.awt.Color(233, 231, 97));
        HEADER.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        isi.setBackground(new java.awt.Color(207, 189, 119));
        isi.setForeground(new java.awt.Color(180, 180, 180));

        username.setForeground(new java.awt.Color(0, 0, 0));
        username.setText("Username");
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        scrollpaneUser.setViewportView(username);

        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setText("password");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout isiLayout = new javax.swing.GroupLayout(isi);
        isi.setLayout(isiLayout);
        isiLayout.setHorizontalGroup(
            isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiLayout.createSequentialGroup()
                .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(isiLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollpaneUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(isiLayout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        isiLayout.setVerticalGroup(
            isiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isiLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(scrollpaneUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(isi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(isi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        if(username.getText().equals("Username")) username.setText("");
    }//GEN-LAST:event_usernameFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        if(username.getText().equals("")) username.setText("Username");
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if(Arrays.toString(password.getPassword()).equals("[]"))password.setText("Password");
    }//GEN-LAST:event_passwordFocusLost

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String password="", username="",panggilan="";
        boolean empty=false, login=false;
        if(this.username.getText().equals(""))empty = true;
        else username = this.username.getText();
        
        if(Arrays.toString(this.password.getPassword()).equals("[]")) empty=true;
        else{
            for(char a:this.password.getPassword())
                password+=a;
        }
        ConnectDB con = new ConnectDB();
        ArrayList<UserPass> al = con.login();
        for(UserPass up:al){
            if(username.equals(up.getUser())&&password.equals(up.getPass())){
                login=true;
                panggilan = up.getPanggilan();
                setgetKasir.user=up.getUser();
                setgetKasir.namaPanggilan=up.getPanggilan();
                break;
            } else login=false;
        }
        if(login){
            JOptionPane.showMessageDialog(this,"Selamat datang "+panggilan,"Login Berhasil",JOptionPane.INFORMATION_MESSAGE);
            Menu menu = new Menu();
            menu.setVisible(true);
            this.dispose();
        }else JOptionPane.showMessageDialog(this, "Username dan Password tidak ditemukan","Error!",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_loginActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER||evt.getKeyCode()==KeyEvent.VK_TAB){
            if(Arrays.toString(password.getPassword()).equals("[]")) password.requestFocus();
            else login.requestFocus();
            evt.consume();
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER||evt.getKeyCode()==KeyEvent.VK_TAB){
            if(username.getText().equals("")) username.requestFocus();
            else password.requestFocus();
            evt.consume();
        }
    }//GEN-LAST:event_usernameKeyPressed
    private void mouseChanged(int status){
        Cursor cursor;
        if(status==1) cursor = new Cursor(Cursor.HAND_CURSOR);
        else cursor = new Cursor(Cursor.DEFAULT_CURSOR);
        setCursor(cursor);
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HEADER;
    private javax.swing.JPanel isi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JScrollPane scrollpaneUser;
    private javax.swing.JEditorPane username;
    // End of variables declaration//GEN-END:variables
}
