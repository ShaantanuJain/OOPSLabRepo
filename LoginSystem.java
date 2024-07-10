import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginSystem {

    private static HashMap<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        // Login Panel
        JPanel loginPanel = new JPanel();
        frame.add(loginPanel);
        placeLoginComponents(loginPanel, frame);

        frame.setVisible(true);
    }

    private static void placeLoginComponents(JPanel panel, JFrame frame) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JButton signupButton = new JButton("Sign Up");
        signupButton.setBounds(180, 80, 80, 25);
        panel.add(signupButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());
                if (users.containsKey(user) && users.get(user).equals(password)) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
            }
        });

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame signupFrame = new JFrame("Sign Up");
                signupFrame.setSize(300, 150);
                JPanel signupPanel = new JPanel();
                signupFrame.add(signupPanel);
                placeSignupComponents(signupPanel, signupFrame);
                signupFrame.setVisible(true);
            }
        });
    }

    private static void placeSignupComponents(JPanel panel, JFrame frame) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton signupButton = new JButton("Sign Up");
        signupButton.setBounds(100, 80, 80, 25);
        panel.add(signupButton);

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());
                if (!users.containsKey(user)) {
                    users.put(user, password);
                    JOptionPane.showMessageDialog(frame, "Sign up successful!");
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(frame, "Username already exists");
                }
            }
        });
    }
}
