package Fundamentals.Variables;

// Naming variables should use the camal case convention - aka lowercase followed by Uppercase as the next word. thisIsAnExampleOfCamalCase
// Double with a capital D is not a valid java variable and would produce a compile time error
// Wrapper classes are an object type or class that has greater functionality than its associated primitive types
// Once you declare a variable's type, it can never be assigned to a value of a different type
// In order to change your code and run it again, you must follow the following: Save code, Compile it with command javac FileName.java, then run it with Java FileName

public class Variables {
    public static void main(String[] args){
        int ourInt; // we can declare a variable without setting its value
        ourInt = 400; // we can assign a value to the variable later in our code
        double pi = 3.14159265; // we can also declare and assign on the same line
        boolean bool = true;
        char singleCharacter = 'A';
        
        String multipleCharacters = "ABC";
    }
}

