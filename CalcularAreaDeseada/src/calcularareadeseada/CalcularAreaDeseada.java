/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularareadeseada;
import javax.swing.JOptionPane;
/**
 *
 * @author amado
 */
public class CalcularAreaDeseada {

    
    public static void main(String[] args) {
       String Fig,Area ;
        Fig = JOptionPane.showInputDialog(null,"         CALCULO DE AREAS\n            Elige una opcion:\n              [1] CIRCULO \n              [2] TRIANGULO\n              [3] TRAPECIO");
         if(Fig.equals("1"))
         {      
            float radio, area;
            radio = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce el radio del circulo: "));
            area = (radio*radio)*3.1416f;
            JOptionPane.showMessageDialog(null,"El area del circulo es: "+area);
         }
               else
                   if(Fig.equals("2"))
                   {
                    float base, altura, area;
                    base = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce la medida de la altura: "));
                    altura = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce la medida de la altura: "));
                    area = base*altura/2;
                    JOptionPane.showMessageDialog(null,"El area del triangulo es: "+area);
                    }
         else
             if(Fig.equals("3"))
             {
             float ac, ag, al, area;
             ac = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa la medida de la base chica: "));
             ag = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa la medida de la base mayor: "));
             al = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la medida de la altura: "));
             area = ac+ag*al/2;
             JOptionPane.showMessageDialog(null,"El area del trapecio es: "+area);
             }
             else
                 JOptionPane.showMessageDialog(null,"OPCION INCORRECTA :-/");
                 
    
}
}
