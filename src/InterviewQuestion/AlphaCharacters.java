package InterviewQuestion;




public class AlphaCharacters {
    public static void main(String[] args) {

    String given = "ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
    String OnlyAlphabets ="";
    String OnlyDigits ="";
    String OnlySpecial = "";
    // we need use
    for(int i =0; i<given.length();i++) {
        char ch = given.charAt(i);
        if (Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
            OnlyAlphabets += ch;

        } else if (!Character.isAlphabetic(ch) && Character.isDigit(ch)) {
            OnlyDigits +=ch;
        } else {
            OnlySpecial += ch;
        }
    }


         System.out.println(" Only Alphabets is "+ OnlyAlphabets);
        System.out.println("Only Dijits is :"+OnlyDigits);
        System.out.println("Only Special sybbols: "+OnlySpecial);
    }

}

