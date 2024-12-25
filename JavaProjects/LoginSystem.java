import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class LoginSystem {
    public static void main(String[] args) {
        
        IDandPassord idandPasswords = new IDandPassord();

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

    }
}

class IDandPassord {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPassord(){
        loginInfo.put("User1", "password1");
        loginInfo.put("username2", "password2");
        loginInfo.put("username3", "password3");

    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}

class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("Username:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel("");

    HashMap<String,String> loginInfo = new HashMap<String, String>();
    
    LoginPage(HashMap<String,String> loginInfoOriginal) {

        loginInfo = loginInfoOriginal;

        userIdLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null, Font.BOLD, 25));

        userIdField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == resetButton){
            userIdField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource() == loginButton){
            String userID = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(loginInfo.containsKey(userID)){
                if(loginInfo.get(userID).equals(password)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");
                    HomePage homePage = new HomePage(userID);
                    frame.dispose();
                }
                else{
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password!");
                }
            }
            else{
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Wrong username!");
            }
        }
    }
}

class HomePage {

    JFrame frame = new JFrame();
    JLabel HomeLabel = new JLabel("");

    HomePage(String userID){
        HomeLabel.setBounds(100,100,200,35);
        HomeLabel.setFont(new Font(null, Font.BOLD, 15));
        HomeLabel.setText("Welcome Back " + userID);

        frame.add(HomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}