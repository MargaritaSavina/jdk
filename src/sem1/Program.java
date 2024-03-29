package sem1;

public class Program {
    public static void main(String[] args) {

        Server server = new Server();
        server.setVisible(true);

    Client client1 = new Client("Vasya","12345",server);
    client1.setVisible(true);

    for (String a : server.chat.chatList) {
        System.out.println(a);
    }
}
}