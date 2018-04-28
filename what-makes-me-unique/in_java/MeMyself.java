//Class of myself
//I am an extension of the greater collective of People
//And I have skills, serious, [look at me!], very serious programming skills...

//package private visibility --> that's right, I can research scope
class David extends Person implements mySkills{

    //a message to anyone who thinks they're better than me...
    static final String whatIam = "Bro, do you even lift?";

    //no one outside this class can see this sh**
    private String education = "";
    private boolean athletic = true; //default is true, obviously...
    private int powerLevel;

    //uh oh - slightly different visibility modifiers between the class declaration
    //and the constructor, oh man, some serious sh** is probably about to go down...
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
            System.out.println(skills);
        }
    }

    //getters + setters
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
    public static void main(String[] args){
        David david = new David("CS degree from super challenging Engineering program",
            true, 9001);
        david.proclaimAwesomeness();
        david.allTheStuffIKnow();
        david.getExperience();
        david.mutantSuperPowers();
        System.out.println(david.whatIam);
        System.out.println(david.howMuchPowerDoesHeActuallyHave());
    }
}