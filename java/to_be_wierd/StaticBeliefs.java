class DynamicRebel{

    //i am open to new ideas

    //but not beyond core beliefs
    final static String beliefs = "I am true to myself";

    String process1;
    String process2;

    //I can accept new ideas
    protected DynamicRebel(String process1, String process2){
        this.process1 = process1;
        this.process2 = process2;
    }
}


class StaticBeliefs{

    final static String dogma = "I believe in only this; all others are the enemy";

    public static void main(String args[]){
        System.out.println("I am unchanging in my beliefs");

        //declare old as the new
        StaticBeliefs oldBeliefSystem = new StaticBeliefs();
        System.out.println(oldBeliefSystem.dogma);

        DynamicRebel heretic = new DynamicRebel("question the system", "do not accept old prejudices");
        System.out.println(heretic.beliefs);
    }
}