package co.edu.cue.practica.application;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class Main {
        private static java.lang.IllegalArgumentException IllegalArgumentException;

        public static void main(String[] args){
                int menu=0;
                do {
                        menu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese lo que quiere hacer \n" +
                                "1. Sumar \n" +
                                "2. Restar \n" +
                                "3. Dividir "));
                        switch (menu) {
                                case 1:
                                        metodo1();
                                        break;
                                case 2:
                                        metodo2();
                                        break;
                                case 3:
                                        metodo3();
                                        break;

                        }
                }while (menu!=4);
        }




        static void metodo1() {

                try {
                        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        int num2 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                        int i = num1+num2;
                        JOptionPane.showMessageDialog(null,"La suma es: "+i);
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "ingrese numeros diferentes");
                }

        }

        static void metodo2(){
                try {
                        double num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                        double num2 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                        double i = num1-num2;
                        validarI(i,num2);
                        JOptionPane.showMessageDialog(null,"La resta es: "+i);
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "ingrese numeros diferentes");
                }catch (ArithmeticException e){
                        JOptionPane.showMessageDialog(null, "Operacion no valida");
                }catch (NullPointerException e){
                        JOptionPane.showMessageDialog(null, "Numero negativo no validos");
                }
        }
public static void validarI(double i, double num2) throws IllegalArgumentException{
                if (i<=0 || num2<=0){
                        throw IllegalArgumentException;
                }
}
public static void metodo3(){
        try {
                double num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
                double num2 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
                double i = num1/num2;
                validarI(i,num2);
                JOptionPane.showMessageDialog(null, "La division es: "+i);
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ingrese numeros diferentes");
        }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Division no valida");
        }catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "Division entre 0 no valida");
        }
}



}