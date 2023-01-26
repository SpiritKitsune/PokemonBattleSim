package core;
import movedata.*;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JRadioButton;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.BadLocationException;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JMenuBar;

import net.miginfocom.swing.MigLayout;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.SpinnerListModel;

@SuppressWarnings("serial")
public class SetupWindow extends JFrame {

	private static int playerLastOpen = 0;
	
	private static int opponentLastOpen = 0;
	
	private static JPanel contentPane;
	
	static int playerEVtotalP1 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerMovesP1 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerSelectedMovesP1 = new JList();
	
	private JLabel lblPlayerMoveTypeIconP1;
	
	private Move playerMovesP1[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerPlayerAttackIVP1;

	private static JSpinner spinnerPlayerDefenseIVP1;

	private static JSpinner spinnerPlayerSpAttackIVP1;

	private static JSpinner spinnerPlayerSpDefenseIVP1;

	private static JSpinner spinnerPlayerSpeedIVP1;

	private static JSpinner spinnerPlayerHPEVP1;

	private static JSpinner spinnerPlayerHPIVP1;

	private static JSpinner spinnerPlayerAttackEVP1;

	private static JSpinner spinnerPlayerDefenseEVP1;

	private static JSpinner spinnerPlayerSpAttackEVP1;

	private static JSpinner spinnerPlayerSpDefenseEVP1;

	private static JSpinner spinnerPlayerSpeedEVP1;

	private static JSpinner spinnerPlayerLevelP1;

	private static JLabel lblPlayerHPP1;

	private static JLabel lblPlayerAttackP1;

	private static JLabel lblPlayerDefenseP1;

	private static JLabel lblPlayerSpAttackP1;

	private static JLabel lblPlayerSpDefenseP1;

	private static JLabel lblPlayerSpeedP1;

	private static JLabel lblPlayerHPCalcP1;

	private static JLabel lblPlayerAttackCalcP1;

	private static JLabel lblPlayerDefenseCalcP1;

	private static JLabel lblPlayerSpAttackCalcP1;

	private static JLabel lblPlayerSpDefenseCalcP1;

	private static JLabel lblPlayerSpeedCalcP1;
	private final ButtonGroup playerGenderGroupP1 = new ButtonGroup();
	private static JLabel lblPlayerEVsAvailableP1;

	@SuppressWarnings("rawtypes")
	private static JList listPlayerPokemonP1;

	private static JSpinner spinnerPlayerNatureP1;

	private static JRadioButton rdbtnPlayerMaleP1;

	private static JRadioButton rdbtnPlayerFemaleP1;

	private static JRadioButton rdbtnPlayerGenderlessP1;

	private static String selectedPlayerMovesP1[];
	private JPanel panelPlayerP1;
	
	/*
	 * 
	 * 
	 */
	
	static int playerEVtotalP2 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerMovesP2 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerSelectedMovesP2 = new JList();
	
	private JLabel lblPlayerMoveTypeIconP2;
	
	private Move playerMovesP2[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerPlayerAttackIVP2;

	private static JSpinner spinnerPlayerDefenseIVP2;

	private static JSpinner spinnerPlayerSpAttackIVP2;

	private static JSpinner spinnerPlayerSpDefenseIVP2;

	private static JSpinner spinnerPlayerSpeedIVP2;

	private static JSpinner spinnerPlayerHPEVP2;

	private static JSpinner spinnerPlayerHPIVP2;

	private static JSpinner spinnerPlayerAttackEVP2;

	private static JSpinner spinnerPlayerDefenseEVP2;

	private static JSpinner spinnerPlayerSpAttackEVP2;

	private static JSpinner spinnerPlayerSpDefenseEVP2;

	private static JSpinner spinnerPlayerSpeedEVP2;

	private static JSpinner spinnerPlayerLevelP2;

	private static JLabel lblPlayerHPP2;

	private static JLabel lblPlayerAttackP2;

	private static JLabel lblPlayerDefenseP2;

	private static JLabel lblPlayerSpAttackP2;

	private static JLabel lblPlayerSpDefenseP2;

	private static JLabel lblPlayerSpeedP2;

	private static JLabel lblPlayerHPCalcP2;

	private static JLabel lblPlayerAttackCalcP2;

	private static JLabel lblPlayerDefenseCalcP2;

	private static JLabel lblPlayerSpAttackCalcP2;

	private static JLabel lblPlayerSpDefenseCalcP2;

	private static JLabel lblPlayerSpeedCalcP2;
	private final ButtonGroup playerGenderGroupP2 = new ButtonGroup();
	private static JLabel lblPlayerEVsAvailableP2;

	@SuppressWarnings("rawtypes")
	private static JList listPlayerPokemonP2;

	private static JSpinner spinnerPlayerNatureP2;

	private static JRadioButton rdbtnPlayerMaleP2;

	private static JRadioButton rdbtnPlayerFemaleP2;

	private static JRadioButton rdbtnPlayerGenderlessP2;

	private static String selectedPlayerMovesP2[];
	private JPanel panelPlayerP2;
	
	/*
	 * 
	 * 
	 */
	
	static int playerEVtotalP3 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerMovesP3 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerSelectedMovesP3 = new JList();
	
	private JLabel lblPlayerMoveTypeIconP3;
	
	private Move playerMovesP3[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerPlayerAttackIVP3;

	private static JSpinner spinnerPlayerDefenseIVP3;

	private static JSpinner spinnerPlayerSpAttackIVP3;

	private static JSpinner spinnerPlayerSpDefenseIVP3;

	private static JSpinner spinnerPlayerSpeedIVP3;

	private static JSpinner spinnerPlayerHPEVP3;

	private static JSpinner spinnerPlayerHPIVP3;

	private static JSpinner spinnerPlayerAttackEVP3;

	private static JSpinner spinnerPlayerDefenseEVP3;

	private static JSpinner spinnerPlayerSpAttackEVP3;

	private static JSpinner spinnerPlayerSpDefenseEVP3;

	private static JSpinner spinnerPlayerSpeedEVP3;

	private static JSpinner spinnerPlayerLevelP3;

	private static JLabel lblPlayerHPP3;

	private static JLabel lblPlayerAttackP3;

	private static JLabel lblPlayerDefenseP3;

	private static JLabel lblPlayerSpAttackP3;

	private static JLabel lblPlayerSpDefenseP3;

	private static JLabel lblPlayerSpeedP3;

	private static JLabel lblPlayerHPCalcP3;

	private static JLabel lblPlayerAttackCalcP3;

	private static JLabel lblPlayerDefenseCalcP3;

	private static JLabel lblPlayerSpAttackCalcP3;

	private static JLabel lblPlayerSpDefenseCalcP3;

	private static JLabel lblPlayerSpeedCalcP3;
	private final ButtonGroup playerGenderGroupP3 = new ButtonGroup();
	private static JLabel lblPlayerEVsAvailableP3;

	@SuppressWarnings("rawtypes")
	private static JList listPlayerPokemonP3;

	private static JSpinner spinnerPlayerNatureP3;

	private static JRadioButton rdbtnPlayerMaleP3;

	private static JRadioButton rdbtnPlayerFemaleP3;

	private static JRadioButton rdbtnPlayerGenderlessP3;

	private static String selectedPlayerMovesP3[];
	private JPanel panelPlayerP3;
	
	/*
	 * 
	 * 
	 */
	
	static int playerEVtotalP4 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerMovesP4 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerSelectedMovesP4 = new JList();
	
	private JLabel lblPlayerMoveTypeIconP4;
	
	private Move playerMovesP4[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerPlayerAttackIVP4;

	private static JSpinner spinnerPlayerDefenseIVP4;

	private static JSpinner spinnerPlayerSpAttackIVP4;

	private static JSpinner spinnerPlayerSpDefenseIVP4;

	private static JSpinner spinnerPlayerSpeedIVP4;

	private static JSpinner spinnerPlayerHPEVP4;

	private static JSpinner spinnerPlayerHPIVP4;

	private static JSpinner spinnerPlayerAttackEVP4;

	private static JSpinner spinnerPlayerDefenseEVP4;

	private static JSpinner spinnerPlayerSpAttackEVP4;

	private static JSpinner spinnerPlayerSpDefenseEVP4;

	private static JSpinner spinnerPlayerSpeedEVP4;

	private static JSpinner spinnerPlayerLevelP4;

	private static JLabel lblPlayerHPP4;

	private static JLabel lblPlayerAttackP4;

	private static JLabel lblPlayerDefenseP4;

	private static JLabel lblPlayerSpAttackP4;

	private static JLabel lblPlayerSpDefenseP4;

	private static JLabel lblPlayerSpeedP4;

	private static JLabel lblPlayerHPCalcP4;

	private static JLabel lblPlayerAttackCalcP4;

	private static JLabel lblPlayerDefenseCalcP4;

	private static JLabel lblPlayerSpAttackCalcP4;

	private static JLabel lblPlayerSpDefenseCalcP4;

	private static JLabel lblPlayerSpeedCalcP4;
	private final ButtonGroup playerGenderGroupP4 = new ButtonGroup();
	private static JLabel lblPlayerEVsAvailableP4;

	@SuppressWarnings("rawtypes")
	private static JList listPlayerPokemonP4;

	private static JSpinner spinnerPlayerNatureP4;

	private static JRadioButton rdbtnPlayerMaleP4;

	private static JRadioButton rdbtnPlayerFemaleP4;

	private static JRadioButton rdbtnPlayerGenderlessP4;

	private static String selectedPlayerMovesP4[];
	private JPanel panelPlayerP4;
	
	/*
	 * 
	 * 
	 */
	
	static int playerEVtotalP5 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerMovesP5 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerSelectedMovesP5 = new JList();
	
	private JLabel lblPlayerMoveTypeIconP5;
	
	private Move playerMovesP5[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerPlayerAttackIVP5;

	private static JSpinner spinnerPlayerDefenseIVP5;

	private static JSpinner spinnerPlayerSpAttackIVP5;

	private static JSpinner spinnerPlayerSpDefenseIVP5;

	private static JSpinner spinnerPlayerSpeedIVP5;

	private static JSpinner spinnerPlayerHPEVP5;

	private static JSpinner spinnerPlayerHPIVP5;

	private static JSpinner spinnerPlayerAttackEVP5;

	private static JSpinner spinnerPlayerDefenseEVP5;

	private static JSpinner spinnerPlayerSpAttackEVP5;

	private static JSpinner spinnerPlayerSpDefenseEVP5;

	private static JSpinner spinnerPlayerSpeedEVP5;

	private static JSpinner spinnerPlayerLevelP5;

	private static JLabel lblPlayerHPP5;

	private static JLabel lblPlayerAttackP5;

	private static JLabel lblPlayerDefenseP5;

	private static JLabel lblPlayerSpAttackP5;

	private static JLabel lblPlayerSpDefenseP5;

	private static JLabel lblPlayerSpeedP5;

	private static JLabel lblPlayerHPCalcP5;

	private static JLabel lblPlayerAttackCalcP5;

	private static JLabel lblPlayerDefenseCalcP5;

	private static JLabel lblPlayerSpAttackCalcP5;

	private static JLabel lblPlayerSpDefenseCalcP5;

	private static JLabel lblPlayerSpeedCalcP5;
	private final ButtonGroup playerGenderGroupP5 = new ButtonGroup();
	private static JLabel lblPlayerEVsAvailableP5;

	@SuppressWarnings("rawtypes")
	private static JList listPlayerPokemonP5;

	private static JSpinner spinnerPlayerNatureP5;

	private static JRadioButton rdbtnPlayerMaleP5;

	private static JRadioButton rdbtnPlayerFemaleP5;

	private static JRadioButton rdbtnPlayerGenderlessP5;

	private static String selectedPlayerMovesP5[];
	private JPanel panelPlayerP5;
	
	/*
	 * 
	 * 
	 */
	
	static int playerEVtotalP6 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerMovesP6 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listPlayerSelectedMovesP6 = new JList();
	
	private JLabel lblPlayerMoveTypeIconP6;
	
	private Move playerMovesP6[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerPlayerAttackIVP6;

	private static JSpinner spinnerPlayerDefenseIVP6;

	private static JSpinner spinnerPlayerSpAttackIVP6;

	private static JSpinner spinnerPlayerSpDefenseIVP6;

	private static JSpinner spinnerPlayerSpeedIVP6;

	private static JSpinner spinnerPlayerHPEVP6;

	private static JSpinner spinnerPlayerHPIVP6;

	private static JSpinner spinnerPlayerAttackEVP6;

	private static JSpinner spinnerPlayerDefenseEVP6;

	private static JSpinner spinnerPlayerSpAttackEVP6;

	private static JSpinner spinnerPlayerSpDefenseEVP6;

	private static JSpinner spinnerPlayerSpeedEVP6;

	private static JSpinner spinnerPlayerLevelP6;

	private static JLabel lblPlayerHPP6;

	private static JLabel lblPlayerAttackP6;

	private static JLabel lblPlayerDefenseP6;

	private static JLabel lblPlayerSpAttackP6;

	private static JLabel lblPlayerSpDefenseP6;

	private static JLabel lblPlayerSpeedP6;

	private static JLabel lblPlayerHPCalcP6;

	private static JLabel lblPlayerAttackCalcP6;

	private static JLabel lblPlayerDefenseCalcP6;

	private static JLabel lblPlayerSpAttackCalcP6;

	private static JLabel lblPlayerSpDefenseCalcP6;

	private static JLabel lblPlayerSpeedCalcP6;
	private final ButtonGroup playerGenderGroupP6 = new ButtonGroup();
	private static JLabel lblPlayerEVsAvailableP6;

	@SuppressWarnings("rawtypes")
	private static JList listPlayerPokemonP6;

	private static JSpinner spinnerPlayerNatureP6;

	private static JRadioButton rdbtnPlayerMaleP6;

	private static JRadioButton rdbtnPlayerFemaleP6;

	private static JRadioButton rdbtnPlayerGenderlessP6;

	private static String selectedPlayerMovesP6[];
	private JPanel panelPlayerP6;
	
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	
	static int opponentEVtotalP1 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentMovesP1 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentSelectedMovesP1 = new JList();
	
	private JLabel lblOpponentMoveTypeIconP1;
	
	private Move opponentMovesP1[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerOpponentAttackIVP1;

	private static JSpinner spinnerOpponentDefenseIVP1;

	private static JSpinner spinnerOpponentSpAttackIVP1;

	private static JSpinner spinnerOpponentSpDefenseIVP1;

	private static JSpinner spinnerOpponentSpeedIVP1;

	private static JSpinner spinnerOpponentHPEVP1;

	private static JSpinner spinnerOpponentHPIVP1;

	private static JSpinner spinnerOpponentAttackEVP1;

	private static JSpinner spinnerOpponentDefenseEVP1;

	private static JSpinner spinnerOpponentSpAttackEVP1;

	private static JSpinner spinnerOpponentSpDefenseEVP1;

	private static JSpinner spinnerOpponentSpeedEVP1;

	private static JSpinner spinnerOpponentLevelP1;

	private static JLabel lblOpponentHPP1;

	private static JLabel lblOpponentAttackP1;

	private static JLabel lblOpponentDefenseP1;

	private static JLabel lblOpponentSpAttackP1;

	private static JLabel lblOpponentSpDefenseP1;

	private static JLabel lblOpponentSpeedP1;

	private static JLabel lblOpponentHPCalcP1;

	private static JLabel lblOpponentAttackCalcP1;

	private static JLabel lblOpponentDefenseCalcP1;

	private static JLabel lblOpponentSpAttackCalcP1;

	private static JLabel lblOpponentSpDefenseCalcP1;

	private static JLabel lblOpponentSpeedCalcP1;
	private final ButtonGroup opponentGenderGroupP1 = new ButtonGroup();
	private static JLabel lblOpponentEVsAvailableP1;

	@SuppressWarnings("rawtypes")
	private static JList listOpponentPokemonP1;

	private static JSpinner spinnerOpponentNatureP1;

	private static JRadioButton rdbtnOpponentMaleP1;

	private static JRadioButton rdbtnOpponentFemaleP1;

	private static JRadioButton rdbtnOpponentGenderlessP1;

	private static String selectedOpponentMovesP1[];
	private JPanel panelOpponentP1;
	
	/*
	 * 
	 * 
	 */
	
	static int opponentEVtotalP2 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentMovesP2 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentSelectedMovesP2 = new JList();
	
	private JLabel lblOpponentMoveTypeIconP2;
	
	private Move opponentMovesP2[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerOpponentAttackIVP2;

	private static JSpinner spinnerOpponentDefenseIVP2;

	private static JSpinner spinnerOpponentSpAttackIVP2;

	private static JSpinner spinnerOpponentSpDefenseIVP2;

	private static JSpinner spinnerOpponentSpeedIVP2;

	private static JSpinner spinnerOpponentHPEVP2;

	private static JSpinner spinnerOpponentHPIVP2;

	private static JSpinner spinnerOpponentAttackEVP2;

	private static JSpinner spinnerOpponentDefenseEVP2;

	private static JSpinner spinnerOpponentSpAttackEVP2;

	private static JSpinner spinnerOpponentSpDefenseEVP2;

	private static JSpinner spinnerOpponentSpeedEVP2;

	private static JSpinner spinnerOpponentLevelP2;

	private static JLabel lblOpponentHPP2;

	private static JLabel lblOpponentAttackP2;

	private static JLabel lblOpponentDefenseP2;

	private static JLabel lblOpponentSpAttackP2;

	private static JLabel lblOpponentSpDefenseP2;

	private static JLabel lblOpponentSpeedP2;

	private static JLabel lblOpponentHPCalcP2;

	private static JLabel lblOpponentAttackCalcP2;

	private static JLabel lblOpponentDefenseCalcP2;

	private static JLabel lblOpponentSpAttackCalcP2;

	private static JLabel lblOpponentSpDefenseCalcP2;

	private static JLabel lblOpponentSpeedCalcP2;
	private final ButtonGroup opponentGenderGroupP2 = new ButtonGroup();
	private static JLabel lblOpponentEVsAvailableP2;

	@SuppressWarnings("rawtypes")
	private static JList listOpponentPokemonP2;

	private static JSpinner spinnerOpponentNatureP2;

	private static JRadioButton rdbtnOpponentMaleP2;

	private static JRadioButton rdbtnOpponentFemaleP2;

	private static JRadioButton rdbtnOpponentGenderlessP2;

	private static String selectedOpponentMovesP2[];
	private JPanel panelOpponentP2;
	
	/*
	 * 
	 * 
	 */
	
	static int opponentEVtotalP3 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentMovesP3 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentSelectedMovesP3 = new JList();
	
	private JLabel lblOpponentMoveTypeIconP3;
	
	private Move opponentMovesP3[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerOpponentAttackIVP3;

	private static JSpinner spinnerOpponentDefenseIVP3;

	private static JSpinner spinnerOpponentSpAttackIVP3;

	private static JSpinner spinnerOpponentSpDefenseIVP3;

	private static JSpinner spinnerOpponentSpeedIVP3;

	private static JSpinner spinnerOpponentHPEVP3;

	private static JSpinner spinnerOpponentHPIVP3;

	private static JSpinner spinnerOpponentAttackEVP3;

	private static JSpinner spinnerOpponentDefenseEVP3;

	private static JSpinner spinnerOpponentSpAttackEVP3;

	private static JSpinner spinnerOpponentSpDefenseEVP3;

	private static JSpinner spinnerOpponentSpeedEVP3;

	private static JSpinner spinnerOpponentLevelP3;

	private static JLabel lblOpponentHPP3;

	private static JLabel lblOpponentAttackP3;

	private static JLabel lblOpponentDefenseP3;

	private static JLabel lblOpponentSpAttackP3;

	private static JLabel lblOpponentSpDefenseP3;

	private static JLabel lblOpponentSpeedP3;

	private static JLabel lblOpponentHPCalcP3;

	private static JLabel lblOpponentAttackCalcP3;

	private static JLabel lblOpponentDefenseCalcP3;

	private static JLabel lblOpponentSpAttackCalcP3;

	private static JLabel lblOpponentSpDefenseCalcP3;

	private static JLabel lblOpponentSpeedCalcP3;
	private final ButtonGroup opponentGenderGroupP3 = new ButtonGroup();
	private static JLabel lblOpponentEVsAvailableP3;

	@SuppressWarnings("rawtypes")
	private static JList listOpponentPokemonP3;

	private static JSpinner spinnerOpponentNatureP3;

	private static JRadioButton rdbtnOpponentMaleP3;

	private static JRadioButton rdbtnOpponentFemaleP3;

	private static JRadioButton rdbtnOpponentGenderlessP3;

	private static String selectedOpponentMovesP3[];
	private JPanel panelOpponentP3;
	
	/*
	 * 
	 * 
	 */
	
	static int opponentEVtotalP4 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentMovesP4 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentSelectedMovesP4 = new JList();
	
	private JLabel lblOpponentMoveTypeIconP4;
	
	private Move opponentMovesP4[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerOpponentAttackIVP4;

	private static JSpinner spinnerOpponentDefenseIVP4;

	private static JSpinner spinnerOpponentSpAttackIVP4;

	private static JSpinner spinnerOpponentSpDefenseIVP4;

	private static JSpinner spinnerOpponentSpeedIVP4;

	private static JSpinner spinnerOpponentHPEVP4;

	private static JSpinner spinnerOpponentHPIVP4;

	private static JSpinner spinnerOpponentAttackEVP4;

	private static JSpinner spinnerOpponentDefenseEVP4;

	private static JSpinner spinnerOpponentSpAttackEVP4;

	private static JSpinner spinnerOpponentSpDefenseEVP4;

	private static JSpinner spinnerOpponentSpeedEVP4;

	private static JSpinner spinnerOpponentLevelP4;

	private static JLabel lblOpponentHPP4;

	private static JLabel lblOpponentAttackP4;

	private static JLabel lblOpponentDefenseP4;

	private static JLabel lblOpponentSpAttackP4;

	private static JLabel lblOpponentSpDefenseP4;

	private static JLabel lblOpponentSpeedP4;

	private static JLabel lblOpponentHPCalcP4;

	private static JLabel lblOpponentAttackCalcP4;

	private static JLabel lblOpponentDefenseCalcP4;

	private static JLabel lblOpponentSpAttackCalcP4;

	private static JLabel lblOpponentSpDefenseCalcP4;

	private static JLabel lblOpponentSpeedCalcP4;
	private final ButtonGroup opponentGenderGroupP4 = new ButtonGroup();
	private static JLabel lblOpponentEVsAvailableP4;

	@SuppressWarnings("rawtypes")
	private static JList listOpponentPokemonP4;

	private static JSpinner spinnerOpponentNatureP4;

	private static JRadioButton rdbtnOpponentMaleP4;

	private static JRadioButton rdbtnOpponentFemaleP4;

	private static JRadioButton rdbtnOpponentGenderlessP4;

	private static String selectedOpponentMovesP4[];
	private JPanel panelOpponentP4;
	
	/*
	 * 
	 * 
	 */
	
	static int opponentEVtotalP5 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentMovesP5 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentSelectedMovesP5 = new JList();
	
	private JLabel lblOpponentMoveTypeIconP5;
	
	private Move opponentMovesP5[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerOpponentAttackIVP5;

	private static JSpinner spinnerOpponentDefenseIVP5;

	private static JSpinner spinnerOpponentSpAttackIVP5;

	private static JSpinner spinnerOpponentSpDefenseIVP5;

	private static JSpinner spinnerOpponentSpeedIVP5;

	private static JSpinner spinnerOpponentHPEVP5;

	private static JSpinner spinnerOpponentHPIVP5;

	private static JSpinner spinnerOpponentAttackEVP5;

	private static JSpinner spinnerOpponentDefenseEVP5;

	private static JSpinner spinnerOpponentSpAttackEVP5;

	private static JSpinner spinnerOpponentSpDefenseEVP5;

	private static JSpinner spinnerOpponentSpeedEVP5;

	private static JSpinner spinnerOpponentLevelP5;

	private static JLabel lblOpponentHPP5;

	private static JLabel lblOpponentAttackP5;

	private static JLabel lblOpponentDefenseP5;

	private static JLabel lblOpponentSpAttackP5;

	private static JLabel lblOpponentSpDefenseP5;

	private static JLabel lblOpponentSpeedP5;

	private static JLabel lblOpponentHPCalcP5;

	private static JLabel lblOpponentAttackCalcP5;

	private static JLabel lblOpponentDefenseCalcP5;

	private static JLabel lblOpponentSpAttackCalcP5;

	private static JLabel lblOpponentSpDefenseCalcP5;

	private static JLabel lblOpponentSpeedCalcP5;
	private final ButtonGroup opponentGenderGroupP5 = new ButtonGroup();
	private static JLabel lblOpponentEVsAvailableP5;

	@SuppressWarnings("rawtypes")
	private static JList listOpponentPokemonP5;

	private static JSpinner spinnerOpponentNatureP5;

	private static JRadioButton rdbtnOpponentMaleP5;

	private static JRadioButton rdbtnOpponentFemaleP5;

	private static JRadioButton rdbtnOpponentGenderlessP5;

	private static String selectedOpponentMovesP5[];
	private JPanel panelOpponentP5;
	
	/*
	 * 
	 * 
	 */
	
	static int opponentEVtotalP6 = 510;
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentMovesP6 = new JList();
	
	@SuppressWarnings("rawtypes")
	static JList listOpponentSelectedMovesP6 = new JList();
	
	private JLabel lblOpponentMoveTypeIconP6;
	
	private Move opponentMovesP6[] = {new None(), new None(), new None(), new None()};

	private static JSpinner spinnerOpponentAttackIVP6;

	private static JSpinner spinnerOpponentDefenseIVP6;

	private static JSpinner spinnerOpponentSpAttackIVP6;

	private static JSpinner spinnerOpponentSpDefenseIVP6;

	private static JSpinner spinnerOpponentSpeedIVP6;

	private static JSpinner spinnerOpponentHPEVP6;

	private static JSpinner spinnerOpponentHPIVP6;

	private static JSpinner spinnerOpponentAttackEVP6;

	private static JSpinner spinnerOpponentDefenseEVP6;

	private static JSpinner spinnerOpponentSpAttackEVP6;

	private static JSpinner spinnerOpponentSpDefenseEVP6;

	private static JSpinner spinnerOpponentSpeedEVP6;

	private static JSpinner spinnerOpponentLevelP6;

	private static JLabel lblOpponentHPP6;

	private static JLabel lblOpponentAttackP6;

	private static JLabel lblOpponentDefenseP6;

	private static JLabel lblOpponentSpAttackP6;

	private static JLabel lblOpponentSpDefenseP6;

	private static JLabel lblOpponentSpeedP6;

	private static JLabel lblOpponentHPCalcP6;

	private static JLabel lblOpponentAttackCalcP6;

	private static JLabel lblOpponentDefenseCalcP6;

	private static JLabel lblOpponentSpAttackCalcP6;

	private static JLabel lblOpponentSpDefenseCalcP6;

	private static JLabel lblOpponentSpeedCalcP6;
	private final ButtonGroup opponentGenderGroupP6 = new ButtonGroup();
	private static JLabel lblOpponentEVsAvailableP6;

	@SuppressWarnings("rawtypes")
	private static JList listOpponentPokemonP6;

	private static JSpinner spinnerOpponentNatureP6;

	private static JRadioButton rdbtnOpponentMaleP6;

	private static JRadioButton rdbtnOpponentFemaleP6;

	private static JRadioButton rdbtnOpponentGenderlessP6;

	private static String selectedOpponentMovesP6[];
	private JPanel panelOpponentP6;
	
	BufferedImage image = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetupWindow frame = new SetupWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public SetupWindow() {
		setResizable(false);
		TextStyles.setStyles();
		setMinimumSize(new Dimension(1590, 880));
		setTitle("Pokemon Battle Sim V0.1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnPlayerSetup = new JButton("Player Team");
		
		JButton btnOpponentSetup = new JButton("Opponent Team");
		
		try {
			image = ImageIO.read(SetupWindow.class.getResource("/BattleSimBGMain2.png"));
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
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JOptionPane.showMessageDialog(contentPane, "This program is currently in alpha. \nBe advised that glitches and bugs\nmay be present and are not \nrepresentative of a final release.", "Warning", JOptionPane.WARNING_MESSAGE);

		JPanel panelPlayerTeam = new JPanel();
		panelPlayerTeam.setBackground(new Color(240,240,240,123));
		contentPane.add(panelPlayerTeam);
		panelPlayerTeam.setVisible(false);
		panelPlayerTeam.setLayout(new MigLayout("", "[]", "[]"));
		
		JButton btnPlayerPokemon1 = new JButton("Pokemon 1");
		panelPlayerTeam.add(btnPlayerPokemon1, "flowx,cell 0 0");
		
		JButton btnPlayerPokemon2 = new JButton("Pokemon 2");
		panelPlayerTeam.add(btnPlayerPokemon2, "cell 0 0");
		
		JButton btnPlayerPokemon3 = new JButton("Pokemon 3");
		panelPlayerTeam.add(btnPlayerPokemon3, "cell 0 0");
		
		JButton btnPlayerPokemon4 = new JButton("Pokemon 4");
		panelPlayerTeam.add(btnPlayerPokemon4, "cell 0 0");
		
		JButton btnPlayerPokemon5 = new JButton("Pokemon 5");
		panelPlayerTeam.add(btnPlayerPokemon5, "cell 0 0");
		
		JButton btnPlayerPokemon6 = new JButton("Pokemon 6");
		panelPlayerTeam.add(btnPlayerPokemon6, "cell 0 0");
		btnPlayerPokemon6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPlayerP1.setVisible(false);
				panelPlayerP2.setVisible(false);
				panelPlayerP3.setVisible(false);
				panelPlayerP4.setVisible(false);
				panelPlayerP5.setVisible(false);
				panelPlayerP6.setVisible(true);
				playerLastOpen = 5;
			}
		});
		btnPlayerPokemon5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPlayerP1.setVisible(false);
				panelPlayerP2.setVisible(false);
				panelPlayerP3.setVisible(false);
				panelPlayerP4.setVisible(false);
				panelPlayerP6.setVisible(false);
				panelPlayerP5.setVisible(true);
				playerLastOpen = 4;
			}
		});
		btnPlayerPokemon4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPlayerP1.setVisible(false);
				panelPlayerP2.setVisible(false);
				panelPlayerP3.setVisible(false);
				panelPlayerP5.setVisible(false);
				panelPlayerP6.setVisible(false);
				panelPlayerP4.setVisible(true);
				playerLastOpen = 3;
			}
		});
		btnPlayerPokemon3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPlayerP1.setVisible(false);
				panelPlayerP2.setVisible(false);
				panelPlayerP4.setVisible(false);
				panelPlayerP5.setVisible(false);
				panelPlayerP6.setVisible(false);
				panelPlayerP3.setVisible(true);
				playerLastOpen = 2;
			}
		});
		btnPlayerPokemon2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPlayerP1.setVisible(false);
				panelPlayerP3.setVisible(false);
				panelPlayerP4.setVisible(false);
				panelPlayerP5.setVisible(false);
				panelPlayerP6.setVisible(false);
				panelPlayerP2.setVisible(true);
				playerLastOpen = 1;
			}
		});
		btnPlayerPokemon1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelPlayerP2.setVisible(false);
				panelPlayerP3.setVisible(false);
				panelPlayerP4.setVisible(false);
				panelPlayerP5.setVisible(false);
				panelPlayerP6.setVisible(false);
				panelPlayerP1.setVisible(true);
				playerLastOpen = 0;
			}
		});
		
		JPanel panelOpponentTeam = new JPanel();
		panelOpponentTeam.setBackground(new Color(240,240,240,123));
		contentPane.add(panelOpponentTeam);
		panelOpponentTeam.setVisible(false);
		panelOpponentTeam.setLayout(new MigLayout("", "[]", "[]"));
		
		JButton btnOpponentPokemon1 = new JButton("Pokemon 1");
		panelOpponentTeam.add(btnOpponentPokemon1, "flowx,cell 0 0");
		
		JButton btnOpponentPokemon2 = new JButton("Pokemon 2");
		panelOpponentTeam.add(btnOpponentPokemon2, "cell 0 0");
		
		JButton btnOpponentPokemon3 = new JButton("Pokemon 3");
		panelOpponentTeam.add(btnOpponentPokemon3, "cell 0 0");
		
		JButton btnOpponentPokemon4 = new JButton("Pokemon 4");
		panelOpponentTeam.add(btnOpponentPokemon4, "cell 0 0");
		
		JButton btnOpponentPokemon5 = new JButton("Pokemon 5");
		panelOpponentTeam.add(btnOpponentPokemon5, "cell 0 0");
		
		JButton btnOpponentPokemon6 = new JButton("Pokemon 6");
		panelOpponentTeam.add(btnOpponentPokemon6, "cell 0 0");
		btnOpponentPokemon6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelOpponentP1.setVisible(false);
				panelOpponentP2.setVisible(false);
				panelOpponentP3.setVisible(false);
				panelOpponentP4.setVisible(false);
				panelOpponentP5.setVisible(false);
				panelOpponentP6.setVisible(true);
				opponentLastOpen = 5;
			}
		});
		btnOpponentPokemon5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelOpponentP1.setVisible(false);
				panelOpponentP2.setVisible(false);
				panelOpponentP3.setVisible(false);
				panelOpponentP4.setVisible(false);
				panelOpponentP6.setVisible(false);
				panelOpponentP5.setVisible(true);
				opponentLastOpen = 4;
			}
		});
		btnOpponentPokemon4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelOpponentP1.setVisible(false);
				panelOpponentP2.setVisible(false);
				panelOpponentP3.setVisible(false);
				panelOpponentP5.setVisible(false);
				panelOpponentP6.setVisible(false);
				panelOpponentP4.setVisible(true);
				opponentLastOpen = 3;
			}
		});
		btnOpponentPokemon3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelOpponentP1.setVisible(false);
				panelOpponentP2.setVisible(false);
				panelOpponentP4.setVisible(false);
				panelOpponentP5.setVisible(false);
				panelOpponentP6.setVisible(false);
				panelOpponentP3.setVisible(true);
				opponentLastOpen = 2;
			}
		});
		btnOpponentPokemon2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelOpponentP1.setVisible(false);
				panelOpponentP3.setVisible(false);
				panelOpponentP4.setVisible(false);
				panelOpponentP5.setVisible(false);
				panelOpponentP6.setVisible(false);
				panelOpponentP2.setVisible(true);
				opponentLastOpen = 1;
			}
		});
		btnOpponentPokemon1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelOpponentP2.setVisible(false);
				panelOpponentP3.setVisible(false);
				panelOpponentP4.setVisible(false);
				panelOpponentP5.setVisible(false);
				panelOpponentP6.setVisible(false);
				panelOpponentP1.setVisible(true);
				opponentLastOpen = 0;
			}
		});
		
		listPlayerMovesP1.setListData(Names.fullMoveNames);
		listPlayerMovesP2.setListData(Names.fullMoveNames);
		listPlayerMovesP3.setListData(Names.fullMoveNames);
		listPlayerMovesP4.setListData(Names.fullMoveNames);
		listPlayerMovesP5.setListData(Names.fullMoveNames);
		listPlayerMovesP6.setListData(Names.fullMoveNames);
		
		listOpponentMovesP1.setListData(Names.fullMoveNames);
		listOpponentMovesP2.setListData(Names.fullMoveNames);
		listOpponentMovesP3.setListData(Names.fullMoveNames);
		listOpponentMovesP4.setListData(Names.fullMoveNames);
		listOpponentMovesP5.setListData(Names.fullMoveNames);
		listOpponentMovesP6.setListData(Names.fullMoveNames);
		
		panelPlayerP1 = new JPanel();
		panelPlayerP1.setBackground(new Color(240,240,240,123));
		contentPane.add(panelPlayerP1);
		panelPlayerP1.setVisible(false);
		selectedPlayerMovesP1 = new String[] {"None", "None", "None", "None"};
		DefaultListSelectionModel pPlayerP1 = new DefaultListSelectionModel();
		pPlayerP1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pPlayerP1.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel mPlayerP1 = new DefaultListSelectionModel();
		mPlayerP1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mPlayerP1.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smPlayerP1 = new DefaultListSelectionModel();
		smPlayerP1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smPlayerP1.setLeadAnchorNotificationEnabled(false);
		panelPlayerP1.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		
		JScrollPane scrollPanePlayerP1 = new JScrollPane();
		scrollPanePlayerP1.setViewportView(listPlayerMovesP1);
		listPlayerMovesP1.setSelectionModel(mPlayerP1);
		listPlayerMovesP1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JScrollPane scrollPanePlayer1 = new JScrollPane();
		panelPlayerP1.add(scrollPanePlayer1, "cell 0 0,grow");
		listPlayerPokemonP1 = new JList(Names.pokemonNames);
		scrollPanePlayer1.setViewportView(listPlayerPokemonP1);
		listPlayerPokemonP1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listPlayerPokemonP1.setSelectionModel(pPlayerP1);
		listPlayerPokemonP1.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getPlayerPKMN()[0] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listPlayerPokemonP1.getSelectedIndex()]).newInstance();
					if(pPlayerP1.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getPlayerPKMN()[0].getValidMoves().length];
					while(i < CurrentSimData.getPlayerPKMN()[0].getValidMoves().length)
					{
						
						int t = CurrentSimData.getPlayerPKMN()[0].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedPlayerMovesP1[0] = "None";
					selectedPlayerMovesP1[1] = "None";
					selectedPlayerMovesP1[2] = "None";
					selectedPlayerMovesP1[3] = "None";
					playerMovesP1 = new Move[]{new None(), new None(), new None(), new None()};
					listPlayerSelectedMovesP1.setListData(selectedPlayerMovesP1);
					listPlayerMovesP1.setListData(label);
					
					spinnerPlayerHPIVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getIvHp());
					spinnerPlayerAttackIVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getIvAttack());
					spinnerPlayerDefenseIVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getIvDefense());
					spinnerPlayerSpAttackIVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getIvSpAttack());
					spinnerPlayerSpDefenseIVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getIvSpDefense());
					spinnerPlayerSpeedIVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getIvSpeed());
					
					spinnerPlayerHPEVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getEvHp());
					spinnerPlayerAttackEVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getEvAttack());
					spinnerPlayerDefenseEVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getEvDefense());
					spinnerPlayerSpAttackEVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getEvSpAttack());
					spinnerPlayerSpDefenseEVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getEvSpDefense());
					spinnerPlayerSpeedEVP1.setValue(CurrentSimData.getPlayerPKMN()[0].getEvSpeed());
					
					spinnerPlayerLevelP1.setValue(CurrentSimData.getPlayerPKMN()[0].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JPanel panelPlayerIVP1 = new JPanel();
		panelPlayerIVP1.setOpaque(false);
		panelPlayerP1.add(panelPlayerIVP1, "cell 1 0,grow");
		panelPlayerIVP1.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblPlayerIVsP1 = new JLabel("IVs");
		panelPlayerIVP1.add(lblPlayerIVsP1, "cell 0 0");
		
		JLabel lblPlayerHPIVP1 = new JLabel("HP: ");
		panelPlayerIVP1.add(lblPlayerHPIVP1, "cell 0 1");
		
		spinnerPlayerHPIVP1 = new JSpinner();
		spinnerPlayerHPIVP1.setOpaque(false);
		spinnerPlayerHPIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[0].setIvHp(Double.parseDouble(""+spinnerPlayerHPIVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[0].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[0].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[0].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel()));
				statLabelUpdaterPlayerP1();
			}
		});
		spinnerPlayerHPIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP1.add(spinnerPlayerHPIVP1, "cell 1 1");
		
		JLabel lblPlayerAttackIVP1 = new JLabel("Attack: ");
		panelPlayerIVP1.add(lblPlayerAttackIVP1, "cell 0 2");
		
		spinnerPlayerAttackIVP1 = new JSpinner();
		spinnerPlayerAttackIVP1.setOpaque(false);
		spinnerPlayerAttackIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[0].setIvAttack(Double.parseDouble(""+spinnerPlayerAttackIVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[0].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[0].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[0].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[0].getNature()));
						statLabelUpdaterPlayerP1();
			}
		});
		spinnerPlayerAttackIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP1.add(spinnerPlayerAttackIVP1, "cell 1 2");
		
		JLabel lblPlayerDefenseIVP1 = new JLabel("Defense: ");
		panelPlayerIVP1.add(lblPlayerDefenseIVP1, "cell 0 3");
		
		spinnerPlayerDefenseIVP1 = new JSpinner();
		spinnerPlayerDefenseIVP1.setOpaque(false);
		spinnerPlayerDefenseIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[0].setIvDefense(Double.parseDouble(""+spinnerPlayerDefenseIVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[0].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[0].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[0].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[0].getNature()));
						statLabelUpdaterPlayerP1();
			}
		});
		spinnerPlayerDefenseIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP1.add(spinnerPlayerDefenseIVP1, "cell 1 3");
		
		JLabel lblPlayerSpAttackIVP1 = new JLabel("Special Attack: ");
		panelPlayerIVP1.add(lblPlayerSpAttackIVP1, "cell 0 4");
		
		spinnerPlayerSpAttackIVP1 = new JSpinner();
		spinnerPlayerSpAttackIVP1.setOpaque(false);
		spinnerPlayerSpAttackIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[0].setIvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackIVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setSpAttack(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[0].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[0].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[0].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[0].getNature()));
						statLabelUpdaterPlayerP1();
			}
		});
		spinnerPlayerSpAttackIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP1.add(spinnerPlayerSpAttackIVP1, "cell 1 4");
		
		JLabel lblPlayerSpDefenseIVP1 = new JLabel("Special Defense: ");
		panelPlayerIVP1.add(lblPlayerSpDefenseIVP1, "cell 0 5");
		
		spinnerPlayerSpDefenseIVP1 = new JSpinner();
		spinnerPlayerSpDefenseIVP1.setOpaque(false);
		spinnerPlayerSpDefenseIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[0].setIvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseIVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setSpDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[0].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[0].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[0].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[0].getNature()));
						statLabelUpdaterPlayerP1();
			}
		});
		spinnerPlayerSpDefenseIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP1.add(spinnerPlayerSpDefenseIVP1, "cell 1 5");
		
		JLabel lblPlayerSpeedIVP1 = new JLabel("Speed: ");
		panelPlayerIVP1.add(lblPlayerSpeedIVP1, "cell 0 6");
		
		spinnerPlayerSpeedIVP1 = new JSpinner();
		spinnerPlayerSpeedIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[0].setIvSpeed(Double.parseDouble(""+spinnerPlayerSpeedIVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setSpeed(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[0].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[0].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[0].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[0].getNature()));
						statLabelUpdaterPlayerP1();
			}
		});
		spinnerPlayerSpeedIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP1.add(spinnerPlayerSpeedIVP1, "cell 1 6");
		
		JPanel panelPlayerEVP1 = new JPanel();
		panelPlayerEVP1.setOpaque(false);
		panelPlayerP1.add(panelPlayerEVP1, "cell 2 0,grow");
		panelPlayerEVP1.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblPlayerEVsP1 = new JLabel("EVs");
		panelPlayerEVP1.add(lblPlayerEVsP1, "cell 0 0");
		
		JLabel lblPlayerEVMaxP1 = new JLabel("Available: ");
		panelPlayerEVP1.add(lblPlayerEVMaxP1, "cell 1 0");
		
		lblPlayerEVsAvailableP1 = new JLabel("510");
		panelPlayerEVP1.add(lblPlayerEVsAvailableP1, "cell 2 0");
		
		JLabel lblPlayerHPEVP1 = new JLabel("HP: ");
		panelPlayerEVP1.add(lblPlayerHPEVP1, "cell 0 1");
		
		spinnerPlayerHPEVP1 = new JSpinner();
		spinnerPlayerHPEVP1.setOpaque(false);
		spinnerPlayerHPEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP1 < 0)
				{
					spinnerPlayerHPEVP1.setValue((int)spinnerPlayerHPEVP1.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[0].setEvHp(Double.parseDouble(""+spinnerPlayerHPEVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[0].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[0].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[0].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel()));
						statLabelUpdaterPlayerP1();
						playerEVCheckP1();
			}
		});
		spinnerPlayerHPEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP1.add(spinnerPlayerHPEVP1, "cell 1 1");
		
		JLabel lblPlayerAttackEVP1 = new JLabel("Attack: ");
		panelPlayerEVP1.add(lblPlayerAttackEVP1, "cell 0 2");
		
		spinnerPlayerAttackEVP1 = new JSpinner();
		spinnerPlayerAttackEVP1.setOpaque(false);
		spinnerPlayerAttackEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP1 < 0)
				{
					spinnerPlayerAttackEVP1.setValue((int)spinnerPlayerAttackEVP1.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[0].setEvAttack(Double.parseDouble(""+spinnerPlayerAttackEVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[0].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[0].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[0].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[0].getNature()));
						statLabelUpdaterPlayerP1();
						playerEVCheckP1();
			}
		});
		spinnerPlayerAttackEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP1.add(spinnerPlayerAttackEVP1, "cell 1 2");
		
		JLabel lblPlayerDefenseEVP1 = new JLabel("Defense: ");
		panelPlayerEVP1.add(lblPlayerDefenseEVP1, "cell 0 3");
		
		spinnerPlayerDefenseEVP1 = new JSpinner();
		spinnerPlayerDefenseEVP1.setOpaque(false);
		spinnerPlayerDefenseEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP1 < 0)
				{
					spinnerPlayerDefenseEVP1.setValue((int)spinnerPlayerDefenseEVP1.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[0].setEvDefense(Double.parseDouble(""+spinnerPlayerDefenseEVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[0].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[0].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[0].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[0].getNature()));
						statLabelUpdaterPlayerP1();
						playerEVCheckP1();
			}
		});
		spinnerPlayerDefenseEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP1.add(spinnerPlayerDefenseEVP1, "cell 1 3");
		
		JLabel lblPlayerSpAttackEVP1 = new JLabel("Special Attack: ");
		panelPlayerEVP1.add(lblPlayerSpAttackEVP1, "cell 0 4");
		
		spinnerPlayerSpAttackEVP1 = new JSpinner();
		spinnerPlayerSpAttackEVP1.setOpaque(false);
		spinnerPlayerSpAttackEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP1 < 0)
				{
					spinnerPlayerSpAttackEVP1.setValue((int)spinnerPlayerSpAttackEVP1.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[0].setEvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackEVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setSpAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[0].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[0].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[0].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[0].getNature()));
						statLabelUpdaterPlayerP1();
						playerEVCheckP1();
			}
		});
		spinnerPlayerSpAttackEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP1.add(spinnerPlayerSpAttackEVP1, "cell 1 4");
		
		JLabel lblPlayerSpDefenseEVP1 = new JLabel("Special Defense: ");
		panelPlayerEVP1.add(lblPlayerSpDefenseEVP1, "cell 0 5");
		
		spinnerPlayerSpDefenseEVP1 = new JSpinner();
		spinnerPlayerSpDefenseEVP1.setOpaque(false);
		spinnerPlayerSpDefenseEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP1 < 0)
				{
					spinnerPlayerSpDefenseEVP1.setValue((int)spinnerPlayerSpDefenseEVP1.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[0].setEvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseEVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setSpDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[0].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[0].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[0].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[0].getNature()));
						statLabelUpdaterPlayerP1();
						playerEVCheckP1();
			}
		});
		spinnerPlayerSpDefenseEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP1.add(spinnerPlayerSpDefenseEVP1, "cell 1 5");
		
		JLabel lblPlayerSpeedEVP1 = new JLabel("Speed: ");
		panelPlayerEVP1.add(lblPlayerSpeedEVP1, "cell 0 7");
		
		spinnerPlayerSpeedEVP1 = new JSpinner();
		spinnerPlayerSpeedEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP1 < 0)
				{
					spinnerPlayerSpeedEVP1.setValue((int)spinnerPlayerSpeedEVP1.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[0].setEvSpeed(Double.parseDouble(""+spinnerPlayerSpeedEVP1.getValue()));
				CurrentSimData.getPlayerPKMN()[0].setSpeed(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[0].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[0].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[0].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[0].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[0].getNature()));
						statLabelUpdaterPlayerP1();
						playerEVCheckP1();
			}
		});
		spinnerPlayerSpeedEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP1.add(spinnerPlayerSpeedEVP1, "cell 1 7");
		
		JPanel panelPlayerStatsP1 = new JPanel();
		panelPlayerStatsP1.setOpaque(false);
		panelPlayerP1.add(panelPlayerStatsP1, "cell 3 0,grow");
		panelPlayerStatsP1.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblPlayerLevelP1 = new JLabel("Level: ");
		panelPlayerStatsP1.add(lblPlayerLevelP1, "cell 0 0");
		
		spinnerPlayerLevelP1 = new JSpinner();
		spinnerPlayerLevelP1.setOpaque(false);
		spinnerPlayerLevelP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[0].setLevel(Double.parseDouble(""+spinnerPlayerLevelP1.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[0]);
				statLabelUpdaterPlayerP1();
			}
		});
		spinnerPlayerLevelP1.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelPlayerStatsP1.add(spinnerPlayerLevelP1, "cell 1 0");
		
		lblPlayerHPP1 = new JLabel("HP: ");
		panelPlayerStatsP1.add(lblPlayerHPP1, "cell 0 1");
		
		lblPlayerHPCalcP1 = new JLabel("0");
		panelPlayerStatsP1.add(lblPlayerHPCalcP1, "cell 1 1");
		
		lblPlayerAttackP1 = new JLabel("Attack: ");
		panelPlayerStatsP1.add(lblPlayerAttackP1, "cell 0 2");
		
		lblPlayerAttackCalcP1 = new JLabel("0");
		panelPlayerStatsP1.add(lblPlayerAttackCalcP1, "cell 1 2");
		
		lblPlayerDefenseP1 = new JLabel("Defense: ");
		panelPlayerStatsP1.add(lblPlayerDefenseP1, "cell 0 3");
		
		lblPlayerDefenseCalcP1 = new JLabel("0");
		panelPlayerStatsP1.add(lblPlayerDefenseCalcP1, "cell 1 3");
		
		lblPlayerSpAttackP1 = new JLabel("Special Attack: ");
		panelPlayerStatsP1.add(lblPlayerSpAttackP1, "cell 0 4");
		
		lblPlayerSpAttackCalcP1 = new JLabel("0");
		panelPlayerStatsP1.add(lblPlayerSpAttackCalcP1, "cell 1 4");
		
		lblPlayerSpDefenseP1 = new JLabel("Special Defense: ");
		panelPlayerStatsP1.add(lblPlayerSpDefenseP1, "cell 0 5");
		
		lblPlayerSpDefenseCalcP1 = new JLabel("0");
		panelPlayerStatsP1.add(lblPlayerSpDefenseCalcP1, "cell 1 5");
		
		lblPlayerSpeedP1 = new JLabel("Speed: ");
		panelPlayerStatsP1.add(lblPlayerSpeedP1, "cell 0 6");
		
		lblPlayerSpeedCalcP1 = new JLabel("0");
		panelPlayerStatsP1.add(lblPlayerSpeedCalcP1, "cell 1 6");
		
		JLabel lblPlayerNatureP1 = new JLabel("Nature: ");
		panelPlayerStatsP1.add(lblPlayerNatureP1, "cell 0 7");
		
		spinnerPlayerNatureP1 = new JSpinner();
		spinnerPlayerNatureP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerPlayerNatureP1.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getPlayerPKMN()[0].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[0]);
				statLabelUpdaterPlayerP1();
				playerStatColors();
			}

			private void playerStatColors() {
				lblPlayerAttackP1.setForeground(Color.BLACK);
				lblPlayerDefenseP1.setForeground(Color.BLACK);
				lblPlayerSpAttackP1.setForeground(Color.BLACK);
				lblPlayerSpDefenseP1.setForeground(Color.BLACK);
				lblPlayerSpeedP1.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getPlayerPKMN()[0].getNature()][0] == StatCalc.natures[CurrentSimData.getPlayerPKMN()[0].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[0].getNature()][0])
					{
					case StatCalc.ATTACK: lblPlayerAttackP1.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP1.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP1.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP1.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP1.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[0].getNature()][1])
					{
					case StatCalc.ATTACK: lblPlayerAttackP1.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP1.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP1.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP1.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP1.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerPlayerNatureP1.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelPlayerStatsP1.add(spinnerPlayerNatureP1, "cell 1 7 2 1,growx");
		
		JPanel panelPlayerExtraP1 = new JPanel();
		panelPlayerExtraP1.setOpaque(false);
		panelPlayerP1.add(panelPlayerExtraP1, "cell 4 0,grow");
		panelPlayerExtraP1.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblPlayerGenderP1 = new JLabel("Gender: ");
		panelPlayerExtraP1.add(lblPlayerGenderP1, "cell 0 0,aligny top");
		
		rdbtnPlayerMaleP1 = new JRadioButton("Male");
		playerGenderGroupP1.add(rdbtnPlayerMaleP1);
		panelPlayerExtraP1.add(rdbtnPlayerMaleP1, "flowy,cell 1 0");
		
		rdbtnPlayerFemaleP1 = new JRadioButton("Female");
		playerGenderGroupP1.add(rdbtnPlayerFemaleP1);
		panelPlayerExtraP1.add(rdbtnPlayerFemaleP1, "cell 1 0");
		
		rdbtnPlayerGenderlessP1 = new JRadioButton("Genderless");
		playerGenderGroupP1.add(rdbtnPlayerGenderlessP1);
		panelPlayerExtraP1.add(rdbtnPlayerGenderlessP1, "cell 1 0");
		rdbtnPlayerMaleP1.setSelected(true);
		panelPlayerP1.add(scrollPanePlayerP1, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_PlayerP1 = new JPanel();
		panel_3_PlayerP1.setOpaque(false);
		panel_3_PlayerP1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddPlayerP1 = new JButton(">>");
		buttonAddPlayerP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerMovesP1.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedPlayerMovesP1.length)
					{
						if(selectedPlayerMovesP1[i] == "None")
						{
							selectedPlayerMovesP1[i] = (String) listPlayerMovesP1.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedPlayerMovesP1[i] == Names.fullMoveNames[w])
								{
									try {
										playerMovesP1[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listPlayerSelectedMovesP1.setListData(selectedPlayerMovesP1);
				}
			}
		});
		panel_3_PlayerP1.add(buttonAddPlayerP1);
		
		JButton buttonRemovePlayerP1 = new JButton("<<");
		buttonRemovePlayerP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerSelectedMovesP1.getSelectedValue()!= null)
				{
					playerMovesP1[listPlayerSelectedMovesP1.getSelectedIndex()] = new None();
					selectedPlayerMovesP1[listPlayerSelectedMovesP1.getSelectedIndices()[0]] = "None";
					listPlayerSelectedMovesP1.setListData(selectedPlayerMovesP1);
				}
			}
		});
		
		JPanel panelPlayerMovePreviewP1 = new JPanel();
		panelPlayerMovePreviewP1.setOpaque(false);
		panelPlayerP1.add(panelPlayerMovePreviewP1, "cell 1 1,grow");
		panelPlayerMovePreviewP1.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblPlayerMoveTypeP1 = new JLabel("Move Type: ");
		panelPlayerMovePreviewP1.add(lblPlayerMoveTypeP1, "cell 0 0,alignx left,aligny top");
		
		lblPlayerMoveTypeIconP1 = new JLabel();
		panelPlayerMovePreviewP1.add(lblPlayerMoveTypeIconP1, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryP1 = new JLabel("Category: ");
		panelPlayerMovePreviewP1.add(lblPlayerMoveCategoryP1, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryCalcP1 = new JLabel("");
		panelPlayerMovePreviewP1.add(lblPlayerMoveCategoryCalcP1, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblPlayerMovePowerP1 = new JLabel("Power: ");
		panelPlayerMovePreviewP1.add(lblPlayerMovePowerP1, "cell 0 2");
		
		JLabel lblPlayerMovePowerCalcP1 = new JLabel("");
		panelPlayerMovePreviewP1.add(lblPlayerMovePowerCalcP1, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyP1 = new JLabel("Accuracy: ");
		panelPlayerMovePreviewP1.add(lblPlayerMoveAccuracyP1, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyCalcP1 = new JLabel("");
		panelPlayerMovePreviewP1.add(lblPlayerMoveAccuracyCalcP1, "cell 1 3");
		panelPlayerP1.add(panel_3_PlayerP1, "cell 2 1,grow");
		
		panel_3_PlayerP1.add(buttonRemovePlayerP1);
		
		
		listPlayerSelectedMovesP1.setSelectionModel(smPlayerP1);
		panelPlayerP1.add(listPlayerSelectedMovesP1, "cell 3 1,grow");
		
		JPanel panelPlayerMoveDetailsP1 = new JPanel();
		panelPlayerMoveDetailsP1.setOpaque(false);
		panelPlayerP1.add(panelPlayerMoveDetailsP1, "cell 4 1,grow");
		panelPlayerMoveDetailsP1.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblPlayerMoveTypeDetailsP1 = new JLabel("Move Type: ");
		panelPlayerMoveDetailsP1.add(lblPlayerMoveTypeDetailsP1, "cell 0 0,alignx left");
		
		JLabel lblPlayerMoveTypeIconDisplayP1 = new JLabel("");
		panelPlayerMoveDetailsP1.add(lblPlayerMoveTypeIconDisplayP1, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryDetailsP1 = new JLabel("Category: ");
		panelPlayerMoveDetailsP1.add(lblPlayerMoveCategoryDetailsP1, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryDisplayP1 = new JLabel("");
		panelPlayerMoveDetailsP1.add(lblPlayerMoveCategoryDisplayP1, "cell 1 1");
		
		JLabel lblPlayerMovePowerDetailsP1 = new JLabel("Power: ");
		panelPlayerMoveDetailsP1.add(lblPlayerMovePowerDetailsP1, "cell 0 2");
		
		JLabel lblPlayerMovePowerDisplayP1 = new JLabel("");
		panelPlayerMoveDetailsP1.add(lblPlayerMovePowerDisplayP1, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyDetailsP1 = new JLabel("Accuracy: ");
		panelPlayerMoveDetailsP1.add(lblPlayerMoveAccuracyDetailsP1, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyDisplayP1 = new JLabel("");
		panelPlayerMoveDetailsP1.add(lblPlayerMoveAccuracyDisplayP1, "cell 1 3");
		
		JLabel lblPlayerMaxPPP1 = new JLabel("Max PP: ");
		panelPlayerMoveDetailsP1.add(lblPlayerMaxPPP1, "cell 0 4");
		
		JLabel lblPlayerMaxPPCalcP1 = new JLabel("0");
		panelPlayerMoveDetailsP1.add(lblPlayerMaxPPCalcP1, "cell 1 4");
		
		JLabel lblPlayerCurrentPPP1 = new JLabel("Current PP: ");
		panelPlayerMoveDetailsP1.add(lblPlayerCurrentPPP1, "cell 0 5");
		
		JSpinner spinnerPlayerCurrentPPP1 = new JSpinner();
		spinnerPlayerCurrentPPP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				playerMovesP1[listPlayerSelectedMovesP1.getSelectedIndex()].setPp((int) spinnerPlayerCurrentPPP1.getValue());
				playerMovesP1[listPlayerSelectedMovesP1.getSelectedIndex()].setCurrentPP((int) spinnerPlayerCurrentPPP1.getValue());
			}
		});
		panelPlayerMoveDetailsP1.add(spinnerPlayerCurrentPPP1, "cell 1 5");
		
		
		
		listPlayerMovesP1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listPlayerMovesP1.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lblPlayerMoveTypeIconP1.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblPlayerMoveCategoryCalcP1.setText(catText);
						lblPlayerMovePowerCalcP1.setText(selected.getPower()+"");
						lblPlayerMoveAccuracyCalcP1.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listPlayerSelectedMovesP1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listPlayerSelectedMovesP1.getSelectedIndex();
				
				lblPlayerMaxPPCalcP1.setText(playerMovesP1[i].getMaxPP() + "");
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+playerMovesP1[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblPlayerMoveTypeIconDisplayP1.setIcon(new ImageIcon(image));
			
				String catTextDisplay = "None";
				switch (playerMovesP1[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblPlayerMoveCategoryDisplayP1.setText(catTextDisplay);
				lblPlayerMovePowerDisplayP1.setText(playerMovesP1[i].getPower()+"");
				lblPlayerMoveAccuracyDisplayP1.setText(playerMovesP1[i].getAccuracy()+"");
				spinnerPlayerCurrentPPP1.setModel(new SpinnerNumberModel(0, 0, playerMovesP1[i].getMaxPP(), 1));
				spinnerPlayerCurrentPPP1.setValue(playerMovesP1[i].getPp());
				repaint();
			}
		});
		
		panelPlayerP2 = new JPanel();
		panelPlayerP2.setBackground(new Color(240,240,240,123));
		contentPane.add(panelPlayerP2);
		panelPlayerP2.setVisible(false);
		selectedPlayerMovesP2 = new String[] {"None", "None", "None", "None"};
		
		JScrollPane scrollPanePlayer2 = new JScrollPane();
		panelPlayerP2.add(scrollPanePlayer2, "cell 0 0,grow");
		listPlayerPokemonP2 = new JList(Names.pokemonNames);
		scrollPanePlayer2.setViewportView(listPlayerPokemonP2);
		listPlayerPokemonP2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListSelectionModel pPlayerP2 = new DefaultListSelectionModel();
		pPlayerP2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pPlayerP2.setLeadAnchorNotificationEnabled(false);
		listPlayerPokemonP2.setSelectionModel(pPlayerP2);
		listPlayerPokemonP2.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getPlayerPKMN()[1] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listPlayerPokemonP2.getSelectedIndex()]).newInstance();
					if(pPlayerP2.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getPlayerPKMN()[1].getValidMoves().length];
					while(i < CurrentSimData.getPlayerPKMN()[1].getValidMoves().length)
					{
						
						int t = CurrentSimData.getPlayerPKMN()[1].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedPlayerMovesP2[0] = "None";
					selectedPlayerMovesP2[1] = "None";
					selectedPlayerMovesP2[2] = "None";
					selectedPlayerMovesP2[3] = "None";
					playerMovesP2 = new Move[]{new None(), new None(), new None(), new None()};
					listPlayerSelectedMovesP2.setListData(selectedPlayerMovesP2);
					listPlayerMovesP2.setListData(label);
					
					spinnerPlayerHPIVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getIvHp());
					spinnerPlayerAttackIVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getIvAttack());
					spinnerPlayerDefenseIVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getIvDefense());
					spinnerPlayerSpAttackIVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getIvSpAttack());
					spinnerPlayerSpDefenseIVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getIvSpDefense());
					spinnerPlayerSpeedIVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getIvSpeed());
					
					spinnerPlayerHPEVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getEvHp());
					spinnerPlayerAttackEVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getEvAttack());
					spinnerPlayerDefenseEVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getEvDefense());
					spinnerPlayerSpAttackEVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getEvSpAttack());
					spinnerPlayerSpDefenseEVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getEvSpDefense());
					spinnerPlayerSpeedEVP2.setValue(CurrentSimData.getPlayerPKMN()[1].getEvSpeed());
					
					spinnerPlayerLevelP2.setValue(CurrentSimData.getPlayerPKMN()[1].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		DefaultListSelectionModel mPlayerP2 = new DefaultListSelectionModel();
		mPlayerP2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mPlayerP2.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smPlayerP2 = new DefaultListSelectionModel();
		smPlayerP2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smPlayerP2.setLeadAnchorNotificationEnabled(false);
		panelPlayerP2.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		panelPlayerP2.add(scrollPanePlayer2, "cell 0 0,grow");
		
		JScrollPane scrollPanePlayerP2 = new JScrollPane();
		scrollPanePlayerP2.setViewportView(listPlayerMovesP2);
		listPlayerMovesP2.setSelectionModel(mPlayerP2);
		listPlayerMovesP2.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JPanel panelPlayerIVP2 = new JPanel();
		panelPlayerIVP2.setOpaque(false);
		panelPlayerP2.add(panelPlayerIVP2, "cell 1 0,grow");
		panelPlayerIVP2.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblPlayerIVsP2 = new JLabel("IVs");
		panelPlayerIVP2.add(lblPlayerIVsP2, "cell 0 0");
		
		JLabel lblPlayerHPIVP2 = new JLabel("HP: ");
		panelPlayerIVP2.add(lblPlayerHPIVP2, "cell 0 1");
		
		spinnerPlayerHPIVP2 = new JSpinner();
		spinnerPlayerHPIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[1].setIvHp(Double.parseDouble(""+spinnerPlayerHPIVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[1].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[1].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[1].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel()));
				statLabelUpdaterPlayerP2();
			}
		});
		spinnerPlayerHPIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP2.add(spinnerPlayerHPIVP2, "cell 1 1");
		
		JLabel lblPlayerAttackIVP2 = new JLabel("Attack: ");
		panelPlayerIVP2.add(lblPlayerAttackIVP2, "cell 0 2");
		
		spinnerPlayerAttackIVP2 = new JSpinner();
		spinnerPlayerAttackIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[1].setIvAttack(Double.parseDouble(""+spinnerPlayerAttackIVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[1].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[1].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[1].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[1].getNature()));
						statLabelUpdaterPlayerP2();
			}
		});
		spinnerPlayerAttackIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP2.add(spinnerPlayerAttackIVP2, "cell 1 2");
		
		JLabel lblPlayerDefenseIVP2 = new JLabel("Defense: ");
		panelPlayerIVP2.add(lblPlayerDefenseIVP2, "cell 0 3");
		
		spinnerPlayerDefenseIVP2 = new JSpinner();
		spinnerPlayerDefenseIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[1].setIvDefense(Double.parseDouble(""+spinnerPlayerDefenseIVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[1].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[1].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[1].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[1].getNature()));
						statLabelUpdaterPlayerP2();
			}
		});
		spinnerPlayerDefenseIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP2.add(spinnerPlayerDefenseIVP2, "cell 1 3");
		
		JLabel lblPlayerSpAttackIVP2 = new JLabel("Special Attack: ");
		panelPlayerIVP2.add(lblPlayerSpAttackIVP2, "cell 0 4");
		
		spinnerPlayerSpAttackIVP2 = new JSpinner();
		spinnerPlayerSpAttackIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[1].setIvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackIVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setSpAttack(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[1].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[1].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[1].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[1].getNature()));
						statLabelUpdaterPlayerP2();
			}
		});
		spinnerPlayerSpAttackIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP2.add(spinnerPlayerSpAttackIVP2, "cell 1 4");
		
		JLabel lblPlayerSpDefenseIVP2 = new JLabel("Special Defense: ");
		panelPlayerIVP2.add(lblPlayerSpDefenseIVP2, "cell 0 5");
		
		spinnerPlayerSpDefenseIVP2 = new JSpinner();
		spinnerPlayerSpDefenseIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[1].setIvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseIVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setSpDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[1].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[1].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[1].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[1].getNature()));
						statLabelUpdaterPlayerP2();
			}
		});
		spinnerPlayerSpDefenseIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP2.add(spinnerPlayerSpDefenseIVP2, "cell 1 5");
		
		JLabel lblPlayerSpeedIVP2 = new JLabel("Speed: ");
		panelPlayerIVP2.add(lblPlayerSpeedIVP2, "cell 0 6");
		
		spinnerPlayerSpeedIVP2 = new JSpinner();
		spinnerPlayerSpeedIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[1].setIvSpeed(Double.parseDouble(""+spinnerPlayerSpeedIVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setSpeed(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[1].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[1].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[1].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[1].getNature()));
						statLabelUpdaterPlayerP2();
			}
		});
		spinnerPlayerSpeedIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP2.add(spinnerPlayerSpeedIVP2, "cell 1 6");
		
		JPanel panelPlayerEVP2 = new JPanel();
		panelPlayerEVP2.setOpaque(false);
		panelPlayerP2.add(panelPlayerEVP2, "cell 2 0,grow");
		panelPlayerEVP2.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblPlayerEVsP2 = new JLabel("EVs");
		panelPlayerEVP2.add(lblPlayerEVsP2, "cell 0 0");
		
		JLabel lblPlayerEVMaxP2 = new JLabel("Available: ");
		panelPlayerEVP2.add(lblPlayerEVMaxP2, "cell 1 0");
		
		lblPlayerEVsAvailableP2 = new JLabel("510");
		panelPlayerEVP2.add(lblPlayerEVsAvailableP2, "cell 2 0");
		
		JLabel lblPlayerHPEVP2 = new JLabel("HP: ");
		panelPlayerEVP2.add(lblPlayerHPEVP2, "cell 0 1");
		
		spinnerPlayerHPEVP2 = new JSpinner();
		spinnerPlayerHPEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP2 < 0)
				{
					spinnerPlayerHPEVP2.setValue((int)spinnerPlayerHPEVP2.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[1].setEvHp(Double.parseDouble(""+spinnerPlayerHPEVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[1].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[1].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[1].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel()));
						statLabelUpdaterPlayerP2();
						playerEVCheckP2();
			}
		});
		spinnerPlayerHPEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP2.add(spinnerPlayerHPEVP2, "cell 1 1");
		
		JLabel lblPlayerAttackEVP2 = new JLabel("Attack: ");
		panelPlayerEVP2.add(lblPlayerAttackEVP2, "cell 0 2");
		
		spinnerPlayerAttackEVP2 = new JSpinner();
		spinnerPlayerAttackEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP2 < 0)
				{
					spinnerPlayerAttackEVP2.setValue((int)spinnerPlayerAttackEVP2.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[1].setEvAttack(Double.parseDouble(""+spinnerPlayerAttackEVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[1].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[1].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[1].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[1].getNature()));
						statLabelUpdaterPlayerP2();
						playerEVCheckP2();
			}
		});
		spinnerPlayerAttackEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP2.add(spinnerPlayerAttackEVP2, "cell 1 2");
		
		JLabel lblPlayerDefenseEVP2 = new JLabel("Defense: ");
		panelPlayerEVP2.add(lblPlayerDefenseEVP2, "cell 0 3");
		
		spinnerPlayerDefenseEVP2 = new JSpinner();
		spinnerPlayerDefenseEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP2 < 0)
				{
					spinnerPlayerDefenseEVP2.setValue((int)spinnerPlayerDefenseEVP2.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[1].setEvDefense(Double.parseDouble(""+spinnerPlayerDefenseEVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[1].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[1].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[1].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[1].getNature()));
						statLabelUpdaterPlayerP2();
						playerEVCheckP2();
			}
		});
		spinnerPlayerDefenseEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP2.add(spinnerPlayerDefenseEVP2, "cell 1 3");
		
		JLabel lblPlayerSpAttackEVP2 = new JLabel("Special Attack: ");
		panelPlayerEVP2.add(lblPlayerSpAttackEVP2, "cell 0 4");
		
		spinnerPlayerSpAttackEVP2 = new JSpinner();
		spinnerPlayerSpAttackEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP2 < 0)
				{
					spinnerPlayerSpAttackEVP2.setValue((int)spinnerPlayerSpAttackEVP2.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[1].setEvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackEVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setSpAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[1].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[1].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[1].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[1].getNature()));
						statLabelUpdaterPlayerP2();
						playerEVCheckP2();
			}
		});
		spinnerPlayerSpAttackEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP2.add(spinnerPlayerSpAttackEVP2, "cell 1 4");
		
		JLabel lblPlayerSpDefenseEVP2 = new JLabel("Special Defense: ");
		panelPlayerEVP2.add(lblPlayerSpDefenseEVP2, "cell 0 5");
		
		spinnerPlayerSpDefenseEVP2 = new JSpinner();
		spinnerPlayerSpDefenseEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP2 < 0)
				{
					spinnerPlayerSpDefenseEVP2.setValue((int)spinnerPlayerSpDefenseEVP2.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[1].setEvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseEVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setSpDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[1].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[1].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[1].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[1].getNature()));
						statLabelUpdaterPlayerP2();
						playerEVCheckP2();
			}
		});
		spinnerPlayerSpDefenseEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP2.add(spinnerPlayerSpDefenseEVP2, "cell 1 5");
		
		JLabel lblPlayerSpeedEVP2 = new JLabel("Speed: ");
		panelPlayerEVP2.add(lblPlayerSpeedEVP2, "cell 0 7");
		
		spinnerPlayerSpeedEVP2 = new JSpinner();
		spinnerPlayerSpeedEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP2 < 0)
				{
					spinnerPlayerSpeedEVP2.setValue((int)spinnerPlayerSpeedEVP2.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[1].setEvSpeed(Double.parseDouble(""+spinnerPlayerSpeedEVP2.getValue()));
				CurrentSimData.getPlayerPKMN()[1].setSpeed(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[1].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[1].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[1].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[1].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[1].getNature()));
						statLabelUpdaterPlayerP2();
						playerEVCheckP2();
			}
		});
		spinnerPlayerSpeedEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP2.add(spinnerPlayerSpeedEVP2, "cell 1 7");
		
		JPanel panelPlayerStatsP2 = new JPanel();
		panelPlayerStatsP2.setOpaque(false);
		panelPlayerP2.add(panelPlayerStatsP2, "cell 3 0,grow");
		panelPlayerStatsP2.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblPlayerLevelP2 = new JLabel("Level: ");
		panelPlayerStatsP2.add(lblPlayerLevelP2, "cell 0 0");
		
		spinnerPlayerLevelP2 = new JSpinner();
		spinnerPlayerLevelP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[1].setLevel(Double.parseDouble(""+spinnerPlayerLevelP2.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[1]);
				statLabelUpdaterPlayerP2();
			}
		});
		spinnerPlayerLevelP2.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelPlayerStatsP2.add(spinnerPlayerLevelP2, "cell 1 0");
		
		lblPlayerHPP2 = new JLabel("HP: ");
		panelPlayerStatsP2.add(lblPlayerHPP2, "cell 0 1");
		
		lblPlayerHPCalcP2 = new JLabel("0");
		panelPlayerStatsP2.add(lblPlayerHPCalcP2, "cell 1 1");
		
		lblPlayerAttackP2 = new JLabel("Attack: ");
		panelPlayerStatsP2.add(lblPlayerAttackP2, "cell 0 2");
		
		lblPlayerAttackCalcP2 = new JLabel("0");
		panelPlayerStatsP2.add(lblPlayerAttackCalcP2, "cell 1 2");
		
		lblPlayerDefenseP2 = new JLabel("Defense: ");
		panelPlayerStatsP2.add(lblPlayerDefenseP2, "cell 0 3");
		
		lblPlayerDefenseCalcP2 = new JLabel("0");
		panelPlayerStatsP2.add(lblPlayerDefenseCalcP2, "cell 1 3");
		
		lblPlayerSpAttackP2 = new JLabel("Special Attack: ");
		panelPlayerStatsP2.add(lblPlayerSpAttackP2, "cell 0 4");
		
		lblPlayerSpAttackCalcP2 = new JLabel("0");
		panelPlayerStatsP2.add(lblPlayerSpAttackCalcP2, "cell 1 4");
		
		lblPlayerSpDefenseP2 = new JLabel("Special Defense: ");
		panelPlayerStatsP2.add(lblPlayerSpDefenseP2, "cell 0 5");
		
		lblPlayerSpDefenseCalcP2 = new JLabel("0");
		panelPlayerStatsP2.add(lblPlayerSpDefenseCalcP2, "cell 1 5");
		
		lblPlayerSpeedP2 = new JLabel("Speed: ");
		panelPlayerStatsP2.add(lblPlayerSpeedP2, "cell 0 6");
		
		lblPlayerSpeedCalcP2 = new JLabel("0");
		panelPlayerStatsP2.add(lblPlayerSpeedCalcP2, "cell 1 6");
		
		JLabel lblPlayerNatureP2 = new JLabel("Nature: ");
		panelPlayerStatsP2.add(lblPlayerNatureP2, "cell 0 7");
		
		spinnerPlayerNatureP2 = new JSpinner();
		spinnerPlayerNatureP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerPlayerNatureP2.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getPlayerPKMN()[1].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[1]);
				statLabelUpdaterPlayerP2();
				playerStatColors();
			}

			private void playerStatColors() {
				lblPlayerAttackP2.setForeground(Color.BLACK);
				lblPlayerDefenseP2.setForeground(Color.BLACK);
				lblPlayerSpAttackP2.setForeground(Color.BLACK);
				lblPlayerSpDefenseP2.setForeground(Color.BLACK);
				lblPlayerSpeedP2.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getPlayerPKMN()[1].getNature()][1] == StatCalc.natures[CurrentSimData.getPlayerPKMN()[1].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[1].getNature()][1])
					{
					case StatCalc.ATTACK: lblPlayerAttackP2.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP2.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP2.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP2.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP2.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[1].getNature()][1])
					{
					case StatCalc.ATTACK: lblPlayerAttackP2.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP2.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP2.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP2.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP2.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerPlayerNatureP2.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelPlayerStatsP2.add(spinnerPlayerNatureP2, "cell 1 7 2 1,growx");
		
		JPanel panelPlayerExtraP2 = new JPanel();
		panelPlayerExtraP2.setOpaque(false);
		panelPlayerP2.add(panelPlayerExtraP2, "cell 4 0,grow");
		panelPlayerExtraP2.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblPlayerGenderP2 = new JLabel("Gender: ");
		panelPlayerExtraP2.add(lblPlayerGenderP2, "cell 0 0,aligny top");
		
		rdbtnPlayerMaleP2 = new JRadioButton("Male");
		playerGenderGroupP2.add(rdbtnPlayerMaleP2);
		panelPlayerExtraP2.add(rdbtnPlayerMaleP2, "flowy,cell 1 0");
		
		rdbtnPlayerFemaleP2 = new JRadioButton("Female");
		playerGenderGroupP2.add(rdbtnPlayerFemaleP2);
		panelPlayerExtraP2.add(rdbtnPlayerFemaleP2, "cell 1 0");
		
		rdbtnPlayerGenderlessP2 = new JRadioButton("Genderless");
		playerGenderGroupP2.add(rdbtnPlayerGenderlessP2);
		panelPlayerExtraP2.add(rdbtnPlayerGenderlessP2, "cell 1 0");
		rdbtnPlayerMaleP2.setSelected(true);
		panelPlayerP2.add(scrollPanePlayerP2, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_PlayerP2 = new JPanel();
		panel_3_PlayerP2.setOpaque(false);
		panel_3_PlayerP2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddPlayerP2 = new JButton(">>");
		buttonAddPlayerP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerMovesP2.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedPlayerMovesP2.length)
					{
						if(selectedPlayerMovesP2[i] == "None")
						{
							selectedPlayerMovesP2[i] = (String) listPlayerMovesP2.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedPlayerMovesP2[i] == Names.fullMoveNames[w])
								{
									try {
										playerMovesP2[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listPlayerSelectedMovesP2.setListData(selectedPlayerMovesP2);
				}
			}
		});
		panel_3_PlayerP2.add(buttonAddPlayerP2);
		
		JButton buttonRemovePlayerP2 = new JButton("<<");
		buttonRemovePlayerP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerSelectedMovesP2.getSelectedValue()!= null)
				{
					playerMovesP2[listPlayerSelectedMovesP2.getSelectedIndex()] = new None();
					selectedPlayerMovesP2[listPlayerSelectedMovesP2.getSelectedIndices()[1]] = "None";
					listPlayerSelectedMovesP2.setListData(selectedPlayerMovesP2);
				}
			}
		});
		
		JPanel panelPlayerMovePreviewP2 = new JPanel();
		panelPlayerMovePreviewP2.setOpaque(false);
		panelPlayerP2.add(panelPlayerMovePreviewP2, "cell 1 1,grow");
		panelPlayerMovePreviewP2.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblPlayerMoveTypeP2 = new JLabel("Move Type: ");
		panelPlayerMovePreviewP2.add(lblPlayerMoveTypeP2, "cell 0 0,alignx left,aligny top");
		
		lblPlayerMoveTypeIconP2 = new JLabel();
		panelPlayerMovePreviewP2.add(lblPlayerMoveTypeIconP2, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryP2 = new JLabel("Category: ");
		panelPlayerMovePreviewP2.add(lblPlayerMoveCategoryP2, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryCalcP2 = new JLabel("");
		panelPlayerMovePreviewP2.add(lblPlayerMoveCategoryCalcP2, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblPlayerMovePowerP2 = new JLabel("Power: ");
		panelPlayerMovePreviewP2.add(lblPlayerMovePowerP2, "cell 0 2");
		
		JLabel lblPlayerMovePowerCalcP2 = new JLabel("");
		panelPlayerMovePreviewP2.add(lblPlayerMovePowerCalcP2, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyP2 = new JLabel("Accuracy: ");
		panelPlayerMovePreviewP2.add(lblPlayerMoveAccuracyP2, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyCalcP2 = new JLabel("");
		panelPlayerMovePreviewP2.add(lblPlayerMoveAccuracyCalcP2, "cell 1 3");
		panelPlayerP2.add(panel_3_PlayerP2, "cell 2 1,grow");
		
		panel_3_PlayerP2.add(buttonRemovePlayerP2);
		
		
		listPlayerSelectedMovesP2.setSelectionModel(smPlayerP2);
		panelPlayerP2.add(listPlayerSelectedMovesP2, "cell 3 1,grow");
		
		JPanel panelPlayerMoveDetailsP2 = new JPanel();
		panelPlayerMoveDetailsP2.setOpaque(false);
		panelPlayerP2.add(panelPlayerMoveDetailsP2, "cell 4 1,grow");
		panelPlayerMoveDetailsP2.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblPlayerMoveTypeDetailsP2 = new JLabel("Move Type: ");
		panelPlayerMoveDetailsP2.add(lblPlayerMoveTypeDetailsP2, "cell 0 0,alignx left");
		
		JLabel lblPlayerMoveTypeIconDisplayP2 = new JLabel("");
		panelPlayerMoveDetailsP2.add(lblPlayerMoveTypeIconDisplayP2, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryDetailsP2 = new JLabel("Category: ");
		panelPlayerMoveDetailsP2.add(lblPlayerMoveCategoryDetailsP2, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryDisplayP2 = new JLabel("");
		panelPlayerMoveDetailsP2.add(lblPlayerMoveCategoryDisplayP2, "cell 1 1");
		
		JLabel lblPlayerMovePowerDetailsP2 = new JLabel("Power: ");
		panelPlayerMoveDetailsP2.add(lblPlayerMovePowerDetailsP2, "cell 0 2");
		
		JLabel lblPlayerMovePowerDisplayP2 = new JLabel("");
		panelPlayerMoveDetailsP2.add(lblPlayerMovePowerDisplayP2, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyDetailsP2 = new JLabel("Accuracy: ");
		panelPlayerMoveDetailsP2.add(lblPlayerMoveAccuracyDetailsP2, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyDisplayP2 = new JLabel("");
		panelPlayerMoveDetailsP2.add(lblPlayerMoveAccuracyDisplayP2, "cell 1 3");
		
		JLabel lblPlayerMaxPPP2 = new JLabel("Max PP: ");
		panelPlayerMoveDetailsP2.add(lblPlayerMaxPPP2, "cell 0 4");
		
		JLabel lblPlayerMaxPPCalcP2 = new JLabel("0");
		panelPlayerMoveDetailsP2.add(lblPlayerMaxPPCalcP2, "cell 1 4");
		
		JLabel lblPlayerCurrentPPP2 = new JLabel("Current PP: ");
		panelPlayerMoveDetailsP2.add(lblPlayerCurrentPPP2, "cell 0 5");
		
		JSpinner spinnerPlayerCurrentPPP2 = new JSpinner();
		spinnerPlayerCurrentPPP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				playerMovesP2[listPlayerSelectedMovesP2.getSelectedIndex()].setPp((int) spinnerPlayerCurrentPPP2.getValue());
				playerMovesP2[listPlayerSelectedMovesP2.getSelectedIndex()].setCurrentPP((int) spinnerPlayerCurrentPPP2.getValue());
			}
		});
		panelPlayerMoveDetailsP2.add(spinnerPlayerCurrentPPP2, "cell 1 5");
		
		
		
		listPlayerMovesP2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listPlayerMovesP2.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}
						lblPlayerMoveTypeIconP2.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblPlayerMoveCategoryCalcP2.setText(catText);
						lblPlayerMovePowerCalcP2.setText(selected.getPower()+"");
						lblPlayerMoveAccuracyCalcP2.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listPlayerSelectedMovesP2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listPlayerSelectedMovesP2.getSelectedIndex();
				
				lblPlayerMaxPPCalcP2.setText(playerMovesP2[i].getMaxPP() + "");
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+playerMovesP1[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblPlayerMoveTypeIconDisplayP2.setIcon(new ImageIcon(image));
				String catTextDisplay = "None";
				switch (playerMovesP2[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblPlayerMoveCategoryDisplayP2.setText(catTextDisplay);
				lblPlayerMovePowerDisplayP2.setText(playerMovesP2[i].getPower()+"");
				lblPlayerMoveAccuracyDisplayP2.setText(playerMovesP2[i].getAccuracy()+"");
				spinnerPlayerCurrentPPP2.setModel(new SpinnerNumberModel(0, 0, playerMovesP2[i].getMaxPP(), 1));
				spinnerPlayerCurrentPPP2.setValue(playerMovesP2[i].getPp());
				repaint();
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		panelPlayerP3 = new JPanel();
		panelPlayerP3.setBackground(new Color(240,240,240,123));
		contentPane.add(panelPlayerP3);
		panelPlayerP3.setVisible(false);
		selectedPlayerMovesP3 = new String[] {"None", "None", "None", "None"};
		JScrollPane scrollPanePlayer3 = new JScrollPane();
		panelPlayerP3.add(scrollPanePlayer3, "cell 0 0,grow");
		listPlayerPokemonP3 = new JList(Names.pokemonNames);
		scrollPanePlayer3.setViewportView(listPlayerPokemonP3);
		listPlayerPokemonP3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListSelectionModel pPlayerP3 = new DefaultListSelectionModel();
		pPlayerP3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pPlayerP3.setLeadAnchorNotificationEnabled(false);
		listPlayerPokemonP3.setSelectionModel(pPlayerP3);
		listPlayerPokemonP3.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getPlayerPKMN()[2] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listPlayerPokemonP3.getSelectedIndex()]).newInstance();
					if(pPlayerP3.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getPlayerPKMN()[2].getValidMoves().length];
					while(i < CurrentSimData.getPlayerPKMN()[2].getValidMoves().length)
					{
						
						int t = CurrentSimData.getPlayerPKMN()[2].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedPlayerMovesP3[0] = "None";
					selectedPlayerMovesP3[1] = "None";
					selectedPlayerMovesP3[2] = "None";
					selectedPlayerMovesP3[3] = "None";
					playerMovesP3 = new Move[]{new None(), new None(), new None(), new None()};
					listPlayerSelectedMovesP3.setListData(selectedPlayerMovesP3);
					listPlayerMovesP3.setListData(label);
					
					spinnerPlayerHPIVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getIvHp());
					spinnerPlayerAttackIVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getIvAttack());
					spinnerPlayerDefenseIVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getIvDefense());
					spinnerPlayerSpAttackIVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getIvSpAttack());
					spinnerPlayerSpDefenseIVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getIvSpDefense());
					spinnerPlayerSpeedIVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getIvSpeed());
					
					spinnerPlayerHPEVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getEvHp());
					spinnerPlayerAttackEVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getEvAttack());
					spinnerPlayerDefenseEVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getEvDefense());
					spinnerPlayerSpAttackEVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getEvSpAttack());
					spinnerPlayerSpDefenseEVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getEvSpDefense());
					spinnerPlayerSpeedEVP3.setValue(CurrentSimData.getPlayerPKMN()[2].getEvSpeed());
					
					spinnerPlayerLevelP3.setValue(CurrentSimData.getPlayerPKMN()[2].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		DefaultListSelectionModel mPlayerP3 = new DefaultListSelectionModel();
		mPlayerP3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mPlayerP3.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smPlayerP3 = new DefaultListSelectionModel();
		smPlayerP3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smPlayerP3.setLeadAnchorNotificationEnabled(false);
		panelPlayerP3.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		panelPlayerP3.add(scrollPanePlayer3, "cell 0 0,grow");
		
		JScrollPane scrollPanePlayerP3 = new JScrollPane();
		scrollPanePlayerP3.setViewportView(listPlayerMovesP3);
		listPlayerMovesP3.setSelectionModel(mPlayerP3);
		listPlayerMovesP3.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JPanel panelPlayerIVP3 = new JPanel();
		panelPlayerIVP3.setOpaque(false);
		panelPlayerP3.add(panelPlayerIVP3, "cell 1 0,grow");
		panelPlayerIVP3.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblPlayerIVsP3 = new JLabel("IVs");
		panelPlayerIVP3.add(lblPlayerIVsP3, "cell 0 0");
		
		JLabel lblPlayerHPIVP3 = new JLabel("HP: ");
		panelPlayerIVP3.add(lblPlayerHPIVP3, "cell 0 1");
		
		spinnerPlayerHPIVP3 = new JSpinner();
		spinnerPlayerHPIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[2].setIvHp(Double.parseDouble(""+spinnerPlayerHPIVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[2].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[2].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[2].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel()));
				statLabelUpdaterPlayerP3();
			}
		});
		spinnerPlayerHPIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP3.add(spinnerPlayerHPIVP3, "cell 1 1");
		
		JLabel lblPlayerAttackIVP3 = new JLabel("Attack: ");
		panelPlayerIVP3.add(lblPlayerAttackIVP3, "cell 0 2");
		
		spinnerPlayerAttackIVP3 = new JSpinner();
		spinnerPlayerAttackIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[2].setIvAttack(Double.parseDouble(""+spinnerPlayerAttackIVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[2].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[2].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[2].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[2].getNature()));
						statLabelUpdaterPlayerP3();
			}
		});
		spinnerPlayerAttackIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP3.add(spinnerPlayerAttackIVP3, "cell 1 2");
		
		JLabel lblPlayerDefenseIVP3 = new JLabel("Defense: ");
		panelPlayerIVP3.add(lblPlayerDefenseIVP3, "cell 0 3");
		
		spinnerPlayerDefenseIVP3 = new JSpinner();
		spinnerPlayerDefenseIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[2].setIvDefense(Double.parseDouble(""+spinnerPlayerDefenseIVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[2].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[2].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[2].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[2].getNature()));
						statLabelUpdaterPlayerP3();
			}
		});
		spinnerPlayerDefenseIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP3.add(spinnerPlayerDefenseIVP3, "cell 1 3");
		
		JLabel lblPlayerSpAttackIVP3 = new JLabel("Special Attack: ");
		panelPlayerIVP3.add(lblPlayerSpAttackIVP3, "cell 0 4");
		
		spinnerPlayerSpAttackIVP3 = new JSpinner();
		spinnerPlayerSpAttackIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[2].setIvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackIVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setSpAttack(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[2].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[2].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[2].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[2].getNature()));
						statLabelUpdaterPlayerP3();
			}
		});
		spinnerPlayerSpAttackIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP3.add(spinnerPlayerSpAttackIVP3, "cell 1 4");
		
		JLabel lblPlayerSpDefenseIVP3 = new JLabel("Special Defense: ");
		panelPlayerIVP3.add(lblPlayerSpDefenseIVP3, "cell 0 5");
		
		spinnerPlayerSpDefenseIVP3 = new JSpinner();
		spinnerPlayerSpDefenseIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[2].setIvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseIVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setSpDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[2].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[2].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[2].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[2].getNature()));
						statLabelUpdaterPlayerP3();
			}
		});
		spinnerPlayerSpDefenseIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP3.add(spinnerPlayerSpDefenseIVP3, "cell 1 5");
		
		JLabel lblPlayerSpeedIVP3 = new JLabel("Speed: ");
		panelPlayerIVP3.add(lblPlayerSpeedIVP3, "cell 0 6");
		
		spinnerPlayerSpeedIVP3 = new JSpinner();
		spinnerPlayerSpeedIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[2].setIvSpeed(Double.parseDouble(""+spinnerPlayerSpeedIVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setSpeed(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[2].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[2].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[2].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[2].getNature()));
						statLabelUpdaterPlayerP3();
			}
		});
		spinnerPlayerSpeedIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP3.add(spinnerPlayerSpeedIVP3, "cell 1 6");
		
		JPanel panelPlayerEVP3 = new JPanel();
		panelPlayerEVP3.setOpaque(false);
		panelPlayerP3.add(panelPlayerEVP3, "cell 2 0,grow");
		panelPlayerEVP3.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblPlayerEVsP3 = new JLabel("EVs");
		panelPlayerEVP3.add(lblPlayerEVsP3, "cell 0 0");
		
		JLabel lblPlayerEVMaxP3 = new JLabel("Available: ");
		panelPlayerEVP3.add(lblPlayerEVMaxP3, "cell 1 0");
		
		lblPlayerEVsAvailableP3 = new JLabel("510");
		panelPlayerEVP3.add(lblPlayerEVsAvailableP3, "cell 2 0");
		
		JLabel lblPlayerHPEVP3 = new JLabel("HP: ");
		panelPlayerEVP3.add(lblPlayerHPEVP3, "cell 0 1");
		
		spinnerPlayerHPEVP3 = new JSpinner();
		spinnerPlayerHPEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP3 < 0)
				{
					spinnerPlayerHPEVP3.setValue((int)spinnerPlayerHPEVP3.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[2].setEvHp(Double.parseDouble(""+spinnerPlayerHPEVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[2].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[2].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[2].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel()));
						statLabelUpdaterPlayerP3();
						playerEVCheckP3();
			}
		});
		spinnerPlayerHPEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP3.add(spinnerPlayerHPEVP3, "cell 1 1");
		
		JLabel lblPlayerAttackEVP3 = new JLabel("Attack: ");
		panelPlayerEVP3.add(lblPlayerAttackEVP3, "cell 0 2");
		
		spinnerPlayerAttackEVP3 = new JSpinner();
		spinnerPlayerAttackEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP3 < 0)
				{
					spinnerPlayerAttackEVP3.setValue((int)spinnerPlayerAttackEVP3.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[2].setEvAttack(Double.parseDouble(""+spinnerPlayerAttackEVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[2].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[2].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[2].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[2].getNature()));
						statLabelUpdaterPlayerP3();
						playerEVCheckP3();
			}
		});
		spinnerPlayerAttackEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP3.add(spinnerPlayerAttackEVP3, "cell 1 2");
		
		JLabel lblPlayerDefenseEVP3 = new JLabel("Defense: ");
		panelPlayerEVP3.add(lblPlayerDefenseEVP3, "cell 0 3");
		
		spinnerPlayerDefenseEVP3 = new JSpinner();
		spinnerPlayerDefenseEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP3 < 0)
				{
					spinnerPlayerDefenseEVP3.setValue((int)spinnerPlayerDefenseEVP3.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[2].setEvDefense(Double.parseDouble(""+spinnerPlayerDefenseEVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[2].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[2].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[2].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[2].getNature()));
						statLabelUpdaterPlayerP3();
						playerEVCheckP3();
			}
		});
		spinnerPlayerDefenseEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP3.add(spinnerPlayerDefenseEVP3, "cell 1 3");
		
		JLabel lblPlayerSpAttackEVP3 = new JLabel("Special Attack: ");
		panelPlayerEVP3.add(lblPlayerSpAttackEVP3, "cell 0 4");
		
		spinnerPlayerSpAttackEVP3 = new JSpinner();
		spinnerPlayerSpAttackEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP3 < 0)
				{
					spinnerPlayerSpAttackEVP3.setValue((int)spinnerPlayerSpAttackEVP3.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[2].setEvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackEVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setSpAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[2].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[2].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[2].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[2].getNature()));
						statLabelUpdaterPlayerP3();
						playerEVCheckP3();
			}
		});
		spinnerPlayerSpAttackEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP3.add(spinnerPlayerSpAttackEVP3, "cell 1 4");
		
		JLabel lblPlayerSpDefenseEVP3 = new JLabel("Special Defense: ");
		panelPlayerEVP3.add(lblPlayerSpDefenseEVP3, "cell 0 5");
		
		spinnerPlayerSpDefenseEVP3 = new JSpinner();
		spinnerPlayerSpDefenseEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP3 < 0)
				{
					spinnerPlayerSpDefenseEVP3.setValue((int)spinnerPlayerSpDefenseEVP3.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[2].setEvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseEVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setSpDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[2].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[2].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[2].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[2].getNature()));
						statLabelUpdaterPlayerP3();
						playerEVCheckP3();
			}
		});
		spinnerPlayerSpDefenseEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP3.add(spinnerPlayerSpDefenseEVP3, "cell 1 5");
		
		JLabel lblPlayerSpeedEVP3 = new JLabel("Speed: ");
		panelPlayerEVP3.add(lblPlayerSpeedEVP3, "cell 0 7");
		
		spinnerPlayerSpeedEVP3 = new JSpinner();
		spinnerPlayerSpeedEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP3 < 0)
				{
					spinnerPlayerSpeedEVP3.setValue((int)spinnerPlayerSpeedEVP3.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[2].setEvSpeed(Double.parseDouble(""+spinnerPlayerSpeedEVP3.getValue()));
				CurrentSimData.getPlayerPKMN()[2].setSpeed(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[2].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[2].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[2].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[2].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[2].getNature()));
						statLabelUpdaterPlayerP3();
						playerEVCheckP3();
			}
		});
		spinnerPlayerSpeedEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP3.add(spinnerPlayerSpeedEVP3, "cell 1 7");
		
		JPanel panelPlayerStatsP3 = new JPanel();
		panelPlayerStatsP3.setOpaque(false);
		panelPlayerP3.add(panelPlayerStatsP3, "cell 3 0,grow");
		panelPlayerStatsP3.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblPlayerLevelP3 = new JLabel("Level: ");
		panelPlayerStatsP3.add(lblPlayerLevelP3, "cell 0 0");
		
		spinnerPlayerLevelP3 = new JSpinner();
		spinnerPlayerLevelP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[2].setLevel(Double.parseDouble(""+spinnerPlayerLevelP3.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[2]);
				statLabelUpdaterPlayerP3();
			}
		});
		spinnerPlayerLevelP3.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelPlayerStatsP3.add(spinnerPlayerLevelP3, "cell 1 0");
		
		lblPlayerHPP3 = new JLabel("HP: ");
		panelPlayerStatsP3.add(lblPlayerHPP3, "cell 0 1");
		
		lblPlayerHPCalcP3 = new JLabel("0");
		panelPlayerStatsP3.add(lblPlayerHPCalcP3, "cell 1 1");
		
		lblPlayerAttackP3 = new JLabel("Attack: ");
		panelPlayerStatsP3.add(lblPlayerAttackP3, "cell 0 2");
		
		lblPlayerAttackCalcP3 = new JLabel("0");
		panelPlayerStatsP3.add(lblPlayerAttackCalcP3, "cell 1 2");
		
		lblPlayerDefenseP3 = new JLabel("Defense: ");
		panelPlayerStatsP3.add(lblPlayerDefenseP3, "cell 0 3");
		
		lblPlayerDefenseCalcP3 = new JLabel("0");
		panelPlayerStatsP3.add(lblPlayerDefenseCalcP3, "cell 1 3");
		
		lblPlayerSpAttackP3 = new JLabel("Special Attack: ");
		panelPlayerStatsP3.add(lblPlayerSpAttackP3, "cell 0 4");
		
		lblPlayerSpAttackCalcP3 = new JLabel("0");
		panelPlayerStatsP3.add(lblPlayerSpAttackCalcP3, "cell 1 4");
		
		lblPlayerSpDefenseP3 = new JLabel("Special Defense: ");
		panelPlayerStatsP3.add(lblPlayerSpDefenseP3, "cell 0 5");
		
		lblPlayerSpDefenseCalcP3 = new JLabel("0");
		panelPlayerStatsP3.add(lblPlayerSpDefenseCalcP3, "cell 1 5");
		
		lblPlayerSpeedP3 = new JLabel("Speed: ");
		panelPlayerStatsP3.add(lblPlayerSpeedP3, "cell 0 6");
		
		lblPlayerSpeedCalcP3 = new JLabel("0");
		panelPlayerStatsP3.add(lblPlayerSpeedCalcP3, "cell 1 6");
		
		JLabel lblPlayerNatureP3 = new JLabel("Nature: ");
		panelPlayerStatsP3.add(lblPlayerNatureP3, "cell 0 7");
		
		spinnerPlayerNatureP3 = new JSpinner();
		spinnerPlayerNatureP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerPlayerNatureP3.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getPlayerPKMN()[2].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[2]);
				statLabelUpdaterPlayerP3();
				playerStatColors();
			}

			private void playerStatColors() {
				lblPlayerAttackP3.setForeground(Color.BLACK);
				lblPlayerDefenseP3.setForeground(Color.BLACK);
				lblPlayerSpAttackP3.setForeground(Color.BLACK);
				lblPlayerSpDefenseP3.setForeground(Color.BLACK);
				lblPlayerSpeedP3.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getPlayerPKMN()[2].getNature()][2] == StatCalc.natures[CurrentSimData.getPlayerPKMN()[2].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[2].getNature()][2])
					{
					case StatCalc.ATTACK: lblPlayerAttackP3.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP3.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP3.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP3.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP3.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[2].getNature()][1])
					{
					case StatCalc.ATTACK: lblPlayerAttackP3.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP3.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP3.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP3.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP3.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerPlayerNatureP3.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelPlayerStatsP3.add(spinnerPlayerNatureP3, "cell 1 7 2 1,growx");
		
		JPanel panelPlayerExtraP3 = new JPanel();
		panelPlayerExtraP3.setOpaque(false);
		panelPlayerP3.add(panelPlayerExtraP3, "cell 4 0,grow");
		panelPlayerExtraP3.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblPlayerGenderP3 = new JLabel("Gender: ");
		panelPlayerExtraP3.add(lblPlayerGenderP3, "cell 0 0,aligny top");
		
		rdbtnPlayerMaleP3 = new JRadioButton("Male");
		playerGenderGroupP3.add(rdbtnPlayerMaleP3);
		panelPlayerExtraP3.add(rdbtnPlayerMaleP3, "flowy,cell 1 0");
		
		rdbtnPlayerFemaleP3 = new JRadioButton("Female");
		playerGenderGroupP3.add(rdbtnPlayerFemaleP3);
		panelPlayerExtraP3.add(rdbtnPlayerFemaleP3, "cell 1 0");
		
		rdbtnPlayerGenderlessP3 = new JRadioButton("Genderless");
		playerGenderGroupP3.add(rdbtnPlayerGenderlessP3);
		panelPlayerExtraP3.add(rdbtnPlayerGenderlessP3, "cell 1 0");
		rdbtnPlayerMaleP3.setSelected(true);
		panelPlayerP3.add(scrollPanePlayerP3, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_PlayerP3 = new JPanel();
		panel_3_PlayerP3.setOpaque(false);
		panel_3_PlayerP3.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddPlayerP3 = new JButton(">>");
		buttonAddPlayerP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerMovesP3.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedPlayerMovesP3.length)
					{
						if(selectedPlayerMovesP3[i] == "None")
						{
							selectedPlayerMovesP3[i] = (String) listPlayerMovesP3.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedPlayerMovesP3[i] == Names.fullMoveNames[w])
								{
									try {
										playerMovesP3[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listPlayerSelectedMovesP3.setListData(selectedPlayerMovesP3);
				}
			}
		});
		panel_3_PlayerP3.add(buttonAddPlayerP3);
		
		JButton buttonRemovePlayerP3 = new JButton("<<");
		buttonRemovePlayerP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerSelectedMovesP3.getSelectedValue()!= null)
				{
					playerMovesP3[listPlayerSelectedMovesP3.getSelectedIndex()] = new None();
					selectedPlayerMovesP3[listPlayerSelectedMovesP3.getSelectedIndices()[2]] = "None";
					listPlayerSelectedMovesP3.setListData(selectedPlayerMovesP3);
				}
			}
		});
		
		JPanel panelPlayerMovePreviewP3 = new JPanel();
		panelPlayerMovePreviewP3.setOpaque(false);
		panelPlayerP3.add(panelPlayerMovePreviewP3, "cell 1 1,grow");
		panelPlayerMovePreviewP3.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblPlayerMoveTypeP3 = new JLabel("Move Type: ");
		panelPlayerMovePreviewP3.add(lblPlayerMoveTypeP3, "cell 0 0,alignx left,aligny top");
		
		lblPlayerMoveTypeIconP3 = new JLabel();
		panelPlayerMovePreviewP3.add(lblPlayerMoveTypeIconP3, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryP3 = new JLabel("Category: ");
		panelPlayerMovePreviewP3.add(lblPlayerMoveCategoryP3, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryCalcP3 = new JLabel("");
		panelPlayerMovePreviewP3.add(lblPlayerMoveCategoryCalcP3, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblPlayerMovePowerP3 = new JLabel("Power: ");
		panelPlayerMovePreviewP3.add(lblPlayerMovePowerP3, "cell 0 2");
		
		JLabel lblPlayerMovePowerCalcP3 = new JLabel("");
		panelPlayerMovePreviewP3.add(lblPlayerMovePowerCalcP3, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyP3 = new JLabel("Accuracy: ");
		panelPlayerMovePreviewP3.add(lblPlayerMoveAccuracyP3, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyCalcP3 = new JLabel("");
		panelPlayerMovePreviewP3.add(lblPlayerMoveAccuracyCalcP3, "cell 1 3");
		panelPlayerP3.add(panel_3_PlayerP3, "cell 2 1,grow");
		
		panel_3_PlayerP3.add(buttonRemovePlayerP3);
		
		
		listPlayerSelectedMovesP3.setSelectionModel(smPlayerP3);
		panelPlayerP3.add(listPlayerSelectedMovesP3, "cell 3 1,grow");
		
		JPanel panelPlayerMoveDetailsP3 = new JPanel();
		panelPlayerMoveDetailsP3.setOpaque(false);
		panelPlayerP3.add(panelPlayerMoveDetailsP3, "cell 4 1,grow");
		panelPlayerMoveDetailsP3.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblPlayerMoveTypeDetailsP3 = new JLabel("Move Type: ");
		panelPlayerMoveDetailsP3.add(lblPlayerMoveTypeDetailsP3, "cell 0 0,alignx left");
		
		JLabel lblPlayerMoveTypeIconDisplayP3 = new JLabel("");
		panelPlayerMoveDetailsP3.add(lblPlayerMoveTypeIconDisplayP3, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryDetailsP3 = new JLabel("Category: ");
		panelPlayerMoveDetailsP3.add(lblPlayerMoveCategoryDetailsP3, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryDisplayP3 = new JLabel("");
		panelPlayerMoveDetailsP3.add(lblPlayerMoveCategoryDisplayP3, "cell 1 1");
		
		JLabel lblPlayerMovePowerDetailsP3 = new JLabel("Power: ");
		panelPlayerMoveDetailsP3.add(lblPlayerMovePowerDetailsP3, "cell 0 2");
		
		JLabel lblPlayerMovePowerDisplayP3 = new JLabel("");
		panelPlayerMoveDetailsP3.add(lblPlayerMovePowerDisplayP3, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyDetailsP3 = new JLabel("Accuracy: ");
		panelPlayerMoveDetailsP3.add(lblPlayerMoveAccuracyDetailsP3, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyDisplayP3 = new JLabel("");
		panelPlayerMoveDetailsP3.add(lblPlayerMoveAccuracyDisplayP3, "cell 1 3");
		
		JLabel lblPlayerMaxPPP3 = new JLabel("Max PP: ");
		panelPlayerMoveDetailsP3.add(lblPlayerMaxPPP3, "cell 0 4");
		
		JLabel lblPlayerMaxPPCalcP3 = new JLabel("0");
		panelPlayerMoveDetailsP3.add(lblPlayerMaxPPCalcP3, "cell 1 4");
		
		JLabel lblPlayerCurrentPPP3 = new JLabel("Current PP: ");
		panelPlayerMoveDetailsP3.add(lblPlayerCurrentPPP3, "cell 0 5");
		
		JSpinner spinnerPlayerCurrentPPP3 = new JSpinner();
		spinnerPlayerCurrentPPP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				playerMovesP3[listPlayerSelectedMovesP3.getSelectedIndex()].setPp((int) spinnerPlayerCurrentPPP3.getValue());
				playerMovesP3[listPlayerSelectedMovesP3.getSelectedIndex()].setCurrentPP((int) spinnerPlayerCurrentPPP3.getValue());
			}
		});
		panelPlayerMoveDetailsP3.add(spinnerPlayerCurrentPPP3, "cell 1 5");
		
		
		
		listPlayerMovesP3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listPlayerMovesP3.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lblPlayerMoveTypeIconP3.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblPlayerMoveCategoryCalcP3.setText(catText);
						lblPlayerMovePowerCalcP3.setText(selected.getPower()+"");
						lblPlayerMoveAccuracyCalcP3.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listPlayerSelectedMovesP3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listPlayerSelectedMovesP3.getSelectedIndex();
				
				lblPlayerMaxPPCalcP3.setText(playerMovesP3[i].getMaxPP() + "");
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+playerMovesP1[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblPlayerMoveTypeIconDisplayP3.setIcon(new ImageIcon(image));
				String catTextDisplay = "None";
				switch (playerMovesP3[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblPlayerMoveCategoryDisplayP3.setText(catTextDisplay);
				lblPlayerMovePowerDisplayP3.setText(playerMovesP3[i].getPower()+"");
				lblPlayerMoveAccuracyDisplayP3.setText(playerMovesP3[i].getAccuracy()+"");
				spinnerPlayerCurrentPPP3.setModel(new SpinnerNumberModel(0, 0, playerMovesP3[i].getMaxPP(), 1));
				spinnerPlayerCurrentPPP3.setValue(playerMovesP3[i].getPp());
				repaint();
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		panelPlayerP4 = new JPanel();
		panelPlayerP4.setBackground(new Color(240,240,240,123));
		contentPane.add(panelPlayerP4);
		panelPlayerP4.setVisible(false);
		selectedPlayerMovesP4 = new String[] {"None", "None", "None", "None"};
		JScrollPane scrollPanePlayer4 = new JScrollPane();
		panelPlayerP4.add(scrollPanePlayer4, "cell 0 0,grow");
		listPlayerPokemonP4 = new JList(Names.pokemonNames);
		scrollPanePlayer4.setViewportView(listPlayerPokemonP4);
		listPlayerPokemonP4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListSelectionModel pPlayerP4 = new DefaultListSelectionModel();
		pPlayerP4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pPlayerP4.setLeadAnchorNotificationEnabled(false);
		listPlayerPokemonP4.setSelectionModel(pPlayerP4);
		listPlayerPokemonP4.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getPlayerPKMN()[3] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listPlayerPokemonP4.getSelectedIndex()]).newInstance();
					if(pPlayerP4.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getPlayerPKMN()[3].getValidMoves().length];
					while(i < CurrentSimData.getPlayerPKMN()[3].getValidMoves().length)
					{
						
						int t = CurrentSimData.getPlayerPKMN()[3].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedPlayerMovesP4[0] = "None";
					selectedPlayerMovesP4[1] = "None";
					selectedPlayerMovesP4[2] = "None";
					selectedPlayerMovesP4[3] = "None";
					playerMovesP4 = new Move[]{new None(), new None(), new None(), new None()};
					listPlayerSelectedMovesP4.setListData(selectedPlayerMovesP4);
					listPlayerMovesP4.setListData(label);
					
					spinnerPlayerHPIVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getIvHp());
					spinnerPlayerAttackIVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getIvAttack());
					spinnerPlayerDefenseIVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getIvDefense());
					spinnerPlayerSpAttackIVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getIvSpAttack());
					spinnerPlayerSpDefenseIVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getIvSpDefense());
					spinnerPlayerSpeedIVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getIvSpeed());
					
					spinnerPlayerHPEVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getEvHp());
					spinnerPlayerAttackEVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getEvAttack());
					spinnerPlayerDefenseEVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getEvDefense());
					spinnerPlayerSpAttackEVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getEvSpAttack());
					spinnerPlayerSpDefenseEVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getEvSpDefense());
					spinnerPlayerSpeedEVP4.setValue(CurrentSimData.getPlayerPKMN()[3].getEvSpeed());
					
					spinnerPlayerLevelP4.setValue(CurrentSimData.getPlayerPKMN()[3].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		DefaultListSelectionModel mPlayerP4 = new DefaultListSelectionModel();
		mPlayerP4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mPlayerP4.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smPlayerP4 = new DefaultListSelectionModel();
		smPlayerP4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smPlayerP4.setLeadAnchorNotificationEnabled(false);
		panelPlayerP4.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		panelPlayerP4.add(scrollPanePlayer4, "cell 0 0,grow");
		
		JScrollPane scrollPanePlayerP4 = new JScrollPane();
		scrollPanePlayerP4.setViewportView(listPlayerMovesP4);
		listPlayerMovesP4.setSelectionModel(mPlayerP4);
		listPlayerMovesP4.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JPanel panelPlayerIVP4 = new JPanel();
		panelPlayerIVP4.setOpaque(false);
		panelPlayerP4.add(panelPlayerIVP4, "cell 1 0,grow");
		panelPlayerIVP4.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblPlayerIVsP4 = new JLabel("IVs");
		panelPlayerIVP4.add(lblPlayerIVsP4, "cell 0 0");
		
		JLabel lblPlayerHPIVP4 = new JLabel("HP: ");
		panelPlayerIVP4.add(lblPlayerHPIVP4, "cell 0 1");
		
		spinnerPlayerHPIVP4 = new JSpinner();
		spinnerPlayerHPIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[3].setIvHp(Double.parseDouble(""+spinnerPlayerHPIVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[3].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[3].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[3].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel()));
				statLabelUpdaterPlayerP4();
			}
		});
		spinnerPlayerHPIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP4.add(spinnerPlayerHPIVP4, "cell 1 1");
		
		JLabel lblPlayerAttackIVP4 = new JLabel("Attack: ");
		panelPlayerIVP4.add(lblPlayerAttackIVP4, "cell 0 2");
		
		spinnerPlayerAttackIVP4 = new JSpinner();
		spinnerPlayerAttackIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[3].setIvAttack(Double.parseDouble(""+spinnerPlayerAttackIVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[3].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[3].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[3].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[3].getNature()));
						statLabelUpdaterPlayerP4();
			}
		});
		spinnerPlayerAttackIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP4.add(spinnerPlayerAttackIVP4, "cell 1 2");
		
		JLabel lblPlayerDefenseIVP4 = new JLabel("Defense: ");
		panelPlayerIVP4.add(lblPlayerDefenseIVP4, "cell 0 3");
		
		spinnerPlayerDefenseIVP4 = new JSpinner();
		spinnerPlayerDefenseIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[3].setIvDefense(Double.parseDouble(""+spinnerPlayerDefenseIVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[3].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[3].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[3].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[3].getNature()));
						statLabelUpdaterPlayerP4();
			}
		});
		spinnerPlayerDefenseIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP4.add(spinnerPlayerDefenseIVP4, "cell 1 3");
		
		JLabel lblPlayerSpAttackIVP4 = new JLabel("Special Attack: ");
		panelPlayerIVP4.add(lblPlayerSpAttackIVP4, "cell 0 4");
		
		spinnerPlayerSpAttackIVP4 = new JSpinner();
		spinnerPlayerSpAttackIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[3].setIvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackIVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setSpAttack(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[3].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[3].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[3].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[3].getNature()));
						statLabelUpdaterPlayerP4();
			}
		});
		spinnerPlayerSpAttackIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP4.add(spinnerPlayerSpAttackIVP4, "cell 1 4");
		
		JLabel lblPlayerSpDefenseIVP4 = new JLabel("Special Defense: ");
		panelPlayerIVP4.add(lblPlayerSpDefenseIVP4, "cell 0 5");
		
		spinnerPlayerSpDefenseIVP4 = new JSpinner();
		spinnerPlayerSpDefenseIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[3].setIvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseIVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setSpDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[3].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[3].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[3].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[3].getNature()));
						statLabelUpdaterPlayerP4();
			}
		});
		spinnerPlayerSpDefenseIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP4.add(spinnerPlayerSpDefenseIVP4, "cell 1 5");
		
		JLabel lblPlayerSpeedIVP4 = new JLabel("Speed: ");
		panelPlayerIVP4.add(lblPlayerSpeedIVP4, "cell 0 6");
		
		spinnerPlayerSpeedIVP4 = new JSpinner();
		spinnerPlayerSpeedIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[3].setIvSpeed(Double.parseDouble(""+spinnerPlayerSpeedIVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setSpeed(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[3].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[3].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[3].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[3].getNature()));
						statLabelUpdaterPlayerP4();
			}
		});
		spinnerPlayerSpeedIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP4.add(spinnerPlayerSpeedIVP4, "cell 1 6");
		
		JPanel panelPlayerEVP4 = new JPanel();
		panelPlayerEVP4.setOpaque(false);
		panelPlayerP4.add(panelPlayerEVP4, "cell 2 0,grow");
		panelPlayerEVP4.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblPlayerEVsP4 = new JLabel("EVs");
		panelPlayerEVP4.add(lblPlayerEVsP4, "cell 0 0");
		
		JLabel lblPlayerEVMaxP4 = new JLabel("Available: ");
		panelPlayerEVP4.add(lblPlayerEVMaxP4, "cell 1 0");
		
		lblPlayerEVsAvailableP4 = new JLabel("510");
		panelPlayerEVP4.add(lblPlayerEVsAvailableP4, "cell 2 0");
		
		JLabel lblPlayerHPEVP4 = new JLabel("HP: ");
		panelPlayerEVP4.add(lblPlayerHPEVP4, "cell 0 1");
		
		spinnerPlayerHPEVP4 = new JSpinner();
		spinnerPlayerHPEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP4 < 0)
				{
					spinnerPlayerHPEVP4.setValue((int)spinnerPlayerHPEVP4.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[3].setEvHp(Double.parseDouble(""+spinnerPlayerHPEVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[3].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[3].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[3].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel()));
						statLabelUpdaterPlayerP4();
						playerEVCheckP4();
			}
		});
		spinnerPlayerHPEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP4.add(spinnerPlayerHPEVP4, "cell 1 1");
		
		JLabel lblPlayerAttackEVP4 = new JLabel("Attack: ");
		panelPlayerEVP4.add(lblPlayerAttackEVP4, "cell 0 2");
		
		spinnerPlayerAttackEVP4 = new JSpinner();
		spinnerPlayerAttackEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP4 < 0)
				{
					spinnerPlayerAttackEVP4.setValue((int)spinnerPlayerAttackEVP4.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[3].setEvAttack(Double.parseDouble(""+spinnerPlayerAttackEVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[3].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[3].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[3].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[3].getNature()));
						statLabelUpdaterPlayerP4();
						playerEVCheckP4();
			}
		});
		spinnerPlayerAttackEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP4.add(spinnerPlayerAttackEVP4, "cell 1 2");
		
		JLabel lblPlayerDefenseEVP4 = new JLabel("Defense: ");
		panelPlayerEVP4.add(lblPlayerDefenseEVP4, "cell 0 3");
		
		spinnerPlayerDefenseEVP4 = new JSpinner();
		spinnerPlayerDefenseEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP4 < 0)
				{
					spinnerPlayerDefenseEVP4.setValue((int)spinnerPlayerDefenseEVP4.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[3].setEvDefense(Double.parseDouble(""+spinnerPlayerDefenseEVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[3].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[3].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[3].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[3].getNature()));
						statLabelUpdaterPlayerP4();
						playerEVCheckP4();
			}
		});
		spinnerPlayerDefenseEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP4.add(spinnerPlayerDefenseEVP4, "cell 1 3");
		
		JLabel lblPlayerSpAttackEVP4 = new JLabel("Special Attack: ");
		panelPlayerEVP4.add(lblPlayerSpAttackEVP4, "cell 0 4");
		
		spinnerPlayerSpAttackEVP4 = new JSpinner();
		spinnerPlayerSpAttackEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP4 < 0)
				{
					spinnerPlayerSpAttackEVP4.setValue((int)spinnerPlayerSpAttackEVP4.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[3].setEvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackEVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setSpAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[3].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[3].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[3].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[3].getNature()));
						statLabelUpdaterPlayerP4();
						playerEVCheckP4();
			}
		});
		spinnerPlayerSpAttackEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP4.add(spinnerPlayerSpAttackEVP4, "cell 1 4");
		
		JLabel lblPlayerSpDefenseEVP4 = new JLabel("Special Defense: ");
		panelPlayerEVP4.add(lblPlayerSpDefenseEVP4, "cell 0 5");
		
		spinnerPlayerSpDefenseEVP4 = new JSpinner();
		spinnerPlayerSpDefenseEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP4 < 0)
				{
					spinnerPlayerSpDefenseEVP4.setValue((int)spinnerPlayerSpDefenseEVP4.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[3].setEvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseEVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setSpDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[3].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[3].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[3].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[3].getNature()));
						statLabelUpdaterPlayerP4();
						playerEVCheckP4();
			}
		});
		spinnerPlayerSpDefenseEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP4.add(spinnerPlayerSpDefenseEVP4, "cell 1 5");
		
		JLabel lblPlayerSpeedEVP4 = new JLabel("Speed: ");
		panelPlayerEVP4.add(lblPlayerSpeedEVP4, "cell 0 7");
		
		spinnerPlayerSpeedEVP4 = new JSpinner();
		spinnerPlayerSpeedEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP4 < 0)
				{
					spinnerPlayerSpeedEVP4.setValue((int)spinnerPlayerSpeedEVP4.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[3].setEvSpeed(Double.parseDouble(""+spinnerPlayerSpeedEVP4.getValue()));
				CurrentSimData.getPlayerPKMN()[3].setSpeed(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[3].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[3].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[3].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[3].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[3].getNature()));
						statLabelUpdaterPlayerP4();
						playerEVCheckP4();
			}
		});
		spinnerPlayerSpeedEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP4.add(spinnerPlayerSpeedEVP4, "cell 1 7");
		
		JPanel panelPlayerStatsP4 = new JPanel();
		panelPlayerStatsP4.setOpaque(false);
		panelPlayerP4.add(panelPlayerStatsP4, "cell 3 0,grow");
		panelPlayerStatsP4.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblPlayerLevelP4 = new JLabel("Level: ");
		panelPlayerStatsP4.add(lblPlayerLevelP4, "cell 0 0");
		
		spinnerPlayerLevelP4 = new JSpinner();
		spinnerPlayerLevelP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[3].setLevel(Double.parseDouble(""+spinnerPlayerLevelP4.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[3]);
				statLabelUpdaterPlayerP4();
			}
		});
		spinnerPlayerLevelP4.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelPlayerStatsP4.add(spinnerPlayerLevelP4, "cell 1 0");
		
		lblPlayerHPP4 = new JLabel("HP: ");
		panelPlayerStatsP4.add(lblPlayerHPP4, "cell 0 1");
		
		lblPlayerHPCalcP4 = new JLabel("0");
		panelPlayerStatsP4.add(lblPlayerHPCalcP4, "cell 1 1");
		
		lblPlayerAttackP4 = new JLabel("Attack: ");
		panelPlayerStatsP4.add(lblPlayerAttackP4, "cell 0 2");
		
		lblPlayerAttackCalcP4 = new JLabel("0");
		panelPlayerStatsP4.add(lblPlayerAttackCalcP4, "cell 1 2");
		
		lblPlayerDefenseP4 = new JLabel("Defense: ");
		panelPlayerStatsP4.add(lblPlayerDefenseP4, "cell 0 3");
		
		lblPlayerDefenseCalcP4 = new JLabel("0");
		panelPlayerStatsP4.add(lblPlayerDefenseCalcP4, "cell 1 3");
		
		lblPlayerSpAttackP4 = new JLabel("Special Attack: ");
		panelPlayerStatsP4.add(lblPlayerSpAttackP4, "cell 0 4");
		
		lblPlayerSpAttackCalcP4 = new JLabel("0");
		panelPlayerStatsP4.add(lblPlayerSpAttackCalcP4, "cell 1 4");
		
		lblPlayerSpDefenseP4 = new JLabel("Special Defense: ");
		panelPlayerStatsP4.add(lblPlayerSpDefenseP4, "cell 0 5");
		
		lblPlayerSpDefenseCalcP4 = new JLabel("0");
		panelPlayerStatsP4.add(lblPlayerSpDefenseCalcP4, "cell 1 5");
		
		lblPlayerSpeedP4 = new JLabel("Speed: ");
		panelPlayerStatsP4.add(lblPlayerSpeedP4, "cell 0 6");
		
		lblPlayerSpeedCalcP4 = new JLabel("0");
		panelPlayerStatsP4.add(lblPlayerSpeedCalcP4, "cell 1 6");
		
		JLabel lblPlayerNatureP4 = new JLabel("Nature: ");
		panelPlayerStatsP4.add(lblPlayerNatureP4, "cell 0 7");
		
		spinnerPlayerNatureP4 = new JSpinner();
		spinnerPlayerNatureP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerPlayerNatureP4.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getPlayerPKMN()[3].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[3]);
				statLabelUpdaterPlayerP4();
				playerStatColors();
			}

			private void playerStatColors() {
				lblPlayerAttackP4.setForeground(Color.BLACK);
				lblPlayerDefenseP4.setForeground(Color.BLACK);
				lblPlayerSpAttackP4.setForeground(Color.BLACK);
				lblPlayerSpDefenseP4.setForeground(Color.BLACK);
				lblPlayerSpeedP4.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getPlayerPKMN()[3].getNature()][3] == StatCalc.natures[CurrentSimData.getPlayerPKMN()[3].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[3].getNature()][3])
					{
					case StatCalc.ATTACK: lblPlayerAttackP4.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP4.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP4.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP4.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP4.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[3].getNature()][1])
					{
					case StatCalc.ATTACK: lblPlayerAttackP4.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP4.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP4.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP4.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP4.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerPlayerNatureP4.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelPlayerStatsP4.add(spinnerPlayerNatureP4, "cell 1 7 2 1,growx");
		
		JPanel panelPlayerExtraP4 = new JPanel();
		panelPlayerExtraP4.setOpaque(false);
		panelPlayerP4.add(panelPlayerExtraP4, "cell 4 0,grow");
		panelPlayerExtraP4.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblPlayerGenderP4 = new JLabel("Gender: ");
		panelPlayerExtraP4.add(lblPlayerGenderP4, "cell 0 0,aligny top");
		
		rdbtnPlayerMaleP4 = new JRadioButton("Male");
		playerGenderGroupP4.add(rdbtnPlayerMaleP4);
		panelPlayerExtraP4.add(rdbtnPlayerMaleP4, "flowy,cell 1 0");
		
		rdbtnPlayerFemaleP4 = new JRadioButton("Female");
		playerGenderGroupP4.add(rdbtnPlayerFemaleP4);
		panelPlayerExtraP4.add(rdbtnPlayerFemaleP4, "cell 1 0");
		
		rdbtnPlayerGenderlessP4 = new JRadioButton("Genderless");
		playerGenderGroupP4.add(rdbtnPlayerGenderlessP4);
		panelPlayerExtraP4.add(rdbtnPlayerGenderlessP4, "cell 1 0");
		rdbtnPlayerMaleP4.setSelected(true);
		panelPlayerP4.add(scrollPanePlayerP4, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_PlayerP4 = new JPanel();
		panel_3_PlayerP4.setOpaque(false);
		panel_3_PlayerP4.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddPlayerP4 = new JButton(">>");
		buttonAddPlayerP4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerMovesP4.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedPlayerMovesP4.length)
					{
						if(selectedPlayerMovesP4[i] == "None")
						{
							selectedPlayerMovesP4[i] = (String) listPlayerMovesP4.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedPlayerMovesP4[i] == Names.fullMoveNames[w])
								{
									try {
										playerMovesP4[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listPlayerSelectedMovesP4.setListData(selectedPlayerMovesP4);
				}
			}
		});
		panel_3_PlayerP4.add(buttonAddPlayerP4);
		
		JButton buttonRemovePlayerP4 = new JButton("<<");
		buttonRemovePlayerP4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerSelectedMovesP4.getSelectedValue()!= null)
				{
					playerMovesP4[listPlayerSelectedMovesP4.getSelectedIndex()] = new None();
					selectedPlayerMovesP4[listPlayerSelectedMovesP4.getSelectedIndices()[3]] = "None";
					listPlayerSelectedMovesP4.setListData(selectedPlayerMovesP4);
				}
			}
		});
		
		JPanel panelPlayerMovePreviewP4 = new JPanel();
		panelPlayerMovePreviewP4.setOpaque(false);
		panelPlayerP4.add(panelPlayerMovePreviewP4, "cell 1 1,grow");
		panelPlayerMovePreviewP4.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblPlayerMoveTypeP4 = new JLabel("Move Type: ");
		panelPlayerMovePreviewP4.add(lblPlayerMoveTypeP4, "cell 0 0,alignx left,aligny top");
		
		lblPlayerMoveTypeIconP4 = new JLabel();
		panelPlayerMovePreviewP4.add(lblPlayerMoveTypeIconP4, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryP4 = new JLabel("Category: ");
		panelPlayerMovePreviewP4.add(lblPlayerMoveCategoryP4, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryCalcP4 = new JLabel("");
		panelPlayerMovePreviewP4.add(lblPlayerMoveCategoryCalcP4, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblPlayerMovePowerP4 = new JLabel("Power: ");
		panelPlayerMovePreviewP4.add(lblPlayerMovePowerP4, "cell 0 2");
		
		JLabel lblPlayerMovePowerCalcP4 = new JLabel("");
		panelPlayerMovePreviewP4.add(lblPlayerMovePowerCalcP4, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyP4 = new JLabel("Accuracy: ");
		panelPlayerMovePreviewP4.add(lblPlayerMoveAccuracyP4, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyCalcP4 = new JLabel("");
		panelPlayerMovePreviewP4.add(lblPlayerMoveAccuracyCalcP4, "cell 1 3");
		panelPlayerP4.add(panel_3_PlayerP4, "cell 2 1,grow");
		
		panel_3_PlayerP4.add(buttonRemovePlayerP4);
		
		
		listPlayerSelectedMovesP4.setSelectionModel(smPlayerP4);
		panelPlayerP4.add(listPlayerSelectedMovesP4, "cell 3 1,grow");
		
		JPanel panelPlayerMoveDetailsP4 = new JPanel();
		panelPlayerMoveDetailsP4.setOpaque(false);
		panelPlayerP4.add(panelPlayerMoveDetailsP4, "cell 4 1,grow");
		panelPlayerMoveDetailsP4.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblPlayerMoveTypeDetailsP4 = new JLabel("Move Type: ");
		panelPlayerMoveDetailsP4.add(lblPlayerMoveTypeDetailsP4, "cell 0 0,alignx left");
		
		JLabel lblPlayerMoveTypeIconDisplayP4 = new JLabel("");
		panelPlayerMoveDetailsP4.add(lblPlayerMoveTypeIconDisplayP4, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryDetailsP4 = new JLabel("Category: ");
		panelPlayerMoveDetailsP4.add(lblPlayerMoveCategoryDetailsP4, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryDisplayP4 = new JLabel("");
		panelPlayerMoveDetailsP4.add(lblPlayerMoveCategoryDisplayP4, "cell 1 1");
		
		JLabel lblPlayerMovePowerDetailsP4 = new JLabel("Power: ");
		panelPlayerMoveDetailsP4.add(lblPlayerMovePowerDetailsP4, "cell 0 2");
		
		JLabel lblPlayerMovePowerDisplayP4 = new JLabel("");
		panelPlayerMoveDetailsP4.add(lblPlayerMovePowerDisplayP4, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyDetailsP4 = new JLabel("Accuracy: ");
		panelPlayerMoveDetailsP4.add(lblPlayerMoveAccuracyDetailsP4, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyDisplayP4 = new JLabel("");
		panelPlayerMoveDetailsP4.add(lblPlayerMoveAccuracyDisplayP4, "cell 1 3");
		
		JLabel lblPlayerMaxPPP4 = new JLabel("Max PP: ");
		panelPlayerMoveDetailsP4.add(lblPlayerMaxPPP4, "cell 0 4");
		
		JLabel lblPlayerMaxPPCalcP4 = new JLabel("0");
		panelPlayerMoveDetailsP4.add(lblPlayerMaxPPCalcP4, "cell 1 4");
		
		JLabel lblPlayerCurrentPPP4 = new JLabel("Current PP: ");
		panelPlayerMoveDetailsP4.add(lblPlayerCurrentPPP4, "cell 0 5");
		
		JSpinner spinnerPlayerCurrentPPP4 = new JSpinner();
		spinnerPlayerCurrentPPP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				playerMovesP4[listPlayerSelectedMovesP4.getSelectedIndex()].setPp((int) spinnerPlayerCurrentPPP4.getValue());
				playerMovesP4[listPlayerSelectedMovesP4.getSelectedIndex()].setCurrentPP((int) spinnerPlayerCurrentPPP4.getValue());
			}
		});
		panelPlayerMoveDetailsP4.add(spinnerPlayerCurrentPPP4, "cell 1 5");
		
		
		
		listPlayerMovesP4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listPlayerMovesP4.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lblPlayerMoveTypeIconP4.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblPlayerMoveCategoryCalcP4.setText(catText);
						lblPlayerMovePowerCalcP4.setText(selected.getPower()+"");
						lblPlayerMoveAccuracyCalcP4.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listPlayerSelectedMovesP4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listPlayerSelectedMovesP4.getSelectedIndex();
				
				lblPlayerMaxPPCalcP4.setText(playerMovesP4[i].getMaxPP() + "");
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+playerMovesP1[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblPlayerMoveTypeIconDisplayP4.setIcon(new ImageIcon(image));
				String catTextDisplay = "None";
				switch (playerMovesP4[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblPlayerMoveCategoryDisplayP4.setText(catTextDisplay);
				lblPlayerMovePowerDisplayP4.setText(playerMovesP4[i].getPower()+"");
				lblPlayerMoveAccuracyDisplayP4.setText(playerMovesP4[i].getAccuracy()+"");
				spinnerPlayerCurrentPPP4.setModel(new SpinnerNumberModel(0, 0, playerMovesP4[i].getMaxPP(), 1));
				spinnerPlayerCurrentPPP4.setValue(playerMovesP4[i].getPp());
				repaint();
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		panelPlayerP5 = new JPanel();
		panelPlayerP5.setBackground(new Color(240,240,240,123));
		contentPane.add(panelPlayerP5);
		panelPlayerP5.setVisible(false);
		selectedPlayerMovesP5 = new String[] {"None", "None", "None", "None"};
		JScrollPane scrollPanePlayer5 = new JScrollPane();
		panelPlayerP5.add(scrollPanePlayer5, "cell 0 0,grow");
		listPlayerPokemonP5 = new JList(Names.pokemonNames);
		scrollPanePlayer5.setViewportView(listPlayerPokemonP5);
		listPlayerPokemonP5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListSelectionModel pPlayerP5 = new DefaultListSelectionModel();
		pPlayerP5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pPlayerP5.setLeadAnchorNotificationEnabled(false);
		listPlayerPokemonP5.setSelectionModel(pPlayerP5);
		listPlayerPokemonP5.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getPlayerPKMN()[4] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listPlayerPokemonP5.getSelectedIndex()]).newInstance();
					if(pPlayerP5.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getPlayerPKMN()[4].getValidMoves().length];
					while(i < CurrentSimData.getPlayerPKMN()[4].getValidMoves().length)
					{
						
						int t = CurrentSimData.getPlayerPKMN()[4].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedPlayerMovesP5[0] = "None";
					selectedPlayerMovesP5[1] = "None";
					selectedPlayerMovesP5[2] = "None";
					selectedPlayerMovesP5[3] = "None";
					playerMovesP5 = new Move[]{new None(), new None(), new None(), new None()};
					listPlayerSelectedMovesP5.setListData(selectedPlayerMovesP5);
					listPlayerMovesP5.setListData(label);
					
					spinnerPlayerHPIVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getIvHp());
					spinnerPlayerAttackIVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getIvAttack());
					spinnerPlayerDefenseIVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getIvDefense());
					spinnerPlayerSpAttackIVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getIvSpAttack());
					spinnerPlayerSpDefenseIVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getIvSpDefense());
					spinnerPlayerSpeedIVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getIvSpeed());
					
					spinnerPlayerHPEVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getEvHp());
					spinnerPlayerAttackEVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getEvAttack());
					spinnerPlayerDefenseEVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getEvDefense());
					spinnerPlayerSpAttackEVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getEvSpAttack());
					spinnerPlayerSpDefenseEVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getEvSpDefense());
					spinnerPlayerSpeedEVP5.setValue(CurrentSimData.getPlayerPKMN()[4].getEvSpeed());
					
					spinnerPlayerLevelP5.setValue(CurrentSimData.getPlayerPKMN()[4].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		DefaultListSelectionModel mPlayerP5 = new DefaultListSelectionModel();
		mPlayerP5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mPlayerP5.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smPlayerP5 = new DefaultListSelectionModel();
		smPlayerP5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smPlayerP5.setLeadAnchorNotificationEnabled(false);
		panelPlayerP5.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		panelPlayerP5.add(scrollPanePlayer5, "cell 0 0,grow");
		
		JScrollPane scrollPanePlayerP5 = new JScrollPane();
		scrollPanePlayerP5.setViewportView(listPlayerMovesP5);
		listPlayerMovesP5.setSelectionModel(mPlayerP5);
		listPlayerMovesP5.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JPanel panelPlayerIVP5 = new JPanel();
		panelPlayerIVP5.setOpaque(false);
		panelPlayerP5.add(panelPlayerIVP5, "cell 1 0,grow");
		panelPlayerIVP5.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblPlayerIVsP5 = new JLabel("IVs");
		panelPlayerIVP5.add(lblPlayerIVsP5, "cell 0 0");
		
		JLabel lblPlayerHPIVP5 = new JLabel("HP: ");
		panelPlayerIVP5.add(lblPlayerHPIVP5, "cell 0 1");
		
		spinnerPlayerHPIVP5 = new JSpinner();
		spinnerPlayerHPIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[4].setIvHp(Double.parseDouble(""+spinnerPlayerHPIVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[4].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[4].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[4].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel()));
				statLabelUpdaterPlayerP5();
			}
		});
		spinnerPlayerHPIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP5.add(spinnerPlayerHPIVP5, "cell 1 1");
		
		JLabel lblPlayerAttackIVP5 = new JLabel("Attack: ");
		panelPlayerIVP5.add(lblPlayerAttackIVP5, "cell 0 2");
		
		spinnerPlayerAttackIVP5 = new JSpinner();
		spinnerPlayerAttackIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[4].setIvAttack(Double.parseDouble(""+spinnerPlayerAttackIVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[4].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[4].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[4].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[4].getNature()));
						statLabelUpdaterPlayerP5();
			}
		});
		spinnerPlayerAttackIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP5.add(spinnerPlayerAttackIVP5, "cell 1 2");
		
		JLabel lblPlayerDefenseIVP5 = new JLabel("Defense: ");
		panelPlayerIVP5.add(lblPlayerDefenseIVP5, "cell 0 3");
		
		spinnerPlayerDefenseIVP5 = new JSpinner();
		spinnerPlayerDefenseIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[4].setIvDefense(Double.parseDouble(""+spinnerPlayerDefenseIVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[4].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[4].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[4].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[4].getNature()));
						statLabelUpdaterPlayerP5();
			}
		});
		spinnerPlayerDefenseIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP5.add(spinnerPlayerDefenseIVP5, "cell 1 3");
		
		JLabel lblPlayerSpAttackIVP5 = new JLabel("Special Attack: ");
		panelPlayerIVP5.add(lblPlayerSpAttackIVP5, "cell 0 4");
		
		spinnerPlayerSpAttackIVP5 = new JSpinner();
		spinnerPlayerSpAttackIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[4].setIvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackIVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setSpAttack(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[4].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[4].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[4].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[4].getNature()));
						statLabelUpdaterPlayerP5();
			}
		});
		spinnerPlayerSpAttackIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP5.add(spinnerPlayerSpAttackIVP5, "cell 1 4");
		
		JLabel lblPlayerSpDefenseIVP5 = new JLabel("Special Defense: ");
		panelPlayerIVP5.add(lblPlayerSpDefenseIVP5, "cell 0 5");
		
		spinnerPlayerSpDefenseIVP5 = new JSpinner();
		spinnerPlayerSpDefenseIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[4].setIvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseIVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setSpDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[4].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[4].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[4].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[4].getNature()));
						statLabelUpdaterPlayerP5();
			}
		});
		spinnerPlayerSpDefenseIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP5.add(spinnerPlayerSpDefenseIVP5, "cell 1 5");
		
		JLabel lblPlayerSpeedIVP5 = new JLabel("Speed: ");
		panelPlayerIVP5.add(lblPlayerSpeedIVP5, "cell 0 6");
		
		spinnerPlayerSpeedIVP5 = new JSpinner();
		spinnerPlayerSpeedIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[4].setIvSpeed(Double.parseDouble(""+spinnerPlayerSpeedIVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setSpeed(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[4].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[4].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[4].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[4].getNature()));
						statLabelUpdaterPlayerP5();
			}
		});
		spinnerPlayerSpeedIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP5.add(spinnerPlayerSpeedIVP5, "cell 1 6");
		
		JPanel panelPlayerEVP5 = new JPanel();
		panelPlayerEVP5.setOpaque(false);
		panelPlayerP5.add(panelPlayerEVP5, "cell 2 0,grow");
		panelPlayerEVP5.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblPlayerEVsP5 = new JLabel("EVs");
		panelPlayerEVP5.add(lblPlayerEVsP5, "cell 0 0");
		
		JLabel lblPlayerEVMaxP5 = new JLabel("Available: ");
		panelPlayerEVP5.add(lblPlayerEVMaxP5, "cell 1 0");
		
		lblPlayerEVsAvailableP5 = new JLabel("510");
		panelPlayerEVP5.add(lblPlayerEVsAvailableP5, "cell 2 0");
		
		JLabel lblPlayerHPEVP5 = new JLabel("HP: ");
		panelPlayerEVP5.add(lblPlayerHPEVP5, "cell 0 1");
		
		spinnerPlayerHPEVP5 = new JSpinner();
		spinnerPlayerHPEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP5 < 0)
				{
					spinnerPlayerHPEVP5.setValue((int)spinnerPlayerHPEVP5.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[4].setEvHp(Double.parseDouble(""+spinnerPlayerHPEVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[4].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[4].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[4].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel()));
						statLabelUpdaterPlayerP5();
						playerEVCheckP5();
			}
		});
		spinnerPlayerHPEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP5.add(spinnerPlayerHPEVP5, "cell 1 1");
		
		JLabel lblPlayerAttackEVP5 = new JLabel("Attack: ");
		panelPlayerEVP5.add(lblPlayerAttackEVP5, "cell 0 2");
		
		spinnerPlayerAttackEVP5 = new JSpinner();
		spinnerPlayerAttackEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP5 < 0)
				{
					spinnerPlayerAttackEVP5.setValue((int)spinnerPlayerAttackEVP5.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[4].setEvAttack(Double.parseDouble(""+spinnerPlayerAttackEVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[4].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[4].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[4].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[4].getNature()));
						statLabelUpdaterPlayerP5();
						playerEVCheckP5();
			}
		});
		spinnerPlayerAttackEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP5.add(spinnerPlayerAttackEVP5, "cell 1 2");
		
		JLabel lblPlayerDefenseEVP5 = new JLabel("Defense: ");
		panelPlayerEVP5.add(lblPlayerDefenseEVP5, "cell 0 3");
		
		spinnerPlayerDefenseEVP5 = new JSpinner();
		spinnerPlayerDefenseEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP5 < 0)
				{
					spinnerPlayerDefenseEVP5.setValue((int)spinnerPlayerDefenseEVP5.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[4].setEvDefense(Double.parseDouble(""+spinnerPlayerDefenseEVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[4].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[4].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[4].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[4].getNature()));
						statLabelUpdaterPlayerP5();
						playerEVCheckP5();
			}
		});
		spinnerPlayerDefenseEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP5.add(spinnerPlayerDefenseEVP5, "cell 1 3");
		
		JLabel lblPlayerSpAttackEVP5 = new JLabel("Special Attack: ");
		panelPlayerEVP5.add(lblPlayerSpAttackEVP5, "cell 0 4");
		
		spinnerPlayerSpAttackEVP5 = new JSpinner();
		spinnerPlayerSpAttackEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP5 < 0)
				{
					spinnerPlayerSpAttackEVP5.setValue((int)spinnerPlayerSpAttackEVP5.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[4].setEvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackEVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setSpAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[4].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[4].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[4].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[4].getNature()));
						statLabelUpdaterPlayerP5();
						playerEVCheckP5();
			}
		});
		spinnerPlayerSpAttackEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP5.add(spinnerPlayerSpAttackEVP5, "cell 1 4");
		
		JLabel lblPlayerSpDefenseEVP5 = new JLabel("Special Defense: ");
		panelPlayerEVP5.add(lblPlayerSpDefenseEVP5, "cell 0 5");
		
		spinnerPlayerSpDefenseEVP5 = new JSpinner();
		spinnerPlayerSpDefenseEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP5 < 0)
				{
					spinnerPlayerSpDefenseEVP5.setValue((int)spinnerPlayerSpDefenseEVP5.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[4].setEvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseEVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setSpDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[4].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[4].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[4].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[4].getNature()));
						statLabelUpdaterPlayerP5();
						playerEVCheckP5();
			}
		});
		spinnerPlayerSpDefenseEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP5.add(spinnerPlayerSpDefenseEVP5, "cell 1 5");
		
		JLabel lblPlayerSpeedEVP5 = new JLabel("Speed: ");
		panelPlayerEVP5.add(lblPlayerSpeedEVP5, "cell 0 7");
		
		spinnerPlayerSpeedEVP5 = new JSpinner();
		spinnerPlayerSpeedEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP5 < 0)
				{
					spinnerPlayerSpeedEVP5.setValue((int)spinnerPlayerSpeedEVP5.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[4].setEvSpeed(Double.parseDouble(""+spinnerPlayerSpeedEVP5.getValue()));
				CurrentSimData.getPlayerPKMN()[4].setSpeed(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[4].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[4].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[4].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[4].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[4].getNature()));
						statLabelUpdaterPlayerP5();
						playerEVCheckP5();
			}
		});
		spinnerPlayerSpeedEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP5.add(spinnerPlayerSpeedEVP5, "cell 1 7");
		
		JPanel panelPlayerStatsP5 = new JPanel();
		panelPlayerStatsP5.setOpaque(false);
		panelPlayerP5.add(panelPlayerStatsP5, "cell 3 0,grow");
		panelPlayerStatsP5.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblPlayerLevelP5 = new JLabel("Level: ");
		panelPlayerStatsP5.add(lblPlayerLevelP5, "cell 0 0");
		
		spinnerPlayerLevelP5 = new JSpinner();
		spinnerPlayerLevelP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[4].setLevel(Double.parseDouble(""+spinnerPlayerLevelP5.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[4]);
				statLabelUpdaterPlayerP5();
			}
		});
		spinnerPlayerLevelP5.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelPlayerStatsP5.add(spinnerPlayerLevelP5, "cell 1 0");
		
		lblPlayerHPP5 = new JLabel("HP: ");
		panelPlayerStatsP5.add(lblPlayerHPP5, "cell 0 1");
		
		lblPlayerHPCalcP5 = new JLabel("0");
		panelPlayerStatsP5.add(lblPlayerHPCalcP5, "cell 1 1");
		
		lblPlayerAttackP5 = new JLabel("Attack: ");
		panelPlayerStatsP5.add(lblPlayerAttackP5, "cell 0 2");
		
		lblPlayerAttackCalcP5 = new JLabel("0");
		panelPlayerStatsP5.add(lblPlayerAttackCalcP5, "cell 1 2");
		
		lblPlayerDefenseP5 = new JLabel("Defense: ");
		panelPlayerStatsP5.add(lblPlayerDefenseP5, "cell 0 3");
		
		lblPlayerDefenseCalcP5 = new JLabel("0");
		panelPlayerStatsP5.add(lblPlayerDefenseCalcP5, "cell 1 3");
		
		lblPlayerSpAttackP5 = new JLabel("Special Attack: ");
		panelPlayerStatsP5.add(lblPlayerSpAttackP5, "cell 0 4");
		
		lblPlayerSpAttackCalcP5 = new JLabel("0");
		panelPlayerStatsP5.add(lblPlayerSpAttackCalcP5, "cell 1 4");
		
		lblPlayerSpDefenseP5 = new JLabel("Special Defense: ");
		panelPlayerStatsP5.add(lblPlayerSpDefenseP5, "cell 0 5");
		
		lblPlayerSpDefenseCalcP5 = new JLabel("0");
		panelPlayerStatsP5.add(lblPlayerSpDefenseCalcP5, "cell 1 5");
		
		lblPlayerSpeedP5 = new JLabel("Speed: ");
		panelPlayerStatsP5.add(lblPlayerSpeedP5, "cell 0 6");
		
		lblPlayerSpeedCalcP5 = new JLabel("0");
		panelPlayerStatsP5.add(lblPlayerSpeedCalcP5, "cell 1 6");
		
		JLabel lblPlayerNatureP5 = new JLabel("Nature: ");
		panelPlayerStatsP5.add(lblPlayerNatureP5, "cell 0 7");
		
		spinnerPlayerNatureP5 = new JSpinner();
		spinnerPlayerNatureP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerPlayerNatureP5.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getPlayerPKMN()[4].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[4]);
				statLabelUpdaterPlayerP5();
				playerStatColors();
			}

			private void playerStatColors() {
				lblPlayerAttackP5.setForeground(Color.BLACK);
				lblPlayerDefenseP5.setForeground(Color.BLACK);
				lblPlayerSpAttackP5.setForeground(Color.BLACK);
				lblPlayerSpDefenseP5.setForeground(Color.BLACK);
				lblPlayerSpeedP5.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getPlayerPKMN()[4].getNature()][4] == StatCalc.natures[CurrentSimData.getPlayerPKMN()[4].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[4].getNature()][4])
					{
					case StatCalc.ATTACK: lblPlayerAttackP5.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP5.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP5.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP5.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP5.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[4].getNature()][1])
					{
					case StatCalc.ATTACK: lblPlayerAttackP5.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP5.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP5.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP5.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP5.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerPlayerNatureP5.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelPlayerStatsP5.add(spinnerPlayerNatureP5, "cell 1 7 2 1,growx");
		
		JPanel panelPlayerExtraP5 = new JPanel();
		panelPlayerExtraP5.setOpaque(false);
		panelPlayerP5.add(panelPlayerExtraP5, "cell 4 0,grow");
		panelPlayerExtraP5.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblPlayerGenderP5 = new JLabel("Gender: ");
		panelPlayerExtraP5.add(lblPlayerGenderP5, "cell 0 0,aligny top");
		
		rdbtnPlayerMaleP5 = new JRadioButton("Male");
		playerGenderGroupP5.add(rdbtnPlayerMaleP5);
		panelPlayerExtraP5.add(rdbtnPlayerMaleP5, "flowy,cell 1 0");
		
		rdbtnPlayerFemaleP5 = new JRadioButton("Female");
		playerGenderGroupP5.add(rdbtnPlayerFemaleP5);
		panelPlayerExtraP5.add(rdbtnPlayerFemaleP5, "cell 1 0");
		
		rdbtnPlayerGenderlessP5 = new JRadioButton("Genderless");
		playerGenderGroupP5.add(rdbtnPlayerGenderlessP5);
		panelPlayerExtraP5.add(rdbtnPlayerGenderlessP5, "cell 1 0");
		rdbtnPlayerMaleP5.setSelected(true);
		panelPlayerP5.add(scrollPanePlayerP5, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_PlayerP5 = new JPanel();
		panel_3_PlayerP5.setOpaque(false);
		panel_3_PlayerP5.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddPlayerP5 = new JButton(">>");
		buttonAddPlayerP5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerMovesP5.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedPlayerMovesP5.length)
					{
						if(selectedPlayerMovesP5[i] == "None")
						{
							selectedPlayerMovesP5[i] = (String) listPlayerMovesP5.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedPlayerMovesP5[i] == Names.fullMoveNames[w])
								{
									try {
										playerMovesP5[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listPlayerSelectedMovesP5.setListData(selectedPlayerMovesP5);
				}
			}
		});
		panel_3_PlayerP5.add(buttonAddPlayerP5);
		
		JButton buttonRemovePlayerP5 = new JButton("<<");
		buttonRemovePlayerP5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerSelectedMovesP5.getSelectedValue()!= null)
				{
					playerMovesP5[listPlayerSelectedMovesP5.getSelectedIndex()] = new None();
					selectedPlayerMovesP5[listPlayerSelectedMovesP5.getSelectedIndices()[4]] = "None";
					listPlayerSelectedMovesP5.setListData(selectedPlayerMovesP5);
				}
			}
		});
		
		JPanel panelPlayerMovePreviewP5 = new JPanel();
		panelPlayerMovePreviewP5.setOpaque(false);
		panelPlayerP5.add(panelPlayerMovePreviewP5, "cell 1 1,grow");
		panelPlayerMovePreviewP5.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblPlayerMoveTypeP5 = new JLabel("Move Type: ");
		panelPlayerMovePreviewP5.add(lblPlayerMoveTypeP5, "cell 0 0,alignx left,aligny top");
		
		lblPlayerMoveTypeIconP5 = new JLabel();
		panelPlayerMovePreviewP5.add(lblPlayerMoveTypeIconP5, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryP5 = new JLabel("Category: ");
		panelPlayerMovePreviewP5.add(lblPlayerMoveCategoryP5, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryCalcP5 = new JLabel("");
		panelPlayerMovePreviewP5.add(lblPlayerMoveCategoryCalcP5, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblPlayerMovePowerP5 = new JLabel("Power: ");
		panelPlayerMovePreviewP5.add(lblPlayerMovePowerP5, "cell 0 2");
		
		JLabel lblPlayerMovePowerCalcP5 = new JLabel("");
		panelPlayerMovePreviewP5.add(lblPlayerMovePowerCalcP5, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyP5 = new JLabel("Accuracy: ");
		panelPlayerMovePreviewP5.add(lblPlayerMoveAccuracyP5, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyCalcP5 = new JLabel("");
		panelPlayerMovePreviewP5.add(lblPlayerMoveAccuracyCalcP5, "cell 1 3");
		panelPlayerP5.add(panel_3_PlayerP5, "cell 2 1,grow");
		
		panel_3_PlayerP5.add(buttonRemovePlayerP5);
		
		
		listPlayerSelectedMovesP5.setSelectionModel(smPlayerP5);
		panelPlayerP5.add(listPlayerSelectedMovesP5, "cell 3 1,grow");
		
		JPanel panelPlayerMoveDetailsP5 = new JPanel();
		panelPlayerMoveDetailsP5.setOpaque(false);
		panelPlayerP5.add(panelPlayerMoveDetailsP5, "cell 4 1,grow");
		panelPlayerMoveDetailsP5.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblPlayerMoveTypeDetailsP5 = new JLabel("Move Type: ");
		panelPlayerMoveDetailsP5.add(lblPlayerMoveTypeDetailsP5, "cell 0 0,alignx left");
		
		JLabel lblPlayerMoveTypeIconDisplayP5 = new JLabel("");
		panelPlayerMoveDetailsP5.add(lblPlayerMoveTypeIconDisplayP5, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryDetailsP5 = new JLabel("Category: ");
		panelPlayerMoveDetailsP5.add(lblPlayerMoveCategoryDetailsP5, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryDisplayP5 = new JLabel("");
		panelPlayerMoveDetailsP5.add(lblPlayerMoveCategoryDisplayP5, "cell 1 1");
		
		JLabel lblPlayerMovePowerDetailsP5 = new JLabel("Power: ");
		panelPlayerMoveDetailsP5.add(lblPlayerMovePowerDetailsP5, "cell 0 2");
		
		JLabel lblPlayerMovePowerDisplayP5 = new JLabel("");
		panelPlayerMoveDetailsP5.add(lblPlayerMovePowerDisplayP5, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyDetailsP5 = new JLabel("Accuracy: ");
		panelPlayerMoveDetailsP5.add(lblPlayerMoveAccuracyDetailsP5, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyDisplayP5 = new JLabel("");
		panelPlayerMoveDetailsP5.add(lblPlayerMoveAccuracyDisplayP5, "cell 1 3");
		
		JLabel lblPlayerMaxPPP5 = new JLabel("Max PP: ");
		panelPlayerMoveDetailsP5.add(lblPlayerMaxPPP5, "cell 0 4");
		
		JLabel lblPlayerMaxPPCalcP5 = new JLabel("0");
		panelPlayerMoveDetailsP5.add(lblPlayerMaxPPCalcP5, "cell 1 4");
		
		JLabel lblPlayerCurrentPPP5 = new JLabel("Current PP: ");
		panelPlayerMoveDetailsP5.add(lblPlayerCurrentPPP5, "cell 0 5");
		
		JSpinner spinnerPlayerCurrentPPP5 = new JSpinner();
		spinnerPlayerCurrentPPP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				playerMovesP5[listPlayerSelectedMovesP5.getSelectedIndex()].setPp((int) spinnerPlayerCurrentPPP5.getValue());
				playerMovesP5[listPlayerSelectedMovesP5.getSelectedIndex()].setCurrentPP((int) spinnerPlayerCurrentPPP5.getValue());
			}
		});
		panelPlayerMoveDetailsP5.add(spinnerPlayerCurrentPPP5, "cell 1 5");
		
		
		
		listPlayerMovesP5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listPlayerMovesP5.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lblPlayerMoveTypeIconP5.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblPlayerMoveCategoryCalcP5.setText(catText);
						lblPlayerMovePowerCalcP5.setText(selected.getPower()+"");
						lblPlayerMoveAccuracyCalcP5.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listPlayerSelectedMovesP5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listPlayerSelectedMovesP5.getSelectedIndex();
				
				lblPlayerMaxPPCalcP5.setText(playerMovesP5[i].getMaxPP() + "");
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+playerMovesP1[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblPlayerMoveTypeIconDisplayP5.setIcon(new ImageIcon(image));
				String catTextDisplay = "None";
				switch (playerMovesP5[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblPlayerMoveCategoryDisplayP5.setText(catTextDisplay);
				lblPlayerMovePowerDisplayP5.setText(playerMovesP5[i].getPower()+"");
				lblPlayerMoveAccuracyDisplayP5.setText(playerMovesP5[i].getAccuracy()+"");
				spinnerPlayerCurrentPPP5.setModel(new SpinnerNumberModel(0, 0, playerMovesP5[i].getMaxPP(), 1));
				spinnerPlayerCurrentPPP5.setValue(playerMovesP5[i].getPp());
				repaint();
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		panelPlayerP6 = new JPanel();
		panelPlayerP6.setBackground(new Color(240,240,240,123));
		contentPane.add(panelPlayerP6);
		panelPlayerP6.setVisible(false);
		selectedPlayerMovesP6 = new String[] {"None", "None", "None", "None"};
		JScrollPane scrollPanePlayer6 = new JScrollPane();
		panelPlayerP6.add(scrollPanePlayer6, "cell 0 0,grow");
		listPlayerPokemonP6 = new JList(Names.pokemonNames);
		scrollPanePlayer6.setViewportView(listPlayerPokemonP6);
		listPlayerPokemonP6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListSelectionModel pPlayerP6 = new DefaultListSelectionModel();
		pPlayerP6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pPlayerP6.setLeadAnchorNotificationEnabled(false);
		listPlayerPokemonP6.setSelectionModel(pPlayerP6);
		listPlayerPokemonP6.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getPlayerPKMN()[5] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listPlayerPokemonP6.getSelectedIndex()]).newInstance();
					if(pPlayerP6.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getPlayerPKMN()[5].getValidMoves().length];
					while(i < CurrentSimData.getPlayerPKMN()[5].getValidMoves().length)
					{
						
						int t = CurrentSimData.getPlayerPKMN()[5].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedPlayerMovesP6[0] = "None";
					selectedPlayerMovesP6[1] = "None";
					selectedPlayerMovesP6[2] = "None";
					selectedPlayerMovesP6[3] = "None";
					playerMovesP6 = new Move[]{new None(), new None(), new None(), new None()};
					listPlayerSelectedMovesP6.setListData(selectedPlayerMovesP6);
					listPlayerMovesP6.setListData(label);
					
					spinnerPlayerHPIVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getIvHp());
					spinnerPlayerAttackIVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getIvAttack());
					spinnerPlayerDefenseIVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getIvDefense());
					spinnerPlayerSpAttackIVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getIvSpAttack());
					spinnerPlayerSpDefenseIVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getIvSpDefense());
					spinnerPlayerSpeedIVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getIvSpeed());
					
					spinnerPlayerHPEVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getEvHp());
					spinnerPlayerAttackEVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getEvAttack());
					spinnerPlayerDefenseEVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getEvDefense());
					spinnerPlayerSpAttackEVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getEvSpAttack());
					spinnerPlayerSpDefenseEVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getEvSpDefense());
					spinnerPlayerSpeedEVP6.setValue(CurrentSimData.getPlayerPKMN()[5].getEvSpeed());
					
					spinnerPlayerLevelP6.setValue(CurrentSimData.getPlayerPKMN()[5].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		DefaultListSelectionModel mPlayerP6 = new DefaultListSelectionModel();
		mPlayerP6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mPlayerP6.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smPlayerP6 = new DefaultListSelectionModel();
		smPlayerP6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smPlayerP6.setLeadAnchorNotificationEnabled(false);
		panelPlayerP6.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		panelPlayerP6.add(scrollPanePlayer6, "cell 0 0,grow");
		
		JScrollPane scrollPanePlayerP6 = new JScrollPane();
		scrollPanePlayerP6.setViewportView(listPlayerMovesP6);
		listPlayerMovesP6.setSelectionModel(mPlayerP6);
		listPlayerMovesP6.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JPanel panelPlayerIVP6 = new JPanel();
		panelPlayerIVP6.setOpaque(false);
		panelPlayerP6.add(panelPlayerIVP6, "cell 1 0,grow");
		panelPlayerIVP6.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblPlayerIVsP6 = new JLabel("IVs");
		panelPlayerIVP6.add(lblPlayerIVsP6, "cell 0 0");
		
		JLabel lblPlayerHPIVP6 = new JLabel("HP: ");
		panelPlayerIVP6.add(lblPlayerHPIVP6, "cell 0 1");
		
		spinnerPlayerHPIVP6 = new JSpinner();
		spinnerPlayerHPIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[5].setIvHp(Double.parseDouble(""+spinnerPlayerHPIVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[5].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[5].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[5].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel()));
				statLabelUpdaterPlayerP6();
			}
		});
		spinnerPlayerHPIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP6.add(spinnerPlayerHPIVP6, "cell 1 1");
		
		JLabel lblPlayerAttackIVP6 = new JLabel("Attack: ");
		panelPlayerIVP6.add(lblPlayerAttackIVP6, "cell 0 2");
		
		spinnerPlayerAttackIVP6 = new JSpinner();
		spinnerPlayerAttackIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[5].setIvAttack(Double.parseDouble(""+spinnerPlayerAttackIVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[5].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[5].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[5].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[5].getNature()));
						statLabelUpdaterPlayerP6();
			}
		});
		spinnerPlayerAttackIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP6.add(spinnerPlayerAttackIVP6, "cell 1 2");
		
		JLabel lblPlayerDefenseIVP6 = new JLabel("Defense: ");
		panelPlayerIVP6.add(lblPlayerDefenseIVP6, "cell 0 3");
		
		spinnerPlayerDefenseIVP6 = new JSpinner();
		spinnerPlayerDefenseIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[5].setIvDefense(Double.parseDouble(""+spinnerPlayerDefenseIVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[5].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[5].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[5].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[5].getNature()));
						statLabelUpdaterPlayerP6();
			}
		});
		spinnerPlayerDefenseIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP6.add(spinnerPlayerDefenseIVP6, "cell 1 3");
		
		JLabel lblPlayerSpAttackIVP6 = new JLabel("Special Attack: ");
		panelPlayerIVP6.add(lblPlayerSpAttackIVP6, "cell 0 4");
		
		spinnerPlayerSpAttackIVP6 = new JSpinner();
		spinnerPlayerSpAttackIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[5].setIvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackIVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setSpAttack(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[5].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[5].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[5].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[5].getNature()));
						statLabelUpdaterPlayerP6();
			}
		});
		spinnerPlayerSpAttackIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP6.add(spinnerPlayerSpAttackIVP6, "cell 1 4");
		
		JLabel lblPlayerSpDefenseIVP6 = new JLabel("Special Defense: ");
		panelPlayerIVP6.add(lblPlayerSpDefenseIVP6, "cell 0 5");
		
		spinnerPlayerSpDefenseIVP6 = new JSpinner();
		spinnerPlayerSpDefenseIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[5].setIvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseIVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setSpDefense(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[5].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[5].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[5].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[5].getNature()));
						statLabelUpdaterPlayerP6();
			}
		});
		spinnerPlayerSpDefenseIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP6.add(spinnerPlayerSpDefenseIVP6, "cell 1 5");
		
		JLabel lblPlayerSpeedIVP6 = new JLabel("Speed: ");
		panelPlayerIVP6.add(lblPlayerSpeedIVP6, "cell 0 6");
		
		spinnerPlayerSpeedIVP6 = new JSpinner();
		spinnerPlayerSpeedIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[5].setIvSpeed(Double.parseDouble(""+spinnerPlayerSpeedIVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setSpeed(StatCalc.calculate(CurrentSimData.getPlayerPKMN()[5].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[5].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[5].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[5].getNature()));
						statLabelUpdaterPlayerP6();
			}
		});
		spinnerPlayerSpeedIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelPlayerIVP6.add(spinnerPlayerSpeedIVP6, "cell 1 6");
		
		JPanel panelPlayerEVP6 = new JPanel();
		panelPlayerEVP6.setOpaque(false);
		panelPlayerP6.add(panelPlayerEVP6, "cell 2 0,grow");
		panelPlayerEVP6.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblPlayerEVsP6 = new JLabel("EVs");
		panelPlayerEVP6.add(lblPlayerEVsP6, "cell 0 0");
		
		JLabel lblPlayerEVMaxP6 = new JLabel("Available: ");
		panelPlayerEVP6.add(lblPlayerEVMaxP6, "cell 1 0");
		
		lblPlayerEVsAvailableP6 = new JLabel("510");
		panelPlayerEVP6.add(lblPlayerEVsAvailableP6, "cell 2 0");
		
		JLabel lblPlayerHPEVP6 = new JLabel("HP: ");
		panelPlayerEVP6.add(lblPlayerHPEVP6, "cell 0 1");
		
		spinnerPlayerHPEVP6 = new JSpinner();
		spinnerPlayerHPEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP6 < 0)
				{
					spinnerPlayerHPEVP6.setValue((int)spinnerPlayerHPEVP6.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[5].setEvHp(Double.parseDouble(""+spinnerPlayerHPEVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setHp(StatCalc.calculateHP(
						CurrentSimData.getPlayerPKMN()[5].getBaseHp(),
						CurrentSimData.getPlayerPKMN()[5].getIvHp(), 
						CurrentSimData.getPlayerPKMN()[5].getEvHp(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel()));
						statLabelUpdaterPlayerP6();
						playerEVCheckP6();
			}
		});
		spinnerPlayerHPEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP6.add(spinnerPlayerHPEVP6, "cell 1 1");
		
		JLabel lblPlayerAttackEVP6 = new JLabel("Attack: ");
		panelPlayerEVP6.add(lblPlayerAttackEVP6, "cell 0 2");
		
		spinnerPlayerAttackEVP6 = new JSpinner();
		spinnerPlayerAttackEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP6 < 0)
				{
					spinnerPlayerAttackEVP6.setValue((int)spinnerPlayerAttackEVP6.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[5].setEvAttack(Double.parseDouble(""+spinnerPlayerAttackEVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[5].getBaseAttack(),
						CurrentSimData.getPlayerPKMN()[5].getIvAttack(), 
						CurrentSimData.getPlayerPKMN()[5].getEvAttack(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getPlayerPKMN()[5].getNature()));
						statLabelUpdaterPlayerP6();
						playerEVCheckP6();
			}
		});
		spinnerPlayerAttackEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP6.add(spinnerPlayerAttackEVP6, "cell 1 2");
		
		JLabel lblPlayerDefenseEVP6 = new JLabel("Defense: ");
		panelPlayerEVP6.add(lblPlayerDefenseEVP6, "cell 0 3");
		
		spinnerPlayerDefenseEVP6 = new JSpinner();
		spinnerPlayerDefenseEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP6 < 0)
				{
					spinnerPlayerDefenseEVP6.setValue((int)spinnerPlayerDefenseEVP6.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[5].setEvDefense(Double.parseDouble(""+spinnerPlayerDefenseEVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[5].getBaseDefense(),
						CurrentSimData.getPlayerPKMN()[5].getIvDefense(), 
						CurrentSimData.getPlayerPKMN()[5].getEvDefense(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getPlayerPKMN()[5].getNature()));
						statLabelUpdaterPlayerP6();
						playerEVCheckP6();
			}
		});
		spinnerPlayerDefenseEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP6.add(spinnerPlayerDefenseEVP6, "cell 1 3");
		
		JLabel lblPlayerSpAttackEVP6 = new JLabel("Special Attack: ");
		panelPlayerEVP6.add(lblPlayerSpAttackEVP6, "cell 0 4");
		
		spinnerPlayerSpAttackEVP6 = new JSpinner();
		spinnerPlayerSpAttackEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP6 < 0)
				{
					spinnerPlayerSpAttackEVP6.setValue((int)spinnerPlayerSpAttackEVP6.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[5].setEvSpAttack(Double.parseDouble(""+spinnerPlayerSpAttackEVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setSpAttack(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[5].getBaseSpAttack(),
						CurrentSimData.getPlayerPKMN()[5].getIvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[5].getEvSpAttack(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getPlayerPKMN()[5].getNature()));
						statLabelUpdaterPlayerP6();
						playerEVCheckP6();
			}
		});
		spinnerPlayerSpAttackEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP6.add(spinnerPlayerSpAttackEVP6, "cell 1 4");
		
		JLabel lblPlayerSpDefenseEVP6 = new JLabel("Special Defense: ");
		panelPlayerEVP6.add(lblPlayerSpDefenseEVP6, "cell 0 5");
		
		spinnerPlayerSpDefenseEVP6 = new JSpinner();
		spinnerPlayerSpDefenseEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP6 < 0)
				{
					spinnerPlayerSpDefenseEVP6.setValue((int)spinnerPlayerSpDefenseEVP6.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[5].setEvSpDefense(Double.parseDouble(""+spinnerPlayerSpDefenseEVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setSpDefense(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[5].getBaseSpDefense(),
						CurrentSimData.getPlayerPKMN()[5].getIvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[5].getEvSpDefense(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getPlayerPKMN()[5].getNature()));
						statLabelUpdaterPlayerP6();
						playerEVCheckP6();
			}
		});
		spinnerPlayerSpDefenseEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP6.add(spinnerPlayerSpDefenseEVP6, "cell 1 5");
		
		JLabel lblPlayerSpeedEVP6 = new JLabel("Speed: ");
		panelPlayerEVP6.add(lblPlayerSpeedEVP6, "cell 0 7");
		
		spinnerPlayerSpeedEVP6 = new JSpinner();
		spinnerPlayerSpeedEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(playerEVtotalP6 < 0)
				{
					spinnerPlayerSpeedEVP6.setValue((int)spinnerPlayerSpeedEVP6.getValue()-1);
				}
				CurrentSimData.getPlayerPKMN()[5].setEvSpeed(Double.parseDouble(""+spinnerPlayerSpeedEVP6.getValue()));
				CurrentSimData.getPlayerPKMN()[5].setSpeed(StatCalc.calculate(
						CurrentSimData.getPlayerPKMN()[5].getBaseSpeed(),
						CurrentSimData.getPlayerPKMN()[5].getIvSpeed(), 
						CurrentSimData.getPlayerPKMN()[5].getEvSpeed(), 
						CurrentSimData.getPlayerPKMN()[5].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getPlayerPKMN()[5].getNature()));
						statLabelUpdaterPlayerP6();
						playerEVCheckP6();
			}
		});
		spinnerPlayerSpeedEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelPlayerEVP6.add(spinnerPlayerSpeedEVP6, "cell 1 7");
		
		JPanel panelPlayerStatsP6 = new JPanel();
		panelPlayerStatsP6.setOpaque(false);
		panelPlayerP6.add(panelPlayerStatsP6, "cell 3 0,grow");
		panelPlayerStatsP6.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblPlayerLevelP6 = new JLabel("Level: ");
		panelPlayerStatsP6.add(lblPlayerLevelP6, "cell 0 0");
		
		spinnerPlayerLevelP6 = new JSpinner();
		spinnerPlayerLevelP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getPlayerPKMN()[5].setLevel(Double.parseDouble(""+spinnerPlayerLevelP6.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[5]);
				statLabelUpdaterPlayerP6();
			}
		});
		spinnerPlayerLevelP6.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelPlayerStatsP6.add(spinnerPlayerLevelP6, "cell 1 0");
		
		lblPlayerHPP6 = new JLabel("HP: ");
		panelPlayerStatsP6.add(lblPlayerHPP6, "cell 0 1");
		
		lblPlayerHPCalcP6 = new JLabel("0");
		panelPlayerStatsP6.add(lblPlayerHPCalcP6, "cell 1 1");
		
		lblPlayerAttackP6 = new JLabel("Attack: ");
		panelPlayerStatsP6.add(lblPlayerAttackP6, "cell 0 2");
		
		lblPlayerAttackCalcP6 = new JLabel("0");
		panelPlayerStatsP6.add(lblPlayerAttackCalcP6, "cell 1 2");
		
		lblPlayerDefenseP6 = new JLabel("Defense: ");
		panelPlayerStatsP6.add(lblPlayerDefenseP6, "cell 0 3");
		
		lblPlayerDefenseCalcP6 = new JLabel("0");
		panelPlayerStatsP6.add(lblPlayerDefenseCalcP6, "cell 1 3");
		
		lblPlayerSpAttackP6 = new JLabel("Special Attack: ");
		panelPlayerStatsP6.add(lblPlayerSpAttackP6, "cell 0 4");
		
		lblPlayerSpAttackCalcP6 = new JLabel("0");
		panelPlayerStatsP6.add(lblPlayerSpAttackCalcP6, "cell 1 4");
		
		lblPlayerSpDefenseP6 = new JLabel("Special Defense: ");
		panelPlayerStatsP6.add(lblPlayerSpDefenseP6, "cell 0 5");
		
		lblPlayerSpDefenseCalcP6 = new JLabel("0");
		panelPlayerStatsP6.add(lblPlayerSpDefenseCalcP6, "cell 1 5");
		
		lblPlayerSpeedP6 = new JLabel("Speed: ");
		panelPlayerStatsP6.add(lblPlayerSpeedP6, "cell 0 6");
		
		lblPlayerSpeedCalcP6 = new JLabel("0");
		panelPlayerStatsP6.add(lblPlayerSpeedCalcP6, "cell 1 6");
		
		JLabel lblPlayerNatureP6 = new JLabel("Nature: ");
		panelPlayerStatsP6.add(lblPlayerNatureP6, "cell 0 7");
		
		spinnerPlayerNatureP6 = new JSpinner();
		spinnerPlayerNatureP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerPlayerNatureP6.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getPlayerPKMN()[5].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getPlayerPKMN()[5]);
				statLabelUpdaterPlayerP6();
				playerStatColors();
			}

			private void playerStatColors() {
				lblPlayerAttackP6.setForeground(Color.BLACK);
				lblPlayerDefenseP6.setForeground(Color.BLACK);
				lblPlayerSpAttackP6.setForeground(Color.BLACK);
				lblPlayerSpDefenseP6.setForeground(Color.BLACK);
				lblPlayerSpeedP6.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getPlayerPKMN()[5].getNature()][5] == StatCalc.natures[CurrentSimData.getPlayerPKMN()[5].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[5].getNature()][5])
					{
					case StatCalc.ATTACK: lblPlayerAttackP6.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP6.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP6.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP6.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP6.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getPlayerPKMN()[5].getNature()][1])
					{
					case StatCalc.ATTACK: lblPlayerAttackP6.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblPlayerDefenseP6.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblPlayerSpAttackP6.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblPlayerSpDefenseP6.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblPlayerSpeedP6.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerPlayerNatureP6.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelPlayerStatsP6.add(spinnerPlayerNatureP6, "cell 1 7 2 1,growx");
		
		JPanel panelPlayerExtraP6 = new JPanel();
		panelPlayerExtraP6.setOpaque(false);
		panelPlayerP6.add(panelPlayerExtraP6, "cell 4 0,grow");
		panelPlayerExtraP6.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblPlayerGenderP6 = new JLabel("Gender: ");
		panelPlayerExtraP6.add(lblPlayerGenderP6, "cell 0 0,aligny top");
		
		rdbtnPlayerMaleP6 = new JRadioButton("Male");
		playerGenderGroupP6.add(rdbtnPlayerMaleP6);
		panelPlayerExtraP6.add(rdbtnPlayerMaleP6, "flowy,cell 1 0");
		
		rdbtnPlayerFemaleP6 = new JRadioButton("Female");
		playerGenderGroupP6.add(rdbtnPlayerFemaleP6);
		panelPlayerExtraP6.add(rdbtnPlayerFemaleP6, "cell 1 0");
		
		rdbtnPlayerGenderlessP6 = new JRadioButton("Genderless");
		playerGenderGroupP6.add(rdbtnPlayerGenderlessP6);
		panelPlayerExtraP6.add(rdbtnPlayerGenderlessP6, "cell 1 0");
		rdbtnPlayerMaleP6.setSelected(true);
		panelPlayerP6.add(scrollPanePlayerP6, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_PlayerP6 = new JPanel();
		panel_3_PlayerP6.setOpaque(false);
		panel_3_PlayerP6.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddPlayerP6 = new JButton(">>");
		buttonAddPlayerP6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerMovesP6.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedPlayerMovesP6.length)
					{
						if(selectedPlayerMovesP6[i] == "None")
						{
							selectedPlayerMovesP6[i] = (String) listPlayerMovesP6.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedPlayerMovesP6[i] == Names.fullMoveNames[w])
								{
									try {
										playerMovesP6[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listPlayerSelectedMovesP6.setListData(selectedPlayerMovesP6);
				}
			}
		});
		panel_3_PlayerP6.add(buttonAddPlayerP6);
		
		JButton buttonRemovePlayerP6 = new JButton("<<");
		buttonRemovePlayerP6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listPlayerSelectedMovesP6.getSelectedValue()!= null)
				{
					playerMovesP6[listPlayerSelectedMovesP6.getSelectedIndex()] = new None();
					selectedPlayerMovesP6[listPlayerSelectedMovesP6.getSelectedIndices()[5]] = "None";
					listPlayerSelectedMovesP6.setListData(selectedPlayerMovesP6);
				}
			}
		});
		
		JPanel panelPlayerMovePreviewP6 = new JPanel();
		panelPlayerMovePreviewP6.setOpaque(false);
		panelPlayerP6.add(panelPlayerMovePreviewP6, "cell 1 1,grow");
		panelPlayerMovePreviewP6.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblPlayerMoveTypeP6 = new JLabel("Move Type: ");
		panelPlayerMovePreviewP6.add(lblPlayerMoveTypeP6, "cell 0 0,alignx left,aligny top");
		
		lblPlayerMoveTypeIconP6 = new JLabel();
		panelPlayerMovePreviewP6.add(lblPlayerMoveTypeIconP6, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryP6 = new JLabel("Category: ");
		panelPlayerMovePreviewP6.add(lblPlayerMoveCategoryP6, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryCalcP6 = new JLabel("");
		panelPlayerMovePreviewP6.add(lblPlayerMoveCategoryCalcP6, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblPlayerMovePowerP6 = new JLabel("Power: ");
		panelPlayerMovePreviewP6.add(lblPlayerMovePowerP6, "cell 0 2");
		
		JLabel lblPlayerMovePowerCalcP6 = new JLabel("");
		panelPlayerMovePreviewP6.add(lblPlayerMovePowerCalcP6, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyP6 = new JLabel("Accuracy: ");
		panelPlayerMovePreviewP6.add(lblPlayerMoveAccuracyP6, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyCalcP6 = new JLabel("");
		panelPlayerMovePreviewP6.add(lblPlayerMoveAccuracyCalcP6, "cell 1 3");
		panelPlayerP6.add(panel_3_PlayerP6, "cell 2 1,grow");
		
		panel_3_PlayerP6.add(buttonRemovePlayerP6);
		
		
		listPlayerSelectedMovesP6.setSelectionModel(smPlayerP6);
		panelPlayerP6.add(listPlayerSelectedMovesP6, "cell 3 1,grow");
		
		JPanel panelPlayerMoveDetailsP6 = new JPanel();
		panelPlayerMoveDetailsP6.setOpaque(false);
		panelPlayerP6.add(panelPlayerMoveDetailsP6, "cell 4 1,grow");
		panelPlayerMoveDetailsP6.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblPlayerMoveTypeDetailsP6 = new JLabel("Move Type: ");
		panelPlayerMoveDetailsP6.add(lblPlayerMoveTypeDetailsP6, "cell 0 0,alignx left");
		
		JLabel lblPlayerMoveTypeIconDisplayP6 = new JLabel("");
		panelPlayerMoveDetailsP6.add(lblPlayerMoveTypeIconDisplayP6, "cell 1 0");
		
		JLabel lblPlayerMoveCategoryDetailsP6 = new JLabel("Category: ");
		panelPlayerMoveDetailsP6.add(lblPlayerMoveCategoryDetailsP6, "cell 0 1");
		
		JLabel lblPlayerMoveCategoryDisplayP6 = new JLabel("");
		panelPlayerMoveDetailsP6.add(lblPlayerMoveCategoryDisplayP6, "cell 1 1");
		
		JLabel lblPlayerMovePowerDetailsP6 = new JLabel("Power: ");
		panelPlayerMoveDetailsP6.add(lblPlayerMovePowerDetailsP6, "cell 0 2");
		
		JLabel lblPlayerMovePowerDisplayP6 = new JLabel("");
		panelPlayerMoveDetailsP6.add(lblPlayerMovePowerDisplayP6, "cell 1 2");
		
		JLabel lblPlayerMoveAccuracyDetailsP6 = new JLabel("Accuracy: ");
		panelPlayerMoveDetailsP6.add(lblPlayerMoveAccuracyDetailsP6, "cell 0 3");
		
		JLabel lblPlayerMoveAccuracyDisplayP6 = new JLabel("");
		panelPlayerMoveDetailsP6.add(lblPlayerMoveAccuracyDisplayP6, "cell 1 3");
		
		JLabel lblPlayerMaxPPP6 = new JLabel("Max PP: ");
		panelPlayerMoveDetailsP6.add(lblPlayerMaxPPP6, "cell 0 4");
		
		JLabel lblPlayerMaxPPCalcP6 = new JLabel("0");
		panelPlayerMoveDetailsP6.add(lblPlayerMaxPPCalcP6, "cell 1 4");
		
		JLabel lblPlayerCurrentPPP6 = new JLabel("Current PP: ");
		panelPlayerMoveDetailsP6.add(lblPlayerCurrentPPP6, "cell 0 5");
		
		JSpinner spinnerPlayerCurrentPPP6 = new JSpinner();
		spinnerPlayerCurrentPPP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				playerMovesP6[listPlayerSelectedMovesP6.getSelectedIndex()].setPp((int) spinnerPlayerCurrentPPP6.getValue());
				playerMovesP6[listPlayerSelectedMovesP6.getSelectedIndex()].setCurrentPP((int) spinnerPlayerCurrentPPP6.getValue());
			}
		});
		panelPlayerMoveDetailsP6.add(spinnerPlayerCurrentPPP6, "cell 1 5");
		
		
		
		listPlayerMovesP6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listPlayerMovesP6.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lblPlayerMoveTypeIconP6.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblPlayerMoveCategoryCalcP6.setText(catText);
						lblPlayerMovePowerCalcP6.setText(selected.getPower()+"");
						lblPlayerMoveAccuracyCalcP6.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listPlayerSelectedMovesP6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listPlayerSelectedMovesP6.getSelectedIndex();
				
				lblPlayerMaxPPCalcP6.setText(playerMovesP6[i].getMaxPP() + "");
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+playerMovesP1[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblPlayerMoveTypeIconDisplayP6.setIcon(new ImageIcon(image));
				String catTextDisplay = "None";
				switch (playerMovesP6[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblPlayerMoveCategoryDisplayP6.setText(catTextDisplay);
				lblPlayerMovePowerDisplayP6.setText(playerMovesP6[i].getPower()+"");
				lblPlayerMoveAccuracyDisplayP6.setText(playerMovesP6[i].getAccuracy()+"");
				spinnerPlayerCurrentPPP6.setModel(new SpinnerNumberModel(0, 0, playerMovesP6[i].getMaxPP(), 1));
				spinnerPlayerCurrentPPP6.setValue(playerMovesP6[i].getPp());
				repaint();
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		panelOpponentP1 = new JPanel();
		panelOpponentP1.setBackground(new Color(240,240,240,123));
		contentPane.add(panelOpponentP1);
		panelOpponentP1.setVisible(false);
		selectedOpponentMovesP1 = new String[] {"None", "None", "None", "None"};
		JScrollPane scrollPaneOpponent1 = new JScrollPane();
		panelOpponentP1.add(scrollPaneOpponent1, "cell 0 0,grow");
		listOpponentPokemonP1 = new JList(Names.pokemonNames);
		scrollPaneOpponent1.setViewportView(listOpponentPokemonP1);
		listOpponentPokemonP1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListSelectionModel pOpponentP1 = new DefaultListSelectionModel();
		pOpponentP1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pOpponentP1.setLeadAnchorNotificationEnabled(false);
		listOpponentPokemonP1.setSelectionModel(pOpponentP1);
		listOpponentPokemonP1.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getOpponentPKMN()[0] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listOpponentPokemonP1.getSelectedIndex()]).newInstance();
					if(pOpponentP1.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getOpponentPKMN()[0].getValidMoves().length];
					while(i < CurrentSimData.getOpponentPKMN()[0].getValidMoves().length)
					{
						
						int t = CurrentSimData.getOpponentPKMN()[0].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedOpponentMovesP1[0] = "None";
					selectedOpponentMovesP1[1] = "None";
					selectedOpponentMovesP1[2] = "None";
					selectedOpponentMovesP1[3] = "None";
					opponentMovesP1 = new Move[]{new None(), new None(), new None(), new None()};
					listOpponentSelectedMovesP1.setListData(selectedOpponentMovesP1);
					listOpponentMovesP1.setListData(label);
					
					spinnerOpponentHPIVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getIvHp());
					spinnerOpponentAttackIVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getIvAttack());
					spinnerOpponentDefenseIVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getIvDefense());
					spinnerOpponentSpAttackIVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getIvSpAttack());
					spinnerOpponentSpDefenseIVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getIvSpDefense());
					spinnerOpponentSpeedIVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getIvSpeed());
					
					spinnerOpponentHPEVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getEvHp());
					spinnerOpponentAttackEVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getEvAttack());
					spinnerOpponentDefenseEVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getEvDefense());
					spinnerOpponentSpAttackEVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getEvSpAttack());
					spinnerOpponentSpDefenseEVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getEvSpDefense());
					spinnerOpponentSpeedEVP1.setValue(CurrentSimData.getOpponentPKMN()[0].getEvSpeed());
					
					spinnerOpponentLevelP1.setValue(CurrentSimData.getOpponentPKMN()[0].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		DefaultListSelectionModel mOpponentP1 = new DefaultListSelectionModel();
		mOpponentP1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mOpponentP1.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smOpponentP1 = new DefaultListSelectionModel();
		smOpponentP1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smOpponentP1.setLeadAnchorNotificationEnabled(false);
		panelOpponentP1.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		panelOpponentP1.add(scrollPaneOpponent1, "cell 0 0,grow");
		
		JScrollPane scrollPaneOpponentP1 = new JScrollPane();
		scrollPaneOpponentP1.setViewportView(listOpponentMovesP1);
		listOpponentMovesP1.setSelectionModel(mOpponentP1);
		listOpponentMovesP1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JPanel panelOpponentIVP1 = new JPanel();
		panelOpponentIVP1.setOpaque(false);
		panelOpponentP1.add(panelOpponentIVP1, "cell 1 0,grow");
		panelOpponentIVP1.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblOpponentIVsP1 = new JLabel("IVs");
		panelOpponentIVP1.add(lblOpponentIVsP1, "cell 0 0");
		
		JLabel lblOpponentHPIVP1 = new JLabel("HP: ");
		panelOpponentIVP1.add(lblOpponentHPIVP1, "cell 0 1");
		
		spinnerOpponentHPIVP1 = new JSpinner();
		spinnerOpponentHPIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[0].setIvHp(Double.parseDouble(""+spinnerOpponentHPIVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[0].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[0].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[0].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel()));
				statLabelUpdaterOpponentP1();
			}
		});
		spinnerOpponentHPIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP1.add(spinnerOpponentHPIVP1, "cell 1 1");
		
		JLabel lblOpponentAttackIVP1 = new JLabel("Attack: ");
		panelOpponentIVP1.add(lblOpponentAttackIVP1, "cell 0 2");
		
		spinnerOpponentAttackIVP1 = new JSpinner();
		spinnerOpponentAttackIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[0].setIvAttack(Double.parseDouble(""+spinnerOpponentAttackIVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[0].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[0].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[0].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[0].getNature()));
						statLabelUpdaterOpponentP1();
			}
		});
		spinnerOpponentAttackIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP1.add(spinnerOpponentAttackIVP1, "cell 1 2");
		
		JLabel lblOpponentDefenseIVP1 = new JLabel("Defense: ");
		panelOpponentIVP1.add(lblOpponentDefenseIVP1, "cell 0 3");
		
		spinnerOpponentDefenseIVP1 = new JSpinner();
		spinnerOpponentDefenseIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[0].setIvDefense(Double.parseDouble(""+spinnerOpponentDefenseIVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[0].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[0].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[0].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[0].getNature()));
						statLabelUpdaterOpponentP1();
			}
		});
		spinnerOpponentDefenseIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP1.add(spinnerOpponentDefenseIVP1, "cell 1 3");
		
		JLabel lblOpponentSpAttackIVP1 = new JLabel("Special Attack: ");
		panelOpponentIVP1.add(lblOpponentSpAttackIVP1, "cell 0 4");
		
		spinnerOpponentSpAttackIVP1 = new JSpinner();
		spinnerOpponentSpAttackIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[0].setIvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackIVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setSpAttack(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[0].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[0].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[0].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[0].getNature()));
						statLabelUpdaterOpponentP1();
			}
		});
		spinnerOpponentSpAttackIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP1.add(spinnerOpponentSpAttackIVP1, "cell 1 4");
		
		JLabel lblOpponentSpDefenseIVP1 = new JLabel("Special Defense: ");
		panelOpponentIVP1.add(lblOpponentSpDefenseIVP1, "cell 0 5");
		
		spinnerOpponentSpDefenseIVP1 = new JSpinner();
		spinnerOpponentSpDefenseIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[0].setIvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseIVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setSpDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[0].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[0].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[0].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[0].getNature()));
						statLabelUpdaterOpponentP1();
			}
		});
		spinnerOpponentSpDefenseIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP1.add(spinnerOpponentSpDefenseIVP1, "cell 1 5");
		
		JLabel lblOpponentSpeedIVP1 = new JLabel("Speed: ");
		panelOpponentIVP1.add(lblOpponentSpeedIVP1, "cell 0 6");
		
		spinnerOpponentSpeedIVP1 = new JSpinner();
		spinnerOpponentSpeedIVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[0].setIvSpeed(Double.parseDouble(""+spinnerOpponentSpeedIVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setSpeed(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[0].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[0].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[0].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[0].getNature()));
						statLabelUpdaterOpponentP1();
			}
		});
		spinnerOpponentSpeedIVP1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP1.add(spinnerOpponentSpeedIVP1, "cell 1 6");
		
		JPanel panelOpponentEVP1 = new JPanel();
		panelOpponentEVP1.setOpaque(false);
		panelOpponentP1.add(panelOpponentEVP1, "cell 2 0,grow");
		panelOpponentEVP1.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblOpponentEVsP1 = new JLabel("EVs");
		panelOpponentEVP1.add(lblOpponentEVsP1, "cell 0 0");
		
		JLabel lblOpponentEVMaxP1 = new JLabel("Available: ");
		panelOpponentEVP1.add(lblOpponentEVMaxP1, "cell 1 0");
		
		lblOpponentEVsAvailableP1 = new JLabel("510");
		panelOpponentEVP1.add(lblOpponentEVsAvailableP1, "cell 2 0");
		
		JLabel lblOpponentHPEVP1 = new JLabel("HP: ");
		panelOpponentEVP1.add(lblOpponentHPEVP1, "cell 0 1");
		
		spinnerOpponentHPEVP1 = new JSpinner();
		spinnerOpponentHPEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP1 < 0)
				{
					spinnerOpponentHPEVP1.setValue((int)spinnerOpponentHPEVP1.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[0].setEvHp(Double.parseDouble(""+spinnerOpponentHPEVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[0].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[0].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[0].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel()));
						statLabelUpdaterOpponentP1();
						opponentEVCheckP1();
			}
		});
		spinnerOpponentHPEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP1.add(spinnerOpponentHPEVP1, "cell 1 1");
		
		JLabel lblOpponentAttackEVP1 = new JLabel("Attack: ");
		panelOpponentEVP1.add(lblOpponentAttackEVP1, "cell 0 2");
		
		spinnerOpponentAttackEVP1 = new JSpinner();
		spinnerOpponentAttackEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP1 < 0)
				{
					spinnerOpponentAttackEVP1.setValue((int)spinnerOpponentAttackEVP1.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[0].setEvAttack(Double.parseDouble(""+spinnerOpponentAttackEVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[0].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[0].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[0].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[0].getNature()));
						statLabelUpdaterOpponentP1();
						opponentEVCheckP1();
			}
		});
		spinnerOpponentAttackEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP1.add(spinnerOpponentAttackEVP1, "cell 1 2");
		
		JLabel lblOpponentDefenseEVP1 = new JLabel("Defense: ");
		panelOpponentEVP1.add(lblOpponentDefenseEVP1, "cell 0 3");
		
		spinnerOpponentDefenseEVP1 = new JSpinner();
		spinnerOpponentDefenseEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP1 < 0)
				{
					spinnerOpponentDefenseEVP1.setValue((int)spinnerOpponentDefenseEVP1.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[0].setEvDefense(Double.parseDouble(""+spinnerOpponentDefenseEVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[0].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[0].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[0].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[0].getNature()));
						statLabelUpdaterOpponentP1();
						opponentEVCheckP1();
			}
		});
		spinnerOpponentDefenseEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP1.add(spinnerOpponentDefenseEVP1, "cell 1 3");
		
		JLabel lblOpponentSpAttackEVP1 = new JLabel("Special Attack: ");
		panelOpponentEVP1.add(lblOpponentSpAttackEVP1, "cell 0 4");
		
		spinnerOpponentSpAttackEVP1 = new JSpinner();
		spinnerOpponentSpAttackEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP1 < 0)
				{
					spinnerOpponentSpAttackEVP1.setValue((int)spinnerOpponentSpAttackEVP1.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[0].setEvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackEVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setSpAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[0].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[0].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[0].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[0].getNature()));
						statLabelUpdaterOpponentP1();
						opponentEVCheckP1();
			}
		});
		spinnerOpponentSpAttackEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP1.add(spinnerOpponentSpAttackEVP1, "cell 1 4");
		
		JLabel lblOpponentSpDefenseEVP1 = new JLabel("Special Defense: ");
		panelOpponentEVP1.add(lblOpponentSpDefenseEVP1, "cell 0 5");
		
		spinnerOpponentSpDefenseEVP1 = new JSpinner();
		spinnerOpponentSpDefenseEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP1 < 0)
				{
					spinnerOpponentSpDefenseEVP1.setValue((int)spinnerOpponentSpDefenseEVP1.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[0].setEvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseEVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setSpDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[0].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[0].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[0].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[0].getNature()));
						statLabelUpdaterOpponentP1();
						opponentEVCheckP1();
			}
		});
		spinnerOpponentSpDefenseEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP1.add(spinnerOpponentSpDefenseEVP1, "cell 1 5");
		
		JLabel lblOpponentSpeedEVP1 = new JLabel("Speed: ");
		panelOpponentEVP1.add(lblOpponentSpeedEVP1, "cell 0 7");
		
		spinnerOpponentSpeedEVP1 = new JSpinner();
		spinnerOpponentSpeedEVP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP1 < 0)
				{
					spinnerOpponentSpeedEVP1.setValue((int)spinnerOpponentSpeedEVP1.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[0].setEvSpeed(Double.parseDouble(""+spinnerOpponentSpeedEVP1.getValue()));
				CurrentSimData.getOpponentPKMN()[0].setSpeed(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[0].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[0].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[0].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[0].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[0].getNature()));
						statLabelUpdaterOpponentP1();
						opponentEVCheckP1();
			}
		});
		spinnerOpponentSpeedEVP1.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP1.add(spinnerOpponentSpeedEVP1, "cell 1 7");
		
		JPanel panelOpponentStatsP1 = new JPanel();
		panelOpponentStatsP1.setOpaque(false);
		panelOpponentP1.add(panelOpponentStatsP1, "cell 3 0,grow");
		panelOpponentStatsP1.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblOpponentLevelP1 = new JLabel("Level: ");
		panelOpponentStatsP1.add(lblOpponentLevelP1, "cell 0 0");
		
		spinnerOpponentLevelP1 = new JSpinner();
		spinnerOpponentLevelP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[0].setLevel(Double.parseDouble(""+spinnerOpponentLevelP1.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[0]);
				statLabelUpdaterOpponentP1();
			}
		});
		spinnerOpponentLevelP1.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelOpponentStatsP1.add(spinnerOpponentLevelP1, "cell 1 0");
		
		lblOpponentHPP1 = new JLabel("HP: ");
		panelOpponentStatsP1.add(lblOpponentHPP1, "cell 0 1");
		
		lblOpponentHPCalcP1 = new JLabel("0");
		panelOpponentStatsP1.add(lblOpponentHPCalcP1, "cell 1 1");
		
		lblOpponentAttackP1 = new JLabel("Attack: ");
		panelOpponentStatsP1.add(lblOpponentAttackP1, "cell 0 2");
		
		lblOpponentAttackCalcP1 = new JLabel("0");
		panelOpponentStatsP1.add(lblOpponentAttackCalcP1, "cell 1 2");
		
		lblOpponentDefenseP1 = new JLabel("Defense: ");
		panelOpponentStatsP1.add(lblOpponentDefenseP1, "cell 0 3");
		
		lblOpponentDefenseCalcP1 = new JLabel("0");
		panelOpponentStatsP1.add(lblOpponentDefenseCalcP1, "cell 1 3");
		
		lblOpponentSpAttackP1 = new JLabel("Special Attack: ");
		panelOpponentStatsP1.add(lblOpponentSpAttackP1, "cell 0 4");
		
		lblOpponentSpAttackCalcP1 = new JLabel("0");
		panelOpponentStatsP1.add(lblOpponentSpAttackCalcP1, "cell 1 4");
		
		lblOpponentSpDefenseP1 = new JLabel("Special Defense: ");
		panelOpponentStatsP1.add(lblOpponentSpDefenseP1, "cell 0 5");
		
		lblOpponentSpDefenseCalcP1 = new JLabel("0");
		panelOpponentStatsP1.add(lblOpponentSpDefenseCalcP1, "cell 1 5");
		
		lblOpponentSpeedP1 = new JLabel("Speed: ");
		panelOpponentStatsP1.add(lblOpponentSpeedP1, "cell 0 6");
		
		lblOpponentSpeedCalcP1 = new JLabel("0");
		panelOpponentStatsP1.add(lblOpponentSpeedCalcP1, "cell 1 6");
		
		JLabel lblOpponentNatureP1 = new JLabel("Nature: ");
		panelOpponentStatsP1.add(lblOpponentNatureP1, "cell 0 7");
		
		spinnerOpponentNatureP1 = new JSpinner();
		spinnerOpponentNatureP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerOpponentNatureP1.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getOpponentPKMN()[0].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[0]);
				statLabelUpdaterOpponentP1();
				opponentStatColors();
			}

			private void opponentStatColors() {
				lblOpponentAttackP1.setForeground(Color.BLACK);
				lblOpponentDefenseP1.setForeground(Color.BLACK);
				lblOpponentSpAttackP1.setForeground(Color.BLACK);
				lblOpponentSpDefenseP1.setForeground(Color.BLACK);
				lblOpponentSpeedP1.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getOpponentPKMN()[0].getNature()][0] == StatCalc.natures[CurrentSimData.getOpponentPKMN()[0].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[0].getNature()][0])
					{
					case StatCalc.ATTACK: lblOpponentAttackP1.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP1.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP1.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP1.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP1.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[0].getNature()][1])
					{
					case StatCalc.ATTACK: lblOpponentAttackP1.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP1.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP1.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP1.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP1.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerOpponentNatureP1.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelOpponentStatsP1.add(spinnerOpponentNatureP1, "cell 1 7 2 1,growx");
		
		JPanel panelOpponentExtraP1 = new JPanel();
		panelOpponentExtraP1.setOpaque(false);
		panelOpponentP1.add(panelOpponentExtraP1, "cell 4 0,grow");
		panelOpponentExtraP1.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblOpponentGenderP1 = new JLabel("Gender: ");
		panelOpponentExtraP1.add(lblOpponentGenderP1, "cell 0 0,aligny top");
		
		rdbtnOpponentMaleP1 = new JRadioButton("Male");
		opponentGenderGroupP1.add(rdbtnOpponentMaleP1);
		panelOpponentExtraP1.add(rdbtnOpponentMaleP1, "flowy,cell 1 0");
		
		rdbtnOpponentFemaleP1 = new JRadioButton("Female");
		opponentGenderGroupP1.add(rdbtnOpponentFemaleP1);
		panelOpponentExtraP1.add(rdbtnOpponentFemaleP1, "cell 1 0");
		
		rdbtnOpponentGenderlessP1 = new JRadioButton("Genderless");
		opponentGenderGroupP1.add(rdbtnOpponentGenderlessP1);
		panelOpponentExtraP1.add(rdbtnOpponentGenderlessP1, "cell 1 0");
		rdbtnOpponentMaleP1.setSelected(true);
		panelOpponentP1.add(scrollPaneOpponentP1, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_OpponentP1 = new JPanel();
		panel_3_OpponentP1.setOpaque(false);
		panel_3_OpponentP1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddOpponentP1 = new JButton(">>");
		buttonAddOpponentP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentMovesP1.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedOpponentMovesP1.length)
					{
						if(selectedOpponentMovesP1[i] == "None")
						{
							selectedOpponentMovesP1[i] = (String) listOpponentMovesP1.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedOpponentMovesP1[i] == Names.fullMoveNames[w])
								{
									try {
										opponentMovesP1[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listOpponentSelectedMovesP1.setListData(selectedOpponentMovesP1);
				}
			}
		});
		panel_3_OpponentP1.add(buttonAddOpponentP1);
		
		JButton buttonRemoveOpponentP1 = new JButton("<<");
		buttonRemoveOpponentP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentSelectedMovesP1.getSelectedValue()!= null)
				{
					opponentMovesP1[listOpponentSelectedMovesP1.getSelectedIndex()] = new None();
					selectedOpponentMovesP1[listOpponentSelectedMovesP1.getSelectedIndices()[0]] = "None";
					listOpponentSelectedMovesP1.setListData(selectedOpponentMovesP1);
				}
			}
		});
		
		JPanel panelOpponentMovePreviewP1 = new JPanel();
		panelOpponentMovePreviewP1.setOpaque(false);
		panelOpponentP1.add(panelOpponentMovePreviewP1, "cell 1 1,grow");
		panelOpponentMovePreviewP1.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblOpponentMoveTypeP1 = new JLabel("Move Type: ");
		panelOpponentMovePreviewP1.add(lblOpponentMoveTypeP1, "cell 0 0,alignx left,aligny top");
		
		lblOpponentMoveTypeIconP1 = new JLabel();
		panelOpponentMovePreviewP1.add(lblOpponentMoveTypeIconP1, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryP1 = new JLabel("Category: ");
		panelOpponentMovePreviewP1.add(lblOpponentMoveCategoryP1, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryCalcP1 = new JLabel("");
		panelOpponentMovePreviewP1.add(lblOpponentMoveCategoryCalcP1, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblOpponentMovePowerP1 = new JLabel("Power: ");
		panelOpponentMovePreviewP1.add(lblOpponentMovePowerP1, "cell 0 2");
		
		JLabel lblOpponentMovePowerCalcP1 = new JLabel("");
		panelOpponentMovePreviewP1.add(lblOpponentMovePowerCalcP1, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyP1 = new JLabel("Accuracy: ");
		panelOpponentMovePreviewP1.add(lblOpponentMoveAccuracyP1, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyCalcP1 = new JLabel("");
		panelOpponentMovePreviewP1.add(lblOpponentMoveAccuracyCalcP1, "cell 1 3");
		panelOpponentP1.add(panel_3_OpponentP1, "cell 2 1,grow");
		
		panel_3_OpponentP1.add(buttonRemoveOpponentP1);
		
		
		listOpponentSelectedMovesP1.setSelectionModel(smOpponentP1);
		panelOpponentP1.add(listOpponentSelectedMovesP1, "cell 3 1,grow");
		
		JPanel panelOpponentMoveDetailsP1 = new JPanel();
		panelOpponentMoveDetailsP1.setOpaque(false);
		panelOpponentP1.add(panelOpponentMoveDetailsP1, "cell 4 1,grow");
		panelOpponentMoveDetailsP1.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblOpponentMoveTypeDetailsP1 = new JLabel("Move Type: ");
		panelOpponentMoveDetailsP1.add(lblOpponentMoveTypeDetailsP1, "cell 0 0,alignx left");
		
		JLabel lblOpponentMoveTypeIconDisplayP1 = new JLabel("");
		panelOpponentMoveDetailsP1.add(lblOpponentMoveTypeIconDisplayP1, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryDetailsP1 = new JLabel("Category: ");
		panelOpponentMoveDetailsP1.add(lblOpponentMoveCategoryDetailsP1, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryDisplayP1 = new JLabel("");
		panelOpponentMoveDetailsP1.add(lblOpponentMoveCategoryDisplayP1, "cell 1 1");
		
		JLabel lblOpponentMovePowerDetailsP1 = new JLabel("Power: ");
		panelOpponentMoveDetailsP1.add(lblOpponentMovePowerDetailsP1, "cell 0 2");
		
		JLabel lblOpponentMovePowerDisplayP1 = new JLabel("");
		panelOpponentMoveDetailsP1.add(lblOpponentMovePowerDisplayP1, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyDetailsP1 = new JLabel("Accuracy: ");
		panelOpponentMoveDetailsP1.add(lblOpponentMoveAccuracyDetailsP1, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyDisplayP1 = new JLabel("");
		panelOpponentMoveDetailsP1.add(lblOpponentMoveAccuracyDisplayP1, "cell 1 3");
		
		JLabel lblOpponentMaxPPP1 = new JLabel("Max PP: ");
		panelOpponentMoveDetailsP1.add(lblOpponentMaxPPP1, "cell 0 4");
		
		JLabel lblOpponentMaxPPCalcP1 = new JLabel("0");
		panelOpponentMoveDetailsP1.add(lblOpponentMaxPPCalcP1, "cell 1 4");
		
		JLabel lblOpponentCurrentPPP1 = new JLabel("Current PP: ");
		panelOpponentMoveDetailsP1.add(lblOpponentCurrentPPP1, "cell 0 5");
		
		JSpinner spinnerOpponentCurrentPPP1 = new JSpinner();
		spinnerOpponentCurrentPPP1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				opponentMovesP1[listOpponentSelectedMovesP1.getSelectedIndex()].setPp((int) spinnerOpponentCurrentPPP1.getValue());
				opponentMovesP1[listOpponentSelectedMovesP1.getSelectedIndex()].setCurrentPP((int) spinnerOpponentCurrentPPP1.getValue());
			}
		});
		panelOpponentMoveDetailsP1.add(spinnerOpponentCurrentPPP1, "cell 1 5");
		
		
		
		listOpponentMovesP1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listOpponentMovesP1.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lblOpponentMoveTypeIconP1.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblOpponentMoveCategoryCalcP1.setText(catText);
						lblOpponentMovePowerCalcP1.setText(selected.getPower()+"");
						lblOpponentMoveAccuracyCalcP1.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listOpponentSelectedMovesP1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listOpponentSelectedMovesP1.getSelectedIndex();
				
				lblOpponentMaxPPCalcP1.setText(opponentMovesP1[i].getMaxPP() + "");
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+opponentMovesP1[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblOpponentMoveTypeIconDisplayP1.setIcon(new ImageIcon(image));
				String catTextDisplay = "None";
				switch (opponentMovesP1[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblOpponentMoveCategoryDisplayP1.setText(catTextDisplay);
				lblOpponentMovePowerDisplayP1.setText(opponentMovesP1[i].getPower()+"");
				lblOpponentMoveAccuracyDisplayP1.setText(opponentMovesP1[i].getAccuracy()+"");
				spinnerOpponentCurrentPPP1.setModel(new SpinnerNumberModel(0, 0, opponentMovesP1[i].getMaxPP(), 1));
				spinnerOpponentCurrentPPP1.setValue(opponentMovesP1[i].getPp());
				repaint();
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		panelOpponentP2 = new JPanel();
		panelOpponentP2.setBackground(new Color(240,240,240,123));
		contentPane.add(panelOpponentP2);
		panelOpponentP2.setVisible(false);
		selectedOpponentMovesP2 = new String[] {"None", "None", "None", "None"};
		JScrollPane scrollPaneOpponent2 = new JScrollPane();
		panelOpponentP2.add(scrollPaneOpponent2, "cell 0 0,grow");
		listOpponentPokemonP2 = new JList(Names.pokemonNames);
		scrollPaneOpponent2.setViewportView(listOpponentPokemonP2);
		listOpponentPokemonP2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListSelectionModel pOpponentP2 = new DefaultListSelectionModel();
		pOpponentP2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pOpponentP2.setLeadAnchorNotificationEnabled(false);
		listOpponentPokemonP2.setSelectionModel(pOpponentP2);
		listOpponentPokemonP2.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getOpponentPKMN()[1] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listOpponentPokemonP2.getSelectedIndex()]).newInstance();
					if(pOpponentP2.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getOpponentPKMN()[1].getValidMoves().length];
					while(i < CurrentSimData.getOpponentPKMN()[1].getValidMoves().length)
					{
						
						int t = CurrentSimData.getOpponentPKMN()[1].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedOpponentMovesP2[0] = "None";
					selectedOpponentMovesP2[1] = "None";
					selectedOpponentMovesP2[2] = "None";
					selectedOpponentMovesP2[3] = "None";
					opponentMovesP2 = new Move[]{new None(), new None(), new None(), new None()};
					listOpponentSelectedMovesP2.setListData(selectedOpponentMovesP2);
					listOpponentMovesP2.setListData(label);
					
					spinnerOpponentHPIVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getIvHp());
					spinnerOpponentAttackIVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getIvAttack());
					spinnerOpponentDefenseIVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getIvDefense());
					spinnerOpponentSpAttackIVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getIvSpAttack());
					spinnerOpponentSpDefenseIVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getIvSpDefense());
					spinnerOpponentSpeedIVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getIvSpeed());
					
					spinnerOpponentHPEVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getEvHp());
					spinnerOpponentAttackEVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getEvAttack());
					spinnerOpponentDefenseEVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getEvDefense());
					spinnerOpponentSpAttackEVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getEvSpAttack());
					spinnerOpponentSpDefenseEVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getEvSpDefense());
					spinnerOpponentSpeedEVP2.setValue(CurrentSimData.getOpponentPKMN()[1].getEvSpeed());
					
					spinnerOpponentLevelP2.setValue(CurrentSimData.getOpponentPKMN()[1].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		DefaultListSelectionModel mOpponentP2 = new DefaultListSelectionModel();
		mOpponentP2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mOpponentP2.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smOpponentP2 = new DefaultListSelectionModel();
		smOpponentP2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smOpponentP2.setLeadAnchorNotificationEnabled(false);
		panelOpponentP2.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		panelOpponentP2.add(scrollPaneOpponent2, "cell 0 0,grow");
		
		JScrollPane scrollPaneOpponentP2 = new JScrollPane();
		scrollPaneOpponentP2.setViewportView(listOpponentMovesP2);
		listOpponentMovesP2.setSelectionModel(mOpponentP2);
		listOpponentMovesP2.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JPanel panelOpponentIVP2 = new JPanel();
		panelOpponentIVP2.setOpaque(false);
		panelOpponentP2.add(panelOpponentIVP2, "cell 1 0,grow");
		panelOpponentIVP2.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblOpponentIVsP2 = new JLabel("IVs");
		panelOpponentIVP2.add(lblOpponentIVsP2, "cell 0 0");
		
		JLabel lblOpponentHPIVP2 = new JLabel("HP: ");
		panelOpponentIVP2.add(lblOpponentHPIVP2, "cell 0 1");
		
		spinnerOpponentHPIVP2 = new JSpinner();
		spinnerOpponentHPIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[1].setIvHp(Double.parseDouble(""+spinnerOpponentHPIVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[1].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[1].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[1].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel()));
				statLabelUpdaterOpponentP2();
			}
		});
		spinnerOpponentHPIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP2.add(spinnerOpponentHPIVP2, "cell 1 1");
		
		JLabel lblOpponentAttackIVP2 = new JLabel("Attack: ");
		panelOpponentIVP2.add(lblOpponentAttackIVP2, "cell 0 2");
		
		spinnerOpponentAttackIVP2 = new JSpinner();
		spinnerOpponentAttackIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[1].setIvAttack(Double.parseDouble(""+spinnerOpponentAttackIVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[1].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[1].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[1].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[1].getNature()));
						statLabelUpdaterOpponentP2();
			}
		});
		spinnerOpponentAttackIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP2.add(spinnerOpponentAttackIVP2, "cell 1 2");
		
		JLabel lblOpponentDefenseIVP2 = new JLabel("Defense: ");
		panelOpponentIVP2.add(lblOpponentDefenseIVP2, "cell 0 3");
		
		spinnerOpponentDefenseIVP2 = new JSpinner();
		spinnerOpponentDefenseIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[1].setIvDefense(Double.parseDouble(""+spinnerOpponentDefenseIVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[1].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[1].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[1].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[1].getNature()));
						statLabelUpdaterOpponentP2();
			}
		});
		spinnerOpponentDefenseIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP2.add(spinnerOpponentDefenseIVP2, "cell 1 3");
		
		JLabel lblOpponentSpAttackIVP2 = new JLabel("Special Attack: ");
		panelOpponentIVP2.add(lblOpponentSpAttackIVP2, "cell 0 4");
		
		spinnerOpponentSpAttackIVP2 = new JSpinner();
		spinnerOpponentSpAttackIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[1].setIvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackIVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setSpAttack(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[1].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[1].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[1].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[1].getNature()));
						statLabelUpdaterOpponentP2();
			}
		});
		spinnerOpponentSpAttackIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP2.add(spinnerOpponentSpAttackIVP2, "cell 1 4");
		
		JLabel lblOpponentSpDefenseIVP2 = new JLabel("Special Defense: ");
		panelOpponentIVP2.add(lblOpponentSpDefenseIVP2, "cell 0 5");
		
		spinnerOpponentSpDefenseIVP2 = new JSpinner();
		spinnerOpponentSpDefenseIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[1].setIvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseIVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setSpDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[1].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[1].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[1].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[1].getNature()));
						statLabelUpdaterOpponentP2();
			}
		});
		spinnerOpponentSpDefenseIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP2.add(spinnerOpponentSpDefenseIVP2, "cell 1 5");
		
		JLabel lblOpponentSpeedIVP2 = new JLabel("Speed: ");
		panelOpponentIVP2.add(lblOpponentSpeedIVP2, "cell 0 6");
		
		spinnerOpponentSpeedIVP2 = new JSpinner();
		spinnerOpponentSpeedIVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[1].setIvSpeed(Double.parseDouble(""+spinnerOpponentSpeedIVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setSpeed(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[1].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[1].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[1].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[1].getNature()));
						statLabelUpdaterOpponentP2();
			}
		});
		spinnerOpponentSpeedIVP2.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP2.add(spinnerOpponentSpeedIVP2, "cell 1 6");
		
		JPanel panelOpponentEVP2 = new JPanel();
		panelOpponentEVP2.setOpaque(false);
		panelOpponentP2.add(panelOpponentEVP2, "cell 2 0,grow");
		panelOpponentEVP2.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblOpponentEVsP2 = new JLabel("EVs");
		panelOpponentEVP2.add(lblOpponentEVsP2, "cell 0 0");
		
		JLabel lblOpponentEVMaxP2 = new JLabel("Available: ");
		panelOpponentEVP2.add(lblOpponentEVMaxP2, "cell 1 0");
		
		lblOpponentEVsAvailableP2 = new JLabel("510");
		panelOpponentEVP2.add(lblOpponentEVsAvailableP2, "cell 2 0");
		
		JLabel lblOpponentHPEVP2 = new JLabel("HP: ");
		panelOpponentEVP2.add(lblOpponentHPEVP2, "cell 0 1");
		
		spinnerOpponentHPEVP2 = new JSpinner();
		spinnerOpponentHPEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP2 < 0)
				{
					spinnerOpponentHPEVP2.setValue((int)spinnerOpponentHPEVP2.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[1].setEvHp(Double.parseDouble(""+spinnerOpponentHPEVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[1].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[1].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[1].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel()));
						statLabelUpdaterOpponentP2();
						opponentEVCheckP2();
			}
		});
		spinnerOpponentHPEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP2.add(spinnerOpponentHPEVP2, "cell 1 1");
		
		JLabel lblOpponentAttackEVP2 = new JLabel("Attack: ");
		panelOpponentEVP2.add(lblOpponentAttackEVP2, "cell 0 2");
		
		spinnerOpponentAttackEVP2 = new JSpinner();
		spinnerOpponentAttackEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP2 < 0)
				{
					spinnerOpponentAttackEVP2.setValue((int)spinnerOpponentAttackEVP2.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[1].setEvAttack(Double.parseDouble(""+spinnerOpponentAttackEVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[1].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[1].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[1].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[1].getNature()));
						statLabelUpdaterOpponentP2();
						opponentEVCheckP2();
			}
		});
		spinnerOpponentAttackEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP2.add(spinnerOpponentAttackEVP2, "cell 1 2");
		
		JLabel lblOpponentDefenseEVP2 = new JLabel("Defense: ");
		panelOpponentEVP2.add(lblOpponentDefenseEVP2, "cell 0 3");
		
		spinnerOpponentDefenseEVP2 = new JSpinner();
		spinnerOpponentDefenseEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP2 < 0)
				{
					spinnerOpponentDefenseEVP2.setValue((int)spinnerOpponentDefenseEVP2.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[1].setEvDefense(Double.parseDouble(""+spinnerOpponentDefenseEVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[1].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[1].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[1].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[1].getNature()));
						statLabelUpdaterOpponentP2();
						opponentEVCheckP2();
			}
		});
		spinnerOpponentDefenseEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP2.add(spinnerOpponentDefenseEVP2, "cell 1 3");
		
		JLabel lblOpponentSpAttackEVP2 = new JLabel("Special Attack: ");
		panelOpponentEVP2.add(lblOpponentSpAttackEVP2, "cell 0 4");
		
		spinnerOpponentSpAttackEVP2 = new JSpinner();
		spinnerOpponentSpAttackEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP2 < 0)
				{
					spinnerOpponentSpAttackEVP2.setValue((int)spinnerOpponentSpAttackEVP2.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[1].setEvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackEVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setSpAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[1].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[1].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[1].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[1].getNature()));
						statLabelUpdaterOpponentP2();
						opponentEVCheckP2();
			}
		});
		spinnerOpponentSpAttackEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP2.add(spinnerOpponentSpAttackEVP2, "cell 1 4");
		
		JLabel lblOpponentSpDefenseEVP2 = new JLabel("Special Defense: ");
		panelOpponentEVP2.add(lblOpponentSpDefenseEVP2, "cell 0 5");
		
		spinnerOpponentSpDefenseEVP2 = new JSpinner();
		spinnerOpponentSpDefenseEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP2 < 0)
				{
					spinnerOpponentSpDefenseEVP2.setValue((int)spinnerOpponentSpDefenseEVP2.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[1].setEvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseEVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setSpDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[1].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[1].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[1].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[1].getNature()));
						statLabelUpdaterOpponentP2();
						opponentEVCheckP2();
			}
		});
		spinnerOpponentSpDefenseEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP2.add(spinnerOpponentSpDefenseEVP2, "cell 1 5");
		
		JLabel lblOpponentSpeedEVP2 = new JLabel("Speed: ");
		panelOpponentEVP2.add(lblOpponentSpeedEVP2, "cell 0 7");
		
		spinnerOpponentSpeedEVP2 = new JSpinner();
		spinnerOpponentSpeedEVP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP2 < 0)
				{
					spinnerOpponentSpeedEVP2.setValue((int)spinnerOpponentSpeedEVP2.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[1].setEvSpeed(Double.parseDouble(""+spinnerOpponentSpeedEVP2.getValue()));
				CurrentSimData.getOpponentPKMN()[1].setSpeed(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[1].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[1].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[1].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[1].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[1].getNature()));
						statLabelUpdaterOpponentP2();
						opponentEVCheckP2();
			}
		});
		spinnerOpponentSpeedEVP2.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP2.add(spinnerOpponentSpeedEVP2, "cell 1 7");
		
		JPanel panelOpponentStatsP2 = new JPanel();
		panelOpponentStatsP2.setOpaque(false);
		panelOpponentP2.add(panelOpponentStatsP2, "cell 3 0,grow");
		panelOpponentStatsP2.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblOpponentLevelP2 = new JLabel("Level: ");
		panelOpponentStatsP2.add(lblOpponentLevelP2, "cell 0 0");
		
		spinnerOpponentLevelP2 = new JSpinner();
		spinnerOpponentLevelP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[1].setLevel(Double.parseDouble(""+spinnerOpponentLevelP2.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[1]);
				statLabelUpdaterOpponentP2();
			}
		});
		spinnerOpponentLevelP2.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelOpponentStatsP2.add(spinnerOpponentLevelP2, "cell 1 0");
		
		lblOpponentHPP2 = new JLabel("HP: ");
		panelOpponentStatsP2.add(lblOpponentHPP2, "cell 0 1");
		
		lblOpponentHPCalcP2 = new JLabel("0");
		panelOpponentStatsP2.add(lblOpponentHPCalcP2, "cell 1 1");
		
		lblOpponentAttackP2 = new JLabel("Attack: ");
		panelOpponentStatsP2.add(lblOpponentAttackP2, "cell 0 2");
		
		lblOpponentAttackCalcP2 = new JLabel("0");
		panelOpponentStatsP2.add(lblOpponentAttackCalcP2, "cell 1 2");
		
		lblOpponentDefenseP2 = new JLabel("Defense: ");
		panelOpponentStatsP2.add(lblOpponentDefenseP2, "cell 0 3");
		
		lblOpponentDefenseCalcP2 = new JLabel("0");
		panelOpponentStatsP2.add(lblOpponentDefenseCalcP2, "cell 1 3");
		
		lblOpponentSpAttackP2 = new JLabel("Special Attack: ");
		panelOpponentStatsP2.add(lblOpponentSpAttackP2, "cell 0 4");
		
		lblOpponentSpAttackCalcP2 = new JLabel("0");
		panelOpponentStatsP2.add(lblOpponentSpAttackCalcP2, "cell 1 4");
		
		lblOpponentSpDefenseP2 = new JLabel("Special Defense: ");
		panelOpponentStatsP2.add(lblOpponentSpDefenseP2, "cell 0 5");
		
		lblOpponentSpDefenseCalcP2 = new JLabel("0");
		panelOpponentStatsP2.add(lblOpponentSpDefenseCalcP2, "cell 1 5");
		
		lblOpponentSpeedP2 = new JLabel("Speed: ");
		panelOpponentStatsP2.add(lblOpponentSpeedP2, "cell 0 6");
		
		lblOpponentSpeedCalcP2 = new JLabel("0");
		panelOpponentStatsP2.add(lblOpponentSpeedCalcP2, "cell 1 6");
		
		JLabel lblOpponentNatureP2 = new JLabel("Nature: ");
		panelOpponentStatsP2.add(lblOpponentNatureP2, "cell 0 7");
		
		spinnerOpponentNatureP2 = new JSpinner();
		spinnerOpponentNatureP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerOpponentNatureP2.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getOpponentPKMN()[1].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[1]);
				statLabelUpdaterOpponentP2();
				opponentStatColors();
			}

			private void opponentStatColors() {
				lblOpponentAttackP2.setForeground(Color.BLACK);
				lblOpponentDefenseP2.setForeground(Color.BLACK);
				lblOpponentSpAttackP2.setForeground(Color.BLACK);
				lblOpponentSpDefenseP2.setForeground(Color.BLACK);
				lblOpponentSpeedP2.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getOpponentPKMN()[1].getNature()][1] == StatCalc.natures[CurrentSimData.getOpponentPKMN()[1].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[1].getNature()][1])
					{
					case StatCalc.ATTACK: lblOpponentAttackP2.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP2.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP2.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP2.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP2.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[1].getNature()][1])
					{
					case StatCalc.ATTACK: lblOpponentAttackP2.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP2.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP2.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP2.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP2.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerOpponentNatureP2.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelOpponentStatsP2.add(spinnerOpponentNatureP2, "cell 1 7 2 1,growx");
		
		JPanel panelOpponentExtraP2 = new JPanel();
		panelOpponentExtraP2.setOpaque(false);
		panelOpponentP2.add(panelOpponentExtraP2, "cell 4 0,grow");
		panelOpponentExtraP2.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblOpponentGenderP2 = new JLabel("Gender: ");
		panelOpponentExtraP2.add(lblOpponentGenderP2, "cell 0 0,aligny top");
		
		rdbtnOpponentMaleP2 = new JRadioButton("Male");
		opponentGenderGroupP2.add(rdbtnOpponentMaleP2);
		panelOpponentExtraP2.add(rdbtnOpponentMaleP2, "flowy,cell 1 0");
		
		rdbtnOpponentFemaleP2 = new JRadioButton("Female");
		opponentGenderGroupP2.add(rdbtnOpponentFemaleP2);
		panelOpponentExtraP2.add(rdbtnOpponentFemaleP2, "cell 1 0");
		
		rdbtnOpponentGenderlessP2 = new JRadioButton("Genderless");
		opponentGenderGroupP2.add(rdbtnOpponentGenderlessP2);
		panelOpponentExtraP2.add(rdbtnOpponentGenderlessP2, "cell 1 0");
		rdbtnOpponentMaleP2.setSelected(true);
		panelOpponentP2.add(scrollPaneOpponentP2, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_OpponentP2 = new JPanel();
		panel_3_OpponentP2.setOpaque(false);
		panel_3_OpponentP2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddOpponentP2 = new JButton(">>");
		buttonAddOpponentP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentMovesP2.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedOpponentMovesP2.length)
					{
						if(selectedOpponentMovesP2[i] == "None")
						{
							selectedOpponentMovesP2[i] = (String) listOpponentMovesP2.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedOpponentMovesP2[i] == Names.fullMoveNames[w])
								{
									try {
										opponentMovesP2[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listOpponentSelectedMovesP2.setListData(selectedOpponentMovesP2);
				}
			}
		});
		panel_3_OpponentP2.add(buttonAddOpponentP2);
		
		JButton buttonRemoveOpponentP2 = new JButton("<<");
		buttonRemoveOpponentP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentSelectedMovesP2.getSelectedValue()!= null)
				{
					opponentMovesP2[listOpponentSelectedMovesP2.getSelectedIndex()] = new None();
					selectedOpponentMovesP2[listOpponentSelectedMovesP2.getSelectedIndices()[1]] = "None";
					listOpponentSelectedMovesP2.setListData(selectedOpponentMovesP2);
				}
			}
		});
		
		JPanel panelOpponentMovePreviewP2 = new JPanel();
		panelOpponentMovePreviewP2.setOpaque(false);
		panelOpponentP2.add(panelOpponentMovePreviewP2, "cell 1 1,grow");
		panelOpponentMovePreviewP2.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblOpponentMoveTypeP2 = new JLabel("Move Type: ");
		panelOpponentMovePreviewP2.add(lblOpponentMoveTypeP2, "cell 0 0,alignx left,aligny top");
		
		lblOpponentMoveTypeIconP2 = new JLabel();
		panelOpponentMovePreviewP2.add(lblOpponentMoveTypeIconP2, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryP2 = new JLabel("Category: ");
		panelOpponentMovePreviewP2.add(lblOpponentMoveCategoryP2, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryCalcP2 = new JLabel("");
		panelOpponentMovePreviewP2.add(lblOpponentMoveCategoryCalcP2, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblOpponentMovePowerP2 = new JLabel("Power: ");
		panelOpponentMovePreviewP2.add(lblOpponentMovePowerP2, "cell 0 2");
		
		JLabel lblOpponentMovePowerCalcP2 = new JLabel("");
		panelOpponentMovePreviewP2.add(lblOpponentMovePowerCalcP2, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyP2 = new JLabel("Accuracy: ");
		panelOpponentMovePreviewP2.add(lblOpponentMoveAccuracyP2, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyCalcP2 = new JLabel("");
		panelOpponentMovePreviewP2.add(lblOpponentMoveAccuracyCalcP2, "cell 1 3");
		panelOpponentP2.add(panel_3_OpponentP2, "cell 2 1,grow");
		
		panel_3_OpponentP2.add(buttonRemoveOpponentP2);
		
		
		listOpponentSelectedMovesP2.setSelectionModel(smOpponentP2);
		panelOpponentP2.add(listOpponentSelectedMovesP2, "cell 3 1,grow");
		
		JPanel panelOpponentMoveDetailsP2 = new JPanel();
		panelOpponentMoveDetailsP2.setOpaque(false);
		panelOpponentP2.add(panelOpponentMoveDetailsP2, "cell 4 1,grow");
		panelOpponentMoveDetailsP2.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblOpponentMoveTypeDetailsP2 = new JLabel("Move Type: ");
		panelOpponentMoveDetailsP2.add(lblOpponentMoveTypeDetailsP2, "cell 0 0,alignx left");
		
		JLabel lblOpponentMoveTypeIconDisplayP2 = new JLabel("");
		panelOpponentMoveDetailsP2.add(lblOpponentMoveTypeIconDisplayP2, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryDetailsP2 = new JLabel("Category: ");
		panelOpponentMoveDetailsP2.add(lblOpponentMoveCategoryDetailsP2, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryDisplayP2 = new JLabel("");
		panelOpponentMoveDetailsP2.add(lblOpponentMoveCategoryDisplayP2, "cell 1 1");
		
		JLabel lblOpponentMovePowerDetailsP2 = new JLabel("Power: ");
		panelOpponentMoveDetailsP2.add(lblOpponentMovePowerDetailsP2, "cell 0 2");
		
		JLabel lblOpponentMovePowerDisplayP2 = new JLabel("");
		panelOpponentMoveDetailsP2.add(lblOpponentMovePowerDisplayP2, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyDetailsP2 = new JLabel("Accuracy: ");
		panelOpponentMoveDetailsP2.add(lblOpponentMoveAccuracyDetailsP2, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyDisplayP2 = new JLabel("");
		panelOpponentMoveDetailsP2.add(lblOpponentMoveAccuracyDisplayP2, "cell 1 3");
		
		JLabel lblOpponentMaxPPP2 = new JLabel("Max PP: ");
		panelOpponentMoveDetailsP2.add(lblOpponentMaxPPP2, "cell 0 4");
		
		JLabel lblOpponentMaxPPCalcP2 = new JLabel("0");
		panelOpponentMoveDetailsP2.add(lblOpponentMaxPPCalcP2, "cell 1 4");
		
		JLabel lblOpponentCurrentPPP2 = new JLabel("Current PP: ");
		panelOpponentMoveDetailsP2.add(lblOpponentCurrentPPP2, "cell 0 5");
		
		JSpinner spinnerOpponentCurrentPPP2 = new JSpinner();
		spinnerOpponentCurrentPPP2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				opponentMovesP2[listOpponentSelectedMovesP2.getSelectedIndex()].setPp((int) spinnerOpponentCurrentPPP2.getValue());
				opponentMovesP2[listOpponentSelectedMovesP2.getSelectedIndex()].setCurrentPP((int) spinnerOpponentCurrentPPP2.getValue());
			}
		});
		panelOpponentMoveDetailsP2.add(spinnerOpponentCurrentPPP2, "cell 1 5");
		
		
		
		listOpponentMovesP2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listOpponentMovesP2.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lblOpponentMoveTypeIconP2.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblOpponentMoveCategoryCalcP2.setText(catText);
						lblOpponentMovePowerCalcP2.setText(selected.getPower()+"");
						lblOpponentMoveAccuracyCalcP2.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listOpponentSelectedMovesP2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listOpponentSelectedMovesP2.getSelectedIndex();
				
				lblOpponentMaxPPCalcP2.setText(opponentMovesP2[i].getMaxPP() + "");
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+opponentMovesP2[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblOpponentMoveTypeIconDisplayP2.setIcon(new ImageIcon(image));
				String catTextDisplay = "None";
				switch (opponentMovesP2[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblOpponentMoveCategoryDisplayP2.setText(catTextDisplay);
				lblOpponentMovePowerDisplayP2.setText(opponentMovesP2[i].getPower()+"");
				lblOpponentMoveAccuracyDisplayP2.setText(opponentMovesP2[i].getAccuracy()+"");
				spinnerOpponentCurrentPPP2.setModel(new SpinnerNumberModel(0, 0, opponentMovesP2[i].getMaxPP(), 1));
				spinnerOpponentCurrentPPP2.setValue(opponentMovesP2[i].getPp());
				repaint();
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		panelOpponentP3 = new JPanel();
		panelOpponentP3.setBackground(new Color(240,240,240,123));
		contentPane.add(panelOpponentP3);
		panelOpponentP3.setVisible(false);
		selectedOpponentMovesP3 = new String[] {"None", "None", "None", "None"};
		JScrollPane scrollPaneOpponent3 = new JScrollPane();
		panelOpponentP3.add(scrollPaneOpponent3, "cell 0 0,grow");
		listOpponentPokemonP3 = new JList(Names.pokemonNames);
		scrollPaneOpponent3.setViewportView(listOpponentPokemonP3);
		listOpponentPokemonP3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListSelectionModel pOpponentP3 = new DefaultListSelectionModel();
		pOpponentP3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pOpponentP3.setLeadAnchorNotificationEnabled(false);
		listOpponentPokemonP3.setSelectionModel(pOpponentP3);
		listOpponentPokemonP3.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getOpponentPKMN()[2] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listOpponentPokemonP3.getSelectedIndex()]).newInstance();
					if(pOpponentP3.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getOpponentPKMN()[2].getValidMoves().length];
					while(i < CurrentSimData.getOpponentPKMN()[2].getValidMoves().length)
					{
						
						int t = CurrentSimData.getOpponentPKMN()[2].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedOpponentMovesP3[0] = "None";
					selectedOpponentMovesP3[1] = "None";
					selectedOpponentMovesP3[2] = "None";
					selectedOpponentMovesP3[3] = "None";
					opponentMovesP3 = new Move[]{new None(), new None(), new None(), new None()};
					listOpponentSelectedMovesP3.setListData(selectedOpponentMovesP3);
					listOpponentMovesP3.setListData(label);
					
					spinnerOpponentHPIVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getIvHp());
					spinnerOpponentAttackIVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getIvAttack());
					spinnerOpponentDefenseIVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getIvDefense());
					spinnerOpponentSpAttackIVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getIvSpAttack());
					spinnerOpponentSpDefenseIVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getIvSpDefense());
					spinnerOpponentSpeedIVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getIvSpeed());
					
					spinnerOpponentHPEVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getEvHp());
					spinnerOpponentAttackEVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getEvAttack());
					spinnerOpponentDefenseEVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getEvDefense());
					spinnerOpponentSpAttackEVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getEvSpAttack());
					spinnerOpponentSpDefenseEVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getEvSpDefense());
					spinnerOpponentSpeedEVP3.setValue(CurrentSimData.getOpponentPKMN()[2].getEvSpeed());
					
					spinnerOpponentLevelP3.setValue(CurrentSimData.getOpponentPKMN()[2].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		DefaultListSelectionModel mOpponentP3 = new DefaultListSelectionModel();
		mOpponentP3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mOpponentP3.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smOpponentP3 = new DefaultListSelectionModel();
		smOpponentP3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smOpponentP3.setLeadAnchorNotificationEnabled(false);
		panelOpponentP3.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		panelOpponentP3.add(scrollPaneOpponent3, "cell 0 0,grow");
		
		JScrollPane scrollPaneOpponentP3 = new JScrollPane();
		scrollPaneOpponentP3.setViewportView(listOpponentMovesP3);
		listOpponentMovesP3.setSelectionModel(mOpponentP3);
		listOpponentMovesP3.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JPanel panelOpponentIVP3 = new JPanel();
		panelOpponentIVP3.setOpaque(false);
		panelOpponentP3.add(panelOpponentIVP3, "cell 1 0,grow");
		panelOpponentIVP3.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblOpponentIVsP3 = new JLabel("IVs");
		panelOpponentIVP3.add(lblOpponentIVsP3, "cell 0 0");
		
		JLabel lblOpponentHPIVP3 = new JLabel("HP: ");
		panelOpponentIVP3.add(lblOpponentHPIVP3, "cell 0 1");
		
		spinnerOpponentHPIVP3 = new JSpinner();
		spinnerOpponentHPIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[2].setIvHp(Double.parseDouble(""+spinnerOpponentHPIVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[2].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[2].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[2].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel()));
				statLabelUpdaterOpponentP3();
			}
		});
		spinnerOpponentHPIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP3.add(spinnerOpponentHPIVP3, "cell 1 1");
		
		JLabel lblOpponentAttackIVP3 = new JLabel("Attack: ");
		panelOpponentIVP3.add(lblOpponentAttackIVP3, "cell 0 2");
		
		spinnerOpponentAttackIVP3 = new JSpinner();
		spinnerOpponentAttackIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[2].setIvAttack(Double.parseDouble(""+spinnerOpponentAttackIVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[2].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[2].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[2].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[2].getNature()));
						statLabelUpdaterOpponentP3();
			}
		});
		spinnerOpponentAttackIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP3.add(spinnerOpponentAttackIVP3, "cell 1 2");
		
		JLabel lblOpponentDefenseIVP3 = new JLabel("Defense: ");
		panelOpponentIVP3.add(lblOpponentDefenseIVP3, "cell 0 3");
		
		spinnerOpponentDefenseIVP3 = new JSpinner();
		spinnerOpponentDefenseIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[2].setIvDefense(Double.parseDouble(""+spinnerOpponentDefenseIVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[2].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[2].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[2].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[2].getNature()));
						statLabelUpdaterOpponentP3();
			}
		});
		spinnerOpponentDefenseIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP3.add(spinnerOpponentDefenseIVP3, "cell 1 3");
		
		JLabel lblOpponentSpAttackIVP3 = new JLabel("Special Attack: ");
		panelOpponentIVP3.add(lblOpponentSpAttackIVP3, "cell 0 4");
		
		spinnerOpponentSpAttackIVP3 = new JSpinner();
		spinnerOpponentSpAttackIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[2].setIvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackIVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setSpAttack(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[2].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[2].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[2].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[2].getNature()));
						statLabelUpdaterOpponentP3();
			}
		});
		spinnerOpponentSpAttackIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP3.add(spinnerOpponentSpAttackIVP3, "cell 1 4");
		
		JLabel lblOpponentSpDefenseIVP3 = new JLabel("Special Defense: ");
		panelOpponentIVP3.add(lblOpponentSpDefenseIVP3, "cell 0 5");
		
		spinnerOpponentSpDefenseIVP3 = new JSpinner();
		spinnerOpponentSpDefenseIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[2].setIvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseIVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setSpDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[2].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[2].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[2].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[2].getNature()));
						statLabelUpdaterOpponentP3();
			}
		});
		spinnerOpponentSpDefenseIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP3.add(spinnerOpponentSpDefenseIVP3, "cell 1 5");
		
		JLabel lblOpponentSpeedIVP3 = new JLabel("Speed: ");
		panelOpponentIVP3.add(lblOpponentSpeedIVP3, "cell 0 6");
		
		spinnerOpponentSpeedIVP3 = new JSpinner();
		spinnerOpponentSpeedIVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[2].setIvSpeed(Double.parseDouble(""+spinnerOpponentSpeedIVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setSpeed(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[2].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[2].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[2].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[2].getNature()));
						statLabelUpdaterOpponentP3();
			}
		});
		spinnerOpponentSpeedIVP3.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP3.add(spinnerOpponentSpeedIVP3, "cell 1 6");
		
		JPanel panelOpponentEVP3 = new JPanel();
		panelOpponentEVP3.setOpaque(false);
		panelOpponentP3.add(panelOpponentEVP3, "cell 2 0,grow");
		panelOpponentEVP3.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblOpponentEVsP3 = new JLabel("EVs");
		panelOpponentEVP3.add(lblOpponentEVsP3, "cell 0 0");
		
		JLabel lblOpponentEVMaxP3 = new JLabel("Available: ");
		panelOpponentEVP3.add(lblOpponentEVMaxP3, "cell 1 0");
		
		lblOpponentEVsAvailableP3 = new JLabel("510");
		panelOpponentEVP3.add(lblOpponentEVsAvailableP3, "cell 2 0");
		
		JLabel lblOpponentHPEVP3 = new JLabel("HP: ");
		panelOpponentEVP3.add(lblOpponentHPEVP3, "cell 0 1");
		
		spinnerOpponentHPEVP3 = new JSpinner();
		spinnerOpponentHPEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP3 < 0)
				{
					spinnerOpponentHPEVP3.setValue((int)spinnerOpponentHPEVP3.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[2].setEvHp(Double.parseDouble(""+spinnerOpponentHPEVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[2].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[2].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[2].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel()));
						statLabelUpdaterOpponentP3();
						opponentEVCheckP3();
			}
		});
		spinnerOpponentHPEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP3.add(spinnerOpponentHPEVP3, "cell 1 1");
		
		JLabel lblOpponentAttackEVP3 = new JLabel("Attack: ");
		panelOpponentEVP3.add(lblOpponentAttackEVP3, "cell 0 2");
		
		spinnerOpponentAttackEVP3 = new JSpinner();
		spinnerOpponentAttackEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP3 < 0)
				{
					spinnerOpponentAttackEVP3.setValue((int)spinnerOpponentAttackEVP3.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[2].setEvAttack(Double.parseDouble(""+spinnerOpponentAttackEVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[2].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[2].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[2].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[2].getNature()));
						statLabelUpdaterOpponentP3();
						opponentEVCheckP3();
			}
		});
		spinnerOpponentAttackEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP3.add(spinnerOpponentAttackEVP3, "cell 1 2");
		
		JLabel lblOpponentDefenseEVP3 = new JLabel("Defense: ");
		panelOpponentEVP3.add(lblOpponentDefenseEVP3, "cell 0 3");
		
		spinnerOpponentDefenseEVP3 = new JSpinner();
		spinnerOpponentDefenseEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP3 < 0)
				{
					spinnerOpponentDefenseEVP3.setValue((int)spinnerOpponentDefenseEVP3.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[2].setEvDefense(Double.parseDouble(""+spinnerOpponentDefenseEVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[2].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[2].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[2].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[2].getNature()));
						statLabelUpdaterOpponentP3();
						opponentEVCheckP3();
			}
		});
		spinnerOpponentDefenseEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP3.add(spinnerOpponentDefenseEVP3, "cell 1 3");
		
		JLabel lblOpponentSpAttackEVP3 = new JLabel("Special Attack: ");
		panelOpponentEVP3.add(lblOpponentSpAttackEVP3, "cell 0 4");
		
		spinnerOpponentSpAttackEVP3 = new JSpinner();
		spinnerOpponentSpAttackEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP3 < 0)
				{
					spinnerOpponentSpAttackEVP3.setValue((int)spinnerOpponentSpAttackEVP3.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[2].setEvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackEVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setSpAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[2].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[2].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[2].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[2].getNature()));
						statLabelUpdaterOpponentP3();
						opponentEVCheckP3();
			}
		});
		spinnerOpponentSpAttackEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP3.add(spinnerOpponentSpAttackEVP3, "cell 1 4");
		
		JLabel lblOpponentSpDefenseEVP3 = new JLabel("Special Defense: ");
		panelOpponentEVP3.add(lblOpponentSpDefenseEVP3, "cell 0 5");
		
		spinnerOpponentSpDefenseEVP3 = new JSpinner();
		spinnerOpponentSpDefenseEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP3 < 0)
				{
					spinnerOpponentSpDefenseEVP3.setValue((int)spinnerOpponentSpDefenseEVP3.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[2].setEvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseEVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setSpDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[2].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[2].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[2].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[2].getNature()));
						statLabelUpdaterOpponentP3();
						opponentEVCheckP3();
			}
		});
		spinnerOpponentSpDefenseEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP3.add(spinnerOpponentSpDefenseEVP3, "cell 1 5");
		
		JLabel lblOpponentSpeedEVP3 = new JLabel("Speed: ");
		panelOpponentEVP3.add(lblOpponentSpeedEVP3, "cell 0 7");
		
		spinnerOpponentSpeedEVP3 = new JSpinner();
		spinnerOpponentSpeedEVP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP3 < 0)
				{
					spinnerOpponentSpeedEVP3.setValue((int)spinnerOpponentSpeedEVP3.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[2].setEvSpeed(Double.parseDouble(""+spinnerOpponentSpeedEVP3.getValue()));
				CurrentSimData.getOpponentPKMN()[2].setSpeed(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[2].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[2].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[2].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[2].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[2].getNature()));
						statLabelUpdaterOpponentP3();
						opponentEVCheckP3();
			}
		});
		spinnerOpponentSpeedEVP3.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP3.add(spinnerOpponentSpeedEVP3, "cell 1 7");
		
		JPanel panelOpponentStatsP3 = new JPanel();
		panelOpponentStatsP3.setOpaque(false);
		panelOpponentP3.add(panelOpponentStatsP3, "cell 3 0,grow");
		panelOpponentStatsP3.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblOpponentLevelP3 = new JLabel("Level: ");
		panelOpponentStatsP3.add(lblOpponentLevelP3, "cell 0 0");
		
		spinnerOpponentLevelP3 = new JSpinner();
		spinnerOpponentLevelP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[2].setLevel(Double.parseDouble(""+spinnerOpponentLevelP3.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[2]);
				statLabelUpdaterOpponentP3();
			}
		});
		spinnerOpponentLevelP3.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelOpponentStatsP3.add(spinnerOpponentLevelP3, "cell 1 0");
		
		lblOpponentHPP3 = new JLabel("HP: ");
		panelOpponentStatsP3.add(lblOpponentHPP3, "cell 0 1");
		
		lblOpponentHPCalcP3 = new JLabel("0");
		panelOpponentStatsP3.add(lblOpponentHPCalcP3, "cell 1 1");
		
		lblOpponentAttackP3 = new JLabel("Attack: ");
		panelOpponentStatsP3.add(lblOpponentAttackP3, "cell 0 2");
		
		lblOpponentAttackCalcP3 = new JLabel("0");
		panelOpponentStatsP3.add(lblOpponentAttackCalcP3, "cell 1 2");
		
		lblOpponentDefenseP3 = new JLabel("Defense: ");
		panelOpponentStatsP3.add(lblOpponentDefenseP3, "cell 0 3");
		
		lblOpponentDefenseCalcP3 = new JLabel("0");
		panelOpponentStatsP3.add(lblOpponentDefenseCalcP3, "cell 1 3");
		
		lblOpponentSpAttackP3 = new JLabel("Special Attack: ");
		panelOpponentStatsP3.add(lblOpponentSpAttackP3, "cell 0 4");
		
		lblOpponentSpAttackCalcP3 = new JLabel("0");
		panelOpponentStatsP3.add(lblOpponentSpAttackCalcP3, "cell 1 4");
		
		lblOpponentSpDefenseP3 = new JLabel("Special Defense: ");
		panelOpponentStatsP3.add(lblOpponentSpDefenseP3, "cell 0 5");
		
		lblOpponentSpDefenseCalcP3 = new JLabel("0");
		panelOpponentStatsP3.add(lblOpponentSpDefenseCalcP3, "cell 1 5");
		
		lblOpponentSpeedP3 = new JLabel("Speed: ");
		panelOpponentStatsP3.add(lblOpponentSpeedP3, "cell 0 6");
		
		lblOpponentSpeedCalcP3 = new JLabel("0");
		panelOpponentStatsP3.add(lblOpponentSpeedCalcP3, "cell 1 6");
		
		JLabel lblOpponentNatureP3 = new JLabel("Nature: ");
		panelOpponentStatsP3.add(lblOpponentNatureP3, "cell 0 7");
		
		spinnerOpponentNatureP3 = new JSpinner();
		spinnerOpponentNatureP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerOpponentNatureP3.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getOpponentPKMN()[2].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[2]);
				statLabelUpdaterOpponentP3();
				opponentStatColors();
			}

			private void opponentStatColors() {
				lblOpponentAttackP3.setForeground(Color.BLACK);
				lblOpponentDefenseP3.setForeground(Color.BLACK);
				lblOpponentSpAttackP3.setForeground(Color.BLACK);
				lblOpponentSpDefenseP3.setForeground(Color.BLACK);
				lblOpponentSpeedP3.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getOpponentPKMN()[2].getNature()][2] == StatCalc.natures[CurrentSimData.getOpponentPKMN()[2].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[2].getNature()][2])
					{
					case StatCalc.ATTACK: lblOpponentAttackP3.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP3.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP3.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP3.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP3.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[2].getNature()][1])
					{
					case StatCalc.ATTACK: lblOpponentAttackP3.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP3.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP3.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP3.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP3.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerOpponentNatureP3.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelOpponentStatsP3.add(spinnerOpponentNatureP3, "cell 1 7 2 1,growx");
		
		JPanel panelOpponentExtraP3 = new JPanel();
		panelOpponentExtraP3.setOpaque(false);
		panelOpponentP3.add(panelOpponentExtraP3, "cell 4 0,grow");
		panelOpponentExtraP3.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblOpponentGenderP3 = new JLabel("Gender: ");
		panelOpponentExtraP3.add(lblOpponentGenderP3, "cell 0 0,aligny top");
		
		rdbtnOpponentMaleP3 = new JRadioButton("Male");
		opponentGenderGroupP3.add(rdbtnOpponentMaleP3);
		panelOpponentExtraP3.add(rdbtnOpponentMaleP3, "flowy,cell 1 0");
		
		rdbtnOpponentFemaleP3 = new JRadioButton("Female");
		opponentGenderGroupP3.add(rdbtnOpponentFemaleP3);
		panelOpponentExtraP3.add(rdbtnOpponentFemaleP3, "cell 1 0");
		
		rdbtnOpponentGenderlessP3 = new JRadioButton("Genderless");
		opponentGenderGroupP3.add(rdbtnOpponentGenderlessP3);
		panelOpponentExtraP3.add(rdbtnOpponentGenderlessP3, "cell 1 0");
		rdbtnOpponentMaleP3.setSelected(true);
		panelOpponentP3.add(scrollPaneOpponentP3, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_OpponentP3 = new JPanel();
		panel_3_OpponentP3.setOpaque(false);
		panel_3_OpponentP3.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddOpponentP3 = new JButton(">>");
		buttonAddOpponentP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentMovesP3.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedOpponentMovesP3.length)
					{
						if(selectedOpponentMovesP3[i] == "None")
						{
							selectedOpponentMovesP3[i] = (String) listOpponentMovesP3.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedOpponentMovesP3[i] == Names.fullMoveNames[w])
								{
									try {
										opponentMovesP3[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listOpponentSelectedMovesP3.setListData(selectedOpponentMovesP3);
				}
			}
		});
		panel_3_OpponentP3.add(buttonAddOpponentP3);
		
		JButton buttonRemoveOpponentP3 = new JButton("<<");
		buttonRemoveOpponentP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentSelectedMovesP3.getSelectedValue()!= null)
				{
					opponentMovesP3[listOpponentSelectedMovesP3.getSelectedIndex()] = new None();
					selectedOpponentMovesP3[listOpponentSelectedMovesP3.getSelectedIndices()[2]] = "None";
					listOpponentSelectedMovesP3.setListData(selectedOpponentMovesP3);
				}
			}
		});
		
		JPanel panelOpponentMovePreviewP3 = new JPanel();
		panelOpponentMovePreviewP3.setOpaque(false);
		panelOpponentP3.add(panelOpponentMovePreviewP3, "cell 1 1,grow");
		panelOpponentMovePreviewP3.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblOpponentMoveTypeP3 = new JLabel("Move Type: ");
		panelOpponentMovePreviewP3.add(lblOpponentMoveTypeP3, "cell 0 0,alignx left,aligny top");
		
		lblOpponentMoveTypeIconP3 = new JLabel();
		panelOpponentMovePreviewP3.add(lblOpponentMoveTypeIconP3, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryP3 = new JLabel("Category: ");
		panelOpponentMovePreviewP3.add(lblOpponentMoveCategoryP3, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryCalcP3 = new JLabel("");
		panelOpponentMovePreviewP3.add(lblOpponentMoveCategoryCalcP3, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblOpponentMovePowerP3 = new JLabel("Power: ");
		panelOpponentMovePreviewP3.add(lblOpponentMovePowerP3, "cell 0 2");
		
		JLabel lblOpponentMovePowerCalcP3 = new JLabel("");
		panelOpponentMovePreviewP3.add(lblOpponentMovePowerCalcP3, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyP3 = new JLabel("Accuracy: ");
		panelOpponentMovePreviewP3.add(lblOpponentMoveAccuracyP3, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyCalcP3 = new JLabel("");
		panelOpponentMovePreviewP3.add(lblOpponentMoveAccuracyCalcP3, "cell 1 3");
		panelOpponentP3.add(panel_3_OpponentP3, "cell 2 1,grow");
		
		panel_3_OpponentP3.add(buttonRemoveOpponentP3);
		
		
		listOpponentSelectedMovesP3.setSelectionModel(smOpponentP3);
		panelOpponentP3.add(listOpponentSelectedMovesP3, "cell 3 1,grow");
		
		JPanel panelOpponentMoveDetailsP3 = new JPanel();
		panelOpponentMoveDetailsP3.setOpaque(false);
		panelOpponentP3.add(panelOpponentMoveDetailsP3, "cell 4 1,grow");
		panelOpponentMoveDetailsP3.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblOpponentMoveTypeDetailsP3 = new JLabel("Move Type: ");
		panelOpponentMoveDetailsP3.add(lblOpponentMoveTypeDetailsP3, "cell 0 0,alignx left");
		
		JLabel lblOpponentMoveTypeIconDisplayP3 = new JLabel("");
		panelOpponentMoveDetailsP3.add(lblOpponentMoveTypeIconDisplayP3, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryDetailsP3 = new JLabel("Category: ");
		panelOpponentMoveDetailsP3.add(lblOpponentMoveCategoryDetailsP3, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryDisplayP3 = new JLabel("");
		panelOpponentMoveDetailsP3.add(lblOpponentMoveCategoryDisplayP3, "cell 1 1");
		
		JLabel lblOpponentMovePowerDetailsP3 = new JLabel("Power: ");
		panelOpponentMoveDetailsP3.add(lblOpponentMovePowerDetailsP3, "cell 0 2");
		
		JLabel lblOpponentMovePowerDisplayP3 = new JLabel("");
		panelOpponentMoveDetailsP3.add(lblOpponentMovePowerDisplayP3, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyDetailsP3 = new JLabel("Accuracy: ");
		panelOpponentMoveDetailsP3.add(lblOpponentMoveAccuracyDetailsP3, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyDisplayP3 = new JLabel("");
		panelOpponentMoveDetailsP3.add(lblOpponentMoveAccuracyDisplayP3, "cell 1 3");
		
		JLabel lblOpponentMaxPPP3 = new JLabel("Max PP: ");
		panelOpponentMoveDetailsP3.add(lblOpponentMaxPPP3, "cell 0 4");
		
		JLabel lblOpponentMaxPPCalcP3 = new JLabel("0");
		panelOpponentMoveDetailsP3.add(lblOpponentMaxPPCalcP3, "cell 1 4");
		
		JLabel lblOpponentCurrentPPP3 = new JLabel("Current PP: ");
		panelOpponentMoveDetailsP3.add(lblOpponentCurrentPPP3, "cell 0 5");
		
		JSpinner spinnerOpponentCurrentPPP3 = new JSpinner();
		spinnerOpponentCurrentPPP3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				opponentMovesP3[listOpponentSelectedMovesP3.getSelectedIndex()].setPp((int) spinnerOpponentCurrentPPP3.getValue());
				opponentMovesP3[listOpponentSelectedMovesP3.getSelectedIndex()].setCurrentPP((int) spinnerOpponentCurrentPPP3.getValue());
			}
		});
		panelOpponentMoveDetailsP3.add(spinnerOpponentCurrentPPP3, "cell 1 5");
		
		
		
		listOpponentMovesP3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listOpponentMovesP3.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lblOpponentMoveTypeIconP3.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblOpponentMoveCategoryCalcP3.setText(catText);
						lblOpponentMovePowerCalcP3.setText(selected.getPower()+"");
						lblOpponentMoveAccuracyCalcP3.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listOpponentSelectedMovesP3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listOpponentSelectedMovesP3.getSelectedIndex();
				
				lblOpponentMaxPPCalcP3.setText(opponentMovesP3[i].getMaxPP() + "");
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+opponentMovesP3[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblOpponentMoveTypeIconDisplayP3.setIcon(new ImageIcon(image));
				String catTextDisplay = "None";
				switch (opponentMovesP3[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblOpponentMoveCategoryDisplayP3.setText(catTextDisplay);
				lblOpponentMovePowerDisplayP3.setText(opponentMovesP3[i].getPower()+"");
				lblOpponentMoveAccuracyDisplayP3.setText(opponentMovesP3[i].getAccuracy()+"");
				spinnerOpponentCurrentPPP3.setModel(new SpinnerNumberModel(0, 0, opponentMovesP3[i].getMaxPP(), 1));
				spinnerOpponentCurrentPPP3.setValue(opponentMovesP3[i].getPp());
				repaint();
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		panelOpponentP4 = new JPanel();
		panelOpponentP4.setBackground(new Color(240,240,240,123));
		contentPane.add(panelOpponentP4);
		panelOpponentP4.setVisible(false);
		selectedOpponentMovesP4 = new String[] {"None", "None", "None", "None"};
		JScrollPane scrollPaneOpponent4 = new JScrollPane();
		panelOpponentP4.add(scrollPaneOpponent4, "cell 0 0,grow");
		listOpponentPokemonP4 = new JList(Names.pokemonNames);
		scrollPaneOpponent4.setViewportView(listOpponentPokemonP4);
		listOpponentPokemonP4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListSelectionModel pOpponentP4 = new DefaultListSelectionModel();
		pOpponentP4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pOpponentP4.setLeadAnchorNotificationEnabled(false);
		listOpponentPokemonP4.setSelectionModel(pOpponentP4);
		listOpponentPokemonP4.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getOpponentPKMN()[3] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listOpponentPokemonP4.getSelectedIndex()]).newInstance();
					if(pOpponentP4.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getOpponentPKMN()[3].getValidMoves().length];
					while(i < CurrentSimData.getOpponentPKMN()[3].getValidMoves().length)
					{
						
						int t = CurrentSimData.getOpponentPKMN()[3].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedOpponentMovesP4[0] = "None";
					selectedOpponentMovesP4[1] = "None";
					selectedOpponentMovesP4[2] = "None";
					selectedOpponentMovesP4[3] = "None";
					opponentMovesP4 = new Move[]{new None(), new None(), new None(), new None()};
					listOpponentSelectedMovesP4.setListData(selectedOpponentMovesP4);
					listOpponentMovesP4.setListData(label);
					
					spinnerOpponentHPIVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getIvHp());
					spinnerOpponentAttackIVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getIvAttack());
					spinnerOpponentDefenseIVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getIvDefense());
					spinnerOpponentSpAttackIVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getIvSpAttack());
					spinnerOpponentSpDefenseIVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getIvSpDefense());
					spinnerOpponentSpeedIVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getIvSpeed());
					
					spinnerOpponentHPEVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getEvHp());
					spinnerOpponentAttackEVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getEvAttack());
					spinnerOpponentDefenseEVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getEvDefense());
					spinnerOpponentSpAttackEVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getEvSpAttack());
					spinnerOpponentSpDefenseEVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getEvSpDefense());
					spinnerOpponentSpeedEVP4.setValue(CurrentSimData.getOpponentPKMN()[3].getEvSpeed());
					
					spinnerOpponentLevelP4.setValue(CurrentSimData.getOpponentPKMN()[3].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		DefaultListSelectionModel mOpponentP4 = new DefaultListSelectionModel();
		mOpponentP4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mOpponentP4.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smOpponentP4 = new DefaultListSelectionModel();
		smOpponentP4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smOpponentP4.setLeadAnchorNotificationEnabled(false);
		panelOpponentP4.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		panelOpponentP4.add(scrollPaneOpponent4, "cell 0 0,grow");
		
		JScrollPane scrollPaneOpponentP4 = new JScrollPane();
		scrollPaneOpponentP4.setViewportView(listOpponentMovesP4);
		listOpponentMovesP4.setSelectionModel(mOpponentP4);
		listOpponentMovesP4.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JPanel panelOpponentIVP4 = new JPanel();
		panelOpponentIVP4.setOpaque(false);
		panelOpponentP4.add(panelOpponentIVP4, "cell 1 0,grow");
		panelOpponentIVP4.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblOpponentIVsP4 = new JLabel("IVs");
		panelOpponentIVP4.add(lblOpponentIVsP4, "cell 0 0");
		
		JLabel lblOpponentHPIVP4 = new JLabel("HP: ");
		panelOpponentIVP4.add(lblOpponentHPIVP4, "cell 0 1");
		
		spinnerOpponentHPIVP4 = new JSpinner();
		spinnerOpponentHPIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[3].setIvHp(Double.parseDouble(""+spinnerOpponentHPIVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[3].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[3].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[3].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel()));
				statLabelUpdaterOpponentP4();
			}
		});
		spinnerOpponentHPIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP4.add(spinnerOpponentHPIVP4, "cell 1 1");
		
		JLabel lblOpponentAttackIVP4 = new JLabel("Attack: ");
		panelOpponentIVP4.add(lblOpponentAttackIVP4, "cell 0 2");
		
		spinnerOpponentAttackIVP4 = new JSpinner();
		spinnerOpponentAttackIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[3].setIvAttack(Double.parseDouble(""+spinnerOpponentAttackIVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[3].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[3].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[3].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[3].getNature()));
						statLabelUpdaterOpponentP4();
			}
		});
		spinnerOpponentAttackIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP4.add(spinnerOpponentAttackIVP4, "cell 1 2");
		
		JLabel lblOpponentDefenseIVP4 = new JLabel("Defense: ");
		panelOpponentIVP4.add(lblOpponentDefenseIVP4, "cell 0 3");
		
		spinnerOpponentDefenseIVP4 = new JSpinner();
		spinnerOpponentDefenseIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[3].setIvDefense(Double.parseDouble(""+spinnerOpponentDefenseIVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[3].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[3].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[3].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[3].getNature()));
						statLabelUpdaterOpponentP4();
			}
		});
		spinnerOpponentDefenseIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP4.add(spinnerOpponentDefenseIVP4, "cell 1 3");
		
		JLabel lblOpponentSpAttackIVP4 = new JLabel("Special Attack: ");
		panelOpponentIVP4.add(lblOpponentSpAttackIVP4, "cell 0 4");
		
		spinnerOpponentSpAttackIVP4 = new JSpinner();
		spinnerOpponentSpAttackIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[3].setIvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackIVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setSpAttack(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[3].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[3].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[3].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[3].getNature()));
						statLabelUpdaterOpponentP4();
			}
		});
		spinnerOpponentSpAttackIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP4.add(spinnerOpponentSpAttackIVP4, "cell 1 4");
		
		JLabel lblOpponentSpDefenseIVP4 = new JLabel("Special Defense: ");
		panelOpponentIVP4.add(lblOpponentSpDefenseIVP4, "cell 0 5");
		
		spinnerOpponentSpDefenseIVP4 = new JSpinner();
		spinnerOpponentSpDefenseIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[3].setIvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseIVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setSpDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[3].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[3].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[3].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[3].getNature()));
						statLabelUpdaterOpponentP4();
			}
		});
		spinnerOpponentSpDefenseIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP4.add(spinnerOpponentSpDefenseIVP4, "cell 1 5");
		
		JLabel lblOpponentSpeedIVP4 = new JLabel("Speed: ");
		panelOpponentIVP4.add(lblOpponentSpeedIVP4, "cell 0 6");
		
		spinnerOpponentSpeedIVP4 = new JSpinner();
		spinnerOpponentSpeedIVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[3].setIvSpeed(Double.parseDouble(""+spinnerOpponentSpeedIVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setSpeed(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[3].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[3].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[3].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[3].getNature()));
						statLabelUpdaterOpponentP4();
			}
		});
		spinnerOpponentSpeedIVP4.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP4.add(spinnerOpponentSpeedIVP4, "cell 1 6");
		
		JPanel panelOpponentEVP4 = new JPanel();
		panelOpponentEVP4.setOpaque(false);
		panelOpponentP4.add(panelOpponentEVP4, "cell 2 0,grow");
		panelOpponentEVP4.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblOpponentEVsP4 = new JLabel("EVs");
		panelOpponentEVP4.add(lblOpponentEVsP4, "cell 0 0");
		
		JLabel lblOpponentEVMaxP4 = new JLabel("Available: ");
		panelOpponentEVP4.add(lblOpponentEVMaxP4, "cell 1 0");
		
		lblOpponentEVsAvailableP4 = new JLabel("510");
		panelOpponentEVP4.add(lblOpponentEVsAvailableP4, "cell 2 0");
		
		JLabel lblOpponentHPEVP4 = new JLabel("HP: ");
		panelOpponentEVP4.add(lblOpponentHPEVP4, "cell 0 1");
		
		spinnerOpponentHPEVP4 = new JSpinner();
		spinnerOpponentHPEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP4 < 0)
				{
					spinnerOpponentHPEVP4.setValue((int)spinnerOpponentHPEVP4.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[3].setEvHp(Double.parseDouble(""+spinnerOpponentHPEVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[3].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[3].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[3].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel()));
						statLabelUpdaterOpponentP4();
						opponentEVCheckP4();
			}
		});
		spinnerOpponentHPEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP4.add(spinnerOpponentHPEVP4, "cell 1 1");
		
		JLabel lblOpponentAttackEVP4 = new JLabel("Attack: ");
		panelOpponentEVP4.add(lblOpponentAttackEVP4, "cell 0 2");
		
		spinnerOpponentAttackEVP4 = new JSpinner();
		spinnerOpponentAttackEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP4 < 0)
				{
					spinnerOpponentAttackEVP4.setValue((int)spinnerOpponentAttackEVP4.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[3].setEvAttack(Double.parseDouble(""+spinnerOpponentAttackEVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[3].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[3].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[3].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[3].getNature()));
						statLabelUpdaterOpponentP4();
						opponentEVCheckP4();
			}
		});
		spinnerOpponentAttackEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP4.add(spinnerOpponentAttackEVP4, "cell 1 2");
		
		JLabel lblOpponentDefenseEVP4 = new JLabel("Defense: ");
		panelOpponentEVP4.add(lblOpponentDefenseEVP4, "cell 0 3");
		
		spinnerOpponentDefenseEVP4 = new JSpinner();
		spinnerOpponentDefenseEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP4 < 0)
				{
					spinnerOpponentDefenseEVP4.setValue((int)spinnerOpponentDefenseEVP4.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[3].setEvDefense(Double.parseDouble(""+spinnerOpponentDefenseEVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[3].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[3].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[3].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[3].getNature()));
						statLabelUpdaterOpponentP4();
						opponentEVCheckP4();
			}
		});
		spinnerOpponentDefenseEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP4.add(spinnerOpponentDefenseEVP4, "cell 1 3");
		
		JLabel lblOpponentSpAttackEVP4 = new JLabel("Special Attack: ");
		panelOpponentEVP4.add(lblOpponentSpAttackEVP4, "cell 0 4");
		
		spinnerOpponentSpAttackEVP4 = new JSpinner();
		spinnerOpponentSpAttackEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP4 < 0)
				{
					spinnerOpponentSpAttackEVP4.setValue((int)spinnerOpponentSpAttackEVP4.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[3].setEvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackEVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setSpAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[3].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[3].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[3].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[3].getNature()));
						statLabelUpdaterOpponentP4();
						opponentEVCheckP4();
			}
		});
		spinnerOpponentSpAttackEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP4.add(spinnerOpponentSpAttackEVP4, "cell 1 4");
		
		JLabel lblOpponentSpDefenseEVP4 = new JLabel("Special Defense: ");
		panelOpponentEVP4.add(lblOpponentSpDefenseEVP4, "cell 0 5");
		
		spinnerOpponentSpDefenseEVP4 = new JSpinner();
		spinnerOpponentSpDefenseEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP4 < 0)
				{
					spinnerOpponentSpDefenseEVP4.setValue((int)spinnerOpponentSpDefenseEVP4.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[3].setEvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseEVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setSpDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[3].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[3].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[3].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[3].getNature()));
						statLabelUpdaterOpponentP4();
						opponentEVCheckP4();
			}
		});
		spinnerOpponentSpDefenseEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP4.add(spinnerOpponentSpDefenseEVP4, "cell 1 5");
		
		JLabel lblOpponentSpeedEVP4 = new JLabel("Speed: ");
		panelOpponentEVP4.add(lblOpponentSpeedEVP4, "cell 0 7");
		
		spinnerOpponentSpeedEVP4 = new JSpinner();
		spinnerOpponentSpeedEVP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP4 < 0)
				{
					spinnerOpponentSpeedEVP4.setValue((int)spinnerOpponentSpeedEVP4.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[3].setEvSpeed(Double.parseDouble(""+spinnerOpponentSpeedEVP4.getValue()));
				CurrentSimData.getOpponentPKMN()[3].setSpeed(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[3].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[3].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[3].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[3].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[3].getNature()));
						statLabelUpdaterOpponentP4();
						opponentEVCheckP4();
			}
		});
		spinnerOpponentSpeedEVP4.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP4.add(spinnerOpponentSpeedEVP4, "cell 1 7");
		
		JPanel panelOpponentStatsP4 = new JPanel();
		panelOpponentStatsP4.setOpaque(false);
		panelOpponentP4.add(panelOpponentStatsP4, "cell 3 0,grow");
		panelOpponentStatsP4.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblOpponentLevelP4 = new JLabel("Level: ");
		panelOpponentStatsP4.add(lblOpponentLevelP4, "cell 0 0");
		
		spinnerOpponentLevelP4 = new JSpinner();
		spinnerOpponentLevelP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[3].setLevel(Double.parseDouble(""+spinnerOpponentLevelP4.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[3]);
				statLabelUpdaterOpponentP4();
			}
		});
		spinnerOpponentLevelP4.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelOpponentStatsP4.add(spinnerOpponentLevelP4, "cell 1 0");
		
		lblOpponentHPP4 = new JLabel("HP: ");
		panelOpponentStatsP4.add(lblOpponentHPP4, "cell 0 1");
		
		lblOpponentHPCalcP4 = new JLabel("0");
		panelOpponentStatsP4.add(lblOpponentHPCalcP4, "cell 1 1");
		
		lblOpponentAttackP4 = new JLabel("Attack: ");
		panelOpponentStatsP4.add(lblOpponentAttackP4, "cell 0 2");
		
		lblOpponentAttackCalcP4 = new JLabel("0");
		panelOpponentStatsP4.add(lblOpponentAttackCalcP4, "cell 1 2");
		
		lblOpponentDefenseP4 = new JLabel("Defense: ");
		panelOpponentStatsP4.add(lblOpponentDefenseP4, "cell 0 3");
		
		lblOpponentDefenseCalcP4 = new JLabel("0");
		panelOpponentStatsP4.add(lblOpponentDefenseCalcP4, "cell 1 3");
		
		lblOpponentSpAttackP4 = new JLabel("Special Attack: ");
		panelOpponentStatsP4.add(lblOpponentSpAttackP4, "cell 0 4");
		
		lblOpponentSpAttackCalcP4 = new JLabel("0");
		panelOpponentStatsP4.add(lblOpponentSpAttackCalcP4, "cell 1 4");
		
		lblOpponentSpDefenseP4 = new JLabel("Special Defense: ");
		panelOpponentStatsP4.add(lblOpponentSpDefenseP4, "cell 0 5");
		
		lblOpponentSpDefenseCalcP4 = new JLabel("0");
		panelOpponentStatsP4.add(lblOpponentSpDefenseCalcP4, "cell 1 5");
		
		lblOpponentSpeedP4 = new JLabel("Speed: ");
		panelOpponentStatsP4.add(lblOpponentSpeedP4, "cell 0 6");
		
		lblOpponentSpeedCalcP4 = new JLabel("0");
		panelOpponentStatsP4.add(lblOpponentSpeedCalcP4, "cell 1 6");
		
		JLabel lblOpponentNatureP4 = new JLabel("Nature: ");
		panelOpponentStatsP4.add(lblOpponentNatureP4, "cell 0 7");
		
		spinnerOpponentNatureP4 = new JSpinner();
		spinnerOpponentNatureP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerOpponentNatureP4.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getOpponentPKMN()[3].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[3]);
				statLabelUpdaterOpponentP4();
				opponentStatColors();
			}

			private void opponentStatColors() {
				lblOpponentAttackP4.setForeground(Color.BLACK);
				lblOpponentDefenseP4.setForeground(Color.BLACK);
				lblOpponentSpAttackP4.setForeground(Color.BLACK);
				lblOpponentSpDefenseP4.setForeground(Color.BLACK);
				lblOpponentSpeedP4.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getOpponentPKMN()[3].getNature()][3] == StatCalc.natures[CurrentSimData.getOpponentPKMN()[3].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[3].getNature()][3])
					{
					case StatCalc.ATTACK: lblOpponentAttackP4.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP4.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP4.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP4.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP4.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[3].getNature()][1])
					{
					case StatCalc.ATTACK: lblOpponentAttackP4.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP4.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP4.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP4.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP4.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerOpponentNatureP4.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelOpponentStatsP4.add(spinnerOpponentNatureP4, "cell 1 7 2 1,growx");
		
		JPanel panelOpponentExtraP4 = new JPanel();
		panelOpponentExtraP4.setOpaque(false);
		panelOpponentP4.add(panelOpponentExtraP4, "cell 4 0,grow");
		panelOpponentExtraP4.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblOpponentGenderP4 = new JLabel("Gender: ");
		panelOpponentExtraP4.add(lblOpponentGenderP4, "cell 0 0,aligny top");
		
		rdbtnOpponentMaleP4 = new JRadioButton("Male");
		opponentGenderGroupP4.add(rdbtnOpponentMaleP4);
		panelOpponentExtraP4.add(rdbtnOpponentMaleP4, "flowy,cell 1 0");
		
		rdbtnOpponentFemaleP4 = new JRadioButton("Female");
		opponentGenderGroupP4.add(rdbtnOpponentFemaleP4);
		panelOpponentExtraP4.add(rdbtnOpponentFemaleP4, "cell 1 0");
		
		rdbtnOpponentGenderlessP4 = new JRadioButton("Genderless");
		opponentGenderGroupP4.add(rdbtnOpponentGenderlessP4);
		panelOpponentExtraP4.add(rdbtnOpponentGenderlessP4, "cell 1 0");
		rdbtnOpponentMaleP4.setSelected(true);
		panelOpponentP4.add(scrollPaneOpponentP4, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_OpponentP4 = new JPanel();
		panel_3_OpponentP4.setOpaque(false);
		panel_3_OpponentP4.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddOpponentP4 = new JButton(">>");
		buttonAddOpponentP4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentMovesP4.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedOpponentMovesP4.length)
					{
						if(selectedOpponentMovesP4[i] == "None")
						{
							selectedOpponentMovesP4[i] = (String) listOpponentMovesP4.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedOpponentMovesP4[i] == Names.fullMoveNames[w])
								{
									try {
										opponentMovesP4[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listOpponentSelectedMovesP4.setListData(selectedOpponentMovesP4);
				}
			}
		});
		panel_3_OpponentP4.add(buttonAddOpponentP4);
		
		JButton buttonRemoveOpponentP4 = new JButton("<<");
		buttonRemoveOpponentP4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentSelectedMovesP4.getSelectedValue()!= null)
				{
					opponentMovesP4[listOpponentSelectedMovesP4.getSelectedIndex()] = new None();
					selectedOpponentMovesP4[listOpponentSelectedMovesP4.getSelectedIndices()[3]] = "None";
					listOpponentSelectedMovesP4.setListData(selectedOpponentMovesP4);
				}
			}
		});
		
		JPanel panelOpponentMovePreviewP4 = new JPanel();
		panelOpponentMovePreviewP4.setOpaque(false);
		panelOpponentP4.add(panelOpponentMovePreviewP4, "cell 1 1,grow");
		panelOpponentMovePreviewP4.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblOpponentMoveTypeP4 = new JLabel("Move Type: ");
		panelOpponentMovePreviewP4.add(lblOpponentMoveTypeP4, "cell 0 0,alignx left,aligny top");
		
		lblOpponentMoveTypeIconP4 = new JLabel();
		panelOpponentMovePreviewP4.add(lblOpponentMoveTypeIconP4, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryP4 = new JLabel("Category: ");
		panelOpponentMovePreviewP4.add(lblOpponentMoveCategoryP4, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryCalcP4 = new JLabel("");
		panelOpponentMovePreviewP4.add(lblOpponentMoveCategoryCalcP4, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblOpponentMovePowerP4 = new JLabel("Power: ");
		panelOpponentMovePreviewP4.add(lblOpponentMovePowerP4, "cell 0 2");
		
		JLabel lblOpponentMovePowerCalcP4 = new JLabel("");
		panelOpponentMovePreviewP4.add(lblOpponentMovePowerCalcP4, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyP4 = new JLabel("Accuracy: ");
		panelOpponentMovePreviewP4.add(lblOpponentMoveAccuracyP4, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyCalcP4 = new JLabel("");
		panelOpponentMovePreviewP4.add(lblOpponentMoveAccuracyCalcP4, "cell 1 3");
		panelOpponentP4.add(panel_3_OpponentP4, "cell 2 1,grow");
		
		panel_3_OpponentP4.add(buttonRemoveOpponentP4);
		
		
		listOpponentSelectedMovesP4.setSelectionModel(smOpponentP4);
		panelOpponentP4.add(listOpponentSelectedMovesP4, "cell 3 1,grow");
		
		JPanel panelOpponentMoveDetailsP4 = new JPanel();
		panelOpponentMoveDetailsP4.setOpaque(false);
		panelOpponentP4.add(panelOpponentMoveDetailsP4, "cell 4 1,grow");
		panelOpponentMoveDetailsP4.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblOpponentMoveTypeDetailsP4 = new JLabel("Move Type: ");
		panelOpponentMoveDetailsP4.add(lblOpponentMoveTypeDetailsP4, "cell 0 0,alignx left");
		
		JLabel lblOpponentMoveTypeIconDisplayP4 = new JLabel("");
		panelOpponentMoveDetailsP4.add(lblOpponentMoveTypeIconDisplayP4, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryDetailsP4 = new JLabel("Category: ");
		panelOpponentMoveDetailsP4.add(lblOpponentMoveCategoryDetailsP4, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryDisplayP4 = new JLabel("");
		panelOpponentMoveDetailsP4.add(lblOpponentMoveCategoryDisplayP4, "cell 1 1");
		
		JLabel lblOpponentMovePowerDetailsP4 = new JLabel("Power: ");
		panelOpponentMoveDetailsP4.add(lblOpponentMovePowerDetailsP4, "cell 0 2");
		
		JLabel lblOpponentMovePowerDisplayP4 = new JLabel("");
		panelOpponentMoveDetailsP4.add(lblOpponentMovePowerDisplayP4, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyDetailsP4 = new JLabel("Accuracy: ");
		panelOpponentMoveDetailsP4.add(lblOpponentMoveAccuracyDetailsP4, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyDisplayP4 = new JLabel("");
		panelOpponentMoveDetailsP4.add(lblOpponentMoveAccuracyDisplayP4, "cell 1 3");
		
		JLabel lblOpponentMaxPPP4 = new JLabel("Max PP: ");
		panelOpponentMoveDetailsP4.add(lblOpponentMaxPPP4, "cell 0 4");
		
		JLabel lblOpponentMaxPPCalcP4 = new JLabel("0");
		panelOpponentMoveDetailsP4.add(lblOpponentMaxPPCalcP4, "cell 1 4");
		
		JLabel lblOpponentCurrentPPP4 = new JLabel("Current PP: ");
		panelOpponentMoveDetailsP4.add(lblOpponentCurrentPPP4, "cell 0 5");
		
		JSpinner spinnerOpponentCurrentPPP4 = new JSpinner();
		spinnerOpponentCurrentPPP4.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				opponentMovesP4[listOpponentSelectedMovesP4.getSelectedIndex()].setPp((int) spinnerOpponentCurrentPPP4.getValue());
				opponentMovesP4[listOpponentSelectedMovesP4.getSelectedIndex()].setCurrentPP((int) spinnerOpponentCurrentPPP4.getValue());
			}
		});
		panelOpponentMoveDetailsP4.add(spinnerOpponentCurrentPPP4, "cell 1 5");
		
		
		
		listOpponentMovesP4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listOpponentMovesP4.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lblOpponentMoveTypeIconP4.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblOpponentMoveCategoryCalcP4.setText(catText);
						lblOpponentMovePowerCalcP4.setText(selected.getPower()+"");
						lblOpponentMoveAccuracyCalcP4.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listOpponentSelectedMovesP4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listOpponentSelectedMovesP4.getSelectedIndex();
				
				lblOpponentMaxPPCalcP4.setText(opponentMovesP4[i].getMaxPP() + "");
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+opponentMovesP4[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblOpponentMoveTypeIconDisplayP4.setIcon(new ImageIcon(image));
				String catTextDisplay = "None";
				switch (opponentMovesP4[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblOpponentMoveCategoryDisplayP4.setText(catTextDisplay);
				lblOpponentMovePowerDisplayP4.setText(opponentMovesP4[i].getPower()+"");
				lblOpponentMoveAccuracyDisplayP4.setText(opponentMovesP4[i].getAccuracy()+"");
				spinnerOpponentCurrentPPP4.setModel(new SpinnerNumberModel(0, 0, opponentMovesP4[i].getMaxPP(), 1));
				spinnerOpponentCurrentPPP4.setValue(opponentMovesP4[i].getPp());
				repaint();
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		panelOpponentP5 = new JPanel();
		panelOpponentP5.setBackground(new Color(240,240,240,123));
		contentPane.add(panelOpponentP5);
		panelOpponentP5.setVisible(false);
		selectedOpponentMovesP5 = new String[] {"None", "None", "None", "None"};
		JScrollPane scrollPaneOpponent5 = new JScrollPane();
		panelOpponentP5.add(scrollPaneOpponent5, "cell 0 0,grow");
		listOpponentPokemonP5 = new JList(Names.pokemonNames);
		scrollPaneOpponent5.setViewportView(listOpponentPokemonP5);
		listOpponentPokemonP5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListSelectionModel pOpponentP5 = new DefaultListSelectionModel();
		pOpponentP5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pOpponentP5.setLeadAnchorNotificationEnabled(false);
		listOpponentPokemonP5.setSelectionModel(pOpponentP5);
		listOpponentPokemonP5.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getOpponentPKMN()[4] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listOpponentPokemonP5.getSelectedIndex()]).newInstance();
					if(pOpponentP5.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getOpponentPKMN()[4].getValidMoves().length];
					while(i < CurrentSimData.getOpponentPKMN()[4].getValidMoves().length)
					{
						
						int t = CurrentSimData.getOpponentPKMN()[4].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedOpponentMovesP5[0] = "None";
					selectedOpponentMovesP5[1] = "None";
					selectedOpponentMovesP5[2] = "None";
					selectedOpponentMovesP5[3] = "None";
					opponentMovesP5 = new Move[]{new None(), new None(), new None(), new None()};
					listOpponentSelectedMovesP5.setListData(selectedOpponentMovesP5);
					listOpponentMovesP5.setListData(label);
					
					spinnerOpponentHPIVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getIvHp());
					spinnerOpponentAttackIVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getIvAttack());
					spinnerOpponentDefenseIVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getIvDefense());
					spinnerOpponentSpAttackIVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getIvSpAttack());
					spinnerOpponentSpDefenseIVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getIvSpDefense());
					spinnerOpponentSpeedIVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getIvSpeed());
					
					spinnerOpponentHPEVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getEvHp());
					spinnerOpponentAttackEVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getEvAttack());
					spinnerOpponentDefenseEVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getEvDefense());
					spinnerOpponentSpAttackEVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getEvSpAttack());
					spinnerOpponentSpDefenseEVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getEvSpDefense());
					spinnerOpponentSpeedEVP5.setValue(CurrentSimData.getOpponentPKMN()[4].getEvSpeed());
					
					spinnerOpponentLevelP5.setValue(CurrentSimData.getOpponentPKMN()[4].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		DefaultListSelectionModel mOpponentP5 = new DefaultListSelectionModel();
		mOpponentP5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mOpponentP5.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smOpponentP5 = new DefaultListSelectionModel();
		smOpponentP5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smOpponentP5.setLeadAnchorNotificationEnabled(false);
		panelOpponentP5.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		panelOpponentP5.add(scrollPaneOpponent5, "cell 0 0,grow");
		
		JScrollPane scrollPaneOpponentP5 = new JScrollPane();
		scrollPaneOpponentP5.setViewportView(listOpponentMovesP5);
		listOpponentMovesP5.setSelectionModel(mOpponentP5);
		listOpponentMovesP5.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JPanel panelOpponentIVP5 = new JPanel();
		panelOpponentIVP5.setOpaque(false);
		panelOpponentP5.add(panelOpponentIVP5, "cell 1 0,grow");
		panelOpponentIVP5.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblOpponentIVsP5 = new JLabel("IVs");
		panelOpponentIVP5.add(lblOpponentIVsP5, "cell 0 0");
		
		JLabel lblOpponentHPIVP5 = new JLabel("HP: ");
		panelOpponentIVP5.add(lblOpponentHPIVP5, "cell 0 1");
		
		spinnerOpponentHPIVP5 = new JSpinner();
		spinnerOpponentHPIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[4].setIvHp(Double.parseDouble(""+spinnerOpponentHPIVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[4].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[4].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[4].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel()));
				statLabelUpdaterOpponentP5();
			}
		});
		spinnerOpponentHPIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP5.add(spinnerOpponentHPIVP5, "cell 1 1");
		
		JLabel lblOpponentAttackIVP5 = new JLabel("Attack: ");
		panelOpponentIVP5.add(lblOpponentAttackIVP5, "cell 0 2");
		
		spinnerOpponentAttackIVP5 = new JSpinner();
		spinnerOpponentAttackIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[4].setIvAttack(Double.parseDouble(""+spinnerOpponentAttackIVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[4].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[4].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[4].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[4].getNature()));
						statLabelUpdaterOpponentP5();
			}
		});
		spinnerOpponentAttackIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP5.add(spinnerOpponentAttackIVP5, "cell 1 2");
		
		JLabel lblOpponentDefenseIVP5 = new JLabel("Defense: ");
		panelOpponentIVP5.add(lblOpponentDefenseIVP5, "cell 0 3");
		
		spinnerOpponentDefenseIVP5 = new JSpinner();
		spinnerOpponentDefenseIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[4].setIvDefense(Double.parseDouble(""+spinnerOpponentDefenseIVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[4].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[4].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[4].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[4].getNature()));
						statLabelUpdaterOpponentP5();
			}
		});
		spinnerOpponentDefenseIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP5.add(spinnerOpponentDefenseIVP5, "cell 1 3");
		
		JLabel lblOpponentSpAttackIVP5 = new JLabel("Special Attack: ");
		panelOpponentIVP5.add(lblOpponentSpAttackIVP5, "cell 0 4");
		
		spinnerOpponentSpAttackIVP5 = new JSpinner();
		spinnerOpponentSpAttackIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[4].setIvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackIVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setSpAttack(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[4].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[4].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[4].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[4].getNature()));
						statLabelUpdaterOpponentP5();
			}
		});
		spinnerOpponentSpAttackIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP5.add(spinnerOpponentSpAttackIVP5, "cell 1 4");
		
		JLabel lblOpponentSpDefenseIVP5 = new JLabel("Special Defense: ");
		panelOpponentIVP5.add(lblOpponentSpDefenseIVP5, "cell 0 5");
		
		spinnerOpponentSpDefenseIVP5 = new JSpinner();
		spinnerOpponentSpDefenseIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[4].setIvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseIVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setSpDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[4].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[4].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[4].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[4].getNature()));
						statLabelUpdaterOpponentP5();
			}
		});
		spinnerOpponentSpDefenseIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP5.add(spinnerOpponentSpDefenseIVP5, "cell 1 5");
		
		JLabel lblOpponentSpeedIVP5 = new JLabel("Speed: ");
		panelOpponentIVP5.add(lblOpponentSpeedIVP5, "cell 0 6");
		
		spinnerOpponentSpeedIVP5 = new JSpinner();
		spinnerOpponentSpeedIVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[4].setIvSpeed(Double.parseDouble(""+spinnerOpponentSpeedIVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setSpeed(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[4].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[4].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[4].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[4].getNature()));
						statLabelUpdaterOpponentP5();
			}
		});
		spinnerOpponentSpeedIVP5.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP5.add(spinnerOpponentSpeedIVP5, "cell 1 6");
		
		JPanel panelOpponentEVP5 = new JPanel();
		panelOpponentEVP5.setOpaque(false);
		panelOpponentP5.add(panelOpponentEVP5, "cell 2 0,grow");
		panelOpponentEVP5.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblOpponentEVsP5 = new JLabel("EVs");
		panelOpponentEVP5.add(lblOpponentEVsP5, "cell 0 0");
		
		JLabel lblOpponentEVMaxP5 = new JLabel("Available: ");
		panelOpponentEVP5.add(lblOpponentEVMaxP5, "cell 1 0");
		
		lblOpponentEVsAvailableP5 = new JLabel("510");
		panelOpponentEVP5.add(lblOpponentEVsAvailableP5, "cell 2 0");
		
		JLabel lblOpponentHPEVP5 = new JLabel("HP: ");
		panelOpponentEVP5.add(lblOpponentHPEVP5, "cell 0 1");
		
		spinnerOpponentHPEVP5 = new JSpinner();
		spinnerOpponentHPEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP5 < 0)
				{
					spinnerOpponentHPEVP5.setValue((int)spinnerOpponentHPEVP5.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[4].setEvHp(Double.parseDouble(""+spinnerOpponentHPEVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[4].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[4].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[4].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel()));
						statLabelUpdaterOpponentP5();
						opponentEVCheckP5();
			}
		});
		spinnerOpponentHPEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP5.add(spinnerOpponentHPEVP5, "cell 1 1");
		
		JLabel lblOpponentAttackEVP5 = new JLabel("Attack: ");
		panelOpponentEVP5.add(lblOpponentAttackEVP5, "cell 0 2");
		
		spinnerOpponentAttackEVP5 = new JSpinner();
		spinnerOpponentAttackEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP5 < 0)
				{
					spinnerOpponentAttackEVP5.setValue((int)spinnerOpponentAttackEVP5.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[4].setEvAttack(Double.parseDouble(""+spinnerOpponentAttackEVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[4].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[4].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[4].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[4].getNature()));
						statLabelUpdaterOpponentP5();
						opponentEVCheckP5();
			}
		});
		spinnerOpponentAttackEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP5.add(spinnerOpponentAttackEVP5, "cell 1 2");
		
		JLabel lblOpponentDefenseEVP5 = new JLabel("Defense: ");
		panelOpponentEVP5.add(lblOpponentDefenseEVP5, "cell 0 3");
		
		spinnerOpponentDefenseEVP5 = new JSpinner();
		spinnerOpponentDefenseEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP5 < 0)
				{
					spinnerOpponentDefenseEVP5.setValue((int)spinnerOpponentDefenseEVP5.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[4].setEvDefense(Double.parseDouble(""+spinnerOpponentDefenseEVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[4].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[4].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[4].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[4].getNature()));
						statLabelUpdaterOpponentP5();
						opponentEVCheckP5();
			}
		});
		spinnerOpponentDefenseEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP5.add(spinnerOpponentDefenseEVP5, "cell 1 3");
		
		JLabel lblOpponentSpAttackEVP5 = new JLabel("Special Attack: ");
		panelOpponentEVP5.add(lblOpponentSpAttackEVP5, "cell 0 4");
		
		spinnerOpponentSpAttackEVP5 = new JSpinner();
		spinnerOpponentSpAttackEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP5 < 0)
				{
					spinnerOpponentSpAttackEVP5.setValue((int)spinnerOpponentSpAttackEVP5.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[4].setEvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackEVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setSpAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[4].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[4].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[4].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[4].getNature()));
						statLabelUpdaterOpponentP5();
						opponentEVCheckP5();
			}
		});
		spinnerOpponentSpAttackEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP5.add(spinnerOpponentSpAttackEVP5, "cell 1 4");
		
		JLabel lblOpponentSpDefenseEVP5 = new JLabel("Special Defense: ");
		panelOpponentEVP5.add(lblOpponentSpDefenseEVP5, "cell 0 5");
		
		spinnerOpponentSpDefenseEVP5 = new JSpinner();
		spinnerOpponentSpDefenseEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP5 < 0)
				{
					spinnerOpponentSpDefenseEVP5.setValue((int)spinnerOpponentSpDefenseEVP5.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[4].setEvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseEVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setSpDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[4].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[4].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[4].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[4].getNature()));
						statLabelUpdaterOpponentP5();
						opponentEVCheckP5();
			}
		});
		spinnerOpponentSpDefenseEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP5.add(spinnerOpponentSpDefenseEVP5, "cell 1 5");
		
		JLabel lblOpponentSpeedEVP5 = new JLabel("Speed: ");
		panelOpponentEVP5.add(lblOpponentSpeedEVP5, "cell 0 7");
		
		spinnerOpponentSpeedEVP5 = new JSpinner();
		spinnerOpponentSpeedEVP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP5 < 0)
				{
					spinnerOpponentSpeedEVP5.setValue((int)spinnerOpponentSpeedEVP5.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[4].setEvSpeed(Double.parseDouble(""+spinnerOpponentSpeedEVP5.getValue()));
				CurrentSimData.getOpponentPKMN()[4].setSpeed(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[4].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[4].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[4].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[4].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[4].getNature()));
						statLabelUpdaterOpponentP5();
						opponentEVCheckP5();
			}
		});
		spinnerOpponentSpeedEVP5.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP5.add(spinnerOpponentSpeedEVP5, "cell 1 7");
		
		JPanel panelOpponentStatsP5 = new JPanel();
		panelOpponentStatsP5.setOpaque(false);
		panelOpponentP5.add(panelOpponentStatsP5, "cell 3 0,grow");
		panelOpponentStatsP5.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblOpponentLevelP5 = new JLabel("Level: ");
		panelOpponentStatsP5.add(lblOpponentLevelP5, "cell 0 0");
		
		spinnerOpponentLevelP5 = new JSpinner();
		spinnerOpponentLevelP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[4].setLevel(Double.parseDouble(""+spinnerOpponentLevelP5.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[4]);
				statLabelUpdaterOpponentP5();
			}
		});
		spinnerOpponentLevelP5.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelOpponentStatsP5.add(spinnerOpponentLevelP5, "cell 1 0");
		
		lblOpponentHPP5 = new JLabel("HP: ");
		panelOpponentStatsP5.add(lblOpponentHPP5, "cell 0 1");
		
		lblOpponentHPCalcP5 = new JLabel("0");
		panelOpponentStatsP5.add(lblOpponentHPCalcP5, "cell 1 1");
		
		lblOpponentAttackP5 = new JLabel("Attack: ");
		panelOpponentStatsP5.add(lblOpponentAttackP5, "cell 0 2");
		
		lblOpponentAttackCalcP5 = new JLabel("0");
		panelOpponentStatsP5.add(lblOpponentAttackCalcP5, "cell 1 2");
		
		lblOpponentDefenseP5 = new JLabel("Defense: ");
		panelOpponentStatsP5.add(lblOpponentDefenseP5, "cell 0 3");
		
		lblOpponentDefenseCalcP5 = new JLabel("0");
		panelOpponentStatsP5.add(lblOpponentDefenseCalcP5, "cell 1 3");
		
		lblOpponentSpAttackP5 = new JLabel("Special Attack: ");
		panelOpponentStatsP5.add(lblOpponentSpAttackP5, "cell 0 4");
		
		lblOpponentSpAttackCalcP5 = new JLabel("0");
		panelOpponentStatsP5.add(lblOpponentSpAttackCalcP5, "cell 1 4");
		
		lblOpponentSpDefenseP5 = new JLabel("Special Defense: ");
		panelOpponentStatsP5.add(lblOpponentSpDefenseP5, "cell 0 5");
		
		lblOpponentSpDefenseCalcP5 = new JLabel("0");
		panelOpponentStatsP5.add(lblOpponentSpDefenseCalcP5, "cell 1 5");
		
		lblOpponentSpeedP5 = new JLabel("Speed: ");
		panelOpponentStatsP5.add(lblOpponentSpeedP5, "cell 0 6");
		
		lblOpponentSpeedCalcP5 = new JLabel("0");
		panelOpponentStatsP5.add(lblOpponentSpeedCalcP5, "cell 1 6");
		
		JLabel lblOpponentNatureP5 = new JLabel("Nature: ");
		panelOpponentStatsP5.add(lblOpponentNatureP5, "cell 0 7");
		
		spinnerOpponentNatureP5 = new JSpinner();
		spinnerOpponentNatureP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerOpponentNatureP5.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getOpponentPKMN()[4].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[4]);
				statLabelUpdaterOpponentP5();
				opponentStatColors();
			}

			private void opponentStatColors() {
				lblOpponentAttackP5.setForeground(Color.BLACK);
				lblOpponentDefenseP5.setForeground(Color.BLACK);
				lblOpponentSpAttackP5.setForeground(Color.BLACK);
				lblOpponentSpDefenseP5.setForeground(Color.BLACK);
				lblOpponentSpeedP5.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getOpponentPKMN()[4].getNature()][4] == StatCalc.natures[CurrentSimData.getOpponentPKMN()[4].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[4].getNature()][4])
					{
					case StatCalc.ATTACK: lblOpponentAttackP5.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP5.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP5.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP5.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP5.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[4].getNature()][1])
					{
					case StatCalc.ATTACK: lblOpponentAttackP5.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP5.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP5.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP5.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP5.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerOpponentNatureP5.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelOpponentStatsP5.add(spinnerOpponentNatureP5, "cell 1 7 2 1,growx");
		
		JPanel panelOpponentExtraP5 = new JPanel();
		panelOpponentExtraP5.setOpaque(false);
		panelOpponentP5.add(panelOpponentExtraP5, "cell 4 0,grow");
		panelOpponentExtraP5.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblOpponentGenderP5 = new JLabel("Gender: ");
		panelOpponentExtraP5.add(lblOpponentGenderP5, "cell 0 0,aligny top");
		
		rdbtnOpponentMaleP5 = new JRadioButton("Male");
		opponentGenderGroupP5.add(rdbtnOpponentMaleP5);
		panelOpponentExtraP5.add(rdbtnOpponentMaleP5, "flowy,cell 1 0");
		
		rdbtnOpponentFemaleP5 = new JRadioButton("Female");
		opponentGenderGroupP5.add(rdbtnOpponentFemaleP5);
		panelOpponentExtraP5.add(rdbtnOpponentFemaleP5, "cell 1 0");
		
		rdbtnOpponentGenderlessP5 = new JRadioButton("Genderless");
		opponentGenderGroupP5.add(rdbtnOpponentGenderlessP5);
		panelOpponentExtraP5.add(rdbtnOpponentGenderlessP5, "cell 1 0");
		rdbtnOpponentMaleP5.setSelected(true);
		panelOpponentP5.add(scrollPaneOpponentP5, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_OpponentP5 = new JPanel();
		panel_3_OpponentP5.setOpaque(false);
		panel_3_OpponentP5.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddOpponentP5 = new JButton(">>");
		buttonAddOpponentP5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentMovesP5.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedOpponentMovesP5.length)
					{
						if(selectedOpponentMovesP5[i] == "None")
						{
							selectedOpponentMovesP5[i] = (String) listOpponentMovesP5.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedOpponentMovesP5[i] == Names.fullMoveNames[w])
								{
									try {
										opponentMovesP5[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listOpponentSelectedMovesP5.setListData(selectedOpponentMovesP5);
				}
			}
		});
		panel_3_OpponentP5.add(buttonAddOpponentP5);
		
		JButton buttonRemoveOpponentP5 = new JButton("<<");
		buttonRemoveOpponentP5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentSelectedMovesP5.getSelectedValue()!= null)
				{
					opponentMovesP5[listOpponentSelectedMovesP5.getSelectedIndex()] = new None();
					selectedOpponentMovesP5[listOpponentSelectedMovesP5.getSelectedIndices()[4]] = "None";
					listOpponentSelectedMovesP5.setListData(selectedOpponentMovesP5);
				}
			}
		});
		
		JPanel panelOpponentMovePreviewP5 = new JPanel();
		panelOpponentMovePreviewP5.setOpaque(false);
		panelOpponentP5.add(panelOpponentMovePreviewP5, "cell 1 1,grow");
		panelOpponentMovePreviewP5.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblOpponentMoveTypeP5 = new JLabel("Move Type: ");
		panelOpponentMovePreviewP5.add(lblOpponentMoveTypeP5, "cell 0 0,alignx left,aligny top");
		
		lblOpponentMoveTypeIconP5 = new JLabel();
		panelOpponentMovePreviewP5.add(lblOpponentMoveTypeIconP5, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryP5 = new JLabel("Category: ");
		panelOpponentMovePreviewP5.add(lblOpponentMoveCategoryP5, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryCalcP5 = new JLabel("");
		panelOpponentMovePreviewP5.add(lblOpponentMoveCategoryCalcP5, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblOpponentMovePowerP5 = new JLabel("Power: ");
		panelOpponentMovePreviewP5.add(lblOpponentMovePowerP5, "cell 0 2");
		
		JLabel lblOpponentMovePowerCalcP5 = new JLabel("");
		panelOpponentMovePreviewP5.add(lblOpponentMovePowerCalcP5, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyP5 = new JLabel("Accuracy: ");
		panelOpponentMovePreviewP5.add(lblOpponentMoveAccuracyP5, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyCalcP5 = new JLabel("");
		panelOpponentMovePreviewP5.add(lblOpponentMoveAccuracyCalcP5, "cell 1 3");
		panelOpponentP5.add(panel_3_OpponentP5, "cell 2 1,grow");
		
		panel_3_OpponentP5.add(buttonRemoveOpponentP5);
		
		
		listOpponentSelectedMovesP5.setSelectionModel(smOpponentP5);
		panelOpponentP5.add(listOpponentSelectedMovesP5, "cell 3 1,grow");
		
		JPanel panelOpponentMoveDetailsP5 = new JPanel();
		panelOpponentMoveDetailsP5.setOpaque(false);
		panelOpponentP5.add(panelOpponentMoveDetailsP5, "cell 4 1,grow");
		panelOpponentMoveDetailsP5.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblOpponentMoveTypeDetailsP5 = new JLabel("Move Type: ");
		panelOpponentMoveDetailsP5.add(lblOpponentMoveTypeDetailsP5, "cell 0 0,alignx left");
		
		JLabel lblOpponentMoveTypeIconDisplayP5 = new JLabel("");
		panelOpponentMoveDetailsP5.add(lblOpponentMoveTypeIconDisplayP5, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryDetailsP5 = new JLabel("Category: ");
		panelOpponentMoveDetailsP5.add(lblOpponentMoveCategoryDetailsP5, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryDisplayP5 = new JLabel("");
		panelOpponentMoveDetailsP5.add(lblOpponentMoveCategoryDisplayP5, "cell 1 1");
		
		JLabel lblOpponentMovePowerDetailsP5 = new JLabel("Power: ");
		panelOpponentMoveDetailsP5.add(lblOpponentMovePowerDetailsP5, "cell 0 2");
		
		JLabel lblOpponentMovePowerDisplayP5 = new JLabel("");
		panelOpponentMoveDetailsP5.add(lblOpponentMovePowerDisplayP5, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyDetailsP5 = new JLabel("Accuracy: ");
		panelOpponentMoveDetailsP5.add(lblOpponentMoveAccuracyDetailsP5, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyDisplayP5 = new JLabel("");
		panelOpponentMoveDetailsP5.add(lblOpponentMoveAccuracyDisplayP5, "cell 1 3");
		
		JLabel lblOpponentMaxPPP5 = new JLabel("Max PP: ");
		panelOpponentMoveDetailsP5.add(lblOpponentMaxPPP5, "cell 0 4");
		
		JLabel lblOpponentMaxPPCalcP5 = new JLabel("0");
		panelOpponentMoveDetailsP5.add(lblOpponentMaxPPCalcP5, "cell 1 4");
		
		JLabel lblOpponentCurrentPPP5 = new JLabel("Current PP: ");
		panelOpponentMoveDetailsP5.add(lblOpponentCurrentPPP5, "cell 0 5");
		
		JSpinner spinnerOpponentCurrentPPP5 = new JSpinner();
		spinnerOpponentCurrentPPP5.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				opponentMovesP5[listOpponentSelectedMovesP5.getSelectedIndex()].setPp((int) spinnerOpponentCurrentPPP5.getValue());
				opponentMovesP5[listOpponentSelectedMovesP5.getSelectedIndex()].setCurrentPP((int) spinnerOpponentCurrentPPP5.getValue());
			}
		});
		panelOpponentMoveDetailsP5.add(spinnerOpponentCurrentPPP5, "cell 1 5");
		
		
		
		listOpponentMovesP5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listOpponentMovesP5.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lblOpponentMoveTypeIconP5.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblOpponentMoveCategoryCalcP5.setText(catText);
						lblOpponentMovePowerCalcP5.setText(selected.getPower()+"");
						lblOpponentMoveAccuracyCalcP5.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listOpponentSelectedMovesP5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listOpponentSelectedMovesP5.getSelectedIndex();
				
				lblOpponentMaxPPCalcP5.setText(opponentMovesP5[i].getMaxPP() + "");
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+opponentMovesP5[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblOpponentMoveTypeIconDisplayP5.setIcon(new ImageIcon(image));				
				String catTextDisplay = "None";
				switch (opponentMovesP5[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblOpponentMoveCategoryDisplayP5.setText(catTextDisplay);
				lblOpponentMovePowerDisplayP5.setText(opponentMovesP5[i].getPower()+"");
				lblOpponentMoveAccuracyDisplayP5.setText(opponentMovesP5[i].getAccuracy()+"");
				spinnerOpponentCurrentPPP5.setModel(new SpinnerNumberModel(0, 0, opponentMovesP5[i].getMaxPP(), 1));
				spinnerOpponentCurrentPPP5.setValue(opponentMovesP5[i].getPp());
				repaint();
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		panelOpponentP6 = new JPanel();
		panelOpponentP6.setBackground(new Color(240,240,240,123));
		contentPane.add(panelOpponentP6);
		panelOpponentP6.setVisible(false);
		selectedOpponentMovesP6 = new String[] {"None", "None", "None", "None"};
		JScrollPane scrollPaneOpponent6 = new JScrollPane();
		panelOpponentP6.add(scrollPaneOpponent6, "cell 0 0,grow");
		listOpponentPokemonP6 = new JList(Names.pokemonNames);
		scrollPaneOpponent6.setViewportView(listOpponentPokemonP6);
		listOpponentPokemonP6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListSelectionModel pOpponentP6 = new DefaultListSelectionModel();
		pOpponentP6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pOpponentP6.setLeadAnchorNotificationEnabled(false);
		listOpponentPokemonP6.setSelectionModel(pOpponentP6);
		listOpponentPokemonP6.addListSelectionListener(new ListSelectionListener() {
			@SuppressWarnings({ "static-access" })
			public void valueChanged(ListSelectionEvent e) {
				try {
					CurrentSimData.getOpponentPKMN()[5] = (Pokemon) Class.forName("pokemondata." + Names.pokemonNames[listOpponentPokemonP6.getSelectedIndex()]).newInstance();
					if(pOpponentP6.getValueIsAdjusting()) return;
					int i = 0;
					String label[] = new String[CurrentSimData.getOpponentPKMN()[5].getValidMoves().length];
					while(i < CurrentSimData.getOpponentPKMN()[5].getValidMoves().length)
					{
						
						int t = CurrentSimData.getOpponentPKMN()[5].getValidMoves()[i];
						String l = Names.fullMoveNames[t];
						
						label[i] = l;
						i++;
					}
					selectedOpponentMovesP6[0] = "None";
					selectedOpponentMovesP6[1] = "None";
					selectedOpponentMovesP6[2] = "None";
					selectedOpponentMovesP6[3] = "None";
					opponentMovesP6 = new Move[]{new None(), new None(), new None(), new None()};
					listOpponentSelectedMovesP6.setListData(selectedOpponentMovesP6);
					listOpponentMovesP6.setListData(label);
					
					spinnerOpponentHPIVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getIvHp());
					spinnerOpponentAttackIVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getIvAttack());
					spinnerOpponentDefenseIVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getIvDefense());
					spinnerOpponentSpAttackIVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getIvSpAttack());
					spinnerOpponentSpDefenseIVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getIvSpDefense());
					spinnerOpponentSpeedIVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getIvSpeed());
					
					spinnerOpponentHPEVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getEvHp());
					spinnerOpponentAttackEVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getEvAttack());
					spinnerOpponentDefenseEVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getEvDefense());
					spinnerOpponentSpAttackEVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getEvSpAttack());
					spinnerOpponentSpDefenseEVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getEvSpDefense());
					spinnerOpponentSpeedEVP6.setValue(CurrentSimData.getOpponentPKMN()[5].getEvSpeed());
					
					spinnerOpponentLevelP6.setValue(CurrentSimData.getOpponentPKMN()[5].getLevel());

				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		DefaultListSelectionModel mOpponentP6 = new DefaultListSelectionModel();
		mOpponentP6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mOpponentP6.setLeadAnchorNotificationEnabled(false);
		
		DefaultListSelectionModel smOpponentP6 = new DefaultListSelectionModel();
		smOpponentP6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		smOpponentP6.setLeadAnchorNotificationEnabled(false);
		panelOpponentP6.setLayout(new MigLayout("", "[258px][258px,grow][258px,grow][258px,grow][grow]", "[130px,grow][grow][]"));
		panelOpponentP6.add(scrollPaneOpponent6, "cell 0 0,grow");
		
		JScrollPane scrollPaneOpponentP6 = new JScrollPane();
		scrollPaneOpponentP6.setViewportView(listOpponentMovesP6);
		listOpponentMovesP6.setSelectionModel(mOpponentP6);
		listOpponentMovesP6.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				
			}
		});
		
		JPanel panelOpponentIVP6 = new JPanel();
		panelOpponentIVP6.setOpaque(false);
		panelOpponentP6.add(panelOpponentIVP6, "cell 1 0,grow");
		panelOpponentIVP6.setLayout(new MigLayout("", "[][]", "[][][][][][][]"));
		
		JLabel lblOpponentIVsP6 = new JLabel("IVs");
		panelOpponentIVP6.add(lblOpponentIVsP6, "cell 0 0");
		
		JLabel lblOpponentHPIVP6 = new JLabel("HP: ");
		panelOpponentIVP6.add(lblOpponentHPIVP6, "cell 0 1");
		
		spinnerOpponentHPIVP6 = new JSpinner();
		spinnerOpponentHPIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[5].setIvHp(Double.parseDouble(""+spinnerOpponentHPIVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[5].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[5].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[5].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel()));
				statLabelUpdaterOpponentP6();
			}
		});
		spinnerOpponentHPIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP6.add(spinnerOpponentHPIVP6, "cell 1 1");
		
		JLabel lblOpponentAttackIVP6 = new JLabel("Attack: ");
		panelOpponentIVP6.add(lblOpponentAttackIVP6, "cell 0 2");
		
		spinnerOpponentAttackIVP6 = new JSpinner();
		spinnerOpponentAttackIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[5].setIvAttack(Double.parseDouble(""+spinnerOpponentAttackIVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[5].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[5].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[5].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[5].getNature()));
						statLabelUpdaterOpponentP6();
			}
		});
		spinnerOpponentAttackIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP6.add(spinnerOpponentAttackIVP6, "cell 1 2");
		
		JLabel lblOpponentDefenseIVP6 = new JLabel("Defense: ");
		panelOpponentIVP6.add(lblOpponentDefenseIVP6, "cell 0 3");
		
		spinnerOpponentDefenseIVP6 = new JSpinner();
		spinnerOpponentDefenseIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[5].setIvDefense(Double.parseDouble(""+spinnerOpponentDefenseIVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[5].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[5].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[5].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[5].getNature()));
						statLabelUpdaterOpponentP6();
			}
		});
		spinnerOpponentDefenseIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP6.add(spinnerOpponentDefenseIVP6, "cell 1 3");
		
		JLabel lblOpponentSpAttackIVP6 = new JLabel("Special Attack: ");
		panelOpponentIVP6.add(lblOpponentSpAttackIVP6, "cell 0 4");
		
		spinnerOpponentSpAttackIVP6 = new JSpinner();
		spinnerOpponentSpAttackIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[5].setIvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackIVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setSpAttack(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[5].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[5].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[5].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[5].getNature()));
						statLabelUpdaterOpponentP6();
			}
		});
		spinnerOpponentSpAttackIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP6.add(spinnerOpponentSpAttackIVP6, "cell 1 4");
		
		JLabel lblOpponentSpDefenseIVP6 = new JLabel("Special Defense: ");
		panelOpponentIVP6.add(lblOpponentSpDefenseIVP6, "cell 0 5");
		
		spinnerOpponentSpDefenseIVP6 = new JSpinner();
		spinnerOpponentSpDefenseIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[5].setIvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseIVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setSpDefense(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[5].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[5].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[5].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[5].getNature()));
						statLabelUpdaterOpponentP6();
			}
		});
		spinnerOpponentSpDefenseIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP6.add(spinnerOpponentSpDefenseIVP6, "cell 1 5");
		
		JLabel lblOpponentSpeedIVP6 = new JLabel("Speed: ");
		panelOpponentIVP6.add(lblOpponentSpeedIVP6, "cell 0 6");
		
		spinnerOpponentSpeedIVP6 = new JSpinner();
		spinnerOpponentSpeedIVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[5].setIvSpeed(Double.parseDouble(""+spinnerOpponentSpeedIVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setSpeed(StatCalc.calculate(CurrentSimData.getOpponentPKMN()[5].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[5].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[5].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[5].getNature()));
						statLabelUpdaterOpponentP6();
			}
		});
		spinnerOpponentSpeedIVP6.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		panelOpponentIVP6.add(spinnerOpponentSpeedIVP6, "cell 1 6");
		
		JPanel panelOpponentEVP6 = new JPanel();
		panelOpponentEVP6.setOpaque(false);
		panelOpponentP6.add(panelOpponentEVP6, "cell 2 0,grow");
		panelOpponentEVP6.setLayout(new MigLayout("", "[][][][]", "[][][][][][][][]"));
		
		JLabel lblOpponentEVsP6 = new JLabel("EVs");
		panelOpponentEVP6.add(lblOpponentEVsP6, "cell 0 0");
		
		JLabel lblOpponentEVMaxP6 = new JLabel("Available: ");
		panelOpponentEVP6.add(lblOpponentEVMaxP6, "cell 1 0");
		
		lblOpponentEVsAvailableP6 = new JLabel("510");
		panelOpponentEVP6.add(lblOpponentEVsAvailableP6, "cell 2 0");
		
		JLabel lblOpponentHPEVP6 = new JLabel("HP: ");
		panelOpponentEVP6.add(lblOpponentHPEVP6, "cell 0 1");
		
		spinnerOpponentHPEVP6 = new JSpinner();
		spinnerOpponentHPEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP6 < 0)
				{
					spinnerOpponentHPEVP6.setValue((int)spinnerOpponentHPEVP6.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[5].setEvHp(Double.parseDouble(""+spinnerOpponentHPEVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setHp(StatCalc.calculateHP(
						CurrentSimData.getOpponentPKMN()[5].getBaseHp(),
						CurrentSimData.getOpponentPKMN()[5].getIvHp(), 
						CurrentSimData.getOpponentPKMN()[5].getEvHp(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel()));
						statLabelUpdaterOpponentP6();
						opponentEVCheckP6();
			}
		});
		spinnerOpponentHPEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP6.add(spinnerOpponentHPEVP6, "cell 1 1");
		
		JLabel lblOpponentAttackEVP6 = new JLabel("Attack: ");
		panelOpponentEVP6.add(lblOpponentAttackEVP6, "cell 0 2");
		
		spinnerOpponentAttackEVP6 = new JSpinner();
		spinnerOpponentAttackEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP6 < 0)
				{
					spinnerOpponentAttackEVP6.setValue((int)spinnerOpponentAttackEVP6.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[5].setEvAttack(Double.parseDouble(""+spinnerOpponentAttackEVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[5].getBaseAttack(),
						CurrentSimData.getOpponentPKMN()[5].getIvAttack(), 
						CurrentSimData.getOpponentPKMN()[5].getEvAttack(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel(), 
						StatCalc.ATTACK, 
						CurrentSimData.getOpponentPKMN()[5].getNature()));
						statLabelUpdaterOpponentP6();
						opponentEVCheckP6();
			}
		});
		spinnerOpponentAttackEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP6.add(spinnerOpponentAttackEVP6, "cell 1 2");
		
		JLabel lblOpponentDefenseEVP6 = new JLabel("Defense: ");
		panelOpponentEVP6.add(lblOpponentDefenseEVP6, "cell 0 3");
		
		spinnerOpponentDefenseEVP6 = new JSpinner();
		spinnerOpponentDefenseEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP6 < 0)
				{
					spinnerOpponentDefenseEVP6.setValue((int)spinnerOpponentDefenseEVP6.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[5].setEvDefense(Double.parseDouble(""+spinnerOpponentDefenseEVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[5].getBaseDefense(),
						CurrentSimData.getOpponentPKMN()[5].getIvDefense(), 
						CurrentSimData.getOpponentPKMN()[5].getEvDefense(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel(), 
						StatCalc.DEFENSE, 
						CurrentSimData.getOpponentPKMN()[5].getNature()));
						statLabelUpdaterOpponentP6();
						opponentEVCheckP6();
			}
		});
		spinnerOpponentDefenseEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP6.add(spinnerOpponentDefenseEVP6, "cell 1 3");
		
		JLabel lblOpponentSpAttackEVP6 = new JLabel("Special Attack: ");
		panelOpponentEVP6.add(lblOpponentSpAttackEVP6, "cell 0 4");
		
		spinnerOpponentSpAttackEVP6 = new JSpinner();
		spinnerOpponentSpAttackEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP6 < 0)
				{
					spinnerOpponentSpAttackEVP6.setValue((int)spinnerOpponentSpAttackEVP6.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[5].setEvSpAttack(Double.parseDouble(""+spinnerOpponentSpAttackEVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setSpAttack(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[5].getBaseSpAttack(),
						CurrentSimData.getOpponentPKMN()[5].getIvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[5].getEvSpAttack(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel(), 
						StatCalc.SP_ATTACK, 
						CurrentSimData.getOpponentPKMN()[5].getNature()));
						statLabelUpdaterOpponentP6();
						opponentEVCheckP6();
			}
		});
		spinnerOpponentSpAttackEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP6.add(spinnerOpponentSpAttackEVP6, "cell 1 4");
		
		JLabel lblOpponentSpDefenseEVP6 = new JLabel("Special Defense: ");
		panelOpponentEVP6.add(lblOpponentSpDefenseEVP6, "cell 0 5");
		
		spinnerOpponentSpDefenseEVP6 = new JSpinner();
		spinnerOpponentSpDefenseEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP6 < 0)
				{
					spinnerOpponentSpDefenseEVP6.setValue((int)spinnerOpponentSpDefenseEVP6.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[5].setEvSpDefense(Double.parseDouble(""+spinnerOpponentSpDefenseEVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setSpDefense(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[5].getBaseSpDefense(),
						CurrentSimData.getOpponentPKMN()[5].getIvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[5].getEvSpDefense(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel(), 
						StatCalc.SP_DEFENSE, 
						CurrentSimData.getOpponentPKMN()[5].getNature()));
						statLabelUpdaterOpponentP6();
						opponentEVCheckP6();
			}
		});
		spinnerOpponentSpDefenseEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP6.add(spinnerOpponentSpDefenseEVP6, "cell 1 5");
		
		JLabel lblOpponentSpeedEVP6 = new JLabel("Speed: ");
		panelOpponentEVP6.add(lblOpponentSpeedEVP6, "cell 0 7");
		
		spinnerOpponentSpeedEVP6 = new JSpinner();
		spinnerOpponentSpeedEVP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(opponentEVtotalP6 < 0)
				{
					spinnerOpponentSpeedEVP6.setValue((int)spinnerOpponentSpeedEVP6.getValue()-1);
				}
				CurrentSimData.getOpponentPKMN()[5].setEvSpeed(Double.parseDouble(""+spinnerOpponentSpeedEVP6.getValue()));
				CurrentSimData.getOpponentPKMN()[5].setSpeed(StatCalc.calculate(
						CurrentSimData.getOpponentPKMN()[5].getBaseSpeed(),
						CurrentSimData.getOpponentPKMN()[5].getIvSpeed(), 
						CurrentSimData.getOpponentPKMN()[5].getEvSpeed(), 
						CurrentSimData.getOpponentPKMN()[5].getLevel(), 
						StatCalc.SPEED, 
						CurrentSimData.getOpponentPKMN()[5].getNature()));
						statLabelUpdaterOpponentP6();
						opponentEVCheckP6();
			}
		});
		spinnerOpponentSpeedEVP6.setModel(new SpinnerNumberModel(0, 0, 252, 1));
		panelOpponentEVP6.add(spinnerOpponentSpeedEVP6, "cell 1 7");
		
		JPanel panelOpponentStatsP6 = new JPanel();
		panelOpponentStatsP6.setOpaque(false);
		panelOpponentP6.add(panelOpponentStatsP6, "cell 3 0,grow");
		panelOpponentStatsP6.setLayout(new MigLayout("", "[][][25px]", "[][][][][][][][][][][]"));
		
		JLabel lblOpponentLevelP6 = new JLabel("Level: ");
		panelOpponentStatsP6.add(lblOpponentLevelP6, "cell 0 0");
		
		spinnerOpponentLevelP6 = new JSpinner();
		spinnerOpponentLevelP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CurrentSimData.getOpponentPKMN()[5].setLevel(Double.parseDouble(""+spinnerOpponentLevelP6.getValue()));
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[5]);
				statLabelUpdaterOpponentP6();
			}
		});
		spinnerOpponentLevelP6.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		panelOpponentStatsP6.add(spinnerOpponentLevelP6, "cell 1 0");
		
		lblOpponentHPP6 = new JLabel("HP: ");
		panelOpponentStatsP6.add(lblOpponentHPP6, "cell 0 1");
		
		lblOpponentHPCalcP6 = new JLabel("0");
		panelOpponentStatsP6.add(lblOpponentHPCalcP6, "cell 1 1");
		
		lblOpponentAttackP6 = new JLabel("Attack: ");
		panelOpponentStatsP6.add(lblOpponentAttackP6, "cell 0 2");
		
		lblOpponentAttackCalcP6 = new JLabel("0");
		panelOpponentStatsP6.add(lblOpponentAttackCalcP6, "cell 1 2");
		
		lblOpponentDefenseP6 = new JLabel("Defense: ");
		panelOpponentStatsP6.add(lblOpponentDefenseP6, "cell 0 3");
		
		lblOpponentDefenseCalcP6 = new JLabel("0");
		panelOpponentStatsP6.add(lblOpponentDefenseCalcP6, "cell 1 3");
		
		lblOpponentSpAttackP6 = new JLabel("Special Attack: ");
		panelOpponentStatsP6.add(lblOpponentSpAttackP6, "cell 0 4");
		
		lblOpponentSpAttackCalcP6 = new JLabel("0");
		panelOpponentStatsP6.add(lblOpponentSpAttackCalcP6, "cell 1 4");
		
		lblOpponentSpDefenseP6 = new JLabel("Special Defense: ");
		panelOpponentStatsP6.add(lblOpponentSpDefenseP6, "cell 0 5");
		
		lblOpponentSpDefenseCalcP6 = new JLabel("0");
		panelOpponentStatsP6.add(lblOpponentSpDefenseCalcP6, "cell 1 5");
		
		lblOpponentSpeedP6 = new JLabel("Speed: ");
		panelOpponentStatsP6.add(lblOpponentSpeedP6, "cell 0 6");
		
		lblOpponentSpeedCalcP6 = new JLabel("0");
		panelOpponentStatsP6.add(lblOpponentSpeedCalcP6, "cell 1 6");
		
		JLabel lblOpponentNatureP6 = new JLabel("Nature: ");
		panelOpponentStatsP6.add(lblOpponentNatureP6, "cell 0 7");
		
		spinnerOpponentNatureP6 = new JSpinner();
		spinnerOpponentNatureP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int i = 0;
				while(i < Names.natureNames.length)
				{
					if(spinnerOpponentNatureP6.getValue() == Names.natureNames[i])
					{
						CurrentSimData.getOpponentPKMN()[5].setNature(i);
						break;
					}
					else
					{
						i++;
					}
				}
				StatCalc.calculateLevel(CurrentSimData.getOpponentPKMN()[5]);
				statLabelUpdaterOpponentP6();
				opponentStatColors();
			}

			private void opponentStatColors() {
				lblOpponentAttackP6.setForeground(Color.BLACK);
				lblOpponentDefenseP6.setForeground(Color.BLACK);
				lblOpponentSpAttackP6.setForeground(Color.BLACK);
				lblOpponentSpDefenseP6.setForeground(Color.BLACK);
				lblOpponentSpeedP6.setForeground(Color.BLACK);
				if(!(StatCalc.natures[CurrentSimData.getOpponentPKMN()[5].getNature()][5] == StatCalc.natures[CurrentSimData.getOpponentPKMN()[5].getNature()][1]))
				{
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[5].getNature()][5])
					{
					case StatCalc.ATTACK: lblOpponentAttackP6.setForeground(Color.RED);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP6.setForeground(Color.RED);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP6.setForeground(Color.RED);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP6.setForeground(Color.RED);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP6.setForeground(Color.RED);
					break;
					}
					
					switch (StatCalc.natures[CurrentSimData.getOpponentPKMN()[5].getNature()][1])
					{
					case StatCalc.ATTACK: lblOpponentAttackP6.setForeground(Color.BLUE);
					break;
					case StatCalc.DEFENSE: lblOpponentDefenseP6.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_ATTACK: lblOpponentSpAttackP6.setForeground(Color.BLUE);
					break;
					case StatCalc.SP_DEFENSE: lblOpponentSpDefenseP6.setForeground(Color.BLUE);
					break;
					case StatCalc.SPEED: lblOpponentSpeedP6.setForeground(Color.BLUE);
					break;
					}
				}
			}
		});
		spinnerOpponentNatureP6.setModel(new SpinnerListModel(new String[] {"Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax", "Timid", "Hasty", "Serious", "Jolly", "Naive", "Modest", "Mild", "Quiet", "Bashful", "Rash", "Calm", "Gentle", "Sassy", "Careful", "Quirky"}));
		panelOpponentStatsP6.add(spinnerOpponentNatureP6, "cell 1 7 2 1,growx");
		
		JPanel panelOpponentExtraP6 = new JPanel();
		panelOpponentExtraP6.setOpaque(false);
		panelOpponentP6.add(panelOpponentExtraP6, "cell 4 0,grow");
		panelOpponentExtraP6.setLayout(new MigLayout("", "[][]", "[]"));
		
		JLabel lblOpponentGenderP6 = new JLabel("Gender: ");
		panelOpponentExtraP6.add(lblOpponentGenderP6, "cell 0 0,aligny top");
		
		rdbtnOpponentMaleP6 = new JRadioButton("Male");
		opponentGenderGroupP6.add(rdbtnOpponentMaleP6);
		panelOpponentExtraP6.add(rdbtnOpponentMaleP6, "flowy,cell 1 0");
		
		rdbtnOpponentFemaleP6 = new JRadioButton("Female");
		opponentGenderGroupP6.add(rdbtnOpponentFemaleP6);
		panelOpponentExtraP6.add(rdbtnOpponentFemaleP6, "cell 1 0");
		
		rdbtnOpponentGenderlessP6 = new JRadioButton("Genderless");
		opponentGenderGroupP6.add(rdbtnOpponentGenderlessP6);
		panelOpponentExtraP6.add(rdbtnOpponentGenderlessP6, "cell 1 0");
		rdbtnOpponentMaleP6.setSelected(true);
		panelOpponentP6.add(scrollPaneOpponentP6, "cell 0 1,width max(100%),alignx left,aligny top");
		
		JPanel panel_3_OpponentP6 = new JPanel();
		panel_3_OpponentP6.setOpaque(false);
		panel_3_OpponentP6.setLayout(new GridLayout(2, 1, 0, 0));
		
		JButton buttonAddOpponentP6 = new JButton(">>");
		buttonAddOpponentP6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentMovesP6.getSelectedValue()!= null)
				{
					int i = 0;
					while(i < selectedOpponentMovesP6.length)
					{
						if(selectedOpponentMovesP6[i] == "None")
						{
							selectedOpponentMovesP6[i] = (String) listOpponentMovesP6.getSelectedValue();
							int w = 0;
							while(w < Names.fullMoveNames.length)
							{
								if(selectedOpponentMovesP6[i] == Names.fullMoveNames[w])
								{
									try {
										opponentMovesP6[i] = (Move) Class.forName("movedata." + Names.moveClasses[w]).newInstance();
									} catch (InstantiationException
											| IllegalAccessException
											| ClassNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									break;
								}
								else
								{
									w++;
								}
							}
							break;
						}
						else
						{
							i++;
						}
					}
					listOpponentSelectedMovesP6.setListData(selectedOpponentMovesP6);
				}
			}
		});
		panel_3_OpponentP6.add(buttonAddOpponentP6);
		
		JButton buttonRemoveOpponentP6 = new JButton("<<");
		buttonRemoveOpponentP6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listOpponentSelectedMovesP6.getSelectedValue()!= null)
				{
					opponentMovesP6[listOpponentSelectedMovesP6.getSelectedIndex()] = new None();
					selectedOpponentMovesP6[listOpponentSelectedMovesP6.getSelectedIndices()[5]] = "None";
					listOpponentSelectedMovesP6.setListData(selectedOpponentMovesP6);
				}
			}
		});
		
		JPanel panelOpponentMovePreviewP6 = new JPanel();
		panelOpponentMovePreviewP6.setOpaque(false);
		panelOpponentP6.add(panelOpponentMovePreviewP6, "cell 1 1,grow");
		panelOpponentMovePreviewP6.setLayout(new MigLayout("", "[60px][]", "[14px][][][]"));
		
		JLabel lblOpponentMoveTypeP6 = new JLabel("Move Type: ");
		panelOpponentMovePreviewP6.add(lblOpponentMoveTypeP6, "cell 0 0,alignx left,aligny top");
		
		lblOpponentMoveTypeIconP6 = new JLabel();
		panelOpponentMovePreviewP6.add(lblOpponentMoveTypeIconP6, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryP6 = new JLabel("Category: ");
		panelOpponentMovePreviewP6.add(lblOpponentMoveCategoryP6, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryCalcP6 = new JLabel("");
		panelOpponentMovePreviewP6.add(lblOpponentMoveCategoryCalcP6, "cell 1 1,alignx left,aligny bottom");
		
		JLabel lblOpponentMovePowerP6 = new JLabel("Power: ");
		panelOpponentMovePreviewP6.add(lblOpponentMovePowerP6, "cell 0 2");
		
		JLabel lblOpponentMovePowerCalcP6 = new JLabel("");
		panelOpponentMovePreviewP6.add(lblOpponentMovePowerCalcP6, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyP6 = new JLabel("Accuracy: ");
		panelOpponentMovePreviewP6.add(lblOpponentMoveAccuracyP6, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyCalcP6 = new JLabel("");
		panelOpponentMovePreviewP6.add(lblOpponentMoveAccuracyCalcP6, "cell 1 3");
		panelOpponentP6.add(panel_3_OpponentP6, "cell 2 1,grow");
		
		panel_3_OpponentP6.add(buttonRemoveOpponentP6);
		
		
		listOpponentSelectedMovesP6.setSelectionModel(smOpponentP6);
		panelOpponentP6.add(listOpponentSelectedMovesP6, "cell 3 1,grow");
		
		JPanel panelOpponentMoveDetailsP6 = new JPanel();
		panelOpponentMoveDetailsP6.setOpaque(false);
		panelOpponentP6.add(panelOpponentMoveDetailsP6, "cell 4 1,grow");
		panelOpponentMoveDetailsP6.setLayout(new MigLayout("", "[][]", "[][][][][][]"));
		
		JLabel lblOpponentMoveTypeDetailsP6 = new JLabel("Move Type: ");
		panelOpponentMoveDetailsP6.add(lblOpponentMoveTypeDetailsP6, "cell 0 0,alignx left");
		
		JLabel lblOpponentMoveTypeIconDisplayP6 = new JLabel("");
		panelOpponentMoveDetailsP6.add(lblOpponentMoveTypeIconDisplayP6, "cell 1 0");
		
		JLabel lblOpponentMoveCategoryDetailsP6 = new JLabel("Category: ");
		panelOpponentMoveDetailsP6.add(lblOpponentMoveCategoryDetailsP6, "cell 0 1");
		
		JLabel lblOpponentMoveCategoryDisplayP6 = new JLabel("");
		panelOpponentMoveDetailsP6.add(lblOpponentMoveCategoryDisplayP6, "cell 1 1");
		
		JLabel lblOpponentMovePowerDetailsP6 = new JLabel("Power: ");
		panelOpponentMoveDetailsP6.add(lblOpponentMovePowerDetailsP6, "cell 0 2");
		
		JLabel lblOpponentMovePowerDisplayP6 = new JLabel("");
		panelOpponentMoveDetailsP6.add(lblOpponentMovePowerDisplayP6, "cell 1 2");
		
		JLabel lblOpponentMoveAccuracyDetailsP6 = new JLabel("Accuracy: ");
		panelOpponentMoveDetailsP6.add(lblOpponentMoveAccuracyDetailsP6, "cell 0 3");
		
		JLabel lblOpponentMoveAccuracyDisplayP6 = new JLabel("");
		panelOpponentMoveDetailsP6.add(lblOpponentMoveAccuracyDisplayP6, "cell 1 3");
		
		JLabel lblOpponentMaxPPP6 = new JLabel("Max PP: ");
		panelOpponentMoveDetailsP6.add(lblOpponentMaxPPP6, "cell 0 4");
		
		JLabel lblOpponentMaxPPCalcP6 = new JLabel("0");
		panelOpponentMoveDetailsP6.add(lblOpponentMaxPPCalcP6, "cell 1 4");
		
		JLabel lblOpponentCurrentPPP6 = new JLabel("Current PP: ");
		panelOpponentMoveDetailsP6.add(lblOpponentCurrentPPP6, "cell 0 5");
		
		JSpinner spinnerOpponentCurrentPPP6 = new JSpinner();
		spinnerOpponentCurrentPPP6.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				opponentMovesP6[listOpponentSelectedMovesP6.getSelectedIndex()].setPp((int) spinnerOpponentCurrentPPP6.getValue());
				opponentMovesP6[listOpponentSelectedMovesP6.getSelectedIndex()].setCurrentPP((int) spinnerOpponentCurrentPPP6.getValue());
			}
		});
		panelOpponentMoveDetailsP6.add(spinnerOpponentCurrentPPP6, "cell 1 5");
		
		
		
		listOpponentMovesP6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = 0;
				while(i < Names.fullMoveNames.length)
				{
					if(Names.fullMoveNames[i] == listOpponentMovesP6.getSelectedValue())
					{
						Move selected = null;
						try {
							selected = (Move) Class.forName("movedata." + Names.moveClasses[i]).newInstance();
						} catch (InstantiationException
								| IllegalAccessException
								| ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(contentPane, "Class not found: \nMove not yet implemented", "Error", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}

						BufferedImage image = null;
						try {
							image = ImageIO.read(SetupWindow.class.getResource("/"+selected.getMoveType()+".png"));
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						lblOpponentMoveTypeIconP6.setIcon(new ImageIcon(image));
						String catText = "None";
						switch (selected.getCategory())
						{
							case Move.PHYSICAL: catText = "Physical";
												break;
							case Move.SPECIAL: catText = "Special";
												break;
							case Move.STATUS: catText = "Status";
												break;
						
						}
						lblOpponentMoveCategoryCalcP6.setText(catText);
						lblOpponentMovePowerCalcP6.setText(selected.getPower()+"");
						lblOpponentMoveAccuracyCalcP6.setText(selected.getAccuracy()+"");
						
						break;
					}
					else
					{
						i++;
					}
				}
				repaint();
			}
		});
		
		
		listOpponentSelectedMovesP6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				int i = listOpponentSelectedMovesP6.getSelectedIndex();
				
				lblOpponentMaxPPCalcP6.setText(opponentMovesP6[i].getMaxPP() + "");
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(SetupWindow.class.getResource("/"+opponentMovesP6[i].getMoveType()+".png"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblOpponentMoveTypeIconDisplayP6.setIcon(new ImageIcon(image));				String catTextDisplay = "None";
				switch (opponentMovesP6[i].getCategory())
				{
					case Move.PHYSICAL: catTextDisplay = "Physical";
										break;
					case Move.SPECIAL: catTextDisplay = "Special";
										break;
					case Move.STATUS: catTextDisplay = "Status";
										break;
				
				}
				lblOpponentMoveCategoryDisplayP6.setText(catTextDisplay);
				lblOpponentMovePowerDisplayP6.setText(opponentMovesP6[i].getPower()+"");
				lblOpponentMoveAccuracyDisplayP6.setText(opponentMovesP6[i].getAccuracy()+"");
				spinnerOpponentCurrentPPP6.setModel(new SpinnerNumberModel(0, 0, opponentMovesP6[i].getMaxPP(), 1));
				spinnerOpponentCurrentPPP6.setValue(opponentMovesP6[i].getPp());
				repaint();
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		btnPlayerSetup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelOpponentTeam.setVisible(false);
				panelPlayerTeam.setVisible(true);
				panelPlayerP1.setVisible(false);
				panelPlayerP2.setVisible(false);
				panelPlayerP3.setVisible(false);
				panelPlayerP4.setVisible(false);
				panelPlayerP5.setVisible(false);
				panelPlayerP6.setVisible(false);
				panelOpponentP1.setVisible(false);
				panelOpponentP2.setVisible(false);
				panelOpponentP3.setVisible(false);
				panelOpponentP4.setVisible(false);
				panelOpponentP5.setVisible(false);
				panelOpponentP6.setVisible(false);
				switch (playerLastOpen)
				{
				case 0: panelPlayerP1.setVisible(true);
				break;
				
				case 1: panelPlayerP2.setVisible(true);
				break;
				
				case 2: panelPlayerP3.setVisible(true);
				break;
				
				case 3: panelPlayerP4.setVisible(true);
				break;
				
				case 4: panelPlayerP5.setVisible(true);
				break;
				
				case 5: panelPlayerP6.setVisible(true);
				break;
				
				}
			}
		});
		menuBar.add(btnPlayerSetup);
		
		btnOpponentSetup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPlayerTeam.setVisible(false);
				panelOpponentTeam.setVisible(true);
				panelPlayerP1.setVisible(false);
				panelPlayerP2.setVisible(false);
				panelPlayerP3.setVisible(false);
				panelPlayerP4.setVisible(false);
				panelPlayerP5.setVisible(false);
				panelPlayerP6.setVisible(false);
				panelOpponentP1.setVisible(false);
				panelOpponentP2.setVisible(false);
				panelOpponentP3.setVisible(false);
				panelOpponentP4.setVisible(false);
				panelOpponentP5.setVisible(false);
				panelOpponentP6.setVisible(false);
				switch (opponentLastOpen)
				{
				case 0: panelOpponentP1.setVisible(true);
				break;
				
				case 1: panelOpponentP2.setVisible(true);
				break;
				
				case 2: panelOpponentP3.setVisible(true);
				break;
				
				case 3: panelOpponentP4.setVisible(true);
				break;
				
				case 4: panelOpponentP5.setVisible(true);
				break;
				
				case 5: panelOpponentP6.setVisible(true);
				break;
				
				}
				
				
			}
		});
		menuBar.add(btnOpponentSetup);
		
		JButton btnSubmit = new JButton("Submit");
		menuBar.add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {

				if(CurrentSimData.getPlayerPKMN()[0] != null)
				{
					CurrentSimData.getPlayerPKMN()[0].setMoveSet(playerMovesP1);
					CurrentSimData.getPlayerPKMN()[0].setCurrentHP(CurrentSimData.getPlayerPKMN()[0].getHp());
					playerPPCheckP1();
					playerGenderCheckP1(rdbtnPlayerMaleP1, rdbtnPlayerFemaleP1,
							rdbtnPlayerGenderlessP1);
				}
					
				if(CurrentSimData.getPlayerPKMN()[1] != null)
				{
					CurrentSimData.getPlayerPKMN()[1].setMoveSet(playerMovesP2);
					CurrentSimData.getPlayerPKMN()[1].setCurrentHP(CurrentSimData.getPlayerPKMN()[1].getHp());
					playerPPCheckP2();
					playerGenderCheckP2(rdbtnPlayerMaleP2, rdbtnPlayerFemaleP2,
							rdbtnPlayerGenderlessP2);
				}
				if(CurrentSimData.getPlayerPKMN()[2] != null)
				{
					CurrentSimData.getPlayerPKMN()[2].setMoveSet(playerMovesP3);
					CurrentSimData.getPlayerPKMN()[2].setCurrentHP(CurrentSimData.getPlayerPKMN()[2].getHp());
					playerPPCheckP3();
					playerGenderCheckP3(rdbtnPlayerMaleP3, rdbtnPlayerFemaleP3,
							rdbtnPlayerGenderlessP3);
				}
				if(CurrentSimData.getPlayerPKMN()[3] != null)
				{
					CurrentSimData.getPlayerPKMN()[3].setMoveSet(playerMovesP4);
					CurrentSimData.getPlayerPKMN()[3].setCurrentHP(CurrentSimData.getPlayerPKMN()[3].getHp());
					playerPPCheckP4();
					playerGenderCheckP4(rdbtnPlayerMaleP4, rdbtnPlayerFemaleP4,
							rdbtnPlayerGenderlessP4);
				}
				if(CurrentSimData.getPlayerPKMN()[4] != null)
				{
					CurrentSimData.getPlayerPKMN()[4].setMoveSet(playerMovesP5);
					CurrentSimData.getPlayerPKMN()[4].setCurrentHP(CurrentSimData.getPlayerPKMN()[4].getHp());
					playerPPCheckP5();
					playerGenderCheckP5(rdbtnPlayerMaleP5, rdbtnPlayerFemaleP5,
							rdbtnPlayerGenderlessP5);
				}
				if(CurrentSimData.getPlayerPKMN()[5] != null)
				{
					CurrentSimData.getPlayerPKMN()[5].setMoveSet(playerMovesP6);
					CurrentSimData.getPlayerPKMN()[5].setCurrentHP(CurrentSimData.getPlayerPKMN()[5].getHp());
					playerPPCheckP6();
					playerGenderCheckP6(rdbtnPlayerMaleP6, rdbtnPlayerFemaleP6,
							rdbtnPlayerGenderlessP6);
				}
				
				if(CurrentSimData.getOpponentPKMN()[0] != null)
				{
					CurrentSimData.getOpponentPKMN()[0].setMoveSet(opponentMovesP1);
					CurrentSimData.getOpponentPKMN()[0].setCurrentHP(CurrentSimData.getOpponentPKMN()[0].getHp());
					opponentPPCheckP1();
					opponentGenderCheckP1(rdbtnOpponentMaleP1, rdbtnOpponentFemaleP1,
							rdbtnOpponentGenderlessP1);
				}
				if(CurrentSimData.getOpponentPKMN()[1] != null)
				{
					CurrentSimData.getOpponentPKMN()[1].setMoveSet(opponentMovesP2);
					CurrentSimData.getOpponentPKMN()[1].setCurrentHP(CurrentSimData.getOpponentPKMN()[1].getHp());
					opponentPPCheckP2();
					opponentGenderCheckP2(rdbtnOpponentMaleP2, rdbtnOpponentFemaleP2,
							rdbtnOpponentGenderlessP2);
				}
				if(CurrentSimData.getOpponentPKMN()[2] != null)
				{
					CurrentSimData.getOpponentPKMN()[2].setMoveSet(opponentMovesP3);
					CurrentSimData.getOpponentPKMN()[2].setCurrentHP(CurrentSimData.getOpponentPKMN()[2].getHp());
					opponentPPCheckP3();
					opponentGenderCheckP3(rdbtnOpponentMaleP3, rdbtnOpponentFemaleP3,
							rdbtnOpponentGenderlessP3);
				}
				if(CurrentSimData.getOpponentPKMN()[3] != null)
				{
					CurrentSimData.getOpponentPKMN()[3].setMoveSet(opponentMovesP4);
					CurrentSimData.getOpponentPKMN()[3].setCurrentHP(CurrentSimData.getOpponentPKMN()[3].getHp());
					opponentPPCheckP4();
					opponentGenderCheckP4(rdbtnOpponentMaleP4, rdbtnOpponentFemaleP4,
							rdbtnOpponentGenderlessP4);
				}
				if(CurrentSimData.getOpponentPKMN()[4] != null)
				{
					CurrentSimData.getOpponentPKMN()[4].setMoveSet(opponentMovesP5);
					CurrentSimData.getOpponentPKMN()[4].setCurrentHP(CurrentSimData.getOpponentPKMN()[4].getHp());
					opponentPPCheckP5();
					opponentGenderCheckP5(rdbtnOpponentMaleP5, rdbtnOpponentFemaleP5,
							rdbtnOpponentGenderlessP5);
				}
				if(CurrentSimData.getOpponentPKMN()[5] != null)
				{
					CurrentSimData.getOpponentPKMN()[5].setMoveSet(opponentMovesP6);
					CurrentSimData.getOpponentPKMN()[5].setCurrentHP(CurrentSimData.getOpponentPKMN()[5].getHp());
					opponentPPCheckP6();
					opponentGenderCheckP6(rdbtnOpponentMaleP6, rdbtnOpponentFemaleP6,
							rdbtnOpponentGenderlessP6);
				}
				int i = 0;
				while(i<6)
				{
					if(CurrentSimData.getPlayerPKMN()[i] != null)
					{
						CurrentSimData.getPlayerPKMN()[i].setStatusNonVolatile(Status.NONE);
						CurrentSimData.getPlayerPKMN()[i].setStatusVolatile(new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false});
						CurrentSimData.getPlayerPKMN()[i].setStatusVolatileBattle(new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false});
					}
					i++;
				}
				i=0;
				while(i<6)
				{
					if(CurrentSimData.getOpponentPKMN()[i] != null)
					{
						CurrentSimData.getOpponentPKMN()[i].setStatusNonVolatile(Status.NONE);
						CurrentSimData.getOpponentPKMN()[i].setStatusVolatile(new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false});
						CurrentSimData.getOpponentPKMN()[i].setStatusVolatileBattle(new boolean[]{false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false});
					}
					i++;
				}
				
				CurrentSimData.setCurrentPokemonPlayer(0);
				CurrentSimData.setCurrentPokemonOpponent(0);
				BattleWindow battleWindow = null;
				try {
					battleWindow = new BattleWindow();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					battleWindow.setVisible(true);
					try {
						battleWindow.battleText.insertString(battleWindow.battleText.getLength(), "BATTLE START", null);
					} catch (BadLocationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}	

		});
	}
	
	public static void playerPPCheckP1()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getPlayerPKMN()[0].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getPlayerPKMN()[0].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getPlayerPKMN()[0]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getPlayerPKMN()[0]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterPlayerP1()
	{
		lblPlayerHPCalcP1.setText(CurrentSimData.getPlayerPKMN()[0].getHp()+"");
		lblPlayerAttackCalcP1.setText(CurrentSimData.getPlayerPKMN()[0].getAttack()+"");
		lblPlayerDefenseCalcP1.setText(CurrentSimData.getPlayerPKMN()[0].getDefense()+"");
		lblPlayerSpAttackCalcP1.setText(CurrentSimData.getPlayerPKMN()[0].getSpAttack()+"");
		lblPlayerSpDefenseCalcP1.setText(CurrentSimData.getPlayerPKMN()[0].getSpDefense()+"");
		lblPlayerSpeedCalcP1.setText(CurrentSimData.getPlayerPKMN()[0].getSpeed()+"");
		contentPane.repaint();
	}

	public static void playerEVCheckP1()
	{
		int total = (int) (CurrentSimData.getPlayerPKMN()[0].getEvHp() +
				CurrentSimData.getPlayerPKMN()[0].getEvAttack() +
				CurrentSimData.getPlayerPKMN()[0].getEvDefense() +
				CurrentSimData.getPlayerPKMN()[0].getEvSpAttack() +
				CurrentSimData.getPlayerPKMN()[0].getEvSpDefense() +
				CurrentSimData.getPlayerPKMN()[0].getEvSpeed());
		
		lblPlayerEVsAvailableP1.setText(510-total+"");
		playerEVtotalP1 = 510-total;
	}
	
	private void playerGenderCheckP1(JRadioButton rdbtnPlayerMale,
			JRadioButton rdbtnPlayerFemale,
			JRadioButton rdbtnPlayerGenderless) {
		if(playerGenderGroupP1.getSelection() == rdbtnPlayerMale)
		{
			CurrentSimData.getPlayerPKMN()[0].setGender(Pokemon.MALE);
		}
		else if(playerGenderGroupP1.getSelection() == rdbtnPlayerFemale)
		{
			CurrentSimData.getPlayerPKMN()[0].setGender(Pokemon.FEMALE);
		}
		else if(playerGenderGroupP1.getSelection() == rdbtnPlayerGenderless)
		{
			CurrentSimData.getPlayerPKMN()[0].setGender(Pokemon.GENDERLESS);
		}
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public static void playerPPCheckP2()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getPlayerPKMN()[1].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getPlayerPKMN()[1].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getPlayerPKMN()[1]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getPlayerPKMN()[1]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterPlayerP2()
	{
		lblPlayerHPCalcP2.setText(CurrentSimData.getPlayerPKMN()[1].getHp()+"");
		lblPlayerAttackCalcP2.setText(CurrentSimData.getPlayerPKMN()[1].getAttack()+"");
		lblPlayerDefenseCalcP2.setText(CurrentSimData.getPlayerPKMN()[1].getDefense()+"");
		lblPlayerSpAttackCalcP2.setText(CurrentSimData.getPlayerPKMN()[1].getSpAttack()+"");
		lblPlayerSpDefenseCalcP2.setText(CurrentSimData.getPlayerPKMN()[1].getSpDefense()+"");
		lblPlayerSpeedCalcP2.setText(CurrentSimData.getPlayerPKMN()[1].getSpeed()+"");
		contentPane.repaint();
	}

	public static void playerEVCheckP2()
	{
		int total = (int) (CurrentSimData.getPlayerPKMN()[1].getEvHp() +
				CurrentSimData.getPlayerPKMN()[1].getEvAttack() +
				CurrentSimData.getPlayerPKMN()[1].getEvDefense() +
				CurrentSimData.getPlayerPKMN()[1].getEvSpAttack() +
				CurrentSimData.getPlayerPKMN()[1].getEvSpDefense() +
				CurrentSimData.getPlayerPKMN()[1].getEvSpeed());
		
		lblPlayerEVsAvailableP2.setText(510-total+"");
		playerEVtotalP2 = 510-total;
	}
	
	private void playerGenderCheckP2(JRadioButton rdbtnPlayerMale,
			JRadioButton rdbtnPlayerFemale,
			JRadioButton rdbtnPlayerGenderless) {
		if(playerGenderGroupP2.getSelection() == rdbtnPlayerMale)
		{
			CurrentSimData.getPlayerPKMN()[1].setGender(Pokemon.MALE);
		}
		else if(playerGenderGroupP2.getSelection() == rdbtnPlayerFemale)
		{
			CurrentSimData.getPlayerPKMN()[1].setGender(Pokemon.FEMALE);
		}
		else if(playerGenderGroupP2.getSelection() == rdbtnPlayerGenderless)
		{
			CurrentSimData.getPlayerPKMN()[1].setGender(Pokemon.GENDERLESS);
		}
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public static void playerPPCheckP3()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getPlayerPKMN()[2].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getPlayerPKMN()[2].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getPlayerPKMN()[2]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getPlayerPKMN()[2]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterPlayerP3()
	{
		lblPlayerHPCalcP3.setText(CurrentSimData.getPlayerPKMN()[2].getHp()+"");
		lblPlayerAttackCalcP3.setText(CurrentSimData.getPlayerPKMN()[2].getAttack()+"");
		lblPlayerDefenseCalcP3.setText(CurrentSimData.getPlayerPKMN()[2].getDefense()+"");
		lblPlayerSpAttackCalcP3.setText(CurrentSimData.getPlayerPKMN()[2].getSpAttack()+"");
		lblPlayerSpDefenseCalcP3.setText(CurrentSimData.getPlayerPKMN()[2].getSpDefense()+"");
		lblPlayerSpeedCalcP3.setText(CurrentSimData.getPlayerPKMN()[2].getSpeed()+"");
		contentPane.repaint();
	}

	public static void playerEVCheckP3()
	{
		int total = (int) (CurrentSimData.getPlayerPKMN()[2].getEvHp() +
				CurrentSimData.getPlayerPKMN()[2].getEvAttack() +
				CurrentSimData.getPlayerPKMN()[2].getEvDefense() +
				CurrentSimData.getPlayerPKMN()[2].getEvSpAttack() +
				CurrentSimData.getPlayerPKMN()[2].getEvSpDefense() +
				CurrentSimData.getPlayerPKMN()[2].getEvSpeed());
		
		lblPlayerEVsAvailableP3.setText(510-total+"");
		playerEVtotalP3 = 510-total;
	}
	
	private void playerGenderCheckP3(JRadioButton rdbtnPlayerMale,
			JRadioButton rdbtnPlayerFemale,
			JRadioButton rdbtnPlayerGenderless) {
		if(playerGenderGroupP3.getSelection() == rdbtnPlayerMale)
		{
			CurrentSimData.getPlayerPKMN()[2].setGender(Pokemon.MALE);
		}
		else if(playerGenderGroupP3.getSelection() == rdbtnPlayerFemale)
		{
			CurrentSimData.getPlayerPKMN()[2].setGender(Pokemon.FEMALE);
		}
		else if(playerGenderGroupP3.getSelection() == rdbtnPlayerGenderless)
		{
			CurrentSimData.getPlayerPKMN()[2].setGender(Pokemon.GENDERLESS);
		}
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public static void playerPPCheckP4()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getPlayerPKMN()[3].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getPlayerPKMN()[3].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getPlayerPKMN()[3]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getPlayerPKMN()[3]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterPlayerP4()
	{
		lblPlayerHPCalcP4.setText(CurrentSimData.getPlayerPKMN()[3].getHp()+"");
		lblPlayerAttackCalcP4.setText(CurrentSimData.getPlayerPKMN()[3].getAttack()+"");
		lblPlayerDefenseCalcP4.setText(CurrentSimData.getPlayerPKMN()[3].getDefense()+"");
		lblPlayerSpAttackCalcP4.setText(CurrentSimData.getPlayerPKMN()[3].getSpAttack()+"");
		lblPlayerSpDefenseCalcP4.setText(CurrentSimData.getPlayerPKMN()[3].getSpDefense()+"");
		lblPlayerSpeedCalcP4.setText(CurrentSimData.getPlayerPKMN()[3].getSpeed()+"");
		contentPane.repaint();
	}

	public static void playerEVCheckP4()
	{
		int total = (int) (CurrentSimData.getPlayerPKMN()[3].getEvHp() +
				CurrentSimData.getPlayerPKMN()[3].getEvAttack() +
				CurrentSimData.getPlayerPKMN()[3].getEvDefense() +
				CurrentSimData.getPlayerPKMN()[3].getEvSpAttack() +
				CurrentSimData.getPlayerPKMN()[3].getEvSpDefense() +
				CurrentSimData.getPlayerPKMN()[3].getEvSpeed());
		
		lblPlayerEVsAvailableP4.setText(510-total+"");
		playerEVtotalP4 = 510-total;
	}
	
	private void playerGenderCheckP4(JRadioButton rdbtnPlayerMale,
			JRadioButton rdbtnPlayerFemale,
			JRadioButton rdbtnPlayerGenderless) {
		if(playerGenderGroupP4.getSelection() == rdbtnPlayerMale)
		{
			CurrentSimData.getPlayerPKMN()[3].setGender(Pokemon.MALE);
		}
		else if(playerGenderGroupP4.getSelection() == rdbtnPlayerFemale)
		{
			CurrentSimData.getPlayerPKMN()[3].setGender(Pokemon.FEMALE);
		}
		else if(playerGenderGroupP4.getSelection() == rdbtnPlayerGenderless)
		{
			CurrentSimData.getPlayerPKMN()[3].setGender(Pokemon.GENDERLESS);
		}
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public static void playerPPCheckP5()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getPlayerPKMN()[4].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getPlayerPKMN()[4].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getPlayerPKMN()[4]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getPlayerPKMN()[4]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterPlayerP5()
	{
		lblPlayerHPCalcP5.setText(CurrentSimData.getPlayerPKMN()[4].getHp()+"");
		lblPlayerAttackCalcP5.setText(CurrentSimData.getPlayerPKMN()[4].getAttack()+"");
		lblPlayerDefenseCalcP5.setText(CurrentSimData.getPlayerPKMN()[4].getDefense()+"");
		lblPlayerSpAttackCalcP5.setText(CurrentSimData.getPlayerPKMN()[4].getSpAttack()+"");
		lblPlayerSpDefenseCalcP5.setText(CurrentSimData.getPlayerPKMN()[4].getSpDefense()+"");
		lblPlayerSpeedCalcP5.setText(CurrentSimData.getPlayerPKMN()[4].getSpeed()+"");
		contentPane.repaint();
	}

	public static void playerEVCheckP5()
	{
		int total = (int) (CurrentSimData.getPlayerPKMN()[4].getEvHp() +
				CurrentSimData.getPlayerPKMN()[4].getEvAttack() +
				CurrentSimData.getPlayerPKMN()[4].getEvDefense() +
				CurrentSimData.getPlayerPKMN()[4].getEvSpAttack() +
				CurrentSimData.getPlayerPKMN()[4].getEvSpDefense() +
				CurrentSimData.getPlayerPKMN()[4].getEvSpeed());
		
		lblPlayerEVsAvailableP5.setText(510-total+"");
		playerEVtotalP5 = 510-total;
	}
	
	private void playerGenderCheckP5(JRadioButton rdbtnPlayerMale,
			JRadioButton rdbtnPlayerFemale,
			JRadioButton rdbtnPlayerGenderless) {
		if(playerGenderGroupP5.getSelection() == rdbtnPlayerMale)
		{
			CurrentSimData.getPlayerPKMN()[4].setGender(Pokemon.MALE);
		}
		else if(playerGenderGroupP5.getSelection() == rdbtnPlayerFemale)
		{
			CurrentSimData.getPlayerPKMN()[4].setGender(Pokemon.FEMALE);
		}
		else if(playerGenderGroupP5.getSelection() == rdbtnPlayerGenderless)
		{
			CurrentSimData.getPlayerPKMN()[4].setGender(Pokemon.GENDERLESS);
		}
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public static void playerPPCheckP6()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getPlayerPKMN()[5].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getPlayerPKMN()[5].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getPlayerPKMN()[5]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getPlayerPKMN()[5]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterPlayerP6()
	{
		lblPlayerHPCalcP6.setText(CurrentSimData.getPlayerPKMN()[5].getHp()+"");
		lblPlayerAttackCalcP6.setText(CurrentSimData.getPlayerPKMN()[5].getAttack()+"");
		lblPlayerDefenseCalcP6.setText(CurrentSimData.getPlayerPKMN()[5].getDefense()+"");
		lblPlayerSpAttackCalcP6.setText(CurrentSimData.getPlayerPKMN()[5].getSpAttack()+"");
		lblPlayerSpDefenseCalcP6.setText(CurrentSimData.getPlayerPKMN()[5].getSpDefense()+"");
		lblPlayerSpeedCalcP6.setText(CurrentSimData.getPlayerPKMN()[5].getSpeed()+"");
		contentPane.repaint();
	}

	public static void playerEVCheckP6()
	{
		int total = (int) (CurrentSimData.getPlayerPKMN()[5].getEvHp() +
				CurrentSimData.getPlayerPKMN()[5].getEvAttack() +
				CurrentSimData.getPlayerPKMN()[5].getEvDefense() +
				CurrentSimData.getPlayerPKMN()[5].getEvSpAttack() +
				CurrentSimData.getPlayerPKMN()[5].getEvSpDefense() +
				CurrentSimData.getPlayerPKMN()[5].getEvSpeed());
		
		lblPlayerEVsAvailableP6.setText(510-total+"");
		playerEVtotalP6 = 510-total;
	}
	
	private void playerGenderCheckP6(JRadioButton rdbtnPlayerMale,
			JRadioButton rdbtnPlayerFemale,
			JRadioButton rdbtnPlayerGenderless) {
		if(playerGenderGroupP6.getSelection() == rdbtnPlayerMale)
		{
			CurrentSimData.getPlayerPKMN()[5].setGender(Pokemon.MALE);
		}
		else if(playerGenderGroupP6.getSelection() == rdbtnPlayerFemale)
		{
			CurrentSimData.getPlayerPKMN()[5].setGender(Pokemon.FEMALE);
		}
		else if(playerGenderGroupP6.getSelection() == rdbtnPlayerGenderless)
		{
			CurrentSimData.getPlayerPKMN()[5].setGender(Pokemon.GENDERLESS);
		}
	}
	
	public static void opponentPPCheckP1()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getOpponentPKMN()[0].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getOpponentPKMN()[0].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getOpponentPKMN()[0]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getOpponentPKMN()[0]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterOpponentP1()
	{
		lblOpponentHPCalcP1.setText(CurrentSimData.getOpponentPKMN()[0].getHp()+"");
		lblOpponentAttackCalcP1.setText(CurrentSimData.getOpponentPKMN()[0].getAttack()+"");
		lblOpponentDefenseCalcP1.setText(CurrentSimData.getOpponentPKMN()[0].getDefense()+"");
		lblOpponentSpAttackCalcP1.setText(CurrentSimData.getOpponentPKMN()[0].getSpAttack()+"");
		lblOpponentSpDefenseCalcP1.setText(CurrentSimData.getOpponentPKMN()[0].getSpDefense()+"");
		lblOpponentSpeedCalcP1.setText(CurrentSimData.getOpponentPKMN()[0].getSpeed()+"");
		contentPane.repaint();
	}

	public static void opponentEVCheckP1()
	{
		int total = (int) (CurrentSimData.getOpponentPKMN()[0].getEvHp() +
				CurrentSimData.getOpponentPKMN()[0].getEvAttack() +
				CurrentSimData.getOpponentPKMN()[0].getEvDefense() +
				CurrentSimData.getOpponentPKMN()[0].getEvSpAttack() +
				CurrentSimData.getOpponentPKMN()[0].getEvSpDefense() +
				CurrentSimData.getOpponentPKMN()[0].getEvSpeed());
		
		lblOpponentEVsAvailableP1.setText(510-total+"");
		opponentEVtotalP1 = 510-total;
	}
	
	private void opponentGenderCheckP1(JRadioButton rdbtnOpponentMale,
			JRadioButton rdbtnOpponentFemale,
			JRadioButton rdbtnOpponentGenderless) {
		if(opponentGenderGroupP1.getSelection() == rdbtnOpponentMale)
		{
			CurrentSimData.getOpponentPKMN()[0].setGender(Pokemon.MALE);
		}
		else if(opponentGenderGroupP1.getSelection() == rdbtnOpponentFemale)
		{
			CurrentSimData.getOpponentPKMN()[0].setGender(Pokemon.FEMALE);
		}
		else if(opponentGenderGroupP1.getSelection() == rdbtnOpponentGenderless)
		{
			CurrentSimData.getOpponentPKMN()[0].setGender(Pokemon.GENDERLESS);
		}
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public static void opponentPPCheckP2()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getOpponentPKMN()[1].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getOpponentPKMN()[1].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getOpponentPKMN()[1]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getOpponentPKMN()[1]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterOpponentP2()
	{
		lblOpponentHPCalcP2.setText(CurrentSimData.getOpponentPKMN()[1].getHp()+"");
		lblOpponentAttackCalcP2.setText(CurrentSimData.getOpponentPKMN()[1].getAttack()+"");
		lblOpponentDefenseCalcP2.setText(CurrentSimData.getOpponentPKMN()[1].getDefense()+"");
		lblOpponentSpAttackCalcP2.setText(CurrentSimData.getOpponentPKMN()[1].getSpAttack()+"");
		lblOpponentSpDefenseCalcP2.setText(CurrentSimData.getOpponentPKMN()[1].getSpDefense()+"");
		lblOpponentSpeedCalcP2.setText(CurrentSimData.getOpponentPKMN()[1].getSpeed()+"");
		contentPane.repaint();
	}

	public static void opponentEVCheckP2()
	{
		int total = (int) (CurrentSimData.getOpponentPKMN()[1].getEvHp() +
				CurrentSimData.getOpponentPKMN()[1].getEvAttack() +
				CurrentSimData.getOpponentPKMN()[1].getEvDefense() +
				CurrentSimData.getOpponentPKMN()[1].getEvSpAttack() +
				CurrentSimData.getOpponentPKMN()[1].getEvSpDefense() +
				CurrentSimData.getOpponentPKMN()[1].getEvSpeed());
		
		lblOpponentEVsAvailableP2.setText(510-total+"");
		opponentEVtotalP2 = 510-total;
	}
	
	private void opponentGenderCheckP2(JRadioButton rdbtnOpponentMale,
			JRadioButton rdbtnOpponentFemale,
			JRadioButton rdbtnOpponentGenderless) {
		if(opponentGenderGroupP2.getSelection() == rdbtnOpponentMale)
		{
			CurrentSimData.getOpponentPKMN()[1].setGender(Pokemon.MALE);
		}
		else if(opponentGenderGroupP2.getSelection() == rdbtnOpponentFemale)
		{
			CurrentSimData.getOpponentPKMN()[1].setGender(Pokemon.FEMALE);
		}
		else if(opponentGenderGroupP2.getSelection() == rdbtnOpponentGenderless)
		{
			CurrentSimData.getOpponentPKMN()[1].setGender(Pokemon.GENDERLESS);
		}
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public static void opponentPPCheckP3()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getOpponentPKMN()[2].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getOpponentPKMN()[2].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getOpponentPKMN()[2]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getOpponentPKMN()[2]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterOpponentP3()
	{
		lblOpponentHPCalcP3.setText(CurrentSimData.getOpponentPKMN()[2].getHp()+"");
		lblOpponentAttackCalcP3.setText(CurrentSimData.getOpponentPKMN()[2].getAttack()+"");
		lblOpponentDefenseCalcP3.setText(CurrentSimData.getOpponentPKMN()[2].getDefense()+"");
		lblOpponentSpAttackCalcP3.setText(CurrentSimData.getOpponentPKMN()[2].getSpAttack()+"");
		lblOpponentSpDefenseCalcP3.setText(CurrentSimData.getOpponentPKMN()[2].getSpDefense()+"");
		lblOpponentSpeedCalcP3.setText(CurrentSimData.getOpponentPKMN()[2].getSpeed()+"");
	}

	public static void opponentEVCheckP3()
	{
		int total = (int) (CurrentSimData.getOpponentPKMN()[2].getEvHp() +
				CurrentSimData.getOpponentPKMN()[2].getEvAttack() +
				CurrentSimData.getOpponentPKMN()[2].getEvDefense() +
				CurrentSimData.getOpponentPKMN()[2].getEvSpAttack() +
				CurrentSimData.getOpponentPKMN()[2].getEvSpDefense() +
				CurrentSimData.getOpponentPKMN()[2].getEvSpeed());
		
		lblOpponentEVsAvailableP3.setText(510-total+"");
		opponentEVtotalP3 = 510-total;
	}
	
	private void opponentGenderCheckP3(JRadioButton rdbtnOpponentMale,
			JRadioButton rdbtnOpponentFemale,
			JRadioButton rdbtnOpponentGenderless) {
		if(opponentGenderGroupP3.getSelection() == rdbtnOpponentMale)
		{
			CurrentSimData.getOpponentPKMN()[2].setGender(Pokemon.MALE);
		}
		else if(opponentGenderGroupP3.getSelection() == rdbtnOpponentFemale)
		{
			CurrentSimData.getOpponentPKMN()[2].setGender(Pokemon.FEMALE);
		}
		else if(opponentGenderGroupP3.getSelection() == rdbtnOpponentGenderless)
		{
			CurrentSimData.getOpponentPKMN()[2].setGender(Pokemon.GENDERLESS);
		}
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public static void opponentPPCheckP4()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getOpponentPKMN()[3].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getOpponentPKMN()[3].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getOpponentPKMN()[3]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getOpponentPKMN()[3]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterOpponentP4()
	{
		lblOpponentHPCalcP4.setText(CurrentSimData.getOpponentPKMN()[3].getHp()+"");
		lblOpponentAttackCalcP4.setText(CurrentSimData.getOpponentPKMN()[3].getAttack()+"");
		lblOpponentDefenseCalcP4.setText(CurrentSimData.getOpponentPKMN()[3].getDefense()+"");
		lblOpponentSpAttackCalcP4.setText(CurrentSimData.getOpponentPKMN()[3].getSpAttack()+"");
		lblOpponentSpDefenseCalcP4.setText(CurrentSimData.getOpponentPKMN()[3].getSpDefense()+"");
		lblOpponentSpeedCalcP4.setText(CurrentSimData.getOpponentPKMN()[3].getSpeed()+"");
	}

	public static void opponentEVCheckP4()
	{
		int total = (int) (CurrentSimData.getOpponentPKMN()[3].getEvHp() +
				CurrentSimData.getOpponentPKMN()[3].getEvAttack() +
				CurrentSimData.getOpponentPKMN()[3].getEvDefense() +
				CurrentSimData.getOpponentPKMN()[3].getEvSpAttack() +
				CurrentSimData.getOpponentPKMN()[3].getEvSpDefense() +
				CurrentSimData.getOpponentPKMN()[3].getEvSpeed());
		
		lblOpponentEVsAvailableP4.setText(510-total+"");
		opponentEVtotalP4 = 510-total;
	}
	
	private void opponentGenderCheckP4(JRadioButton rdbtnOpponentMale,
			JRadioButton rdbtnOpponentFemale,
			JRadioButton rdbtnOpponentGenderless) {
		if(opponentGenderGroupP4.getSelection() == rdbtnOpponentMale)
		{
			CurrentSimData.getOpponentPKMN()[3].setGender(Pokemon.MALE);
		}
		else if(opponentGenderGroupP4.getSelection() == rdbtnOpponentFemale)
		{
			CurrentSimData.getOpponentPKMN()[3].setGender(Pokemon.FEMALE);
		}
		else if(opponentGenderGroupP4.getSelection() == rdbtnOpponentGenderless)
		{
			CurrentSimData.getOpponentPKMN()[3].setGender(Pokemon.GENDERLESS);
		}
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public static void opponentPPCheckP5()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getOpponentPKMN()[4].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getOpponentPKMN()[4].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getOpponentPKMN()[4]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getOpponentPKMN()[4]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterOpponentP5()
	{
		lblOpponentHPCalcP5.setText(CurrentSimData.getOpponentPKMN()[4].getHp()+"");
		lblOpponentAttackCalcP5.setText(CurrentSimData.getOpponentPKMN()[4].getAttack()+"");
		lblOpponentDefenseCalcP5.setText(CurrentSimData.getOpponentPKMN()[4].getDefense()+"");
		lblOpponentSpAttackCalcP5.setText(CurrentSimData.getOpponentPKMN()[4].getSpAttack()+"");
		lblOpponentSpDefenseCalcP5.setText(CurrentSimData.getOpponentPKMN()[4].getSpDefense()+"");
		lblOpponentSpeedCalcP5.setText(CurrentSimData.getOpponentPKMN()[4].getSpeed()+"");
	}

	public static void opponentEVCheckP5()
	{
		int total = (int) (CurrentSimData.getOpponentPKMN()[4].getEvHp() +
				CurrentSimData.getOpponentPKMN()[4].getEvAttack() +
				CurrentSimData.getOpponentPKMN()[4].getEvDefense() +
				CurrentSimData.getOpponentPKMN()[4].getEvSpAttack() +
				CurrentSimData.getOpponentPKMN()[4].getEvSpDefense() +
				CurrentSimData.getOpponentPKMN()[4].getEvSpeed());
		
		lblOpponentEVsAvailableP5.setText(510-total+"");
		opponentEVtotalP5 = 510-total;
	}
	
	private void opponentGenderCheckP5(JRadioButton rdbtnOpponentMale,
			JRadioButton rdbtnOpponentFemale,
			JRadioButton rdbtnOpponentGenderless) {
		if(opponentGenderGroupP5.getSelection() == rdbtnOpponentMale)
		{
			CurrentSimData.getOpponentPKMN()[4].setGender(Pokemon.MALE);
		}
		else if(opponentGenderGroupP5.getSelection() == rdbtnOpponentFemale)
		{
			CurrentSimData.getOpponentPKMN()[4].setGender(Pokemon.FEMALE);
		}
		else if(opponentGenderGroupP5.getSelection() == rdbtnOpponentGenderless)
		{
			CurrentSimData.getOpponentPKMN()[4].setGender(Pokemon.GENDERLESS);
		}
	}
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public static void opponentPPCheckP6()
	{
		int i = 0;
		while(i < 4)
		{
			if(CurrentSimData.getOpponentPKMN()[5].getMoveFromPokemon(i).getCurrentPP() == 0 && !(CurrentSimData.getOpponentPKMN()[5].getMoveFromPokemon(i) instanceof None));
			{
				CurrentSimData.getOpponentPKMN()[5]
						.getMoveFromPokemon(i)
						.setCurrentPP(
								CurrentSimData.getOpponentPKMN()[5]
										.getMoveFromPokemon(i).getPp());
			}
			i++;
		}
	}
	public static void statLabelUpdaterOpponentP6()
	{
		lblOpponentHPCalcP6.setText(CurrentSimData.getOpponentPKMN()[5].getHp()+"");
		lblOpponentAttackCalcP6.setText(CurrentSimData.getOpponentPKMN()[5].getAttack()+"");
		lblOpponentDefenseCalcP6.setText(CurrentSimData.getOpponentPKMN()[5].getDefense()+"");
		lblOpponentSpAttackCalcP6.setText(CurrentSimData.getOpponentPKMN()[5].getSpAttack()+"");
		lblOpponentSpDefenseCalcP6.setText(CurrentSimData.getOpponentPKMN()[5].getSpDefense()+"");
		lblOpponentSpeedCalcP6.setText(CurrentSimData.getOpponentPKMN()[5].getSpeed()+"");
	}

	public static void opponentEVCheckP6()
	{
		int total = (int) (CurrentSimData.getOpponentPKMN()[5].getEvHp() +
				CurrentSimData.getOpponentPKMN()[5].getEvAttack() +
				CurrentSimData.getOpponentPKMN()[5].getEvDefense() +
				CurrentSimData.getOpponentPKMN()[5].getEvSpAttack() +
				CurrentSimData.getOpponentPKMN()[5].getEvSpDefense() +
				CurrentSimData.getOpponentPKMN()[5].getEvSpeed());
		
		lblOpponentEVsAvailableP6.setText(510-total+"");
		opponentEVtotalP6 = 510-total;
	}
	
	private void opponentGenderCheckP6(JRadioButton rdbtnOpponentMale,
			JRadioButton rdbtnOpponentFemale,
			JRadioButton rdbtnOpponentGenderless) {
		if(opponentGenderGroupP6.getSelection() == rdbtnOpponentMale)
		{
			CurrentSimData.getOpponentPKMN()[5].setGender(Pokemon.MALE);
		}
		else if(opponentGenderGroupP6.getSelection() == rdbtnOpponentFemale)
		{
			CurrentSimData.getOpponentPKMN()[5].setGender(Pokemon.FEMALE);
		}
		else if(opponentGenderGroupP6.getSelection() == rdbtnOpponentGenderless)
		{
			CurrentSimData.getOpponentPKMN()[5].setGender(Pokemon.GENDERLESS);
		}
	}
}