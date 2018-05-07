package com.knight.bean;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserInterface extends JFrame{
	
	@Autowired
	private UserService userService;
	private JTextField fname;
	private JLabel lname;
	private JTextField femail;
	private JLabel lemail;
	private JTextField fpasswd;
	private JLabel lpasswd;
	private JTextField fmark;
	private JLabel lmark;
	private JLabel lout;
	private JButton save;
	private JButton retrive;
	
	
	public UserInterface(){
		
		setTitle("Be Like Bill");
		fname = new JTextField(40);
		femail = new JTextField(40);
		fpasswd = new JTextField(40);
		fmark = new JTextField(40);
		
		lname = new JLabel("Name:");
		lemail = new JLabel("Email:");
		lpasswd = new JLabel("Password:");
		lmark = new JLabel("Mark:");
		lout = new JLabel("Out:");
		
		save = new JButton("SAVE");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserInfo user = new UserInfo();
				user.setEmail(femail.getText());
				user.setName(fname.getText());
				user.setPasswd(fpasswd.getText());
				user.setMarks(Integer.parseInt(fmark.getText()));
				userService.saveUser(user);
				lout.setText("Cleared");
			}
		});
		
		retrive = new JButton("RETRIVE");
		retrive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<UserInfo> lt = userService.retive();
				String str = new String();
				for (UserInfo user : lt) {
					str=str+" and "+user.getName();
				}
				lout.setText(str);
			}
		});
		
		add(lname);
		add(fname);
		add(lemail);
		add(femail);
		add(lpasswd);
		add(fpasswd);
		add(lmark);
		add(fmark);
		add(save);
		add(retrive);
		add(lout);
		
        this.setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
	}
	

	public void display() {
		
		System.out.println("Hi abhi");
	}
	
}

	


	
	
	
	

