/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstracion;
import javax.swing.JOptionPane;


/**
 *
 * @author Leonardo Urbina
 */
public class Principal {
    
    public static void main(String[] args) {
    
    int op;
 do
 {
 
 op = Integer.parseInt(JOptionPane.showInputDialog(null,"CALCULAR EL AREA DE LAS FIGURAS GEOMETRICAS\n"
 + "Seleccione una opcion: \n"
 + " 1. Triangulo\n"
 + " 2. Cuadrado\n"
 + " 3. Circulo\n"
 + " 4. Rectangulo\n"
 + " 5. Salir"));
 
 
 switch(op)
 {
 case 1: 
 Triangulo Nia = new Triangulo();
 Nia.AreaF();
 System.out.println("");
 
 break;
 
 case 2:
 Cuadrado Nia1 = new Cuadrado();
 Nia1.AreaF();
 System.out.println("");
 
 break;
 
 case 3:
 Circulo Nia2 = new Circulo();
 Nia2.AreaF();
 System.out.println("");
 
 break;
 
 case 4:
 Rectangulo Nia3 = new Rectangulo();
 Nia3.AreaF();
 System.out.println("");
 
 break;
 
 
 case 5:
 JOptionPane.showMessageDialog(null,"QUE TENGA BUEN DIA");System.exit(0);
 
 break;
 
 default: JOptionPane.showMessageDialog(null,"Eliga una opcion Valida");
 System.out.println("");
 
 }
 
 
 }while(op!=5);
 
 }
 
}
    
