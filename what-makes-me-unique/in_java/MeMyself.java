class David extends Person implements mySkills{
    
    void proclaimAwesome() { System.out.println("I'm very awesome actually"); }

    public void allTheStuffIKnow(){
        for (NinjaSkills skills : NinjaSkills.values()) {
            System.out.println(skills);
        }
    }
}

public class MeMyself{
    public static void main(String[] args){
        David david = new David();
        david.proclaimAwesome();
        david.allTheStuffIKnow();
    }
}