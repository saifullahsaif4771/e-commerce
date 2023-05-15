import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Font;



public class Product extends JFrame implements ActionListener
{
	private JLabel products;
	private JTextArea showp;
	private JButton addproduct1;
	

	
	public Product()
	{
		//title
		super("Adding products");
		//label
		products=new JLabel("products available:-");
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
        addproduct1=new JButton ("Add product");
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
			
			
			String Username = textfield1.getText();
			String password1 = new String(passField1.getPassword());
			String password2 = new String(passField2.getPassword());
			String email = textfield2.getText();
            
        }
    }
	
	public static void main(String[] args)
	{
		new Product();
	}
}