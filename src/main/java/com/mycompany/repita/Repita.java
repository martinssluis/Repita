/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repita;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Repita {

    public static void main(String[] args) {
        int n, s =0;
        int tv=-1;
        int tp=-1;
        int ti=0;
        int maior=0;
        int media=0;
       do{
         n = Integer.parseInt(JOptionPane.showInputDialog(null,
                 "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>")); // não declarar variavel dentro de repetição
         s +=n;
       tv+=1;
            if (n%2==0) {
                tp+=1;
                
            }else{
                ti+=1;
                
            }
            if(n>100){
                maior+=1;
            }
            

           
        } while (n != 0);
        
        media = (int) (float) (s / tv); 
        
         JOptionPane.showMessageDialog(null, "<html>Resultado final<br><hr>" 
                + "Somatório vale: &nbsp;<strong>" + s
                + ".</strong><br>Valores inseridos: &nbsp;<strong>" + tv
                + ".</strong><br>Valores pares: &nbsp;&nbsp;<strong>" + tp
                + ".</strong><br>Valores ímpares: &nbsp;<strong>" + ti
                + ".</strong><br>Valores acima de 100: &nbsp;<strong>" + maior
                 + ".</strong><br>Média dos valores: &nbsp;<strong>" + media + "</strong></html>"); 
    }
}
