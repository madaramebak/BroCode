package filehandling;
import java.io.*;
import java.nio.*;

public class FileStuff {

    public void lineByLine (File file){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = " ";
            while( (line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("No file found");
        } catch (IOException e){
            System.out.println("Can't read file");
        }
    }

    public void readAll (Path filePath){
        List<String> lines = Files.readAllLines(filePath);
    }

    public void searchFile (File file, String keyword){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            int counter = 1;
            System.out.println("Results: ");
            while( (line = reader.readLine()) != null){
                if(line.contains(keyword)){
                    System.out.println("line " + counter + ": " + line);
                }
                counter++;
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("No file found");
        } catch (IOException e){
            System.out.println("Can't read file");
        }
    }
}

