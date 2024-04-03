package sem4;

import java.util.ArrayList;
import java.util.Locale;

public class Directory {
    ArrayList<Emploee> directory = new ArrayList<>();

    public Directory(ArrayList<Emploee> dir) {
         this.directory = dir;
    }

    public Directory(){

    }
    public void addEmploee(Emploee emp){
        directory.add(emp);
    }

    public ArrayList<Emploee> findExperience(int experience){
        ArrayList<Emploee> emp2 = new ArrayList<>();
        for (Emploee e : directory){
            if (e.getExperience() == experience){
                emp2.add(e);
            }
        }
        return emp2;
    }

    public void findPhoneNumber(String name){
        for (Emploee e : directory){
            if (e.getName() == name){
                System.out.printf(name + "Телефон: %d", e.getPhoneNumber());
            }
        }

    }

    public void findPersonalNumber(int num){
        for (Emploee e : directory){
            if (e.getPersonalNumber() == num){
                System.out.println(e.toString());
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(Emploee e : directory){
            str.append(e.toString()).append("\n");
        }
        return str.toString();
    }
}
