import javax.swing.*; 
import java.awt.*; 
public class gui
{  
	public static void main(String[] args)
	{  
		JFrame f=new JFrame();//creating instance of JFrame  
    JButton add, update, delete;      
		add =new JButton("Add");//creating instance of JButton  
		update =new JButton("update");//creating instance of JButton  
		delete =new JButton("delete");//creating instance of JButton  
		//add.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		//update.setBounds(290,100,100, 40);//x axis, y axis, width, height  
		//delete.setBounds(130,100,100, 40);//x axis, y axis, width, height  
          
	//	f.add(add);//adding button in JFrame  	

		//b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
          
//		f.add(add);//adding button in JFrame  
         
				BorderLayout layout = new BorderLayout(); 
				f.setLayout( layout );//using no layout managers  
				JToolBar tb;
				JPanel p = new JPanel(); 

				p.add(add); 
        p.add(update); 
        p.add(delete); 
				tb = new JToolBar();
				tb.add(p); 

				layout.setHgap(50);
      	layout.setVgap(50);
				f.add(tb, BorderLayout.EAST); 
				tb.setOrientation(SwingConstants.VERTICAL); 
				p.setLayout(new BoxLayout(p, BorderLayout.Y_AXIS));
				//layout.setHgap(50);
      	//layout.setVgap(50);
				f.setSize(600,700);//400 width and 500 height  
				//f.setLayout( new BorderLayout() );//using no layout managers  
				f.setVisible(true);//making the frame visible  
	}  
}  
