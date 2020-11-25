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

                // 정규표현식 regular expression
                // 특정한 규칙을 가진 문자열의 집합을 표현하기 위하여 사용하는 형식언어
                //[0-9] : 숫자집합
                //[a-z,A-Z] : 영문자 집합
                //[가-힣] : 한글 집합
                //* : 0이상 무한개의 임의의 문자 반복
                //ab* : ab, ab
                //+ :1개 이상 무한개의 임의의 문자 반복
                //ab+ : aba, ab1, abA, abaa, ...
                // ? : 0개 또는 1개의 임의의 문자 반복
                //ab? : aba, abb, ... ab0, abZ, abz
                //{n,m} : 최소 n개 이상 m개 이하 반복
                //[0-9]{3,4} : 123, 987 , 1234, 9876
                // ^ : 문자열 시작
                // ^123 : 123으로 시작하는 문자열 의미
                //$ : 문자열 끝
                //123$ : 123으로 끝나는 문자열 의미
                //. : 임의의 문자를 의미
                //.{3, } : 문자의 최소길이는 3
                //ex) 사용자 아이디가 다음규칙에 적합하게 작성되었는지 학인
                //영문자 소문자하나/ 대문자 하나씩, 숫자, 특수기호 등으로
                if((id.contains("[a-z]")) && (id.contains("[A-Z]")) && (id.contains("[0-9]")) && !(id.contains("[a-z],[A-Z],[0-9]"))) {
                    JOptionPane.showMessageDialog(null, "아이디가 잘못됬습니다~", "아이디확인", JOptionPane.DEFAULT_OPTION);
                    return;
                }
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


