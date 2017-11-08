/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_2;

import javax.swing.JOptionPane;

/**
 *
 * @author RRH
 */
public class BMI_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String name, age, height, weight;
      int A;
      double H, W;
      double BMI;
    name = JOptionPane.showInputDialog("Body Mass Index Calculator", "Enter your name");
    height = JOptionPane.showInputDialog("Body Mass Index Calculator", "Enter your height (in cm)");
    weight = JOptionPane.showInputDialog(null, "Body Mass Index Calculator", "Enter your weight (in Kg)");

    H = Double.parseDouble(height);
    W = Double.parseDouble(weight);
    
    BMI = (W/(H*H/10000));
    String multiLineMsg[] = {"Dear "+name+ ",", "Your Body Mass Index is", " "+BMI} ;
    JOptionPane.showMessageDialog(null, multiLineMsg, "Body Mass Index Calculator", JOptionPane.PLAIN_MESSAGE);
    if(BMI < 18.5) {JOptionPane.showMessageDialog(null, "You are UNDERWEIGHT", "Body Mass Index Calculator", JOptionPane.PLAIN_MESSAGE);
    }
    else if(BMI >= 18.5 && BMI < 25) {JOptionPane.showMessageDialog(null, "Your weight is normal", "Body Mass Index Calculator", JOptionPane.PLAIN_MESSAGE);
    }
    else if(BMI >= 25 && BMI <30) {JOptionPane.showMessageDialog(null,"You are OVERWEIGHT", "Body Mass Index Calculator", JOptionPane.PLAIN_MESSAGE);
    }
    else if (BMI > 30){JOptionPane.showMessageDialog(null, "You are OBESE", "Body Mass Index Calculator", JOptionPane.PLAIN_MESSAGE);
    }
    }
    
}
