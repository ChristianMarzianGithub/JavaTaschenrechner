		package calculator;
		
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		
		import javax.swing.JButton;
		import javax.swing.JFrame;
		import javax.swing.JLabel;
		import javax.swing.JPanel;
		import javax.swing.JTextField;
		
		public class CalculatorCalc  extends JFrame implements ActionListener  {
			
			JButton einsBtn = new JButton("1");
			JButton zweiBtn = new JButton("2");
			JButton dreiBtn = new JButton("3");
			JButton vierBtn = new JButton("4");
			JButton fuenfBtn = new JButton("5");
			JButton sechsBtn = new JButton("6");
			JButton siebenBtn = new JButton("7");
			JButton achtBtn = new JButton("8");
			JButton neunBtn = new JButton("9");
			JButton plusBtn = new JButton("+");
			JButton minusBtn = new JButton("-");
			JButton malBtn = new JButton("*");
			JButton geteiltBtn = new JButton("/");
			JLabel label;
		    JPanel panel;
		    JTextField textField = new JTextField();
		    
		    
		    double sum = 0;
		    int rechenArt;
		 
		    public CalculatorCalc(){
		        this.setTitle("ActionListener Beispiel");
		        this.setSize(400, 250);
		        panel = new JPanel();
		        panel.setLayout(null);
		       
		        einsBtn.addActionListener(this);
		        einsBtn.setLocation(20, 50);
		        einsBtn.setSize(50, 25);
		        
		        zweiBtn.addActionListener(this);
		        zweiBtn.setLocation(100, 50);
		        zweiBtn.setSize(50, 25);

		        dreiBtn.addActionListener(this);
		        dreiBtn.setLocation(180, 50);
		        dreiBtn.setSize(50, 25);

		        vierBtn.addActionListener(this);
		        vierBtn.setLocation(20, 100);
		        vierBtn.setSize(50, 25);

		        fuenfBtn.addActionListener(this);
		        fuenfBtn.setLocation(100, 100);
		        fuenfBtn.setSize(50, 25);
		        
		        sechsBtn.addActionListener(this);
		        sechsBtn.setLocation(180, 100);
		        sechsBtn.setSize(50, 25);
		        		        
		        siebenBtn.addActionListener(this);
		        siebenBtn.setLocation(20, 150);
		        siebenBtn.setSize(50, 25);
		        
		        achtBtn.addActionListener(this);
		        achtBtn.setLocation(100, 150);
		        achtBtn.setSize(50, 25);
		        
		        neunBtn.setLocation(180, 150);
		        neunBtn.setSize(50, 25);		        
		        neunBtn.addActionListener(this);
		        
		        //Buttons werden dem JPanel hinzugefügt
		        textField.setSize(210, 20);
		        textField.setLocation(20, 20);
		        panel.add(textField);
		        
		        
		        panel.add(einsBtn);
		        panel.add(zweiBtn);
		        panel.add(dreiBtn);
		        panel.add(vierBtn);
		        panel.add(fuenfBtn);
		        panel.add(sechsBtn);
		        panel.add(siebenBtn);
		        panel.add(achtBtn);
		        panel.add(neunBtn);
		        
		        panel.add(plusBtn);
		        panel.add(minusBtn);
		        panel.add(malBtn);
		        panel.add(geteiltBtn);
		        
		 
		        this.add(panel);
		        
		        
		        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }
		 
		    public void actionPerformed (ActionEvent ae){
		        
		        if(ae.getSource() == this.einsBtn){
		            sum = sum + 1;
		        }
		        else if(ae.getSource() == this.zweiBtn){
		        	sum = sum + 2;
		        }
		        else if (ae.getSource() == this.dreiBtn){
		            label.setText(("Button 3 wurde betätigt"));
		        }else if(ae.getSource() == this.zweiBtn){
		            label.setText("Button 2 wurde betätigt");
		        }
		        else if (ae.getSource() == this.vierBtn){
		            label.setText(("Button 3 wurde betätigt"));
		        }else if(ae.getSource() == this.zweiBtn){
		            label.setText("Button 2 wurde betätigt");
		        }
		        else if (ae.getSource() == this.fuenfBtn){
		            label.setText(("Button 3 wurde betätigt"));
		        }else if(ae.getSource() == this.zweiBtn){
		            label.setText("Button 2 wurde betätigt");
		        }
		        else if (ae.getSource() == this.sechsBtn){
		            label.setText(("Button 3 wurde betätigt"));
		        }else if(ae.getSource() == this.siebenBtn){
		            label.setText("Button 2 wurde betätigt");
		        }
		        else if (ae.getSource() == this.achtBtn){
		            label.setText(("Button 3 wurde betätigt"));
		        }else if(ae.getSource() == this.neunBtn){
		            label.setText("Button 2 wurde betätigt");
		        }else if(ae.getSource() == this.neunBtn){
		            label.setText("Button 2 wurde betätigt");
		        }else if(ae.getSource() == this.neunBtn){
		            label.setText("Button 2 wurde betätigt");
		        }else if(ae.getSource() == this.neunBtn){
		            label.setText("Button 2 wurde betätigt");
		        }else if(ae.getSource() == this.neunBtn){
		            label.setText("Button 2 wurde betätigt");
		        }
		    }
					
		}
