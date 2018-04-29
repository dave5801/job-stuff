//this is the Cat's name, as it is lost in time...
//...Like Tears in the Rain.
class Schrodinger{

    Schrodinger(){}

    void makeCatSound(){System.out.println("Meow Meow");}

    public String aliveOrDead(boolean boxOpen, int timeDimension){
        if(boxOpen == false){
            return "Alive or Dead";
        }else{
            return "You cat murderer!!";
        }
    }

}