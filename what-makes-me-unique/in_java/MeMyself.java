//Class of myself
//I am an extension of the greater collective of People
//And I have skills, serious, [look at me!], very serious programming skills...

class David extends Person implements mySkills{
    
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
}

//do all humans have a main method, somewhere inside of their conscious being?
public class MeMyself{
    public static void main(String[] args){
        David david = new David();
        david.proclaimAwesomeness();
        david.allTheStuffIKnow();
        david.getExperience();
        david.mutantSuperPowers();
    }
}