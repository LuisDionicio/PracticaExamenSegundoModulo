
package pregunta3;

import javax.swing.JOptionPane;
import java.util.Stack;

public class metodo_de_llaves {
    
public void verificar(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

           
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } 
           
            else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "La expresión NO está balanceada.");
                    return;
                }
                char ultimo = pila.pop();
                if ((c == ')' && ultimo != '(') ||
                    (c == '}' && ultimo != '{') ||
                    (c == ']' && ultimo != '[')) {
                    JOptionPane.showMessageDialog(null, "a expresión NO está balanceada.");
                    return;
                }
            }
        }

        if (pila.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La expresión está balanceada.");
        } else {
            JOptionPane.showMessageDialog(null, "La expresión NO está balanceada.");
        }
    }
   }
