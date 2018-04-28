class David extends Person implements mySkills{
    void proclaimAwesome() { System.out.println("I'm very awesome actually"); }


    public String allTheStuffIKnow(){
        return stuffIKnow;
    }
}

public class MeMyself{
    public static void main(String[] args){
        David david = new David();
        david.proclaimAwesome();
        System.out.println(david.allTheStuffIKnow());
    }
}