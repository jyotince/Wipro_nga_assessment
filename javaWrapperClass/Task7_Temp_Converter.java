package classPractice.javaWrapperClass;

import java.util.*; 

public class Task7_Temp_Converter 
{ 
    public static void main(String[] args) { 
        String[] temps = {"36", "38", "40"}; 
        ArrayList<Double> fahrenheitTemps = new ArrayList<>(); 
 
        for (String t : temps) { 
            int celsius = Integer.parseInt(t); 
            double f = (celsius * 9.0 / 5) + 32; 
            fahrenheitTemps.add(f); 
        } 
        System.out.println("Fahrenheit Temps: " + fahrenheitTemps); 
    }
}