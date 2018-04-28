//I'm a badass with some awesome technology skills
public interface mySkills{

    //here's what makes me a badass
    public enum NinjaSkills {
    JAVA ("Java"),
    PYTHON ("Python"),
    JS ("Javascript -- meaning React and Node too"),
    AWS ("Amazon Web Services -- S3, EC2, automation scripts, and VPC"),
    HTML ("HTML5"),
    CSS ("CSS - I write it manually rather than relying on Bootstrap"),
    SERIOUS_SKILLS ("Nunchuck Skills");

    private final String name;       

    private NinjaSkills(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false 
        return name.equals(otherName);
    }

    public String toString() {
       return this.name;
    }
}
    
}