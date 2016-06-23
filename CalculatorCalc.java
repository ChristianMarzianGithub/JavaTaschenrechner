		package taschenrechner;
		
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		
		import javax.swing.JButton;
		import javax.swing.JFrame;
		import javax.swing.JLabel;
		import javax.swing.JPanel;
		import javax.swing.JTextField;
		
		@SuppressWarnings("serial")
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
			JButton gleichBtn = new JButton("=");
			JButton clearBtn = new JButton("C");
			
			JLabel label;
		    JPanel panel;
		    JTextField textField = new JTextField();
		    
		    double sum = 0;
		    int rechenArt;
		    
		 
		    public CalculatorCalc(){
		        this.setTitle("Taschenrechner");
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
		       		       
		        textField.setSize(210, 20);
		        textField.setLocation(20, 20);
		        panel.add(textField);
		        
		        plusBtn.setLocation(250, 150);
		        plusBtn.setSize(50, 25);		        
		        plusBtn.addActionListener(this);
		        
		        minusBtn.setLocation(300, 150);
		        minusBtn.setSize(50, 25);		        
		        minusBtn.addActionListener(this);
		        
		        malBtn.setLocation(250, 100);
		        malBtn.setSize(50, 25);		        
		        malBtn.addActionListener(this);
		        
		        geteiltBtn.setLocation(300, 100);
		        geteiltBtn.setSize(50, 25);		        
		        geteiltBtn.addActionListener(this);
		        
		        gleichBtn.setLocation(350, 100);
		        gleichBtn.setSize(50, 25);		        
		        gleichBtn.addActionListener(this);
		        
		        clearBtn.setLocation(350, 150);
		        clearBtn.setSize(50, 25);		        
		        clearBtn.addActionListener(this);
		        
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
		        
		        panel.add(gleichBtn);
		        panel.add(clearBtn);
		        
		 
		        this.add(panel);
		        
		        
		        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }
		    
		    public void rechne(double var){
	            if (rechenArt == 0){
	            	sum = sum + var;
	        	}else if(rechenArt == 1){
	        		sum = sum - var;
	        	}else if(rechenArt == 2){
	        		sum = sum * var;
	        	}else if(rechenArt == 3){
	        		sum = sum / var;
	        	}
	           textField.setText(String.valueOf(var));
		    }
		 
		    public void actionPerformed (ActionEvent ae){
		        
		        if(ae.getSource() == this.einsBtn){
		            rechne(1);
		        }else if(ae.getSource() == this.zweiBtn){
		        	rechne(2);
		        }else if (ae.getSource() == this.dreiBtn){
		        	rechne(3);		            
		        }else if(ae.getSource() == this.vierBtn){
		            rechne(4);
		        }else if (ae.getSource() == this.fuenfBtn){
		            rechne(5);
		        }else if(ae.getSource() == this.sechsBtn){
		            rechne(6);
		        }else if (ae.getSource() == this.siebenBtn){
		        	rechne(7);
		        }else if(ae.getSource() == this.achtBtn){
		        	rechne(8);
		        }else if (ae.getSource() == this.neunBtn){
		            rechne(9);
		        }else if(ae.getSource() == this.plusBtn){
		        	rechenArt = 0;
		        }else if(ae.getSource() == this.minusBtn){
		        	rechenArt = 1;
		        }else if(ae.getSource() == this.malBtn){
		        	rechenArt = 2;
		        }else if(ae.getSource() == this.geteiltBtn){
		        	rechenArt = 3;
		        }else if(ae.getSource() == this.gleichBtn){
		        	textField.setText(String.valueOf(sum));
		        }else if(ae.getSource() == this.clearBtn){
		        	sum = 0;
		        	textField.setText(String.valueOf(sum));
		        }
		    }
					
		}
