// Class -> needs to be the same name as the file name
// Class names go by the Pascal Case convention -> each new word must be capitalized -> BankAccount
// Each code needs a launch point/Main to start the program file. 
// To compile code -> all syntax must be correct or code will not compile -> Java will point out the errors before you can proceed
// Compile the file via terminal using javac followed by the name of the file dot java 
// etc javac Test.java or in the bank account example -> javac BankAccount.java
// Once compiled -> a new file will be created called filename.java i.e. Test.class
// Printing to console/printing in Java is established via System.out.println(x: "what you want printed");
// the Test.class file is the bytecode and isn't human readable so we need to run in through an interpreter 
// to run the code, we simply type into the terminal java followed by the name of the class, we do not need to follow this name with the extension of class to translate/interpret the code
// i.e. java Test or in the BankAccount example -> java BankAccount -> code gets run.
// each time a change is made in the code, you need to recompile and run the data over again.

public class Test { 
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
