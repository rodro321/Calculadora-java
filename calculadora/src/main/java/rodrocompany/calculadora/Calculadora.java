/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rodrocompany.calculadora;

/**
 *
 * @author win
 */
public class Calculadora {

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller control = new Controller(view , model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
}
