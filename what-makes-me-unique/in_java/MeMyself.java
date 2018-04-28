class David extends Person implements mySkills{
    
    void proclaimAwesomeness() { System.out.println("I'm very awesome actually"); }
    void getExperience(){System.out.println("I'm a GrandMaster of Martial Arts");}
    void mutantSuperPowers(){System.out.println("Basically, I'm Wolverine.");}

    public void allTheStuffIKnow(){
        for (NinjaSkills skills : NinjaSkills.values()) {
            System.out.println(skills);
        }
    }
}

public class MeMyself{
    public static void main(String[] args){
        David david = new David();
        david.proclaimAwesomeness();
        david.allTheStuffIKnow();
        david.getExperience();
        david.mutantSuperPowers();
    }
}