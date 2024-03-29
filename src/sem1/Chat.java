package sem1;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class Chat {

    public static  ArrayList<String> chatList = new ArrayList<>();
    public Chat(){

    }

    public void sendToChat(String message) {
        try(FileWriter writeMess = new FileWriter(
                "C:\\Users\\user\\IdeaProjects\\JDK\\src\\sem1\\historyChat.txt",true)) {
            writeMess.write( "\n" + message );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void updateChat() {
        try(BufferedReader readMess = new BufferedReader (new FileReader(
                "C:\\Users\\user\\IdeaProjects\\JDK\\src\\sem1\\historyChat.txt"))) {
            for (String line : chatList) {
                while (line != null) {
                    line = readMess.readLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();}



    }




}
