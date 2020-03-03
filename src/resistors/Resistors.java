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
        int Black = 0, Brown = 1, red = 2, Orange = 3, Yellow = 4, Green = 5, Blue = 6, Violet = 7, Grey = 8, White = 9;
        
        int []colours = {Black, red, Orange, Yellow, Green, Blue, Violet, Grey, White};
        
        Scanner Input = new Scanner(System.in);
        System.out.println("Please Enter Your Resistor Colors, with a - between all of them");
        
        int sub1 = 3;
        String ColorInput = Input.next();
        String ColorDetection1 = ColorInput.substring(0,sub1);;
        
    
        if(ColorDetection1.contains("-")){
            
        }
        //System.out.println("The Value of your Resistor is " + totalOhms + " Ohms");
    }
    
}
