package sem4;

import java.util.ArrayList;

public class Emploee {

    private String name;
    private ArrayList<Long> phoneNumber = new ArrayList<>();
    private int experience;

    private static int id = 100;
    private  int personalNumber;


    public Emploee(String name, long phoneNumber, int experience){
        this.experience = experience;
        this.name = name;
        this.phoneNumber.add(phoneNumber);
        this.personalNumber = id;
        id++;


    }


    public void setPhoneNumber(ArrayList<Long> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public ArrayList<Long> getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                " personalNumber=" + personalNumber +
                ",name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", experience=" + experience +
                '}';
    }
}
