package seoungcoding.Day1124;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 로그인 확인 프로그램
 * 1, 아이디, 비밀번호를 입력받음
 */
public class LoginME extends JFrame {
    public static void main(String[] args) {
        new LoginME();
    }
    private JPanel loginPanel = new JPanel(new GridLayout(3, 2));
    private JLabel idLb = new JLabel("ID ");
    private JLabel pwLb = new JLabel("Password ");
    private JTextField idT = new JTextField();
    private JPasswordField pwT = new JPasswordField();
    private JButton loginBtn = new JButton("Login");

    private JButton idpwSearchBtn = new JButton("ID/Password 찾기");

    public LoginME() {

        super("LoginWindow");
        this.setContentPane(loginPanel);
        loginPanel.add(idLb);
        loginPanel.add(pwLb);
        loginPanel.add(idT);
        loginPanel.add(pwT);
        loginPanel.add(idpwSearchBtn);
        loginPanel.add(loginBtn);

        idLb.setHorizontalAlignment(NORMAL);
        pwLb.setHorizontalAlignment(NORMAL);

        setSize(480, 220);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idT.getText().trim();
                String pw = pwT.getText().trim();

                if (id.length() == 0 || pw.length() == 0) {
                    JOptionPane.showMessageDialog(null, "아이디와 비번을 입력하세요~", "아이디/비밀번호 입력", JOptionPane.DEFAULT_OPTION);
                    return;
                }
                if (id.equals("tjdxo1193") && pw.equals("tjdxo123")) {
                    JOptionPane.showMessageDialog(null, "Login Successful!!", "로그인 성공", JOptionPane.DEFAULT_OPTION);
                    return;
                }
                JOptionPane.showMessageDialog(null, "Login False", "로그인 실패", JOptionPane.DEFAULT_OPTION);
            }
        });
        idpwSearchBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "아이디 비번 찾기 : (공사중)", "아이디/비밀번호 찾기", JOptionPane.DEFAULT_OPTION);
            }
        });
    }
}
