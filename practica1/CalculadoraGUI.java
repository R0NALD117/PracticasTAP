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
            arr_col[i].addActionListener(this);
        }
        op = new JButton("Op");
        btn_mas = new JButton("+");
        btn_menos = new JButton("-");
        btn_div = new JButton("/");
        btn_mul = new JButton("*");
        btn_ig = new JButton("=");
        btn_exp = new JButton("^");

        op.addActionListener(this);
        btn_mas.addActionListener(this);
        btn_menos.addActionListener(this);
        btn_div.addActionListener(this);
        btn_mul.addActionListener(this);
        btn_ig.addActionListener(this);
        btn_exp.addActionListener(this);

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

       if(e.getSource() == arr_btn[0]){
            campo_texto.setText(campo_texto.getText()+"0");
       } 
       if(e.getSource() == arr_btn[1]){
            campo_texto.setText(campo_texto.getText()+"1");
       }
       if(e.getSource() == arr_btn[2]){
            campo_texto.setText(campo_texto.getText()+"2");
       }
       if(e.getSource() == arr_btn[3]){
            campo_texto.setText(campo_texto.getText()+"3");
       }
       if(e.getSource() == arr_btn[4]){
            campo_texto.setText(campo_texto.getText()+"4");
       }
       if(e.getSource() == arr_btn[5]){
            campo_texto.setText(campo_texto.getText()+"5");
       }
       if(e.getSource() == arr_btn[6]){
            campo_texto.setText(campo_texto.getText()+"6");
       }
       if(e.getSource() == arr_btn[7]){
            campo_texto.setText(campo_texto.getText()+"7");
       }
       if(e.getSource() == arr_btn[8]){
            campo_texto.setText(campo_texto.getText()+"8");
       }
       if(e.getSource() == arr_btn[9]){
            campo_texto.setText(campo_texto.getText()+"9");
       }
       if(e.getSource() == btn_mas){
        campo_texto.setText(campo_texto.getText()+ "+");
       }
       if(e.getSource() == btn_menos){
          campo_texto.setText(campo_texto.getText()+ "-");
       }
       if(e.getSource() == btn_div){
          campo_texto.setText(campo_texto.getText()+ "/");
       }
       if(e.getSource() == btn_mul){
          campo_texto.setText(campo_texto.getText()+ "*");
       }  
       if(e.getSource() == btn_exp){
          campo_texto.setText(campo_texto.getText()+ "^");
       }
       if(e.getSource() == btn_ig){
          campo_texto.setText(campo_texto.getText()+ "=");
       }
    }
}
