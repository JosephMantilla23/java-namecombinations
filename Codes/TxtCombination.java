package Codes;

import javax.swing.*;

public class TxtCombination {
    public static void main (String[] args){
        String Direction;
        Reader Text = new Reader();
        Direction = JOptionPane.showInputDialog("Ingrese la dirección del archivo");
        System.out.println(Text.TxtReader(Direction));
    }
}