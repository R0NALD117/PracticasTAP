package practica2;

import java.awt.*;
import java.awt.event.*;

public class GameMain extends Frame implements MouseListener, MouseMotionListener, KeyListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6242959679180212526L;
	private Game obj_pintable;
	
	public GameMain() {
		
		initComponent();
	}
	
	public void initComponent() {
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		obj_pintable = new Game();
		obj_pintable.addMouseListener(this);
        obj_pintable.addMouseMotionListener(this);
        obj_pintable.addKeyListener(this);
        this.addKeyListener(this);
        this.add(obj_pintable);
        
        this.setSize(500,500);
        this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		GameMain test = new GameMain();
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		
		if(!obj_pintable.isClicked()){
            obj_pintable.setX(e.getX());
            obj_pintable.setY(e.getY());
            obj_pintable.repaint();
        }
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(obj_pintable.isClicked()){
            obj_pintable.setW(e.getX());
            obj_pintable.setH(e.getY());
            obj_pintable.repaint();
        } else{
            obj_pintable.setX(e.getX());
            obj_pintable.setY(e.getY());
        }
        obj_pintable.setClicked();
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Esbozo de método generado automáticamente
		
	}

}
