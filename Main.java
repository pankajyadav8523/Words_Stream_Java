
// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Stemmer class
        Stemmer_word stemmer = new Stemmer_word();
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a word
        System.out.println("Enter a word:");
        String word = scanner.nextLine();
        // Close the scanner
        scanner.close();
        // Declare a variable to store the suffix
        String suffix = "";
        // Use a series of if-else statements to check the word for the suffix and assign the suffix variable accordingly
        if (word.endsWith("ed")) {
            suffix = "ed";
        } else if (word.endsWith("ly")) {
            suffix = "ly";
        } else if (word.endsWith("ful")) {
            suffix = "ful";
        } else if (word.endsWith("est")) {
            suffix = "est";
<<<<<<< HEAD
        } else if (word.endsWith("ing")) {
            suffix = "ing";
        } else if (word.endsWith("es")) {
            suffix = "es";
        } else if (word.endsWith("ic")) {
            suffix = "ic";
        } else if (word.endsWith("er")) {
            suffix = "er";
        } else if (word.endsWith("ness")) {
            suffix = "ness";
        } else if (word.endsWith("ity")) {
            suffix = "ity";
        } else {
            System.out.println("The word does not end with any of the following suffixes: ed, ly, ful, est, ing, es, ic, er, ness, or ity.");
=======
        } else if (word.endsWith("ity")){
            suffix  = "ity";
        }
        else if (word.endsWith("ant")){
            suffix  = "ant";
        }
        else if (word.endsWith("ness")){
            suffix  = "ness";
        }
        else if (word.endsWith("es")){
            suffix  = "es";
        }
        else if (word.endsWith("ic")){
            suffix  = "ic";
        }
        else if (word.endsWith("er")){
            suffix  = "er";
        }
        else if (word.endsWith("ing")){
            suffix  = "ing";
        }
        else if (word.endsWith("s")){
            suffix  = "s";
        }
        
        else {
            System.out.println("The word does not end with any of the following suffixes: ed, ly, ful, er, ic, ing, ity, ness, es, or est.");
>>>>>>> 5394e0b (Adding method)
            return;
        }
        // Declare a variable to store the stemmed word
        String stemmedWord = "";
        // Use a switch statement to choose the appropriate method to call based on the suffix
        switch (suffix) {
            case "ed":
                stemmedWord = stemmer.stemEd(word);
                break;
            case "ly":
                stemmedWord = stemmer.stemLy(word);
                break;
            case "ful":
                stemmedWord = stemmer.stemFul(word);
                break;
            case "est":
                stemmedWord = stemmer.stemEst(word);
                break;
<<<<<<< HEAD
            case "ing":
                stemmedWord = stemmer.stemIng(word);
                break;
            case "es":
                stemmedWord = stemmer.stemEs(word);
                break;
            case "ic":
                stemmedWord = stemmer.stemIc(word);
                break;
            case "er":
                stemmedWord = stemmer.stemEr(word);
=======

            case "ity":
                stemmedWord = stemmer.stemIty(word);
                break;

            case "ant":
                stemmedWord = stemmer.stemIty(word);
>>>>>>> 5394e0b (Adding method)
                break;
            case "ness":
                stemmedWord = stemmer.stemNess(word);
                break;
<<<<<<< HEAD
            case "ity":
                stemmedWord = stemmer.stemIty(word);
                break;
=======

            case "es":
                stemmedWord = stemmer.stemEs(word);
                break;

            case "ic":
                stemmedWord = stemmer.stemIc(word);
                break;

            case "er":
                stemmedWord = stemmer.stemEr(word);
                break;

            case "ing":
                stemmedWord = stemmer.stemIng(word);
                break;
            case "s":
                stemmedWord = stemmer.stemS(word);
                break;

>>>>>>> 5394e0b (Adding method)
            default:
                System.out.println(word);
                return;
        }
        // Print the original word and the stemmed word
        System.out.println("Original word: " + word);
        System.out.println("Stemmed word: " + stemmedWord);
    }
}


class Stemmer_word {
    public String stemEd(String word) {
        // If word length is greater than or equal to 6 and the word ends with eed, remove d from last
        if (word.length() >= 6 && word.endsWith("eed")) {
            return word.substring(0, word.length() - 1);
        }

        if (word.length() >= 6 && word.endsWith("ied")) {
            return word.substring(0, word.length() - 3) + "y";
        }

        if (word.length() >= 5 && word.endsWith("ered")) {
            return word.substring(0, word.length() - 2);
        }

        // If word length is greater than or equal to 5 and the word ends with vowel + red or ted, remove d from last
        if (word.length() >= 5 && word.matches(".*[aeiou]red$|.*[aeiou]ted$|.*[aeiou]zed")) {
            return word.substring(0, word.length() - 1);
        }

        // If word length is greater than or equal to 6 and the word ends with ed, remove ed from last
        if (word.length() >= 6 && word.endsWith("ed")) {
            return word.substring(0, word.length() - 2);
        }

        return word;
    }

    public String stemLy(String word) {
        // If the word length is greater than or equal to 5, apply the rules
        if (word.length() >= 5) {
            // If the word ends with aly, remove y from the end
            if (word.endsWith("aly")) {
                return word.substring(0, word.length() - 1);
            }

            // If the word ends with ily, remove ily from the end and add y
            if (word.endsWith("ily")) {
                return word.substring(0, word.length() - 3) + "y";
            }

            // If the word ends with ly, remove ly from the end
            if (word.endsWith("ly")) {
                return word.substring(0, word.length() - 2);
            }
        }

        return word;
    }

    public String stemFul(String word) {
        // If the word ends with iful, remove iful from the end and add y
        if (word.length() >= 6 && word.endsWith("iful")) {
            return word.substring(0, word.length() - 4) + "y";
        }

        // If the word ends with full, remove ful from the end
        if (word.length() >= 6 && word.endsWith("ful")) {
            return word.substring(0, word.length() - 3);
        }

        return word;
    }

        public String stemEst(String word) {
        // If the word length is greater than or equal to 6, apply the rules
        if (word.length() >= 6) {
            // If the word ends with iest, remove iest from the end and add y
            if (word.endsWith("iest")) {
                return word.substring(0, word.length() - 4) + "y";
            }

            // If the word ends with llest, remove lest from the end and add l
            if (word.endsWith("llest")) {
                return word.substring(0, word.length() - 4);
            }

            // If the word ends with est, remove est from the end
            if (word.endsWith("est")) {
                return word.substring(0, word.length() - 3);
            }
        }
        return word;

        
    }
<<<<<<< HEAD
}
=======

    public String stemIty(String word) {

        // Rule 1 : change "ality" to ""
        String result = word.replaceAll("ality", "");

        // Rule 2: Remove "ity"
        result = result.replaceAll("ity$", "e");

        // Rule 3: Change "ual" to "ue"
        result = result.replaceAll("ual$", "ue");

        // Rule 4: Change "al" to "e"
        result = result.replaceAll("al$", "e");

        // Rule 5: Change "ant" to "ance"
        result = result.replaceAll("ant$", "ance");

        // Rule 6: Change "icity" to "ic"
        result = result.replaceAll("icity$", "ic");

        // Rule 7: Change "ivity" to "ive"
        result = result.replaceAll("ivity$", "ive");

        // Rule 8: Change "osity" to "ose"
        result = result.replaceAll("osity$", "ose");

        // Rule 9: Change "ivity" to "ive"
        result = result.replaceAll("ivity$", "ive");

        // Rule 10: Change "ivity" to "ive"
        result = result.replaceAll("ivity$", "ive");
        // For removing ed from word

        // Rule 1 : if the word ends in "id" replace it with empty string
        result = result.replaceAll("ed$", "");

        // Rule 2: If the word ends in "ied," replace it with "y"
        result = result.replaceAll("ied$", "y");

        // Rule 3: If the word ends in "ed" and has a consonant before "ed," remove "e"
        result = result.replaceAll("([b-df-hj-np-tv-z])ed$", "$1");
        
        return result;
}

    public String stemNess(String word) {
    if (word.length() >= 5) {
        if (word.endsWith("iness")){
            word = word.substring(0, word.length() - 5) + "y";
        } else if (word.endsWith("ness")) {
            word = word.substring(0, word.length() - 4);
        }
    }
    return word;

    }

    public String stemEs(String word){
        if (word.length() >= 3){
            if (word.endsWith("es") && word.charAt(word.length()-3) == 'h'){
                word = word.substring(0, word.length()-2);
                
            }
            else if (word.endsWith("es") && word.charAt(word.length()-3) == 's'){
                word = word.substring(0, word.length()-2);
                

            }
            else if (word.endsWith("es") && word.charAt(word.length()-3) == 'x'){
                word = word.substring(0, word.length()-2);
                

            }
            else if (word.endsWith("es") && word.charAt(word.length()-3) == 'z'){
                word = word.substring(0, word.length()-2);
            }
            else if (word.endsWith("es") && word.charAt(word.length()-3) == 'o'){
                word = word.substring(0, word.length()-2);
            }
            else{
                word = word.substring(0, word.length()-1);    
            }
        }
        return word;
    }

    public String stemEr(String word) {
        // If the word length is greater than or equal to 4 and the word ends with "er", remove "er" from the end
        if (word.length() >= 4 && word.endsWith("er")) {
            return word.substring(0, word.length() - 2);
        }

        // If the word length is greater than or equal to 5 and the word ends with "ier", replace "ier" with "y"
        if (word.length() >= 5 && word.endsWith("ier")) {
            return word.substring(0, word.length() - 3) + "y";
        }

        // If the word length is greater than or equal to 7 and the word ends with "izer", remove "er" from the end
        if (word.length() >= 7 && word.endsWith("izer")) {
            return word.substring(0, word.length() - 2);
        }

        // Return the original word if it doesn't match any of the rules
        return word;
    }

    public String stemIc(String word) {
        // If the word length is greater than or equal to 4 and the word ends with "ic", remove "ic" from the end
        // {alchoholic, }
        if (word.length() >= 4 && word.endsWith("ic")) {
            return word.substring(0, word.length() - 2);
        }

        // If the word length is greater than or equal to 5 and the word ends with "atic", remove "ic" from the end
        if (word.length() >= 5 && word.endsWith("atic")) {
            return word.substring(0, word.length() - 2);
        }


        // Return the original word if it doesn't match any of the rules
        return word;
}
    public String stemIng(String word) {
        // If the word length is greater than or equal to 3 and the word ends with "ing", remove "ing" from the end
        if (word.length() >= 3 && word.endsWith("ing")) {
            return word.substring(0, word.length() - 3);
        }

        // If the word length is greater than or equal to 5 and the word ends with "ating", remove "ing" from the end
        if (word.length() >= 5 && word.endsWith("ating")) {
            return word.substring(0, word.length() - 3);
        }

        // If the word length is greater than or equal to 4 and the word ends with "ying", replace "ying" with "y"
        if (word.length() >= 4 && word.endsWith("ying")) {
            return word.substring(0, word.length() - 3) + "y";
        }

        // If the word length is greater than or equal to 6 and the word ends with "izing", remove "ing" from the end
        if (word.length() >= 6 && word.endsWith("izing")) {
            return word.substring(0, word.length() - 3);
        }
        return word;

        
    }

    public String stemS(String word){
        if (word.endsWith("s")){
            word = word.substring(0, word.length()-1);
        }
        
        return word;
    }

}

>>>>>>> 5394e0b (Adding method)
