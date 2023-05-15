import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Font;



public class History extends JFrame implements ActionListener
{
	private JLabel users;
	private JTextArea showu;
	private JButton deleteuser;
	

	
	public History()
	{
		//title
		super("History");
		//label
		users=new JLabel("log in history:-");
        Font font1 = new Font ("Dialog", Font.BOLD,20);
        users.setFont(font1);
		users.setBounds(20,30,200,50);
		



		
		showu= new JTextArea();
	
		showu.setBounds(20,90,300,400);
        
		Readfile obj = new Readfile();
		try {
			showu.setText(obj.filereader());
		} catch (IOException e) {
			
			System.out.println(e);
		}

        //button for add product
        deleteuser=new JButton ("Delete user");
        deleteuser.setBounds(20,600,200, 30);
        deleteuser.addActionListener(this);



		
		
		add(users);
		add(showu);
        add(deleteuser); //button
		
		
		
		
		
		//layout,size
		setLayout(null);
		setSize(800,800);  //(width,height)
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

    public void actionPerformed(ActionEvent x){
        if (x.getSource()== deleteuser) {
			
			
			
        }
    }
	
	public static void main(String[] args)
	{
		new History();
	}
}