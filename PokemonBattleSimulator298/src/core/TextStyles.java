package core;

import java.awt.Color;

import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;


public class TextStyles {

	private static StyleContext context = new StyleContext();
	private static Style turnStyle = context.addStyle("test", null);
	private static Style supereffectiveStyle = context.addStyle("test", null);
	private static Style notveryeffectiveStyle = context.addStyle("test", null);
	private static Style noeffectStyle = context.addStyle("test", null);
	private static Style statIncreaseStyle = context.addStyle("test", null);
	private static Style statDecreaseStyle = context.addStyle("test", null);

	public static void setStyles()
	{
		StyleConstants.setForeground(turnStyle, Color.WHITE);
		StyleConstants.setForeground(supereffectiveStyle, Color.GREEN);
		StyleConstants.setForeground(notveryeffectiveStyle, Color.YELLOW);
		StyleConstants.setForeground(noeffectStyle, Color.GRAY);
		StyleConstants.setForeground(statIncreaseStyle, Color.BLUE);
		StyleConstants.setForeground(statDecreaseStyle, Color.RED);
	}

	public static Style getTurnStyle() {
		return turnStyle;
	}

	public static void setTurnStyle(Style turnStyle) {
		TextStyles.turnStyle = turnStyle;
	}

	public static Style getSupereffectiveStyle() {
		return supereffectiveStyle;
	}

	public static void setSupereffectiveStyle(Style supereffectiveStyle) {
		TextStyles.supereffectiveStyle = supereffectiveStyle;
	}

	public static Style getNotveryeffectiveStyle() {
		return notveryeffectiveStyle;
	}

	public static void setNotveryeffectiveStyle(Style notveryeffectiveStyle) {
		TextStyles.notveryeffectiveStyle = notveryeffectiveStyle;
	}

	public static Style getNoeffectStyle() {
		return noeffectStyle;
	}

	public static void setNoeffectStyle(Style noeffectStyle) {
		TextStyles.noeffectStyle = noeffectStyle;
	}

	public static Style getStatIncreaseStyle() {
		return statIncreaseStyle;
	}

	public static void setStatIncreaseStyle(Style statIncreaseStyle) {
		TextStyles.statIncreaseStyle = statIncreaseStyle;
	}

	public static Style getStatDecreaseStyle() {
		return statDecreaseStyle;
	}

	public static void setStatDecreaseStyle(Style statDecreaseStyle) {
		TextStyles.statDecreaseStyle = statDecreaseStyle;
	}
}
