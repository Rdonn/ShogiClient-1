package ShogiClient;

import javax.swing.JFrame;

public class ShogiClient extends JFrame
{
	public ShogiClient(String arg)
	{
		//basic initialization for JFrame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	public ShogiClient()
	{
		//this will eventually be the default 
		//constructor if there are no command line args
		this("");
	}
	public static void main(String[] args) 
	{
		new ShogiClient();
	}

}
