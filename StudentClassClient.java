import java.rmi.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 
public class StudentClassClient extends JFrame implements ActionListener 
{

	JTextField ClassTextField;
    JTextField NameTextField;
	
	
		JTextField ClassTextField2;
    JTextField NameTextField1;
    JButton Submit;
    
    JButton viewRecord;

    JLabel jLabel1;
    JLabel jLabel2;
	
	
	    JLabel jLabel3;
    JLabel jLabel4;
    
    public StudentClassClient()
    
     {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
		
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
		
        NameTextField = new JTextField();
        ClassTextField = new JTextField();
			
        NameTextField1 = new JTextField();
        ClassTextField2 = new JTextField();
        Submit = new JButton();
        viewRecord = new JButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Tahoma", 0, 12)); 
        jLabel1.setText(" Student ID No");

        jLabel2.setFont(new Font("Tahoma", 0, 12)); 
        jLabel2.setText("Year of Study");
		
		
		
		   jLabel3.setFont(new Font("Tahoma", 0, 12)); 
        jLabel3.setText("Student Name");
		
		
		   jLabel4.setFont(new Font("Tahoma", 0, 12)); 
        jLabel4.setText("Department");

		
		

		
		
				
        NameTextField.setFont(new Font("Tahoma", 0, 12)); 

        ClassTextField.setFont(new Font("Tahoma", 0, 12)); 
		
				
        NameTextField1.setFont(new Font("Tahoma", 0, 12)); 

        ClassTextField2.setFont(new Font("Tahoma", 0, 12)); 

        Submit.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        Submit.addActionListener(this);
        Submit.setText("Register");
        viewRecord.addActionListener(this); 
        viewRecord.setText("Other Operation"); 
		
/*---------------------------------------------------------------------------------------*/
/*---------------------------------------------------------------------------------------*/
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Submit)
                        .addComponent(viewRecord)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
							 .addComponent(jLabel3)
							  .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ClassTextField)
							 .addComponent(ClassTextField2)
							  .addComponent(NameTextField1)
                            .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				
                    .addComponent(jLabel1)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				
				
				
							
                    .addComponent(jLabel3)
                    .addComponent(NameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				
							
                    .addComponent(jLabel4)
                    .addComponent(ClassTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
				
				
			
                    .addComponent(jLabel2)
                    .addComponent(ClassTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Submit)
                    .addComponent(viewRecord)
                .addContainerGap())
        );
        
/*---------------------------------------------------------------------------------------*/


/*---------------------------------------------------------------------------------------*/        

        pack();
    }
    
    public void actionPerformed(ActionEvent ae)
    
    	{
            StudentClass h = null;
             try
		    {
		    h = (StudentClass)Naming.lookup("rmi://127.0.0.1/server");
                    }catch(Exception e)
	    	
	    		{
		    		
		    		
	    		}
		    	
	    if (ae.getSource() == Submit)
	    
	    	{	
		   
		    	try{
		    String stuname = NameTextField.getText();
		    String classname = ClassTextField.getText();
		    String yrrs = NameTextField1.getText();
		    String pros = ClassTextField2.getText();
		    h.insertDetails(stuname,classname,yrrs,pros);	
                        }catch(Exception e){
                            
                        }
	    	
	    	
		    }else if(ae.getSource()==viewRecord){
                        System.out.println("vieRecord Clicked");
						
						StudentInformation pro=new StudentInformation();
                       pro.dis();

                    }	
	    	
    	}
    
    
    
    
    public static void main(String args[]) 
    
    {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
             {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
             }
        } catch (Exception ex) 
        {
            
        } 
        StudentClassClient ob = new StudentClassClient();
        ob.setVisible(true);
        
    }
    
    
    
}
