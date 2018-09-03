package vcampus.view;

import java.awt.EventQueue;
 
	
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField; 
import java.awt.Button;
import java.awt.Choice;
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 
  
public class LoginFirst { 
  
 private JFrame frame; 
 private JTextField textField; 
 private JTextField textField_1; 

 public static void main(String[] args) { 
  EventQueue.invokeLater(new Runnable() { 
   public void run() { 
    try { 
    	LoginFirst window = new LoginFirst(); 
     window.frame.setVisible(true); 
    } catch (Exception e) { 
     e.printStackTrace(); 
    } 
   } 
  }); 
 } 
 
 public LoginFirst() { 
  initialize(); 
 } 
  
 private void initialize() { 
  frame = new JFrame(); 
  frame.setTitle(""); 
  frame.setBounds(400, 250, 450, 300); 
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  frame.getContentPane().setLayout(null); 
    
  JLabel lblNewLabel = new JLabel("Virtual Campus"); 
  lblNewLabel.setBounds(111, 17, 287, 15); 
  frame.getContentPane().add(lblNewLabel); 
    
  JLabel lblNewLabel_1 = new JLabel("学号"); 
  lblNewLabel_1.setBounds(87, 67, 67, 15); 
  frame.getContentPane().add(lblNewLabel_1); 
    
  textField = new JTextField(); 
  textField.setBounds(154, 64, 141, 21); 
  frame.getContentPane().add(textField); 
  textField.setColumns(10); 
    
  JLabel label = new JLabel("密码"); 
  label.setBounds(87, 108, 67, 15); 
  frame.getContentPane().add(label); 
    
  textField_1 = new JTextField(); 
  textField_1.setColumns(10); 
  textField_1.setBounds(154, 103, 141, 21); 
  frame.getContentPane().add(textField_1);
    
  final Choice choice = new Choice(); 
  choice.setBounds(305, 67, 74, 21); 
  choice.add("学生"); 
  choice.add("教师"); 
  choice.add("管理员"); 

  frame.getContentPane().add(choice); /*
  JRadioButton rad1 = new JRadioButton("学生");
  JRadioButton rad2 = new JRadioButton("教师");
  JRadioButton rad3 = new JRadioButton("系统管理员");
	  
	  frame.getContentPane().add(rad1);
	  frame.getContentPane().add(rad2);
	  frame.getContentPane().add(rad3);
*/
  Button button = new Button("登陆"); 
  button.setBounds(173, 153, 76, 23); 
  button.addMouseListener(new MouseAdapter() { 
   @Override
   public void mouseClicked(MouseEvent e) { 
    @SuppressWarnings("unused")
	String user=textField.getText(); 
    @SuppressWarnings("unused")
	String password=textField_1.getText(); 
    @SuppressWarnings("unused")
	String shenfen=choice.getSelectedItem(); 
  //  setLayout(new GridLayout(1,1)); 
    if(user.equals("")||user==null){ 
     JOptionPane.showMessageDialog(frame, shenfen+":您好，帐号不能为空！"); 
     return; 
    }else if(password.equals("")||password==null){ 
     JOptionPane.showMessageDialog(frame, shenfen+":您好，密码不能为空！"); 
     return; 
    }/*else{ 
     StudentInfo stu=new StudentInfo(Integer.parseInt(user), 
       Integer.parseInt(password),shenfen); 
     UserLoginValid dao=new UserLoginValid(); 
     String result=dao.isValid(stu); 
       
     if("登录成功！".equals(result)){ 
      JOptionPane.showMessageDialog(frame,result); 
      StudentMainView index=new StudentMainView(stu); 
      JFrame frame2=index.getFrame(); 
      frame2.setVisible(true); 
      frame.dispose(); 
     }else{ 
      JOptionPane.showMessageDialog(frame,result); 
     } 
       */
    } 
   
  }); 
  frame.getContentPane().add(button); 
    
  Button button_1 = new Button("取消"); 
  button_1.setBounds(173, 230, 76, 23); 
  frame.getContentPane().add(button_1);
  
  Button button_2 = new Button("\u6CE8\u518C");
  button_2.setBounds(173, 188, 76, 22);
  frame.getContentPane().add(button_2);
 }  
}

