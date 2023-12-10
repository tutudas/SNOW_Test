package com.test.swingTest;

import javax.swing.JFrame;
import javax.swing.JLabel;

//import statements
//Check if window closes automatically. Otherwise add suitable code
public class HelloWorldFrame extends JFrame {

 public static void main(String args[]) {
  new HelloWorldFrame();
 }
 
 HelloWorldFrame() {
	 super("Swing Test");
  JLabel jlbHelloWorld = new JLabel("Hello World");
  add(jlbHelloWorld);
  this.setSize(100, 100);
  // pack();
  setVisible(true);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 
}