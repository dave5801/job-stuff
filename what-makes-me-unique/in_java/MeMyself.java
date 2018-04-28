//Class of myself
//I am an extension of the greater collective of People
//And I have skills, serious, [look at me!], very serious programming skills...

//imports
import java.util.*;

//package private visibility --> that's right, I can research scope
class David extends Person implements mySkills{

    //a message to anyone who thinks they're better than me...
    static final String whatIam = "Bro, do you even lift?";

    //no one outside this class can see this sh**
    private String education = "";
    private boolean athletic = true; //default is true, obviously...
    private int powerLevel;

    //uh oh - slightly different visibility modifiers between the class declaration
    //and the constructor, I bet there might be some issues if I try to instantiate 
    //this from outside my personal class heiarchy.
    protected David(String education, boolean athletic, int powerLevel){
        this.education = education;
        this.athletic = athletic;
        this.powerLevel = powerLevel;

    }

    //a little method overriding action
    void proclaimAwesomeness() { System.out.println("I'm very awesome actually"); }
    void getExperience(){System.out.println("I'm a GrandMaster of Martial Arts");}
    void mutantSuperPowers(){System.out.println("Basically, I'm Wolverine.");}

    //lets implement that interface
    public void allTheStuffIKnow(){
        for (NinjaSkills skills : NinjaSkills.values()) {
            System.out.println(skills + " " + skills.getClass().getName());
        }
    }

    //Not proper getters + setters...but rather my personal variation

    public String getEducationLevel(){
        String what_I_think_about_cs_degrees = "...mind set and experience are what makes a good engineer, not some sheet of paper.";

        return "I have " +this.education + " " + what_I_think_about_cs_degrees;
    }

    public String getAthleticProwess(){
        if(this.athletic == true){
            return "Thanks to the gym and eating right because god forbid I achieve something through hardwork...";
        }else{
            return "I think anyone can be in shape if they work hard for it.";
        }
    }

    //get power level -- in the form of someone's shocking reaction
    public String howMuchPowerDoesHeActuallyHave(){
        if(this.powerLevel > 9000){
            return "IT'S OVER 9000!!!!!";
        }else{
            return "I can feel his power increasing...!!!!!";
        }
    }

}

//do all humans have a main method, somewhere inside of their conscious being?
public class MeMyself{

    //a data structure which will not allow duplicates
    //see where I'm going with this?
    static HashSet all_people_in_existence = new HashSet();

    static void there_can_be_only_one(David david){
        
        //arbitrary for loop to add multiple elements to a hashset
        for(int i = 0; i < 10; i++){
            all_people_in_existence.add(david);
        }

        //hash sets have no tolerance for duplicates
        if(all_people_in_existence.size() == 1){
            System.out.println("[In an Ominous Voice] Make No Mistake...\n");
            System.out.println("There is Only one David Franklin.\n");
        }
    }

    public static void main(String[] args){

        David david = new David("CS degree from a super challenging Engineering program",
            true, 9001);
        
        there_can_be_only_one(david);

        System.out.println("...and this is why: \n");
        
        david.proclaimAwesomeness();
        david.allTheStuffIKnow();
        david.getExperience();
        david.mutantSuperPowers();
        System.out.println(david.whatIam);
        System.out.println(david.howMuchPowerDoesHeActuallyHave());
        System.out.println(david.getAthleticProwess());
        System.out.println(david.getEducationLevel());
    }
}