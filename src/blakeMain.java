import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Derrick Green on 8/8/2015.
 */
public class blakeMain
{

	public static void main(final String[] args)
	{
		JFrame myFrame = new JFrame("my title");
		myFrame.setSize(600,600);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel myPanel = new JPanel();
		myPanel.setSize(100, 100);
		JButton button = new JButton("Press ME");
		button.setBackground(Color.blue);
		button.setSize(100, 100);

		button.addActionListener(new ActionListener()
		{
			@Override public void actionPerformed(ActionEvent actionEvent)
			{
//				myPanel.add(new JLabel("You pushed the stupid button."));
				if (button.getBackground().equals(Color.blue))
				{
					button.setBackground(Color.red);
					JButton newButton = new JButton("Press ME");
					newButton.setBackground(Color.blue);
					myPanel.add(newButton);
				} else
					button.setBackground(Color.blue);

				myPanel.revalidate();
			}
		});
		myPanel.add(button, BorderLayout.CENTER);
//		myPanel.add(new JLabel("My Name is Blake"));


		myFrame.add(myPanel);

		myFrame.setVisible(true);
//		JOptionPane.showMessageDialog(null, "My Name is Blake...");
	}
}
