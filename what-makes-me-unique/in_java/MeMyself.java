class David extends Person{
    void proclaimAwesome() { System.out.println("I'm very awesome actually"); }
}

public class MeMyself{
    public static void main(String[] args){
        David david = new David();
        david.proclaimAwesome();
    }
}