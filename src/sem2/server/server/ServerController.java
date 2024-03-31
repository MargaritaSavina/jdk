package sem2.server.server;

import sem2.server.client.ClientController;

import java.util.ArrayList;
import java.util.List;

public class ServerController {



    public List<ClientController> clientList  = new ArrayList<>();
    public ServerView serverView;
    public Repository repository;

    boolean work;

    public void setServerView(ServerView serverView) {this.serverView = serverView;}



    public void message(String text){
        if (!work){
            return;
        }
        serverView.appendLog(text);
        answerAll(text);
        repository.saveHistory(text);
    }

    private void answerAll(String text){
        for (ClientController client: clientList){
            client.message(text);
        }
    }



}
