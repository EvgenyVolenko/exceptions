package Seminar_3.controller;

import java.io.FileWriter;
import java.io.IOException;

import Seminar_3.model.HumanWithData;

public class WriteFile {

     public static void WrFile (HumanWithData humanWithData) {
        
        try(FileWriter writer = new FileWriter(humanWithData.getsurname(), true))
        {
            writer.write(humanWithData.toString());
            writer.append('\n');
            writer.flush();
            System.out.println("Запись в файл прошла успешно");
            writer.close();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }
}
