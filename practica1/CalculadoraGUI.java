package practica1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraGUI extends JFrame implements ActionListener {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    JButton op,btn_mas,btn_menos,btn_div,btn_ig,btn_mul,btn_exp;
    JButton[] arr_btn = new JButton[10];
    JButton[] arr_col = new JButton[3];
    JPanel panel_superior,panel_inferior;
    JTextField campo_texto;

    public CalculadoraGUI(String nombre){

        super(nombre);
        setSize(500,400);
        panelSuperior();
        panelInferior();
        this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        this.setVisible(true);
        this.add(panel_superior);
        this.add(panel_inferior);
        this.pack();
    }

    public void panelSuperior(){
        campo_texto = new JTextField(40);
        panel_superior = new JPanel();
        panel_superior.setLayout(new FlowLayout());
        panel_superior.add(campo_texto);
       
    }
    public void panelInferior(){

        panel_inferior = new JPanel();

        for(int i = 0; i < arr_btn.length; i++){
            arr_btn[i] = new JButton("" + i);
            arr_btn[i].addActionListener(this);
        }
        for(int i = 0; i < arr_col.length; i++){
            arr_col[i] = new JButton("C"+ (i + 1 ));
        }
        op = new JButton("Op");
        btn_mas = new JButton("+");
        btn_menos = new JButton("-");
        btn_div = new JButton("/");
        btn_mul = new JButton("*");
        btn_ig = new JButton("=");
        btn_exp = new JButton("^");

        panel_inferior.setLayout(new GridLayout(5,4,8,8));

        panel_inferior.add(arr_col[0]);
        panel_inferior.add(arr_col[1]);
        panel_inferior.add(arr_col[2]);
        panel_inferior.add(op);
        panel_inferior.add(arr_btn[1]);
        panel_inferior.add(arr_btn[2]);
        panel_inferior.add(arr_btn[3]);
        panel_inferior.add(btn_mas);
        panel_inferior.add(arr_btn[4]);
        panel_inferior.add(arr_btn[5]);
        panel_inferior.add(arr_btn[6]);
        panel_inferior.add(btn_menos);
        panel_inferior.add(arr_btn[7]);
        panel_inferior.add(arr_btn[8]);
        panel_inferior.add(arr_btn[9]);
        panel_inferior.add(btn_div);
        panel_inferior.add(btn_mul);
        panel_inferior.add(arr_btn[0]);
        panel_inferior.add(btn_exp);
        panel_inferior.add(btn_ig);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }


}
