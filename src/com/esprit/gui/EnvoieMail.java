/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.gui;

import static com.esprit.gui.Login.us;
import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author pc
 */
public class EnvoieMail extends javax.swing.JFrame {

    /**
     * Creates new form EnvoieMail
     */
    public EnvoieMail() {
        
        
        initComponents();
       
        yourmail.setText(us.getEmail());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sendmail = new javax.swing.JTextField();
        object = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        envoyer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        yourmail = new javax.swing.JTextField();
        tfpassword = new javax.swing.JPasswordField();
        Retour = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Destiné à ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 325, 64, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Objet");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 394, 70, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Description");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 444, 80, 30);

        sendmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        sendmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendmailActionPerformed(evt);
            }
        });
        getContentPane().add(sendmail);
        sendmail.setBounds(190, 320, 428, 30);

        object.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(object);
        object.setBounds(190, 390, 428, 30);

        description.setColumns(20);
        description.setRows(5);
        description.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setViewportView(description);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 440, 521, 181);

        envoyer.setText("Envoyer");
        envoyer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                envoyerMouseReleased(evt);
            }
        });
        envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoyerActionPerformed(evt);
            }
        });
        getContentPane().add(envoyer);
        envoyer.setBounds(740, 660, 110, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Votre Email");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 210, 80, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("Mot De Passe");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(59, 270, 100, 15);

        yourmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        yourmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yourmailActionPerformed(evt);
            }
        });
        getContentPane().add(yourmail);
        yourmail.setBounds(190, 200, 428, 31);

        tfpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(tfpassword);
        tfpassword.setBounds(190, 260, 428, 27);

        Retour.setText("Retour");
        Retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RetourMouseReleased(evt);
            }
        });
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });
        getContentPane().add(Retour);
        Retour.setBounds(600, 660, 94, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/gui/arriere plan.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1170, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendmailActionPerformed

    private void envoyerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_envoyerMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_envoyerMouseReleased

    private void envoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoyerActionPerformed
         
        
        if(yourmail.getText().equals(null)&&tfpassword.getText().equals(null)&&sendmail.getText().equals(null)&&object.getText().equals(null)&&description.getText().equals(null)){
        int confirm = JOptionPane.showConfirmDialog(this, "Etes vous sur de vouloir envoyer ce mail !", "Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
       
         if (confirm == JOptionPane.OK_OPTION) {
//         if(yourmail.getText().equals(null)&&tfpassword.getText().equals(null)&&sendmail.getText().equals(null)&&object.getText().equals(null)&&description.getText().equals(null)){
        
        final String username = yourmail.getText();
    final String password = tfpassword.getText();
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "25");
    Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
        }
      });

    try {
        javax.mail.Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(yourmail.getText()));
        message.setRecipients(javax.mail.Message.RecipientType.TO,
            InternetAddress.parse(sendmail.getText()));// 
        message.setSubject(object.getText());
        message.setText(description.getText()); 
        Transport.send(message,message.getAllRecipients());
        JOptionPane.showMessageDialog(null, "Email envoyé avec succés");
         menuClient j = new menuClient();
        j.setVisible(true);
        j.setSize(1075 , 728);

        this.setVisible(false);
    } catch (MessagingException e) {
        //throw new RuntimeException(e);
        JOptionPane.showMessageDialog(null, e);
    }
        }else 
        {
            menuClient j = new menuClient();
        j.setVisible(true);
        j.setSize(1075 , 728);

        this.setVisible(false);
        }
         }
        else
         {
            JOptionPane.showMessageDialog(null, "veuillez saisir tous les champs svp !!");
       }
    }//GEN-LAST:event_envoyerActionPerformed

    private void yourmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yourmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yourmailActionPerformed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RetourActionPerformed

    private void RetourMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetourMouseReleased
        menuClient j = new menuClient();
        j.setVisible(true);
        j.setSize(1075 , 728);

        this.setVisible(false);
    }//GEN-LAST:event_RetourMouseReleased

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
           /*     if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnvoieMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnvoieMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnvoieMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnvoieMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               EnvoieMail e =new EnvoieMail();
               e.setVisible(true);
                 
                e.setSize(1075 , 728);
                e.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retour;
    private javax.swing.JTextArea description;
    private javax.swing.JButton envoyer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField object;
    private javax.swing.JTextField sendmail;
    private javax.swing.JPasswordField tfpassword;
    private javax.swing.JTextField yourmail;
    // End of variables declaration//GEN-END:variables
}
