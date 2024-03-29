package sem1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client extends JFrame{
    private final int SIZE = 400;
    JButton btnStart,btn;


    public Client(String name, String passwd, Server server)  {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(SIZE, SIZE);
        setLocationRelativeTo(null);
        setTitle("ChatClient");
        setResizable(false);

        JPanel panelAbove = new JPanel(new GridLayout(2,3));
        JPanel panelBelow = new JPanel(new GridLayout(1,2));
        JPanel panelText = new JPanel(new GridLayout(1,1));

        JLabel textIP = new JLabel("127.0.0.1");
        JLabel textPort = new JLabel("8189");
        JTextField login = new JTextField(name);
        JTextField password = new JTextField(passwd);
        JButton btnLogin = new JButton("login");
        JTextField sendMessage = new JTextField();
        JButton btnSend = new JButton("send");
        JTextArea chatPrint = new JTextArea("История чата");

        panelText.add(chatPrint);
        add(panelText,BorderLayout.CENTER);

        panelAbove.add(textIP);
        panelAbove.add(textPort);
        panelAbove.add(new JLabel());
        panelAbove.add(login);
        panelAbove.add(password);
        panelAbove.add(btnLogin);
        add(panelAbove,BorderLayout.NORTH);

        panelBelow.add(sendMessage);
        panelBelow.add(btnSend,BorderLayout.EAST);
        add(panelBelow,BorderLayout.SOUTH);

        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.chat.sendToChat(sendMessage.getText());
                server.chat.updateChat();
                for(String s : server.chat.chatList) {
                    chatPrint.append(s);
                }
            }
        });

    }


}
