package Codes;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TxtCombination {
    public static void main (String[] args){
        String Direction;
        Reader Text = new Reader();
        File file;
        FileWriter Write;
        PrintWriter Line;
        String NewText;
        Direction = JOptionPane.showInputDialog("Ingrese la dirección del archivo");
        String FileDirection = JOptionPane.showInputDialog("Ingrese la dirección del nuevo archivo, terminando con (Nombre de archivo).txt");
        try {
            NewText = Text.TxtReader(Direction);
            file = new File(FileDirection);
            if (file.createNewFile()){
                JOptionPane.showMessageDialog(null, "El archivo se ha creado con éxito");
            }
            Write = new FileWriter(file, true);
            Line = new PrintWriter(Write);
            Line.println(NewText);
            Line.close();
            Write.close();
        }
        catch (IOException e){
            System.err.println("No se ha podido crear el archivo");
        }
    }
}