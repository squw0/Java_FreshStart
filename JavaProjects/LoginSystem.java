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

        HomePage homePage = new HomePage();
    }
}

class IDandPassord {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPassord(){
        loginInfo.put("username1", "password1");
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
    JPasswordField userPassword = new JPasswordField();
    JLabel userIdLabel = new JLabel("Username:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel(":D");

    HashMap<String,String> loginInfo = new HashMap<String, String>();
    
    LoginPage(HashMap<String,String> loginInfoOriginal) {

        loginInfo = loginInfoOriginal;

        userIdLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null, Font.BOLD, 25));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    
}

class HomePage {

}