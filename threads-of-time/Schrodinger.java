//this is the Cat's name as it is lost...in time.
//...like tears in the Rain.
class Schrodinger{
    Schrodinger(){}
    void makeCatSound() { System.out.println("\nMeow Meow"); }

    public boolean aliveOrDead(int timeDimension){
        if(timeDimension != 0){
            return true;
        }else{
            return false;
        }
    }
}