class Caesar{

    static String andYouBrutus(String andYou, int idesOfMarch){
        String thenFallCaesar = "";

        int wouldCassiuslikeASCIIvalues = (int)andYou.charAt(0);
        int e = (wouldCassiuslikeASCIIvalues+idesOfMarch - 65)%26 + 65;
        System.out.println((char)e);

        //char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);

        //int constantAsTheNorthStar = Math.abs(idesOfMarch -wouldCassiuslikeASCIIvalues);
       // System.out.println(constantAsTheNorthStar);
        //System.out.println((int)'X' - 42);
        return thenFallCaesar;
    }

    public static void main(String[] args){
       

        String toEncrypt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int rotate = 23;
        andYouBrutus(toEncrypt, rotate);
    }
}