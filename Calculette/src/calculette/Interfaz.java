package calculette;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

import java.awt.event.*;


public class Interfaz extends JFrame implements ActionListener, KeyListener{
    private JTextField campo;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton boton0;
    private JButton botonc;
    private JButton botonsuma;
    private JButton botonresta;
    private JButton botonmult;
    private JButton botondiv;
    private JButton botonigual;
    private JButton botonpunto;
    private JButton botonparen;
    private JButton botontesis;
    

    public Interfaz(){
        
        this.setLayout(new GridBagLayout()); 
        this.setTitle("Calculadora");
        
        campo = new JTextField ();
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 1; 
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 1.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add (campo, c);
        campo.requestFocus();
        
        botonc=new JButton("C");
        c.gridx = 3;
        c.gridy = 0; 
        c.gridwidth = 2; 
        c.gridheight = 1;
        this.add (botonc, c);
     
        boton1=new JButton("1");
        c.gridx = 1;
        c.gridy = 1; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (boton1, c);
        
        boton2=new JButton("2");
        c.gridx = 2;
        c.gridy = 1; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (boton2, c);
        
        boton3=new JButton("3");
        c.gridx = 3;
        c.gridy = 1; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (boton3, c);
        
        boton4=new JButton("4");
        c.gridx = 1;
        c.gridy = 2; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (boton4, c);
        
        boton5=new JButton("5");
        c.gridx = 2;
        c.gridy = 2; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (boton5, c);
        
        boton6=new JButton("6");
        c.gridx = 3;
        c.gridy = 2; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (boton6, c);
        
        boton7=new JButton("7");
        c.gridx = 1;
        c.gridy = 3; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (boton7, c);
        
        boton8=new JButton("8");
        c.gridx = 2;
        c.gridy = 3; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (boton8, c);
        
        boton9=new JButton("9");
        c.gridx = 3;
        c.gridy = 3; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (boton9, c);
        
        boton0=new JButton("0");
        c.gridx = 2;
        c.gridy = 4; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (boton0, c);
        boton0.addActionListener(this);
        
        botonsuma=new JButton("+");
        c.gridx = 4;
        c.gridy = 1; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (botonsuma, c);
        
        botonresta=new JButton("-");
        c.gridx = 4;
        c.gridy = 2; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (botonresta, c);
        
        botonmult=new JButton("*");
        c.gridx = 4;
        c.gridy = 3; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (botonmult, c);
        
        botondiv=new JButton("/");
        c.gridx = 4;
        c.gridy = 4; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (botondiv, c);
        
        botonpunto=new JButton(".");
        c.gridx = 1;
        c.gridy = 4; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (botonpunto, c);
        
        botonigual=new JButton("=");
        c.gridx = 3;
        c.gridy = 4; 
        c.gridwidth = 1; 
        c.gridheight = 1;
        this.add (botonigual, c);
        
        botonparen=new JButton("(");
        c.gridx = 1;
        c.gridy = 5; 
        c.gridwidth = 2; 
        c.gridheight = 1;
        this.add (botonparen, c);
        
        botontesis=new JButton(")");
        c.gridx = 3;
        c.gridy = 5; 
        c.gridwidth = 2; 
        c.gridheight = 1;
        this.add (botontesis, c);
        

        boton1.addActionListener(this);
        boton1.addKeyListener(this);
        boton2.addActionListener(this);
        boton2.addKeyListener(this);
        boton3.addActionListener(this);
        boton3.addKeyListener(this);
        boton4.addActionListener(this);
        boton4.addKeyListener(this);
        boton5.addActionListener(this);
        boton5.addKeyListener(this);
        boton6.addActionListener(this);
        boton6.addKeyListener(this);
        boton7.addActionListener(this);
        boton7.addKeyListener(this);
        boton8.addActionListener(this);
        boton8.addKeyListener(this);
        boton9.addActionListener(this);
        boton9.addKeyListener(this);
        botonresta.addActionListener(this);
        botonsuma.addActionListener(this);
        botonsuma.addKeyListener(this);
        botonpunto.addActionListener(this);
        botondiv.addActionListener(this);
        botondiv.addKeyListener(this);
        botonmult.addActionListener(this);
        botonmult.addKeyListener(this);
        botonigual.addActionListener(this);
        botonigual.addKeyListener(this);
        botonc.addActionListener(this);
        botonparen.addActionListener(this);
        botonparen.addKeyListener(this);
        botontesis.addActionListener(this);
        botontesis.addKeyListener(this);
        
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    
        
    public void actionPerformed(ActionEvent e) {

       if(e.getSource()==boton0){
           this.campo.setText(campo.getText()+"0");
       }
       if(e.getSource()==boton1){
           this.campo.setText(campo.getText()+"1");
       }
       if(e.getSource()==boton2){
           this.campo.setText(campo.getText()+"2");
       }
       if(e.getSource()==boton3){
           this.campo.setText(campo.getText()+"3");
       }
       
       if(e.getSource()==boton4){
           this.campo.setText(campo.getText()+"4");
       }
       
       if(e.getSource()==boton5){
           this.campo.setText(campo.getText()+"5");
       }
       
       if(e.getSource()==boton6){
           this.campo.setText(campo.getText()+"6");
       }
       
       if(e.getSource()==boton7){
           this.campo.setText(campo.getText()+"7");
       }
       
       if(e.getSource()==boton8){
           this.campo.setText(campo.getText()+"8");
       }
       
       if(e.getSource()==boton9){
           this.campo.setText(campo.getText()+"9");
       }
       
       if(e.getSource()==botonc){
           this.campo.setText("");
       }
       
       if(e.getSource()==botonsuma){
           this.campo.setText(campo.getText()+"+");
       }
       
       if(e.getSource()==botonresta){
           this.campo.setText(campo.getText()+"-");
       }
       
       if(e.getSource()==botonmult){
           this.campo.setText(campo.getText()+"*");
       }
       
       if(e.getSource()==botondiv){
           this.campo.setText(campo.getText()+"/");
       }
       
       if(e.getSource()==botonpunto){
           this.campo.setText(campo.getText()+".");
       }
       
       if(e.getSource()==botonparen){
           this.campo.setText(campo.getText()+"(");
       }
       
       if(e.getSource()==botontesis){
           this.campo.setText(campo.getText()+")");
       }
       
       if(e.getSource()==botonigual){
	   String expresion = campo.getText();
       campo.setText(Double.toString((Eval.Main(expresion))));
       }
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if ((e.getKeyCode()== KeyEvent.VK_ENTER) || (e.getKeyCode()==KeyEvent.VK_EQUALS)){
            //this.campo.setText("Resultado");
            botonigual.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_NUMPAD0) || (e.getKeyCode()== KeyEvent.VK_0)) {
            boton0.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_NUMPAD1) || (e.getKeyCode()== KeyEvent.VK_1)) {
            boton1.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_NUMPAD2) || (e.getKeyCode()== KeyEvent.VK_2)) {
            boton2.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_NUMPAD3) || (e.getKeyCode()== KeyEvent.VK_3)) {
            boton3.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_NUMPAD4) || (e.getKeyCode()== KeyEvent.VK_4)) {
            boton4.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_NUMPAD5) || (e.getKeyCode()== KeyEvent.VK_5)) {
            boton5.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_NUMPAD6) || (e.getKeyCode()== KeyEvent.VK_6)) {
            boton6.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_NUMPAD7) || (e.getKeyCode()== KeyEvent.VK_7)) {
            boton7.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_NUMPAD8) || (e.getKeyCode()== KeyEvent.VK_8)) {
            boton8.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_NUMPAD9) || (e.getKeyCode()== KeyEvent.VK_9)) {
            boton9.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_PLUS)|| (e.getKeyCode()==KeyEvent.VK_ADD)){
            botonsuma.doClick();
        }
        
        if ((e.getKeyCode()== KeyEvent.VK_MINUS)|| (e.getKeyCode()==KeyEvent.VK_SUBTRACT)){
            botonresta.doClick();
        }
        
        if (e.getKeyCode()== KeyEvent.VK_MULTIPLY){
           botonmult.doClick();
        }
        
        if (e.getKeyCode()== KeyEvent.VK_DIVIDE){
            botondiv.doClick();
        }
        
        if ((e.getKeyCode()==KeyEvent.VK_DELETE) || (e.getKeyCode()==8)){
            botonc.doClick();
        }
        
        if (e.getKeyCode()==46){
            botonpunto.doClick();
        }
  
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
}