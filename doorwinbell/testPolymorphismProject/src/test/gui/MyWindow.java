package test.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow extends JFrame implements ActionListener{
	// Field
	private JButton btn = new JButton("클릭하세요");
	
	public MyWindow () {
		super("상속 테스트");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		add(btn);
		// 버튼에 클릭 이벤트 연결하기
		btn.addActionListener(this);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showConfirmDialog(this, "버튼이 클릭되었습니다.");
		
	}
}
