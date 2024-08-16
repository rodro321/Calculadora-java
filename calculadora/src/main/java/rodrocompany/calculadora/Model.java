/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rodrocompany.calculadora;

import javax.swing.JTextArea;

/**
 *
 * @author win
 */
public class Model {

    int aux;
    String operacion;

    public Model() {
        aux = 0;
        operacion = "";
    }

    public void clear(JTextArea Pantalla) {
        Pantalla.setText("");
        aux = 0;
        operacion = "";
    }

    public void delete(JTextArea Pantalla) {
        String cad = Pantalla.getText();
        int n = Integer.valueOf(cad);
        if ((n % 10) == 0) {
            Pantalla.setText("");
        } else {
            n = n / 10;
            cad = "" + n;
            Pantalla.setText(cad);
        }
    }

    public void suma(JTextArea Pantalla) {
        String dato = Pantalla.getText();
        if (!operacion.equals("+")) {
            if (!operacion.equals("-")) {
                if (!operacion.equals("*")) {
                    if (!operacion.equals("/")) {
                        aux = Integer.valueOf(dato);
                        operacion = "+";
                        Pantalla.setText("");
                    } else {
                        aux = aux / Integer.valueOf(dato);
                        operacion = "+";
                        Pantalla.setText("");
                    }
                } else {
                    aux = aux * Integer.valueOf(dato);
                    operacion = "+";
                    Pantalla.setText("");
                }
            } else {
                aux = aux - Integer.valueOf(dato);
                operacion = "+";
                Pantalla.setText("");
            }
        } else {
            aux = aux + Integer.valueOf(dato);
            operacion = "+";
            Pantalla.setText("");
        }
    }

    void multiplica(JTextArea Pantalla) {
        String dato = Pantalla.getText();
        if (!operacion.equals("+")) {
            if (!operacion.equals("-")) {
                if (!operacion.equals("*")) {
                    if (!operacion.equals("/")) {
                        aux = Integer.valueOf(dato);
                        operacion = "*";
                        Pantalla.setText("");
                    } else {
                        aux = aux / Integer.valueOf(dato);
                        operacion = "*";
                        Pantalla.setText("");
                    }
                } else {
                    aux = aux * Integer.valueOf(dato);
                    operacion = "*";
                    Pantalla.setText("");
                }
            } else {
                aux = aux - Integer.valueOf(dato);
                operacion = "*";
                Pantalla.setText("");
            }
        } else {
            aux = aux + Integer.valueOf(dato);
            operacion = "*";
            Pantalla.setText("");
        }
    }

    void restar(JTextArea Pantalla) {
        String dato = Pantalla.getText();
        if (!operacion.equals("+")) {
            if (!operacion.equals("-")) {
                if (!operacion.equals("*")) {
                    if (!operacion.equals("/")) {
                        aux = Integer.valueOf(dato);
                        operacion = "-";
                        Pantalla.setText("");
                    } else {
                        aux = aux / Integer.valueOf(dato);
                        operacion = "-";
                        Pantalla.setText("");
                    }
                } else {
                    aux = aux * Integer.valueOf(dato);
                    operacion = "-";
                    Pantalla.setText("");
                }
            } else {
                aux = aux - Integer.valueOf(dato);
                operacion = "-";
                Pantalla.setText("");
            }
        } else {
            aux = aux + Integer.valueOf(dato);
            operacion = "-";
            Pantalla.setText("");
        }
    }

    void dividir(JTextArea Pantalla) {
        String dato = Pantalla.getText();
        if (!operacion.equals("+")) {
            if (!operacion.equals("-")) {
                if (!operacion.equals("*")) {
                    if (!operacion.equals("/")) {
                        aux = Integer.valueOf(dato);
                        operacion = "/";
                        Pantalla.setText("");
                    } else {
                        aux = aux / Integer.valueOf(dato);
                        operacion = "/";
                        Pantalla.setText("");
                    }
                } else {
                    aux = aux * Integer.valueOf(dato);
                    operacion = "/";
                    Pantalla.setText("");
                }
            } else {
                aux = aux - Integer.valueOf(dato);
                operacion = "/";
                Pantalla.setText("");
            }
        } else {
            aux = aux + Integer.valueOf(dato);
            operacion = "/";
            Pantalla.setText("");
        }
    }

    public void total(JTextArea Pantalla) {
        String dato = Pantalla.getText();
        if (!operacion.equals("+")) {
            if (!operacion.equals("-")) {
                if (!operacion.equals("*")) {
                    if (!operacion.equals("/")) {

                    } else {
                        aux = aux / Integer.valueOf(dato);
                        Pantalla.setText("" + aux);
                        operacion = "";
                    }
                } else {
                    aux = aux * Integer.valueOf(dato);
                    Pantalla.setText("" + aux);
                    operacion = "";
                }
            } else {
                aux = aux - Integer.valueOf(dato);
                Pantalla.setText("" + aux);
                operacion = "";
            }
        } else {
            aux = aux + Integer.valueOf(dato);
            Pantalla.setText("" + aux);
            operacion = "";
        }
    }

}
