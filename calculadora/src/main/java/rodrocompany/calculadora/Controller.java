/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrocompany.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 *
 * @author win
 */
public class Controller {
    private View view;
    private Model model;
    
    public Controller (View view , Model model){
        this.view = view;
        this.model = model;
        AgregarBotton();
    }
    
    private void AgregarBotton(){
        JButton suma = view.getSuma();
        JButton resta = view.getResta();
        JButton multiplicaion = view.getMultiplicacion();
        JButton division = view.getDivision();
        JButton delete = view.getDelete();
        JButton clear = view.getClear();
        JTextArea Pantalla = view.getPantalla();
        JButton total = view.getTotal();
        
        clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                model.clear(Pantalla);
            }
            
        });
        
        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                model.delete(Pantalla);
            }
            
        });
        
        
        suma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                model.suma(Pantalla);
            }
            
        });
        
        resta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                model.restar(Pantalla);
            }
            
        });
        
        multiplicaion.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                model.multiplica(Pantalla);
            }
            
        });
        
        division.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                model.dividir(Pantalla);
            }
            
        });
        
        total.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                model.total(Pantalla);
            }
            
        });
    }
    
    
    
}
