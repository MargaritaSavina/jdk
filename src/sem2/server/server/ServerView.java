package sem2.server.server;

import sem2.server.client.ClientController;

public interface ServerView {
    public boolean connectUser(ClientController client);
    public void disconnectUser(ClientController client);
    public void appendLog(String text);
}
