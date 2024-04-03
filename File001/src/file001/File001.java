
package file001;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * @Rinzler
 */
public class File001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //Write in File : 
        try {
            FileWriter myWriter = new FileWriter("file0123.txt");
            for (int i = 0; i < N; i++) {
                myWriter.write(i);
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred1.");
        }
        //READ From File : 
        try {
            File myObj = new File("file0123.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextInt()) {
                System.out.println(myReader.nextInt());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred2.");
        }
    }

}
