package Codes;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader {
    public String TxtReader (String Directory){
        StringBuilder Combinations = new StringBuilder();
        try{
            BufferedReader Txt = new BufferedReader(new FileReader(Directory));
            String TxtRead;
            String Combination;
            while((TxtRead = Txt.readLine()) != null){
                String[] Split = TxtRead.split(" ");
                char[] Initial = new char[Split.length];
                for (int i=0; i<Split.length; i++){
                    Initial[i] = Split[i].charAt(0);
                    for (int j=0; j<Split.length; j++){
                        if (j != i){
                            Combination = Initial[i]+Split[j];
                            Combination = Combination.toLowerCase();
                            Combinations.append("\n").append(Combination);
                        }
                    }
                }
            }
        }
        catch (Exception e){
            System.err.println("No se ha encontrado el archivo");
        }
        return Combinations.toString();
    }
}