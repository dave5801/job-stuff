class HereticalReformer{

    //i am open to new ideas

    //but not beyond core beliefs
    final static String beliefs = "I am true to myself";

    String process1;
    String process2;

    //I can accept new ideas
    protected HereticalReformer(String process1, String process2){
        this.process1 = process1;
        this.process2 = process2;
    }

    public String getNewRevelation(){
        return "The System must be changed";
    }
}

class TheFanatic{
    final static String theEnd = "the System must be destroyed, and its purveyors with it";

    String newProphecy = "";

    //adopting new principles as excuse for atrocity
    private TheFanatic(String newProphecy){
        this.newProphecy = newProphecy;
    }
}

class StaticBeliefs{

    final static String dogma = "I believe in only this; all others are the enemy";

 

    public static void main(String args[]){
        System.out.println("Human Religious and Ideological Conflict as illustrated by Dogmatic Java");
        System.out.println("Just a little review of visibility modifiers");//and object constructors
        
        //declare old as the new
        StaticBeliefs oldBeliefSystem = new StaticBeliefs();
        System.out.println(oldBeliefSystem.dogma);

        //does the heretic truly exist outside the heirarchy...
        HereticalReformer reformer = new HereticalReformer("question the system", "do not accept old prejudices");
        //...if I can instantiate its protected class from beyond?
        System.out.println(reformer.beliefs); //--> real reformers merely attempt to change a corrupt system.
        System.out.println();
        System.out.println("Until the fanatics...");

        TheFanatic zealot = new TheFanatic(reformer.getNewRevelation());
        //they ruin the system
        //perhaps a way to detect class modifiers
        
        
        


       
        
        
    }
}