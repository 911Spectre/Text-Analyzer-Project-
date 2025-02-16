# Text File Analyzer

This Java program analyzes a text file and provides various statistics and information about its content. It allows the user to perform different operations like counting words, calculating average word length, finding the longest/shortest word, checking for palindromes, and more.

## Features

- **See Content**: View the entire content of the text file.
- **Count Words**: Count the total number of words in the text file.
- **Count Average Word Length**: Calculate the average length of words in the file.
- **See Longest Word**: Find the longest word in the text file.
- **See Shortest Word**: Find the shortest word in the text file.
- **See Unique Words**: Count the number of unique words in the text file.
- **See Frequent Words**: Find the most frequently occurring words in the text file.
- **See Palindrome Words**: Find all palindrome words in the text file.
- **Choose Another File**: Allows the user to input a new file and repeat the analysis.
- **Exit**: Exit the program.

## Requirements

- Java 8 or higher.

## How to Run the Program

1. **Clone the Repository** (if you have it hosted in a repository):
    ```bash
    git clone <repository-url>
    ```

2. **Navigate to the Project Folder**:
    ```bash
    cd <project-folder>
    ```

3. **Compile and Run the Program**:
    - Open a terminal or command prompt.
    - Navigate to the folder where the `Javabek.java` file is located.
    - Run the following command:
      ```bash
      javac Javabek.java
      java Javabek
      ```

4. **Follow the Prompts**: 
    - Upon running the program, it will ask you to input the name of a text file (for example, `yourfile.txt`). 
    - After that, you can choose the operation you want to perform from the main menu.

## Example Usage

### Menu Options:
Once the program is running, you will be presented with the following main menu:

```
Lets analyze your file 

    MAIN MENU

    1 => SEE CONTENT 
    2 => COUNT WORDS 
    3 => COUNT AVERAGE WORD LENGTH 
    4 => SEE LONGEST WORD 
    5 => SEE SHORTEST WORD 
    6 => SEE UNIQUE WORD 
    7 => SEE FREQUENT WORDS 
    8 => SEE PALINDROME WORDS 
    9 => CHOOSE OTHER FILE
    10 => EXIT
```

You can enter a number to select an option:

1. **See Content**: This will display the entire content of the file.
2. **Count Words**: This will count and display the total number of words in the file.
3. **Count Average Word Length**: This will calculate and display the average word length in the file.
4. **See Longest Word**: This will display the longest word in the file.
5. **See Shortest Word**: This will display the shortest word in the file.
6. **See Unique Words**: This will count and display the number of unique words in the file.
7. **See Frequent Words**: This will display the most frequent words in the file.
8. **See Palindrome Words**: This will display any words that are palindromes.
9. **Choose Other File**: This allows you to select a new file to analyze.
10. **Exit**: Exit the program.

### Example Output:

```bash
Hello ! Welcome to the program which will analyze your txt

Enter name of your txt file
Example <<yourfile.txt>>

Enter : yourfile.txt

Lets analyze your file 

    MAIN MENU

    1 => SEE CONTENT 
    2 => COUNT WORDS 
    3 => COUNT AVERAGE WORD LENGTH 
    4 => SEE LONGEST WORD 
    5 => SEE SHORTEST WORD 
    6 => SEE UNIQUE WORD 
    7 => SEE FREQUENT WORDS 
    8 => SEE PALINDROME WORDS 
    9 => CHOOSE OTHER FILE
    10 => EXIT

ENTER : 2

Total words: 150
```

### Example for Palindrome Words:
If the text contains words like "madam" or "level", the program will list them under option 8 as palindromes.

### Handling Errors:
- If the file is not found, the program will ask you to try again.
- If you choose an invalid option, the program will notify you and ask you to choose again.

## File Structure

- **Javabek.java**: Contains the main program and all the functions for analyzing the text file.
- **Your Text Files**: Place your `.txt` files in the same directory or specify their path when prompted.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or suggestions, feel free to open an issue in the repository or contact the project owner.

