import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * InputOutput
 * 
 * One of the most basic in any programming language is to learn how to read input and output, so we will just start with it.
 * 
 * Resources : 
 * https://docs.oracle.com/javase/8/docs/api/java/io/package-summary.html
 *
 * the java.nio
 *  package is a valuable tool for Java developers when performance and efficiency are critical factors, particularly in network programming, handling large files, or implementing asynchronous operations. However, for simpler I/O tasks or when ease of use is a priority, the java.io package remains a solid choice.
 * 
 */
public class InputOutput {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        // The most common way of reading user input in java is by using Scanner class. 


        System.out.println("Enter your name :");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);

        // Buffered reader is proven to be the most efficient way to handle large text based input data.

        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Your favourite Quote:");
        try{
            String quote = bufferReader.readLine();
            System.err.println(quote);
        }catch(IOException exception){
            System.err.println(exception.getMessage());
        }

        // You can also read input data from other sources like network or files on your disk.

        // an example of reading input from file. You will first need to create a File object for this.
        
        File fileName = new File("ReadMe.md");      // I have used relative path here but you can also use absolute path. You should only use relative path if it is inside the working directory but Java supports both, so in the end the choice is up to you.

        readInputFromFile(fileName);

        // you can read from a file which is hosted somewhere as well. 

        String url = "https://raw.githubusercontent.com/ohmyzsh/ohmyzsh/master/tools/install.sh";

        readFileFromURL(url);

        // here just reverse the order of below method calls, and see the diff your self.
        saveOutPutToFileUsingPrintWriter();
        saveOutPutToFileUsingFileWriterAndBufferedWriter();

        scanner.close();

    }


    static void readInputFromFile(File fileName){
        try {
            Scanner scanner = new Scanner(fileName);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getLocalizedMessage());
        }

    } 
    
    static void readFileFromURL(String url){
        try{
            URL fileUrl = new URL(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileUrl.openStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }

    // there are few ways to save output in a file, below are two of them which are most commonly used.

    // using print writer which again internally uses bw + fw, also you can perform the same operation using outputstreamwriter and fileoutputstream.
    static  void saveOutPutToFileUsingPrintWriter(){
        try(PrintWriter pw = new PrintWriter("Java/Basics/output.txt")){
            System.out.println("Write name of your friends: ");
            pw.write("My friends list:");
            for (int i=0;i<=5;i++){
                String name = scanner.nextLine();
                pw.write(name);
                pw.write("\n"); // new line
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    // using bufferdWriter and fileWriter
    static void saveOutPutToFileUsingFileWriterAndBufferedWriter(){
        // here true will prevent file writer to overrite the existing data on file.
        try (FileWriter fw = new FileWriter("Java/Basics/output.txt", true); BufferedWriter bw = new BufferedWriter(fw);){
            for(int i=1;i<=5;i++){
                bw.write("Gear "+i);
                bw.write("\n"); // new line
                System.out.println("Hi there !!!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}