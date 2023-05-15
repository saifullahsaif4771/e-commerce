import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;


public class ecommerce extends JFrame implements ActionListener
{ 
    private JLabel welcome;
    private JLabel adminpanel;
    private JButton addproduct;
    private JButton checkseller;
    
    

    public ecommerce()
    {
        //title 
        super("Admin Page");

        //label for "welcome"
        welcome = new JLabel ("Welcome to" );
        Font font1 = new Font ("Dialog", Font.BOLD, 40);
        welcome.setFont(font1);
        welcome.setBounds(10,5,400,100);

     //label for "admin panel"
          
        adminpanel = new JLabel ("admin panel" );
        Font font2 = new Font ("Dialog", Font.BOLD, 40);
        adminpanel.setFont(font2);
        adminpanel.setBounds(10,50,400,100);





        //button for history
        checkseller= new JButton("USER HISTORY");
        Font font3 = new Font ("Dialog", Font.BOLD, 20);
        checkseller.setFont(font3);
        checkseller.setBounds(300,50,200,200);
        checkseller.addActionListener(this);

        

        //button for add product
        addproduct= new JButton("ADD PRODUCT");
        Font font4 = new Font ("Dialog", Font.BOLD, 20);
        addproduct.setFont(font4);
        addproduct.setBounds(520,50,200,200);
        addproduct.addActionListener(this);
        



        


    
        




        add(welcome);
        add(adminpanel);
        add(addproduct);
        add(checkseller);



        //GUI frame
        setLayout(null);
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);



    } 

    public void actionPerformed(ActionEvent a){
        if (a.getSource()==checkseller)
        {
            setVisible(false);
            new History();
        }

        if(a.getSource()==addproduct)
        {
            setVisible(false);
            new product();
        }
    }


    public static void main (String []args){
        new ecommerce();
    }

          
    
}