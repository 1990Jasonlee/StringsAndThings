package io.zipcoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author tariq
 */
public class StringsAndThings {
    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        String[] splitted = input.split(" ");
        int count = 0;
        for (int i = 0; i < splitted.length; i++) {
            if (splitted[i].charAt(splitted[i].length() -1 ) == 'y' ||
                    splitted[i].charAt(splitted[i].length() -1 ) == 'z'){
                count++;
            }
        }
        return count;
    }
    //split words separated by " " into different array
    //for loop to check if words end in y or z, count

/*String split[] = input.split(" ");
    int count = 0;
    Pattern cYZ = Pattern.compile("[y-z]{1}");
    Matcher yZ = cYZ.matcher(input);
        while (yZ.find()) {
        count++;*/
//not working
    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        return base.replaceAll(remove, "");
    }


    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        boolean isAndNot;
        int isCount = (input.split("is", -1).length);
        int notCount = (input.split("not", -1).length);
        if (isCount == notCount){
            isAndNot = true;
        } else isAndNot = false;
        return isAndNot;
    }
        //find is
        //find not
        //compare and return true or false based on quantity matching


    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {

        String str = input;
        for (int i = 0; i < input.length(); i++){
            if (str.charAt(i) == 'g' && str.charAt(i + 1) == 'g'){
                return true;
            }
        }
        return false;
    }
    //for loop to go through string
    //check if g is next to another g


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int count = 0;
        String str = input;

        for (int i = 0; i < input.length() - 3; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) {
            count++;
            //only look if 3 in a row
            // tests if 1st character matches 2nd and 2nd match 3rd
        }
    }
    return count;
}
}