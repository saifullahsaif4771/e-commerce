import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Font;



public class product extends JFrame implements ActionListener
{
	private JLabel products;
	private JTextArea showp;
	private JButton addproduct1;
	

	
	public product()
	{
		//title
		super("History");
		//label
		products=new JLabel("log in his:-");
        Font font1 = new Font ("Dialog", Font.BOLD,20);
        products.setFont(font1);
		products.setBounds(20,30,200,50);
		



		
		showp= new JTextArea();
	
		showp.setBounds(20,90,300,400);
        
		Readfile obj = new Readfile();
		try {
			showp.setText(obj.filereader());
		} catch (IOException e) {
			
			System.out.println(e);
		}

        //button for add product
        addproduct1=new JButton ("add product");
        addproduct1.setBounds(20,600,200, 30);
        addproduct1.addActionListener(this);



		
		
		add(products);
		add(showp);
        add(addproduct1); //button
		
		
		
		
		
		//layout,size
		setLayout(null);
		setSize(800,800);  //(width,height)
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

    public void actionPerformed(ActionEvent x){
        if (x.getSource()== addproduct1) {
			
			
			
        }
    }
	
	public static void main(String[] args)
	{
		new product();
	}
}
    

