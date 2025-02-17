import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Javabek {
//_____________________________________________________________________________________________________
    public static String readFileToString(String filename) {    // Function to read file as string
        StringBuilder filecontent = new StringBuilder(); 

        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                filecontent.append(data).append("\n");
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + filename);
            return null;
        }
        
        return filecontent.toString();
    }



//_____________________________________________________________________________________________________    
    public static int TotalWordCount(String text){     // Function to count total words
        int words = 1;
        for(int i = 1; i < text.length() - 1; i++){
            if (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ') {
                words++; 
            }
        }
        return words;
    }



//_____________________________________________________________________________________________________
    public static int AverageWordLength(String text) {   // Function to count Average Word Length
        int letters = 0;
        int words = TotalWordCount(text);
        String symbols = ".?!@#$%^&*()_+-><:; ";  
        for (int i = 0; i < text.length(); i++) {
            if (symbols.indexOf(text.charAt(i)) == -1 && Character.isLetter(text.charAt(i))) {
                letters++;
            }
        }
        int average = letters / words;
        return average;
    }



//_____________________________________________________________________________________________________
    public static int SentenceCount(String text){    // Function to count sentences
        int sentences = 0;
        text = text.trim();
        String symbols = ".!?";
        boolean end = false;
        for (int i = 0; i < text.length(); i++) {
            if (symbols.indexOf(text.charAt(i)) != -1) {
                if (!end) {
                    sentences++;
                    end = true;
                }
            } else {
                end = false;
            }
        }
        return sentences;
    }



//_____________________________________________________________________________________________________
    public static String LongestWord(String text) {     // Function to find longest word
        String symbols = ".?!@#$%^&*()_+-><:;"; 
        ArrayList<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (symbols.indexOf(c) == -1 && Character.isLetter(c)) {
                currentWord.append(c);
            } else if (c == ' ' || symbols.indexOf(c) != -1) {
                if (currentWord.length() > 0) {
                    words.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
        }

        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

//_____________________________________________________________________________________________________
    public static String ShortestWord(String text) {    // Function to read shortest word
        String symbols = ".?!@#$%^&*()_+-><:;"; 
        ArrayList<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();
    
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (symbols.indexOf(c) == -1 && Character.isLetter(c)) {
                currentWord.append(c);
            } else if (c == ' ' || symbols.indexOf(c) != -1) {
                if (currentWord.length() > 0) {
                    words.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
        }

        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        String shortestWord = "";
        for (String word : words) {
            if (word.length() > shortestWord.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }

//_____________________________________________________________________________________________________________
    public static boolean isUnique(String word, ArrayList<String> words) {      // Function to check uniqueness
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count == 1;
    }
    public static int UniqueWordCount(String text){    // Function to check unique word
        String symbols = ".?!@#$%^&*()_+-><:;"; 
        ArrayList<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (symbols.indexOf(c) == -1 && Character.isLetter(c)) {
                currentWord.append(c);
            } else if (c == ' ' || symbols.indexOf(c) != -1) {
                if (currentWord.length() > 0) {
                    words.add(currentWord.toString());
                    currentWord.setLength(0);  
                }
            }
        }

        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }
        int uniques = 0;
        for (String word : words) {
            if (isUnique(word, words)) {
                uniques++;
            }
        }

        return uniques;
    }
    
//________________________________________________________________________________________________
    public static String MostFrequentWords(String text){  // Function to check Frequent word
        String symbols = ".?!@#$%^&*()_+-><:;"; 
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> mostFrequentWords = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (symbols.indexOf(c) == -1 && Character.isLetter(c)) {
                currentWord.append(c);
            } else if (c == ' ' || symbols.indexOf(c) != -1) {
                if (currentWord.length() > 0) {
                    words.add(currentWord.toString());
                    currentWord.setLength(0);  
                }
            }
        }

        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        int highestCount = 0;
        
        for (String word : words) {
            int count = 0;
            for (String w : words) {
                if (w.equals(word)) {
                    count++;
                }
            }
            
            if (count > highestCount) {
                highestCount = count;
                mostFrequentWords.clear();  
                mostFrequentWords.add(word);
            }

            else if (count == highestCount && !mostFrequentWords.contains(word)) {
                mostFrequentWords.add(word);
            }
        }

        return mostFrequentWords.toString();
    }



//________________________________________________________________________________________________
    public static boolean isPalindrome(String word) {
        String lowerWord = word.toLowerCase();
        int length = lowerWord.length();
        for (int i = 0; i < length / 2; i++) {
            if (lowerWord.charAt(i) != lowerWord.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static String PalindromeWords(String text) {
        String symbols = ".?!@#$%^&*()_+-><:;"; 
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> palindromes = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (symbols.indexOf(c) == -1 && Character.isLetter(c)) {
                currentWord.append(c);
            } else if (c == ' ' || symbols.indexOf(c) != -1) {
                if (currentWord.length() > 0) {
                    words.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
        }

        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        for (String word : words) {
            if (isPalindrome(word) && word.length() > 0) {
                palindromes.add(word);
            }
        }

        return String.join(", ", palindromes);
    }



    public static void main(String[] args) throws Exception {   // Main function

        Scanner scanner = new Scanner(System.in);
        String filename = "";
        String content = "";
        // Greetings 
        System.out.println("Hello ! Welcome to the program which will analyze your txt ");
        System.out.println("");
        // Getting data 
        while (true) {
            System.out.println("Enter name of your txt file");
            System.out.println("Example <<yourfile.txt>>");
            System.out.println(" ");
            System.out.print("Enter : ");
            filename = scanner.nextLine();
            System.out.println(" ");

            content = readFileToString(filename);

            if (content != null) {
                break;
            } else {
                System.out.println("File not found. Please try again.");
            }
        }
        if (content == null || content.trim().isEmpty()) {
            System.out.println(" ");
            System.out.println("File is empty");
        }
        // Main Menu
        while (true) {
            System.out.println("Lets analyze your file ");
            System.out.println(" ");
            System.out.println("    MAIN MENU");
            System.out.println(" ");
            System.out.println("    1 => SEE CONTENT ");
            System.out.println("    2 => COUNT WORDS ");
            System.out.println("    3 => COUNT AVERAGE WORD LENGTH ");
            System.out.println("    4 => SEE LONGEST WORD ");
            System.out.println("    5 => SEE SHORTEST WORD ");
            System.out.println("    6 => SEE UNIQUE WORD ");
            System.out.println("    7 => SEE FREQUENT WORDS "); 
            System.out.println("    8 => SEE PALINDROME WORDS "); 
            System.out.println("    9 => CHOOSE OTHER FILE");
            System.out.println("    10 => EXIT");
            System.out.println(" ");    
            System.out.print("ENTER : ");
            int o = scanner.nextInt();
            scanner.nextLine();  
            System.out.println(" ");
            
            if(o == 1){
                String text = readFileToString(content);
                System.out.println(text);
            }else if(o == 2){
                int words = TotalWordCount(content);
                System.out.println("Total words : " + words);
            }else if(o == 3){
                int averagewordlength = AverageWordLength(content);
                System.out.println("Average word length : " + averagewordlength);
            }else if(o == 4){
                String text = LongestWord(content);
                System.out.println("Longest word : " + text);
            }else if(o == 5){
                String text = ShortestWord(content);
                System.out.println("Shortest word : " + text);
            }else if(o == 6){
                int uniques = UniqueWordCount(content);
                System.out.println("Unique words : " + uniques);
            }else if(o == 7){
                String text = MostFrequentWords(content);
                System.out.println("Frequent words : " + text);
            }else if(o == 8){
                String text = PalindromeWords(content);
                System.out.println("Palindrome words : " + text);
            }else if(o == 9){

                System.out.println("You can choose a new file.");
                while (true) {
                    System.out.println("Enter name of your new txt file");
                    System.out.println("Example <<yourfile.txt>>");
                    System.out.print("Enter : ");
                    filename = scanner.nextLine();
                    System.out.println(" ");

                    content = readFileToString(filename);

                    if (content != null) {
                        break;
                    } else {
                        System.out.println("File not found. Please try again.");
                    }
                }
                if (content == null || content.trim().isEmpty()) {
                    System.out.println(" ");
                    System.out.println("File is empty");
                }
            }else if(o == 10){
                return;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
