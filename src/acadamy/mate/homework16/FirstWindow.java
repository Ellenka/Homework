package acadamy.mate.homework16;


import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FirstWindow {

  private JFrame frame;
  
  

  /**
   * Launch the application.
   */
  

  public JFrame getFrame() {
    return frame;
  }

  public void setFrame(JFrame frame) {
    this.frame = frame;
  }

  /**
   * Create the application.
   */
  public FirstWindow() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
   
    
    JLabel lblPleaseSelectThe = new JLabel("Please, select the figure");
    lblPleaseSelectThe.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblPleaseSelectThe.setHorizontalAlignment(SwingConstants.CENTER);
    lblPleaseSelectThe.setBounds(112, 25, 198, 25);
    frame.getContentPane().add(lblPleaseSelectThe);
    
    JRadioButton rdbtnCircle = new JRadioButton("Circle");
    rdbtnCircle.setFont(new Font("Tahoma", Font.BOLD, 12));
    rdbtnCircle.setBounds(34, 174, 79, 23);
    frame.getContentPane().add(rdbtnCircle);
    
    JRadioButton rdbtnSquare = new JRadioButton("Square");
    rdbtnSquare.setFont(new Font("Tahoma", Font.BOLD, 12));
    rdbtnSquare.setBounds(181, 174, 79, 23);
    frame.getContentPane().add(rdbtnSquare);
    
    JRadioButton rdbtnTriangle = new JRadioButton("Triangle");
    rdbtnTriangle.setFont(new Font("Tahoma", Font.BOLD, 12));
    rdbtnTriangle.setBounds(311, 174, 79, 23);
    frame.getContentPane().add(rdbtnTriangle);
    
    JButton btnCreate = new JButton("Create");
    btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 12));
    btnCreate.setBounds(335, 213, 89, 23);
    frame.getContentPane().add(btnCreate);
    
    JLabel lblNewLabel = new JLabel("");
    lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Elena\\eclipse-workspace\\Homework\\images\\circ.png"));
    
    lblNewLabel.setBounds(27, 52, 100, 100);
    frame.getContentPane().add(lblNewLabel);
    
    JLabel label = new JLabel("");
    label.setIcon(new ImageIcon("C:\\Users\\Elena\\eclipse-workspace\\Homework\\images\\sqr.png"));
    label.setBounds(160, 52, 100, 100);
    frame.getContentPane().add(label);
    
    JLabel label_1 = new JLabel("");
    label_1.setIcon(new ImageIcon("C:\\Users\\Elena\\eclipse-workspace\\Homework\\images\\trn.png"));
    label_1.setBounds(309, 52, 100, 100);
    frame.getContentPane().add(label_1);
    
    
    ButtonGroup group = new ButtonGroup();
    group.add(rdbtnCircle);
    group.add(rdbtnSquare);
    group.add(rdbtnTriangle);
  }
  
  
  
}
