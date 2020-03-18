/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resistors;
import java.util.Scanner;
/**
 *
 * @author Jorda
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalOhms = 0;
        int Black = 0, Brown = 1, Red = 2, Orange = 3, Yellow = 4, Green = 5, Blue = 6, Violet = 7, Grey = 8, White = 9;
        int values[] = {Black, Brown, Red, Orange, Yellow, Green, Blue, Violet, Grey, White};
        
        String []colours = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"};
        
        Scanner Input = new Scanner(System.in);
        System.out.println("Please Enter Your Resistor Colors, with a - between all of them and All Start with Caps");
        

        String ColorInput = Input.next();
        String ColorDetection1 = ColorInput.substring(0,ColorInput.indexOf("-"));
        String ColorDetection2 = ColorInput.substring(ColorInput.indexOf("-") + 1, ColorInput.lastIndexOf("-"));
        String ColorDetection3 = ColorInput.substring(ColorInput.lastIndexOf("-") + 1, ColorInput.length());

        
        for (int i = 0; i < 1; i++){
            
            String values2 = String.valueOf(values[i]);
            String a, b, c;
            
            if (colours[i].equals(ColorDetection1)){
                 a = ColorDetection1;
            }
            if (colours[i].equals(ColorDetection2)){
                 b = ColorDetection2;
            }
            if(colours[i].equals(ColorDetection3)){
                 c = ColorDetection3;
            }

        }
    
        
        //System.out.println("The Value of your Resistor is " + totalOhms + " Ohms");
    }
    
}
