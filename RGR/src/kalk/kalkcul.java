/**
 * ���������� ������
 */
package kalk;
/**
 * ������ ��������� �������, ����������� ��� ������.
 */
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.NumberFormatter;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
/**
 * ���������� ���������� ������, ������������ ����� ������ JFrame, ��� �������� ���� , ��� �������������� ������ ������� 
 */
public class kalkcul extends JFrame {
	/**
	 * ��������� ���������� k1,k2,k3, ������� ������������ ��� ������� ������� �������, 
	 * k1 - ����������, k2 - ������ ������� �� 100 ��,k3 - ��������� �������,
	 * ���������� r1 ������������ ��� ��������� ������ �� 100 ��.
	 * ���������� r2 ������������ ��� ��������� ������� ������� �� 100 ��.
	 * ���������� s1 ������������ ��� ��������� ����� ���������.
	 * ���������� s2 ������������ ��� ��������� ������� �������.
	 */
	int k1,k2,k3,r1,r2;
	int s1,s2;
	
	/**
	 * �����, ���������� �� ������ ������
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkcul frame = new kalkcul();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * ���������� ������, � ������� ����������� �������� �������� �����, �� �������, � ����� ���������� ���������� ������� �������
	 */
	public kalkcul() {
		
		/**
		 * �������� ������� ������
		 */
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(BorderFactory.createTitledBorder("�����������"));
		/**
		 * �������� ������� ���: 
		 * ���������� ������� � �����
		 * ������
		 */
		JPanel Panel1 = new JPanel(new GridLayout(8, 1));
		Panel1.setBounds(10,15,280,200);
		JPanel Panel2 = new JPanel();
		Panel2.setLayout(null);
		Panel2.setBounds(300,15,350,200);
		/**
		 * ������� ������ � ������� �������� ��� ������, �����, ��������������
		 */
		Font font = new Font("Times New Roman", Font.PLAIN, 18);
		/**
		 * �������� ����� 
		 */
		JLabel label_1 = new JLabel("����������");
		label_1.setFont(font);
		JLabel label_2 = new JLabel("������ ������� �� 100 ��");
		label_2.setFont(font);
		JLabel label_3 = new JLabel("��������� �������");
		label_3.setFont(font);
		JLabel label_4 = new JLabel("0 ���.");
		label_4.setBounds(80, 120, 350, 20);
		label_4.setFont(font);
		JLabel label_5 = new JLabel("������� ���������.");
		label_5.setBounds(80, 150, 350, 20);
		label_5.setFont(font);
		/**
		 * �������� ����� ����� 
		 */
		NumberFormat number = new DecimalFormat("##0.###");//����� �����
		/**
		 * �������� ��������� ����� 
		 */
		JFormattedTextField TxtBox = new JFormattedTextField(new NumberFormatter(number));//����������� ��������� ���� ��� �������� �����
		TxtBox.setFont(font);
		JFormattedTextField TxtBox_1 = new JFormattedTextField(new NumberFormatter(number));
		TxtBox_1.setFont(font);
		JFormattedTextField TxtBox_2 = new JFormattedTextField(new NumberFormatter(number));
		TxtBox_2.setFont(font);
		JFormattedTextField TxtBox_3 = new JFormattedTextField(new NumberFormatter(number));
		TxtBox_3.setFont(font);
		/**
		 * �������� ������
		 */
		JButton btnNewButton = new JButton("����������");
		btnNewButton.setFont(font);
		btnNewButton.setBounds(50, 80, 140, 40);
		/**
		 * ���������� ��������� �� ������ ��� ��������� �����
		 */
		Panel1.add(label_1);
		Panel1.add(TxtBox);
		Panel1.add(label_2);
		Panel1.add(TxtBox_1);
		Panel1.add(label_3);
		Panel1.add(TxtBox_2);
		/**
		 * ���������� ��������� �� ������ ��� ������
		 */
		Panel2.add(btnNewButton);
		Panel2.add(label_4);
		Panel2.add(label_5);
		/**
		 * ���������� ��������� �� ������� ������
		 */
		contentPane.add(Panel1);
		contentPane.add(Panel2);
		/**
		 * �������� �������, ������������, �������� �������� �����, ���������� �� ��� ������� ������
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("������ ������� �������");
		setContentPane(contentPane);
		setBounds(100, 100, 600, 280);	
		
		/**
		 * ������� ��� ������ "����������". ���������� ������� �������
		 */
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k1=((Long) TxtBox.getValue()).intValue();
				k2=((Long) TxtBox_1.getValue()).intValue();
				k3=((Long) TxtBox_2.getValue()).intValue();
				r1=k2*k3;
				r2=k1/100;
				s1=(int) (r2*r1);
				s2=(int) (r2*k2);
				label_4.setText(Integer.toString(s1) + " ���.");
				label_5.setText(Integer.toString(s2) + " ������� ���������.");
			}
		});
		
	}
}
