import java.io.File;
import java.util.Scanner;

public class Files() throws Exception{
public static void main(String [] args){

File file = new File("expenses.txt");
Scanner fileScanner = new Scanner(file);
int words=0;
while(input.hasNextLine()){
String line = input.nextLine();
  words+=line.split(" ").length;

}
  System.out.println(words)
}
}

