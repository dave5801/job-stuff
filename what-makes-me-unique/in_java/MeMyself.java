//Class of myself
//I am an extension of the greater collective of People
//And I have skills, serious, [look at me!], very serious programming skills...

//imports
import java.util.*;

//package private visibility --> that's right, I can research scope
class David extends Person implements mySkills{

    //a message to anyone who thinks they're better than me...
    static final String whatIam = "\nI'm an Army Veteran who served in Iraq.\n";

    //no one outside this class can see this sh**
    private String education = "";
    private boolean isAthletic = true; //default is true, obviously...
    private int powerLevel;

    //uh oh - slightly different visibility modifiers between the class declaration
    //and the constructor, I bet there might be some issues if I try to instantiate 
    //this from outside my personal class heiarchy.
    protected David(String education, boolean isAthletic, int powerLevel){
        this.education = education;
        this.isAthletic = isAthletic;
        this.powerLevel = powerLevel;

    }

    //a little method overriding action
    void proclaimAwesomeness() { System.out.println("\nI'm very awesome actually."); }
    void getExperience(){System.out.println("I'm a GrandMaster of Martial Arts...From the Future.\n");}
    void mutantSuperPowers(){System.out.println("And also -- I'm Wolverine.\n");}

    //lets implement that interface
    public void allTheStuffIKnow(){
        //list out tech skills in one string
        StringBuilder tech_skills = new StringBuilder("TECHNOLOGY SKILLS: ");  
        //look enum values converted to Strings
        for (NinjaSkills skills : NinjaSkills.values()) {
            tech_skills.append(skills.toString() + " ");
        }
        System.out.println(tech_skills);
    }

    //Not proper getters + setters...but rather my personal variation

    public String getEducationLevel(){
        String what_I_think_about_cs_degrees = "...mind set and experience are what makes a good engineer, not some sheet of paper.";

        return "I have " +this.education + " " + what_I_think_about_cs_degrees;
    }

    public String getAthleticProwess(){
        if(this.isAthletic){
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
    static HashSet<Person> allPeopleInExistence = new HashSet();

    static void thereCanBeOnlyOne(David david){
        
        //arbitrary for loop to add multiple elements to a hashset
        for(int i = 0; i < 10; i++){
            allPeopleInExistence.add(david);
        }

        //hash sets have no tolerance for duplicates
        if(allPeopleInExistence.size() == 1){
            System.out.println("[In an Ominous Voice] Make No Mistake...\n");
            System.out.println("There is Only one David Franklin.\n");
        }
    }

    public static void main(String[] args){

        David david = new David("CS degree from a super challenging Engineering program",
            true, 9001);
        
        thereCanBeOnlyOne(david);

        System.out.println("...and this is why: \n");
        
        david.getExperience();
        david.mutantSuperPowers();

        david.allTheStuffIKnow();
        david.proclaimAwesomeness();

        System.out.println("What power level does this guy have...???? " +david.howMuchPowerDoesHeActuallyHave());
        System.out.println("I'm totally in shape too... " +david.getAthleticProwess());
        System.out.println("And also " +david.getEducationLevel());

        System.out.println(david.whatIam);
      
        
    }
}