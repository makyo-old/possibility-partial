package com.mjs_svc.possibility.views;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.mjs_svc.possibility.controllers.LoginController;
import com.mjs_svc.possibility.util.*;
import java.beans.PropertyVetoException;
import java.util.*;

/**
 * A view with a username and password field to let a user log in.
 * @author Matthew Scott
 * @version $Id: Login.java 26 2010-04-13 04:20:41Z matthew.joseph.scott $
 */
public class Login extends JPanel {

    private ResourceBundle panelRB = ResourceBundle.getBundle(
            "PanelTexts",
            Locale.getDefault());
    private JLabel username_label = new JLabel(panelRB.getString("login.username")),
            password_label = new JLabel(panelRB.getString("login.password")),
            error = new JLabel();
    private JTextField username = new JTextField();
    private JPasswordField password = new JPasswordField();
    private JButton submit = new JButton(panelRB.getString("login"));
    private UserListener a;

    public static String title;
    public static final boolean resizable = false;
    public static final boolean closable = true;
    public static final boolean maximizable = false;
    public static final boolean iconifiable = false;

    /**
     * Construct a new login pane
     */
    public Login() {
        title = panelRB.getString("login");
        setLayout(new GridLayout(0, 2));
        setSize(250, 100);
        username_label.setFont(new Font(null, Font.BOLD, 14));
        password_label.setFont(new Font(null, Font.BOLD, 14));

        // Fire the submit button's action listener when enter is pressed
        password.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                submit.getActionListeners()[0].actionPerformed(e);
            }
        });
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                LoginController login = new LoginController();
                if (login.doLogin(username.getText(), new String(password.getPassword()))) {
                    if (a instanceof UserListener) {
                        a.setUser(login.getUser());
                        StatusContainer.getStatusBar().setStatus(
                                "Logged in!  Welcome, " + login.getUser().getUsername());
                        finish();
                    }
                } else {
                    username.setText("");
                    username.requestFocus();
                    password.setText("");
                    error.setForeground(Color.RED);
                    error.setText(panelRB.getString("login.failure"));
                    repaint();
                }
            }
        });
        add(username_label);
        add(username);
        add(password_label);
        add(password);
        add(error);
        add(submit);
        username.setFocusable(true);
        username.requestFocus();
    }

    /**
     * Close down the window so that the password and username disappear
     */
    public void finish() {
        JInternalFrame p = ((JInternalFrame) this
                .getParent() // JLayeredPane
                .getParent() // JRootPane
                .getParent()); // JInternalFrame

        try {
            p.setClosed(true);
        } catch (PropertyVetoException e) {
            //
        }
        p.dispose();
    }

    /**
     * Make sure we keep the app up to date with the new user
     * @param a The app that needs tellin'.
     */
    public void setUserListener(UserListener a) {
        this.a = a;
    }
}
