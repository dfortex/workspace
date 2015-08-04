import java.awt.*;
import java.awt.event.*;

public class GUI extends Frame implements ActionListener
{
	private Label lbinput;
	private Label lboutput;
	private TextField tfinput;
	private TextField tfoutput;
	private int number;
	private int sum = 0;
	private Frame f;
	
	public GUI()
	{
		setLayout(new FlowLayout());
		lbinput = new Label("Enter an Integer: ");
		add(lbinput);
		
		tfinput = new TextField(10);
		add(tfinput);
		
		tfinput.addActionListener(this);
		
		lboutput = new Label("The Accumulated Sum is: ");
		add(lboutput);
		
		tfoutput = new TextField(10);
		tfoutput.setEditable(false);
		add(tfoutput);
		
		setTitle("GUI Accumulator");
		setSize(350, 120);
		setVisible(true);
		
		addWindowListener(new WindowListener(){
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		number = Integer.parseInt(tfinput.getText());
		sum += number;
		tfinput.setText("");
		tfoutput.setText(sum + "");
	}

}
