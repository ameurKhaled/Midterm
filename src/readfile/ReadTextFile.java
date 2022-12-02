package readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    /*
     *
     * read the below textFile and print to console:
     * file-dat.txt
     *
     * use FileReader/BufferedReader classes
     * use try..catch block to handle exceptions
     *
     * After reading from file using BufferedReader API, store each word into LinkedList. So each word
     * should construct a node in LinkedList. Then iterate/traverse through the list to retrieve as FIFO (first in first out)
     * order from LinkedList
     *
     * find and print out the number of the words in th text
     *
     */


    public static void main(String[] args) {

        //write your code here

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("/home/ameur/workspace_qaway/Midterm/src/readfile/file-data");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }

        br = new BufferedReader(fr);

        String line = "";



        do {
            System.out.println(line);
            try {
                line = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } while (line != null);

        try {
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
