//I'm a badass with some awesome technology skills
public interface mySkills{

    //here's what makes me a badass
    public enum NinjaSkills {
    JAVA ("Java,"),
    PYTHON ("Python, Django,"),
    JS ("Javascript, React, Node,"),
    AWS ("Amazon Web Services -- S3, EC2, automation scripts, and VPC,"),
    HTML ("HTML5,"),
    CSS ("CSS,"),
    SERIOUS_SKILLS ("Nunchuck Skills");

    //converts my enum constants to strings
    //citation: https://stackoverflow.com/questions/6667243/using-enum-values-as-string-literals
    //I can google things
    private final String name;       

    private NinjaSkills(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
       return this.name;
    }
}
    
}