package com.fifteen.events.sync;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reAuthenticatePage extends JFrame {
  private JTextField emailTextField;
  private JTextField passwordTextField;
  private JButton submitButton;
  private JLabel displayMessage;
  private JLabel displayEmail;
  private JLabel emailJlabel;
  private JLabel passwordJlabel;
  private JLabel displayPassword;
  private JPanel reAuthPanel;
  private JFrame frame;

  public reAuthenticatePage() {

    frame = new JFrame("Re-Authenticate");

    frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    frame.setPreferredSize(new Dimension(300, 300));
    frame.setResizable(false);

    frame.add(reAuthPanel);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    submitButton.addActionListener(new ActionListener() {
      /**
       * Invoked when an action occurs.
       *
       * @param e the event to be processed
       */
      @Override
      public void actionPerformed(ActionEvent e) {
        // String
      }
    });
  }

  {
    // GUI initializer generated by IntelliJ IDEA GUI Designer
    // >>> IMPORTANT!! <<<
    // DO NOT EDIT OR ADD ANY CODE HERE!
    $$$setupUI$$$();
  }

  /**
   * Method generated by IntelliJ IDEA GUI Designer
   * >>> IMPORTANT!! <<<
   * DO NOT edit this method OR call it in your code!
   *
   * @noinspection ALL
   */
  private void $$$setupUI$$$() {
    reAuthPanel = new JPanel();
    reAuthPanel.setLayout(new GridLayoutManager(8, 1, new Insets(0, 0, 0, 0), -1, -1));
    emailTextField = new JTextField();
    reAuthPanel.add(emailTextField,
        new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null,
            0, false));
    passwordTextField = new JTextField();
    reAuthPanel.add(passwordTextField,
        new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null,
            0, false));
    submitButton = new JButton();
    submitButton.setText("Submit");
    reAuthPanel.add(submitButton,
        new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    emailJlabel = new JLabel();
    emailJlabel.setText("");
    reAuthPanel.add(emailJlabel,
        new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    passwordJlabel = new JLabel();
    passwordJlabel.setText("");
    reAuthPanel.add(passwordJlabel,
        new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    displayMessage = new JLabel();
    displayMessage.setHorizontalAlignment(0);
    displayMessage.setHorizontalTextPosition(0);
    displayMessage.setText("Please enter your email and password to sync your work");
    reAuthPanel.add(displayMessage,
        new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    displayEmail = new JLabel();
    displayEmail.setText("Email");
    reAuthPanel.add(displayEmail,
        new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    displayPassword = new JLabel();
    displayPassword.setText("Password");
    reAuthPanel.add(displayPassword,
        new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return reAuthPanel;
  }

  private void createUIComponents() {
    // TODO: place custom component creation code here
  }
}
