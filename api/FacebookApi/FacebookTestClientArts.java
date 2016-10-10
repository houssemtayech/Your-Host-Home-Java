/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.FacebookApi;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author myriam
 */
public class FacebookTestClientArts extends JFrame{
 JButton login;
 JButton getPermissionsForApp;
 JButton retrieveUser;
 JButton getAccessToken;
    public FacebookTestClientArts() {
  login = new JButton("Login");
  getPermissionsForApp = new JButton("get permissions for app");
  retrieveUser = new JButton("retrieve user information");
  getAccessToken = new JButton("get access_token");

  JPanel panel = new JPanel();
  panel.setLayout(new GridLayout(0, 1));

  panel.add(login);
  panel.add(getPermissionsForApp);
  panel.add(retrieveUser);
  panel.add(getAccessToken);

  add(panel);

  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setSize(100, 125);
  setLocationRelativeTo(null);
  setVisible(true);
  // VOIR MEANING
  pack();
 }
    public void setLoginListener(ActionListener l) {
  login.addActionListener(l);
 }

 public void setgetPermissionsForAppListener(ActionListener l) {
  getPermissionsForApp.addActionListener(l);
 }

 public void setretrieveUserListener(ActionListener l) {
  retrieveUser.addActionListener(l);
 }

 public void setgetAccessTokenListener(ActionListener l) {
  getAccessToken.addActionListener(l);
 }

}
