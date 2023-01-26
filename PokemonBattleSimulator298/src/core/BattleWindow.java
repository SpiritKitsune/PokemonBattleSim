package core;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.BoxLayout;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

import movedata.None;
import movedata.Struggle;

import java.awt.Color;

import net.miginfocom.swing.MigLayout;

@SuppressWarnings("serial")
public class BattleWindow extends JFrame {

	static JPanel contentPane;
	
	private static JLabel lbloppMove1;
	
	private static JLabel lbloppMove2;
	
	private static JLabel lbloppMove3;
	
	private static JLabel lbloppMove4;

	private static JPanel panelPlayer;

	private static JPanel panelAttackMessages;

	private static JPanel panelOpponent;

	private static JLabel lbloppName;

	private static JLabel lbloppHP;

	private static JLabel lblPlayerPKMNName;

	private static JLabel lblPlayerHP;

	private static JButton btnMove1;

	private static JButton btnMove2;

	private static JButton btnMove3;

	private static JButton btnMove4;
	
	private static JLabel lblPlayerAttack;
	
	private static JLabel lblPlayerDefense;
	
	private static JLabel lblPlayerSpAttack;
	
	private static JLabel lblPlayerSpDefense;
	
	private static JLabel lblPlayerSpeed;
	
	private static JLabel lblPlayerAccuracy;
	
	private static JLabel lblPlayerEvasion;
	
	private static JPanel panelPlayerInfo;
	
	private static JPanel panelPlayerMoves;
	
	private static JLabel lblOpponentAttack;
	
	private static JLabel lblOpponentDefense;
	
	private static JLabel lblOpponentSpAttack;
	
	private static JLabel lblOpponentSpDefense;
	
	private static JLabel lblOpponentSpeed;
	
	private static JLabel lblOpponentAccuracy;
	
	private static JLabel lblOpponentEvasion;
	
	private static JPanel panelOpponentInfo;
	
	private static JPanel panelOpponentMoves;
	private JPanel panelPlayerStats;
	private JPanel panelOpponentStats;
	private JPanel panelPlayerTypes;
	private JPanel panelOpponentTypes;
	private JLabel lblMove1Details;
	private JLabel lblMove2Details;
	private JLabel lblMove3Details;
	private JLabel lblMove4Details;
	private JPanel panelPlayerMove1;
	private JPanel panelPlayerMove2;
	private JPanel panelPlayerMove3;
	private JPanel panelPlayerMove4;
	private JLabel lblPlayerMove1PP;
	private JLabel lblPlayerMove2PP;
	private JLabel lblPlayerMove3PP;
	private JLabel lblPlayerMove4PP;
	private final static JTextPane textPane = new JTextPane();
	
	private static JPanel panelSwitch = new JPanel();
	
	static StyledDocument battleText = textPane.getStyledDocument();
	private JScrollPane scrollPane;
	private static JLabel lblPlayerStatusNV;
	private static JLabel lblOpponentStatusNV;
	private JPanel panelPlayerNamespace;
	private JPanel panelOpponentNamespace;
	private JButton btnPlayerSwitch;
	
	BufferedImage image = null;
	private JPanel panelOpponentMove1;
	private JPanel panelOpponentMove2;
	private JPanel panelOpponentMove3;
	private JPanel panelOpponentMove4;

	private JLabel lblOpponentMove1Details;

	private JLabel lblOpponentMove1PP;

	private JLabel lblOpponentMove2Details;

	private JLabel lblOpponentMove2PP;

	private JLabel lblOpponentMove3Details;

	private JLabel lblOpponentMove3PP;

	private JLabel lblOpponentMove4Details;

	private JLabel lblOpponentMove4PP;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					BattleWindow frame = new BattleWindow();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws BadLocationException 
	 */
	public BattleWindow() throws IOException, BadLocationException 
	{
		setResizable(false);
		
		
		
		setMinimumSize(new Dimension(790, 480));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		try {
			image = ImageIO.read(BattleWindow.class.getResource("/BattleBG.png"));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		contentPane = new JPanel()
		{
			@Override
			protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(image, 0, 0, null);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		
		
		panelPlayer = new JPanel();
		panelPlayer.setBackground(new Color(240,240,240,123));
		contentPane.add(panelPlayer);
		
		panelAttackMessages = new JPanel();
		contentPane.add(panelAttackMessages);
		panelAttackMessages.setLayout(new BoxLayout(panelAttackMessages, BoxLayout.X_AXIS));
		
		scrollPane = new JScrollPane();
		panelAttackMessages.add(scrollPane);
		textPane.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(textPane);
		
		panelOpponent = new JPanel();
		panelOpponent.setBackground(new Color(240,240,240,123));
		contentPane.add(panelOpponent);
		panelOpponent.setLayout(new MigLayout("", "[258px]", "[150px][150px][150px]"));
		
		panelOpponentInfo = new JPanel();
		panelOpponentInfo.setOpaque(false);
		panelOpponent.add(panelOpponentInfo, "cell 0 0,grow");
		panelOpponentInfo.setLayout(new BoxLayout(panelOpponentInfo, BoxLayout.Y_AXIS));
		
		panelOpponentNamespace = new JPanel();
		panelOpponentNamespace.setOpaque(false);
		panelOpponentInfo.add(panelOpponentNamespace);
		panelOpponentNamespace.setLayout(new MigLayout("", "[][]", "[][]"));
		
		lbloppName = new JLabel(CurrentSimData.getCurrentPokemonOpponent().getName());
		panelOpponentNamespace.add(lbloppName, "cell 0 0");
		
		lbloppHP = new JLabel();
		panelOpponentNamespace.add(lbloppHP, "cell 0 1");
		lbloppHP.setText(CurrentSimData.getCurrentPokemonOpponent().getCurrentHP()
									+ "/"
									+ CurrentSimData.getCurrentPokemonOpponent().getHp());
		
		lblOpponentStatusNV = new JLabel("");
		panelOpponentNamespace.add(lblOpponentStatusNV, "cell 1 1");
		
		panelOpponentTypes = new JPanel();
		panelOpponentTypes.setOpaque(false);
		panelOpponentInfo.add(panelOpponentTypes);
		panelOpponentTypes.setLayout(new BoxLayout(panelOpponentTypes, BoxLayout.Y_AXIS));
		
		JLabel opponentType1 = new JLabel();
		BufferedImage imageOpponentType1 = null;
		try {
			imageOpponentType1 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonOpponent().getType1()+".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		opponentType1.setIcon(new ImageIcon(imageOpponentType1));
		panelOpponentTypes.add(opponentType1);
		
		JLabel opponentType2 = new JLabel();
		BufferedImage imageOpponentType2 = null;
		try {
			imageOpponentType2 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonOpponent().getType2()+".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		opponentType2.setIcon(new ImageIcon(imageOpponentType2));
		panelOpponentTypes.add(opponentType2);
		
		JLabel opponentPic = new JLabel();
		BufferedImage imageOpponent = null;
		try {
			imageOpponent = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonOpponent().getName().toLowerCase()+"1.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		opponentPic.setIcon(new ImageIcon(imageOpponent));
		panelOpponentInfo.add(opponentPic);
		
		panelOpponentStats = new JPanel();
		panelOpponentStats.setOpaque(false);
		panelOpponent.add(panelOpponentStats, "cell 0 1,grow");
		panelOpponentStats.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblOpponentAttack = new JLabel();
		panelOpponentStats.add(lblOpponentAttack);
		
		lblOpponentAttack.setText("Attack: " + CurrentSimData.getCurrentPokemonOpponent().getStageAttack());
		lblOpponentDefense = new JLabel();
		panelOpponentStats.add(lblOpponentDefense);
		lblOpponentDefense.setText("Defense: " + CurrentSimData.getCurrentPokemonOpponent().getStageDefense());
		lblOpponentSpAttack = new JLabel();
		panelOpponentStats.add(lblOpponentSpAttack);
		lblOpponentSpAttack.setText("Special Attack: " + CurrentSimData.getCurrentPokemonOpponent().getStageSpAttack());
		lblOpponentSpDefense = new JLabel();
		panelOpponentStats.add(lblOpponentSpDefense);
		lblOpponentSpDefense.setText("Special Defense: " + CurrentSimData.getCurrentPokemonOpponent().getStageSpDefense());
		lblOpponentSpeed = new JLabel();
		panelOpponentStats.add(lblOpponentSpeed);
		lblOpponentSpeed.setText("Speed: " + CurrentSimData.getCurrentPokemonOpponent().getStageSpeed());
		lblOpponentAccuracy = new JLabel();
		panelOpponentStats.add(lblOpponentAccuracy);
		lblOpponentAccuracy.setText("Accuracy: " + CurrentSimData.getCurrentPokemonOpponent().getStageAccuracy());
		lblOpponentEvasion = new JLabel();
		panelOpponentStats.add(lblOpponentEvasion);
		lblOpponentEvasion.setText("Evasion: " + CurrentSimData.getCurrentPokemonOpponent().getStageEvasion());
		
		panelOpponentMoves = new JPanel();
		panelOpponentMoves.setOpaque(false);
		panelOpponent.add(panelOpponentMoves, "cell 0 2,grow");
		panelOpponentMoves.setLayout(new GridLayout(4, 2, 0, 0));
		
		lbloppMove1 = new JLabel(CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(0).getName());
		panelOpponentMoves.add(lbloppMove1);
		
		panelOpponentMove1 = new JPanel();
		panelOpponentMove1.setOpaque(false);
		panelOpponentMoves.add(panelOpponentMove1);
		
		BufferedImage imageOpponentMove1 = null;
		try {
			imageOpponentMove1 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(0).getMoveType()+".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		lblOpponentMove1Details = new JLabel();
		lblOpponentMove1Details.setIcon(new ImageIcon(imageOpponentMove1));
		panelOpponentMove1.add(lblOpponentMove1Details);
		
		lblOpponentMove1PP = new JLabel(CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(0).getCurrentPP() + "/" + CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(0).getPp());
		panelOpponentMove1.add(lblOpponentMove1PP);
		
		lbloppMove2 = new JLabel(CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(1).getName());
		panelOpponentMoves.add(lbloppMove2);
		
		panelOpponentMove2 = new JPanel();
		panelOpponentMove2.setOpaque(false);
		panelOpponentMoves.add(panelOpponentMove2);
		
		BufferedImage imageOpponentMove2 = null;
		try {
			imageOpponentMove2 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(1).getMoveType()+".png"));
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		lblOpponentMove2Details = new JLabel();
		lblOpponentMove2Details.setIcon(new ImageIcon(imageOpponentMove2));
		panelOpponentMove2.add(lblOpponentMove2Details);
		
		lblOpponentMove2PP = new JLabel(CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(1).getCurrentPP() + "/" + CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(1).getPp());
		panelOpponentMove2.add(lblOpponentMove2PP);
		
		lbloppMove3 = new JLabel(CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(2).getName());
		panelOpponentMoves.add(lbloppMove3);
		
		panelOpponentMove3 = new JPanel();
		panelOpponentMove3.setOpaque(false);
		panelOpponentMoves.add(panelOpponentMove3);
		
		BufferedImage imageOpponentMove3 = null;
		try {
			imageOpponentMove3 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(2).getMoveType()+".png"));
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		lblOpponentMove3Details = new JLabel();
		lblOpponentMove3Details.setIcon(new ImageIcon(imageOpponentMove3));
		panelOpponentMove3.add(lblOpponentMove3Details);
		
		lblOpponentMove3PP = new JLabel(CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(2).getCurrentPP() + "/" + CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(2).getPp());
		panelOpponentMove3.add(lblOpponentMove3PP);
		
		lbloppMove4 = new JLabel(CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(3).getName());
		panelOpponentMoves.add(lbloppMove4);
		
		panelOpponentMove4 = new JPanel();
		panelOpponentMove4.setOpaque(false);
		panelOpponentMoves.add(panelOpponentMove4);
		
		BufferedImage imageOpponentMove4 = null;
		try {
			imageOpponentMove4 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(3).getMoveType()+".png"));
		} catch (IOException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		lblOpponentMove4Details = new JLabel();
		lblOpponentMove4Details.setIcon(new ImageIcon(imageOpponentMove4));
		panelOpponentMove4.add(lblOpponentMove4Details);
		
		lblOpponentMove4PP = new JLabel(CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(3).getCurrentPP() + "/" + CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(3).getPp());
		panelOpponentMove4.add(lblOpponentMove4PP);
		
		
		panelPlayer.setLayout(new MigLayout("", "[258px]", "[150px][150px][150px]"));
		
		panelPlayerInfo = new JPanel();
		panelPlayerInfo.setOpaque(false);
		panelPlayer.add(panelPlayerInfo, "cell 0 0,grow");
		
		//final ImageIcon testPic = new ImageIcon("skater-left.png");
		JLabel playerPic = new JLabel();
		BufferedImage image = null;
		try {
			image = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonPlayer().getName().toLowerCase()+"1.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		playerPic.setIcon(new ImageIcon(image));
		panelPlayerInfo.setLayout(new BoxLayout(panelPlayerInfo, BoxLayout.Y_AXIS));
		
		panelPlayerNamespace = new JPanel();
		panelPlayerNamespace.setOpaque(false);
		panelPlayerInfo.add(panelPlayerNamespace);
		panelPlayerNamespace.setLayout(new MigLayout("", "[55px][26px][1px][][][][][]", "[14px][]"));
		
		lblPlayerPKMNName = new JLabel(CurrentSimData.getCurrentPokemonPlayer().getName());
		panelPlayerNamespace.add(lblPlayerPKMNName, "cell 0 0,alignx left,aligny top");
		
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
					BattleWindow battleWindow = null;
					try {
						battleWindow = new BattleWindow();
					} catch (IOException | BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						battleText.insertString(battleText.getLength(), "\n"+CurrentSimData.getCurrentPokemonPlayer().getName()+" was switched in", null);
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					battleWindow.setVisible(true);
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
					BattleWindow battleWindow = null;
					try {
						battleWindow = new BattleWindow();
					} catch (IOException | BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						battleText.insertString(battleText.getLength(), "\n"+CurrentSimData.getCurrentPokemonPlayer().getName()+" was switched in", null);
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					battleWindow.setVisible(true);
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
					BattleWindow battleWindow = null;
					try {
						battleWindow = new BattleWindow();
					} catch (IOException | BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						battleText.insertString(battleText.getLength(), "\n"+CurrentSimData.getCurrentPokemonPlayer().getName()+" was switched in", null);
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					battleWindow.setVisible(true);
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
					BattleWindow battleWindow = null;
					try {
						battleWindow = new BattleWindow();
					} catch (IOException | BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						battleText.insertString(battleText.getLength(), "\n"+CurrentSimData.getCurrentPokemonPlayer().getName()+" was switched in", null);
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					battleWindow.setVisible(true);
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
					BattleWindow battleWindow = null;
					try {
						battleWindow = new BattleWindow();
					} catch (IOException | BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						battleText.insertString(battleText.getLength(), "\n"+CurrentSimData.getCurrentPokemonPlayer().getName()+" was switched in", null);
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					battleWindow.setVisible(true);
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
					BattleWindow battleWindow = null;
					try {
						battleWindow = new BattleWindow();
					} catch (IOException | BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						battleText.insertString(battleText.getLength(), "\n"+CurrentSimData.getCurrentPokemonPlayer().getName()+" was switched in", null);
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					battleWindow.setVisible(true);
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
		
		btnPlayerSwitch = new JButton("Switch Out");
		btnPlayerSwitch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panelSwitch.removeAll();
				int i = 0;
				while(i < 6)
				{
					int y = 0;
					if(CurrentSimData.getPlayerPKMN()[i] != null)
					{
						buttons[i].setText(CurrentSimData.getPlayerPKMN()[i].getName());
						panelSwitch.add(buttons[i], "cell 0 " + y);
						y++;
					}
					i++;
				}
				String[] options = {"Cancel"};
				JOptionPane.showOptionDialog((Component)contentPane, (Object)panelSwitch, "Switch Out", JOptionPane.NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);
				
				
				
			}
		});
		panelPlayerNamespace.add(btnPlayerSwitch, "cell 7 0");
		
		lblPlayerHP = new JLabel();
		panelPlayerNamespace.add(lblPlayerHP, "cell 0 1,alignx left,aligny top");
		lblPlayerHP.setText(CurrentSimData.getCurrentPokemonPlayer().getCurrentHP() 
										+ "/" 
										+ CurrentSimData.getCurrentPokemonPlayer().getHp());
		
		lblPlayerStatusNV = new JLabel("");
		panelPlayerNamespace.add(lblPlayerStatusNV, "cell 1 1,alignx left,aligny center");
		
		panelPlayerTypes = new JPanel();
		panelPlayerTypes.setOpaque(false);
		panelPlayerInfo.add(panelPlayerTypes);
		panelPlayerTypes.setLayout(new BoxLayout(panelPlayerTypes, BoxLayout.Y_AXIS));
		
		JLabel playerType1 = new JLabel();
		playerType1.setText("");
		BufferedImage imageType1 = null;
		try {
			imageType1 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonPlayer().getType1()+".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		playerType1.setIcon(new ImageIcon(imageType1));
		panelPlayerTypes.add(playerType1);
		
		JLabel playerType2 = new JLabel();
		playerType2.setText("");
		BufferedImage imageType2 = null;
		try {
			imageType2 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonPlayer().getType2()+".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		playerType2.setIcon(new ImageIcon(imageType2));
		panelPlayerTypes.add(playerType2);
		panelPlayerInfo.add(playerPic);
		
		panelPlayerStats = new JPanel();
		panelPlayerStats.setOpaque(false);
		panelPlayer.add(panelPlayerStats, "cell 0 1,grow");
		panelPlayerStats.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblPlayerAttack = new JLabel();
		panelPlayerStats.add(lblPlayerAttack);
		
		lblPlayerAttack.setText("Attack: " + CurrentSimData.getCurrentPokemonPlayer().getStageAttack());
		lblPlayerDefense = new JLabel();
		panelPlayerStats.add(lblPlayerDefense);
		lblPlayerDefense.setText("Defense: " + CurrentSimData.getCurrentPokemonPlayer().getStageDefense());
		lblPlayerSpAttack = new JLabel();
		panelPlayerStats.add(lblPlayerSpAttack);
		lblPlayerSpAttack.setText("Special Attack: " + CurrentSimData.getCurrentPokemonPlayer().getStageSpAttack());
		lblPlayerSpDefense = new JLabel();
		panelPlayerStats.add(lblPlayerSpDefense);
		lblPlayerSpDefense.setText("Special Defense: " + CurrentSimData.getCurrentPokemonPlayer().getStageSpDefense());
		lblPlayerSpeed = new JLabel();
		panelPlayerStats.add(lblPlayerSpeed);
		lblPlayerSpeed.setText("Speed: " + CurrentSimData.getCurrentPokemonPlayer().getStageSpeed());
		lblPlayerAccuracy = new JLabel();
		panelPlayerStats.add(lblPlayerAccuracy);
		lblPlayerAccuracy.setText("Accuracy: " + CurrentSimData.getCurrentPokemonPlayer().getStageAccuracy());
		lblPlayerEvasion = new JLabel();
		panelPlayerStats.add(lblPlayerEvasion);
		lblPlayerEvasion.setText("Evasion: " + CurrentSimData.getCurrentPokemonPlayer().getStageEvasion());
		
		panelPlayerMoves = new JPanel();
		panelPlayerMoves.setOpaque(false);
		panelPlayer.add(panelPlayerMoves, "cell 0 2,grow");
		panelPlayerMoves.setLayout(new GridLayout(4, 2, 0, 0));
		
		btnMove1 = new JButton(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(0).getName());
		btnMove1.setOpaque(false);
		btnMove1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(0) instanceof None))
				{
					Move playerMove = CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(0);
					if(struggleCheck(CurrentSimData.getCurrentPokemonPlayer()))
					{
						playerMove = new Struggle();
					}
					if(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(0).getCurrentPP() <= 0 && !(playerMove instanceof Struggle))
					{
						JOptionPane.showMessageDialog(contentPane, "Out of PP, please choose a different move", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						try {
							BattleHandler.runTurn(playerMove, opponentMoveSelector());
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						if(CurrentSimData.getCurrentPokemonPlayer().getForceMove() != null)
						{
							try {
								BattleHandler.runTurn(playerMove, opponentMoveSelector());
							} catch (BadLocationException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
					hpUpdate();
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Please select a valid move", "Error", JOptionPane.ERROR_MESSAGE);
				}
				lblPlayerMove1PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonPlayer(), 0));
				lblOpponentMove1PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 0));
				lblOpponentMove2PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 1));
				lblOpponentMove3PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 2));
				lblOpponentMove4PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 3));
				
				repaint();
				
				try {
					oppFaintCheck();
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			
		});
		panelPlayerMoves.add(btnMove1);
		
		btnMove2 = new JButton(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(1).getName());
		btnMove2.setOpaque(false);
		btnMove2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(1) instanceof None))
				{
					Move playerMove = CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(1);
					if(struggleCheck(CurrentSimData.getCurrentPokemonPlayer()))
					{
						playerMove = new Struggle();
					}
					if(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(1).getCurrentPP() <= 0 && !(playerMove instanceof Struggle))
					{
						JOptionPane.showMessageDialog(contentPane, "Out of PP, please choose a different move", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						try {
							BattleHandler.runTurn(playerMove, opponentMoveSelector());
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						if(CurrentSimData.getCurrentPokemonPlayer().getForceMove() != null)
						{
							try {
								BattleHandler.runTurn(playerMove, opponentMoveSelector());
							} catch (BadLocationException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
					hpUpdate();
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Please select a valid move", "Error", JOptionPane.ERROR_MESSAGE);
				}
				lblPlayerMove2PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonPlayer(), 1));
				lblOpponentMove1PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 0));
				lblOpponentMove2PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 1));
				lblOpponentMove3PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 2));
				lblOpponentMove4PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 3));
				repaint();
				
				try {
					oppFaintCheck();
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		panelPlayerMove1 = new JPanel();
		panelPlayerMove1.setOpaque(false);
		panelPlayerMoves.add(panelPlayerMove1);
		
		BufferedImage imageMove1 = null;
		try {
			imageMove1 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(0).getMoveType()+".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		lblMove1Details = new JLabel();
		lblMove1Details.setIcon(new ImageIcon(imageMove1));
		panelPlayerMove1.add(lblMove1Details);
		
		lblPlayerMove1PP = new JLabel(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(0).getCurrentPP() + "/" + CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(0).getPp());
		panelPlayerMove1.add(lblPlayerMove1PP);
		panelPlayerMoves.add(btnMove2);
		
		btnMove3 = new JButton(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(2).getName());
		btnMove3.setOpaque(false);
		btnMove3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(2) instanceof None))
				{
					Move playerMove = CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(2);
					if(struggleCheck(CurrentSimData.getCurrentPokemonPlayer()))
					{
						playerMove = new Struggle();
					}
					if(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(2).getCurrentPP() <= 0 && !(playerMove instanceof Struggle))
					{
						JOptionPane.showMessageDialog(contentPane, "Out of PP, please choose a different move", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						try {
							BattleHandler.runTurn(playerMove, opponentMoveSelector());
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						if(CurrentSimData.getCurrentPokemonPlayer().getForceMove() != null)
						{
							try {
								BattleHandler.runTurn(playerMove, opponentMoveSelector());
							} catch (BadLocationException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
					hpUpdate();
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Please select a valid move", "Error", JOptionPane.ERROR_MESSAGE);
				}
				lblPlayerMove3PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonPlayer(), 2));
				lblOpponentMove1PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 0));
				lblOpponentMove2PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 1));
				lblOpponentMove3PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 2));
				lblOpponentMove4PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 3));
				repaint();
				
				try {
					oppFaintCheck();
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		panelPlayerMove2 = new JPanel();
		panelPlayerMove2.setOpaque(false);
		panelPlayerMoves.add(panelPlayerMove2);
		
		BufferedImage imageMove2 = null;
		try {
			imageMove2 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(1).getMoveType()+".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		lblMove2Details = new JLabel();
		lblMove2Details.setIcon(new ImageIcon(imageMove2));
		panelPlayerMove2.add(lblMove2Details);
		
		lblPlayerMove2PP = new JLabel(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(1).getCurrentPP() + "/" + CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(1).getPp());
		panelPlayerMove2.add(lblPlayerMove2PP);
		panelPlayerMoves.add(btnMove3);
		
		btnMove4 = new JButton(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(3).getName());
		btnMove4.setOpaque(false);
		btnMove4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(3) instanceof None))
				{
					Move playerMove = CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(3);
					if(struggleCheck(CurrentSimData.getCurrentPokemonPlayer()))
					{
						playerMove = new Struggle();
					}
					if(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(3).getCurrentPP() <= 0 && !(playerMove instanceof Struggle))
					{
						JOptionPane.showMessageDialog(contentPane, "Out of PP, please choose a different move", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						try {
							BattleHandler.runTurn(playerMove, opponentMoveSelector());
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						if(CurrentSimData.getCurrentPokemonPlayer().getForceMove() != null)
						{
							try {
								BattleHandler.runTurn(playerMove, opponentMoveSelector());
							} catch (BadLocationException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
					hpUpdate();
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Please select a valid move", "Error", JOptionPane.ERROR_MESSAGE);
				}
				lblPlayerMove4PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonPlayer(), 3));
				lblOpponentMove1PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 0));
				lblOpponentMove2PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 1));
				lblOpponentMove3PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 2));
				lblOpponentMove4PP.setText(ppUpdater(CurrentSimData.getCurrentPokemonOpponent(), 3));
				repaint();
				try {
					oppFaintCheck();
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			

		});
		
		panelPlayerMove3 = new JPanel();
		panelPlayerMove3.setOpaque(false);
		panelPlayerMoves.add(panelPlayerMove3);
		
		BufferedImage imageMove3 = null;
		try {
			imageMove3 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(2).getMoveType()+".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		lblMove3Details = new JLabel();
		lblMove3Details.setIcon(new ImageIcon(imageMove3));
		panelPlayerMove3.add(lblMove3Details);
		
		lblPlayerMove3PP = new JLabel(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(2).getCurrentPP() + "/" + CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(2).getPp());
		panelPlayerMove3.add(lblPlayerMove3PP);
		panelPlayerMoves.add(btnMove4);
		
		panelPlayerMove4 = new JPanel();
		panelPlayerMove4.setOpaque(false);
		panelPlayerMoves.add(panelPlayerMove4);
		
		BufferedImage imageMove4 = null;
		try {
			imageMove4 = ImageIO.read(BattleWindow.class.getResource("/"+CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(3).getMoveType()+".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		lblMove4Details = new JLabel();
		lblMove4Details.setIcon(new ImageIcon(imageMove4));
		panelPlayerMove4.add(lblMove4Details);
		
		lblPlayerMove4PP = new JLabel(CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(3).getCurrentPP() + "/" + CurrentSimData.getCurrentPokemonPlayer().getMoveFromPokemon(3).getPp());
		panelPlayerMove4.add(lblPlayerMove4PP);
		
		
	}

	private void oppFaintCheck() throws BadLocationException {
		if(CurrentSimData.getCurrentPokemonOpponent().getStatusNonVolatile() == Status.FAINT)
		{
			int i = 0;
			int r = 0;
			while(i<6)
			{
				if(CurrentSimData.getOpponentPKMN()[i] != null)
				{
					if(CurrentSimData.getOpponentPKMN()[i].getStatusNonVolatile() != Status.FAINT)
					{
						r++;
					}
				}
				i++;
			}
			int rand = 0;
			if(r > 0)
			{
				while(true)
				{
					rand = ThreadLocalRandom.current().nextInt(6);
					if(CurrentSimData.getOpponentPKMN()[rand] != null && CurrentSimData.getOpponentPKMN()[rand] != CurrentSimData.getCurrentPokemonOpponent() && CurrentSimData.getOpponentPKMN()[rand].getStatusNonVolatile() != Status.FAINT)
					{
						break;
					}
				}
				
				CurrentSimData.setCurrentPokemonOpponent(rand);
				BattleWindow battleWindow = null;
				try {
					battleWindow = new BattleWindow();
				} catch (IOException | BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				battleText.insertString(battleText.getLength(), "\n"+CurrentSimData.getCurrentPokemonOpponent().getName()+" was switched in", null);
				battleWindow.setVisible(true);
				setVisible(false);
				dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(contentPane, "Opponent is out of usable Pokemon!");
			}
		}
	}
	
	private boolean struggleCheck(Pokemon pkmn)
	{
		int i = 0;
		while(i < 4)
		{
			if(pkmn.getMoveFromPokemon(i).getCurrentPP() > 0)
			{
				break;
			}
			else
			{
				i++;
			}
		}
		if(i == 4)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	protected String ppUpdater(Pokemon pkmn, int i) 
	{
		return pkmn.getMoveFromPokemon(i).getCurrentPP() + "/" + pkmn.getMoveFromPokemon(i).getPp();
	}

	private void hpUpdate() {
		lblPlayerHP.setText(CurrentSimData.getCurrentPokemonPlayer().getCurrentHP() 
				+ "/" 
				+ CurrentSimData.getCurrentPokemonPlayer().getHp());
		lbloppHP.setText(CurrentSimData.getCurrentPokemonOpponent().getCurrentHP()
				+ "/"
				+ CurrentSimData.getCurrentPokemonOpponent().getHp());
	}
	
	private Move opponentMoveSelector() 
	{
		if(struggleCheck(CurrentSimData.getCurrentPokemonOpponent()))
		{
			return new Struggle();
		}
		else
		{
			boolean ok = false;
			int i = 0;
			while(i < 4)
			{
				if(!(CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(i) instanceof None))
				{
					ok = true;
					break;
				}
				else
				{
					i++;
				}
			}
			if(ok)
			{
				int opponentMove = 0;
				while(true)
				{
					opponentMove = ThreadLocalRandom.current().nextInt(3);
					if(!(CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(opponentMove) instanceof None))
					{
						if(CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(i).getCurrentPP() > 0)
						{
							break;
						}
					}
				}
				return CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(opponentMove);
			}
			else
			{
				return CurrentSimData.getCurrentPokemonOpponent().getMoveFromPokemon(0);
			}
		}
	}


	public static JLabel getLbloppMove1() {
		return lbloppMove1;
	}


	public static void setLbloppMove1(JLabel lbloppMove1) {
		BattleWindow.lbloppMove1 = lbloppMove1;
	}


	public static JLabel getLbloppMove2() {
		return lbloppMove2;
	}


	public static void setLbloppMove2(JLabel lbloppMove2) {
		BattleWindow.lbloppMove2 = lbloppMove2;
	}


	public static JLabel getLbloppMove3() {
		return lbloppMove3;
	}


	public static void setLbloppMove3(JLabel lbloppMove3) {
		BattleWindow.lbloppMove3 = lbloppMove3;
	}


	public static JLabel getLbloppMove4() {
		return lbloppMove4;
	}


	public static void setLbloppMove4(JLabel lbloppMove4) {
		BattleWindow.lbloppMove4 = lbloppMove4;
	}


	public static JPanel getPanelPlayer() {
		return panelPlayer;
	}


	public static void setPanelPlayer(JPanel panelPlayer) {
		BattleWindow.panelPlayer = panelPlayer;
	}


	public static JPanel getPanelAttackMessages() {
		return panelAttackMessages;
	}


	public static void setPanelAttackMessages(JPanel panelAttackMessages) {
		BattleWindow.panelAttackMessages = panelAttackMessages;
	}


	public static JPanel getPanelOpponent() {
		return panelOpponent;
	}


	public static void setPanelOpponent(JPanel panelOpponent) {
		BattleWindow.panelOpponent = panelOpponent;
	}


	public static JLabel getLbloppName() {
		return lbloppName;
	}


	public static void setLbloppName(JLabel lbloppName) {
		BattleWindow.lbloppName = lbloppName;
	}


	public static JLabel getLbloppHP() {
		return lbloppHP;
	}


	public static void setLbloppHP(JLabel lbloppHP) {
		BattleWindow.lbloppHP = lbloppHP;
	}


	public static JLabel getLblPlayerPKMNName() {
		return lblPlayerPKMNName;
	}


	public static void setLblPlayerPKMNName(JLabel lblPlayerPKMNName) {
		BattleWindow.lblPlayerPKMNName = lblPlayerPKMNName;
	}


	public static JLabel getLblPlayerHP() {
		return lblPlayerHP;
	}


	public static void setLblPlayerHP(JLabel lblPlayerHP) {
		BattleWindow.lblPlayerHP = lblPlayerHP;
	}


	public static JButton getBtnMove1() {
		return btnMove1;
	}


	public static void setBtnMove1(JButton btnMove1) {
		BattleWindow.btnMove1 = btnMove1;
	}


	public static JButton getBtnMove2() {
		return btnMove2;
	}


	public static void setBtnMove2(JButton btnMove2) {
		BattleWindow.btnMove2 = btnMove2;
	}


	public static JButton getBtnMove3() {
		return btnMove3;
	}


	public static void setBtnMove3(JButton btnMove3) {
		BattleWindow.btnMove3 = btnMove3;
	}


	public static JButton getBtnMove4() {
		return btnMove4;
	}


	public static void setBtnMove4(JButton btnMove4) {
		BattleWindow.btnMove4 = btnMove4;
	}


	public static JLabel getLblPlayerAttack() {
		return lblPlayerAttack;
	}


	public static void setLblPlayerAttack(JLabel lblPlayerAttack) {
		BattleWindow.lblPlayerAttack = lblPlayerAttack;
	}


	public static JLabel getLblPlayerDefense() {
		return lblPlayerDefense;
	}


	public static void setLblPlayerDefense(JLabel lblPlayerDefense) {
		BattleWindow.lblPlayerDefense = lblPlayerDefense;
	}


	public static JLabel getLblPlayerSpAttack() {
		return lblPlayerSpAttack;
	}


	public static void setLblPlayerSpAttack(JLabel lblPlayerSpAttack) {
		BattleWindow.lblPlayerSpAttack = lblPlayerSpAttack;
	}


	public static JLabel getLblPlayerSpDefense() {
		return lblPlayerSpDefense;
	}


	public static void setLblPlayerSpDefense(JLabel lblPlayerSpDefense) {
		BattleWindow.lblPlayerSpDefense = lblPlayerSpDefense;
	}


	public static JLabel getLblPlayerSpeed() {
		return lblPlayerSpeed;
	}


	public static void setLblPlayerSpeed(JLabel lblPlayerSpeed) {
		BattleWindow.lblPlayerSpeed = lblPlayerSpeed;
	}


	public static JLabel getLblPlayerAccuracy() {
		return lblPlayerAccuracy;
	}


	public static void setLblPlayerAccuracy(JLabel lblPlayerAccuracy) {
		BattleWindow.lblPlayerAccuracy = lblPlayerAccuracy;
	}


	public static JLabel getLblPlayerEvasion() {
		return lblPlayerEvasion;
	}


	public static void setLblPlayerEvasion(JLabel lblPlayerEvasion) {
		BattleWindow.lblPlayerEvasion = lblPlayerEvasion;
	}


	public static JPanel getPanelPlayerInfo() {
		return panelPlayerInfo;
	}


	public static void setPanelPlayerInfo(JPanel panelPlayerInfo) {
		BattleWindow.panelPlayerInfo = panelPlayerInfo;
	}


	public static JPanel getPanelPlayerMoves() {
		return panelPlayerMoves;
	}


	public static void setPanelPlayerMoves(JPanel panelPlayerMoves) {
		BattleWindow.panelPlayerMoves = panelPlayerMoves;
	}


	public static JLabel getLblOpponentAttack() {
		return lblOpponentAttack;
	}


	public static void setLblOpponentAttack(JLabel lblOpponentAttack) {
		BattleWindow.lblOpponentAttack = lblOpponentAttack;
	}


	public static JLabel getLblOpponentDefense() {
		return lblOpponentDefense;
	}


	public static void setLblOpponentDefense(JLabel lblOpponentDefense) {
		BattleWindow.lblOpponentDefense = lblOpponentDefense;
	}


	public static JLabel getLblOpponentSpAttack() {
		return lblOpponentSpAttack;
	}


	public static void setLblOpponentSpAttack(JLabel lblOpponentSpAttack) {
		BattleWindow.lblOpponentSpAttack = lblOpponentSpAttack;
	}


	public static JLabel getLblOpponentSpDefense() {
		return lblOpponentSpDefense;
	}


	public static void setLblOpponentSpDefense(JLabel lblOpponentSpDefense) {
		BattleWindow.lblOpponentSpDefense = lblOpponentSpDefense;
	}


	public static JLabel getLblOpponentSpeed() {
		return lblOpponentSpeed;
	}


	public static void setLblOpponentSpeed(JLabel lblOpponentSpeed) {
		BattleWindow.lblOpponentSpeed = lblOpponentSpeed;
	}


	public static JLabel getLblOpponentAccuracy() {
		return lblOpponentAccuracy;
	}


	public static void setLblOpponentAccuracy(JLabel lblOpponentAccuracy) {
		BattleWindow.lblOpponentAccuracy = lblOpponentAccuracy;
	}


	public static JLabel getLblOpponentEvasion() {
		return lblOpponentEvasion;
	}


	public static void setLblOpponentEvasion(JLabel lblOpponentEvasion) {
		BattleWindow.lblOpponentEvasion = lblOpponentEvasion;
	}


	public static JPanel getPanelOpponentInfo() {
		return panelOpponentInfo;
	}


	public static void setPanelOpponentInfo(JPanel panelOpponentInfo) {
		BattleWindow.panelOpponentInfo = panelOpponentInfo;
	}


	public static JPanel getPanelOpponentMoves() {
		return panelOpponentMoves;
	}


	public static void setPanelOpponentMoves(JPanel panelOpponentMoves) {
		BattleWindow.panelOpponentMoves = panelOpponentMoves;
	}

	public static JLabel getLblPlayerStatusNV() {
		return lblPlayerStatusNV;
	}

	public static void setLblPlayerStatusNV(JLabel lblPlayerStatusNV) {
		BattleWindow.lblPlayerStatusNV = lblPlayerStatusNV;
	}

	public static JLabel getLblOpponentStatusNV() {
		return lblOpponentStatusNV;
	}

	public static void setLblOpponentStatusNV(JLabel lblOpponentStatusNV) {
		BattleWindow.lblOpponentStatusNV = lblOpponentStatusNV;
	}

	

}
