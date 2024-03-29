package sem1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Server extends JFrame {

    public static Chat chat = new Chat();
    private final int SIZE = 400;
    JButton btnStart,btnStop;
    JTextArea chatPrint = new JTextArea("История чата");;


    public Server() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(SIZE, SIZE);
        setLocationRelativeTo(null);
        setTitle("ChatServer");
        setResizable(false);
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");

        btnStart.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e){
                  chat.updateChat();
                  for (String s : chat.chatList) {
                      System.out.println(s);
                      chatPrint.append(s);
                  }

              }
        });
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // прерывание работы сервера
            }
        });
        JPanel panelText = new JPanel(new GridLayout(1,2));
        panelText.add(chatPrint);
        add(panelText,BorderLayout.CENTER);

        JPanel panel = new JPanel(new GridLayout(1,2));
        panel.add(btnStart);
        panel.add(btnStop);
        add(panel,BorderLayout.SOUTH);
    }
}
