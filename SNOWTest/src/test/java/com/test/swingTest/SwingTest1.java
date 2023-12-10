package com.test.swingTest;

import javax.swing.JFrame;
import javax.swing.JLabel;

//import statements
//Check if window closes automatically. Otherwise add suitable code
public class  SwingTest1 {

 public static void main(String args[]) {
  JFrame jf = new JFrame ("Hello Swing World");
 // add(jf);
  jf.setSize(100, 500);
  // pack();
  jf.setVisible(true);
  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

}
