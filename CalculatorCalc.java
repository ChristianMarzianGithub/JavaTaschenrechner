		package calculator;
		
		import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
		
		import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
		
		public class CalculatorCalc {
			
			static JFrame fenster = new JFrame();
			static JPanel panel = new JPanel();
			static JTextField lohnEdit = new JTextField();
			static JButton einsBtn = new JButton("1");
			static JButton zweiBtn = new JButton("2");
			static JButton dreiBtn = new JButton("3");
			static JButton vierBtn = new JButton("4");
			static JButton fuenfBtn = new JButton("5");
			static JButton sechsBtn = new JButton("6");
			static JButton siebenBtn = new JButton("7");
			static JButton achtBtn = new JButton("8");
			static JButton neunBtn = new JButton("9");
			
			
			
			
			
			public static void calc (){
				frame();
				//frameSample();
			}
			
			
			public static void frame() {
				
				fenster.setSize(500, 250);
				fenster.setLocationRelativeTo(null);
				fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
						
				panel.setLayout(null);
				
				
				
				
				
				einsBtn.setLocation(50, 150);
				einsBtn.setSize(45, 20);
				
				zweiBtn.setLocation(100, 150);
				zweiBtn.setSize(45, 20);
				
				dreiBtn.setLocation(150, 150);
				dreiBtn.setSize(45, 20);
			
				vierBtn.setLocation(50, 120);
				vierBtn.setSize(45, 20);
				
				fuenfBtn.setLocation(100, 120);
				fuenfBtn.setSize(45, 20);
				
				sechsBtn.setLocation(150, 120);
				sechsBtn.setSize(45, 20);
				
				siebenBtn.setLocation(50, 90);
				siebenBtn.setSize(45, 20);
				
				achtBtn.setLocation(100, 90);
				achtBtn.setSize(45, 20);
				
				neunBtn.setLocation(150, 90);
				neunBtn.setSize(45, 20);
				neunBtn.addActionListener(new java.awt.event.ActionListener() {
		            
		            public void actionPerformed(java.awt.event.ActionEvent e) {
		            	System.out.println("hi");
		                
		            }
		        });
				
				
				lohnEdit.setSize(200, 20);
				lohnEdit.setLocation(50, 20);				
				
				panel.add(neunBtn);
				panel.add(achtBtn);
				panel.add(siebenBtn);
				panel.add(sechsBtn);
				panel.add(fuenfBtn);
				panel.add(vierBtn);
				panel.add(dreiBtn);
				panel.add(zweiBtn);
				panel.add(einsBtn);
				panel.add(lohnEdit);	
				fenster.add(panel);
				fenster.setVisible(true);		
			
				
				
				
			}
			
			
			
			
		
		}
