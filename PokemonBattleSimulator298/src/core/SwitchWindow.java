package core;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class SwitchWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public SwitchWindow() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[][][][][][]"));
		
		JButton btnPlayerSwitch1 = new JButton("Pokemon1");
		btnPlayerSwitch1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CurrentSimData.getCurrentPokemonPlayer() == CurrentSimData.getPlayerPKMN()[0])
				{
					JOptionPane.showMessageDialog(contentPane, "This Pokemon is already in battle!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					CurrentSimData.setCurrentPokemonPlayer(0);
					setVisible(false);
					dispose();
				}
			}
		});
		//contentPane.add(btnPlayerSwitch1, "cell 0 0");
		
		JButton btnPlayerSwitch2 = new JButton("Pokemon2");
		btnPlayerSwitch2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CurrentSimData.getCurrentPokemonPlayer() == CurrentSimData.getPlayerPKMN()[1])
				{
					JOptionPane.showMessageDialog(contentPane, "This Pokemon is already in battle!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					CurrentSimData.setCurrentPokemonPlayer(1);
					setVisible(false);
					dispose();
				}
			}
		});
		//contentPane.add(btnPlayerSwitch2, "cell 0 1");
		
		JButton btnPlayerSwitch3 = new JButton("Pokemon3");
		btnPlayerSwitch3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CurrentSimData.getCurrentPokemonPlayer() == CurrentSimData.getPlayerPKMN()[2])
				{
					JOptionPane.showMessageDialog(contentPane, "This Pokemon is already in battle!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					CurrentSimData.setCurrentPokemonPlayer(2);
					setVisible(false);
					dispose();
				}
			}
		});
		//contentPane.add(btnPlayerSwitch3, "cell 0 2");
		
		JButton btnPlayerSwitch4 = new JButton("Pokemon4");
		btnPlayerSwitch4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CurrentSimData.getCurrentPokemonPlayer() == CurrentSimData.getPlayerPKMN()[3])
				{
					JOptionPane.showMessageDialog(contentPane, "This Pokemon is already in battle!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					CurrentSimData.setCurrentPokemonPlayer(3);
					setVisible(false);
					dispose();
				}
			}
		});
		//contentPane.add(btnPlayerSwitch4, "cell 0 3");
		
		JButton btnPlayerSwitch5 = new JButton("Pokemon5");
		btnPlayerSwitch5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CurrentSimData.getCurrentPokemonPlayer() == CurrentSimData.getPlayerPKMN()[4])
				{
					JOptionPane.showMessageDialog(contentPane, "This Pokemon is already in battle!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					CurrentSimData.setCurrentPokemonPlayer(4);
					setVisible(false);
					dispose();
				}
			}
		});
		//contentPane.add(btnPlayerSwitch5, "cell 0 4");
		
		JButton btnPlayerSwitch6 = new JButton("Pokemon6");
		btnPlayerSwitch6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CurrentSimData.getCurrentPokemonPlayer() == CurrentSimData.getPlayerPKMN()[5])
				{
					JOptionPane.showMessageDialog(contentPane, "This Pokemon is already in battle!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					CurrentSimData.setCurrentPokemonPlayer(5);
					setVisible(false);
					dispose();
				}
			}
		});
		//contentPane.add(btnPlayerSwitch6, "cell 0 5");
		
		JButton buttons[] = {btnPlayerSwitch1,
							 btnPlayerSwitch2,
							 btnPlayerSwitch3,
							 btnPlayerSwitch4,
							 btnPlayerSwitch5,
							 btnPlayerSwitch6,};
		
		int i = 0;
		while(i < 6)
		{
			int y = 0;
			if(CurrentSimData.getPlayerPKMN()[i] != null)
			{
				buttons[i].setText(CurrentSimData.getPlayerPKMN()[i].getName());
				contentPane.add(buttons[i], "cell 0 " + y);
				y++;
			}
			i++;
		}
	}

}
