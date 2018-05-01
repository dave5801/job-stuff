class Caesar{

    static String andYouBrutus(String andYou, int idesOfMarch){
        StringBuilder thenFallCaesar=new StringBuilder("");  
  
        int wouldCassiuslikeASCIIvalues = 0;

        for(int senators = 0; senators < andYou.length(); senators++){

            wouldCassiuslikeASCIIvalues = (int)andYou.charAt(senators);

            if (Character.isUpperCase(andYou.charAt(senators))){
                char constantAsTheNorthStar = (char)((wouldCassiuslikeASCIIvalues+idesOfMarch - 65)%26 + 65);
                thenFallCaesar.append(constantAsTheNorthStar);
            }else{
                char constantAsTheNorthStar = (char)((wouldCassiuslikeASCIIvalues+idesOfMarch - 97)%26 + 97);
                thenFallCaesar.append(constantAsTheNorthStar);
            }
        }

        return thenFallCaesar.toString();
    }

    public static void main(String[] args){
       

        String toEncrypt = "Try to keep up with the Historical References";
        int rotate = 23;
        String encrypted = andYouBrutus(toEncrypt, rotate);
        System.out.println(encrypted);
    }
}