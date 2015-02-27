package speak;

public class Program {

	// alle Variablen und Methoden static, da sie nicht in der Main stehen wegen
	// der Übersicht
	private static String alph = "Hallo mein Name ist Jannis";
	private static String leet = "|-|4110 \\v/317"; // doppelter Backslash (\\)
													// wird benötigt, da \ zum
													// escapen von z.B.
													// Zeilenumbrüchen \n oder
													// tabs \t benutzt wird oder
													// um Sonderzeichen wie ""
													// im String
													// auszugeben
													// ("er sagte: \"Hallo!\"")
	private static String[][] alphabete = new String[27][2];
	

	public static void fuellen() { // Array wird befüllt mit dem Lateinischen
									// Alphabet
									// und den dazugehörigen 1337 Buchstaben
		alphabete[0][0] = "4";
		alphabete[0][1] = "A";
		// Platzhalter
		alphabete[1][0] = "13";
		alphabete[1][1] = "B";
		//
		alphabete[2][0] = "(";
		alphabete[2][1] = "C";
		//
		alphabete[3][0] = "[)";
		alphabete[3][1] = "D";
		//
		alphabete[4][0] = "3";
		alphabete[4][1] = "E";
		//
		alphabete[5][0] = "|=";
		alphabete[5][1] = "F";
		//
		alphabete[6][0] = "6";
		alphabete[6][1] = "G";
		//
		alphabete[7][0] = "|-|";
		alphabete[7][1] = "H";
		//
		alphabete[8][0] = "|";
		alphabete[8][1] = "I";
		//
		alphabete[9][0] = ".]";
		alphabete[9][1] = "J";
		//
		alphabete[10][0] = "|<";
		alphabete[10][1] = "K";
		//
		alphabete[11][0] = "1";
		alphabete[11][1] = "L";
		//
		alphabete[12][0] = "|\\/|";
		alphabete[12][1] = "M";
		//
		alphabete[13][0] = "/\\/";
		alphabete[13][1] = "N";
		//
		alphabete[14][0] = "0";
		alphabete[14][1] = "O";
		//
		alphabete[15][0] = "|>";
		alphabete[15][1] = "P";
		//
		alphabete[16][0] = "0,";
		alphabete[16][1] = "Q";
		//
		alphabete[17][0] = "|2";
		alphabete[17][1] = "R";
		//
		alphabete[18][0] = "5";
		alphabete[18][1] = "S";
		//
		alphabete[19][0] = "7";
		alphabete[19][1] = "T";
		//
		alphabete[20][0] = "|_|";
		alphabete[20][1] = "U";
		//
		alphabete[21][0] = "\\/";
		alphabete[21][1] = "V";
		//
		alphabete[22][0] = "\\v/";
		alphabete[22][1] = "W";
		//
		alphabete[23][0] = "}{";
		alphabete[23][1] = "X";
		//
		alphabete[24][0] = "`/";
		alphabete[24][1] = "Y";
		//
		alphabete[25][0] = "2";
		alphabete[25][1] = "Z";
		//
		alphabete[26][0] = " ";
		alphabete[26][1] = " ";
	}

	public static void alphabeteAusgeben() {
		for (int y = 0; y < 2; y++) {
			for (int x = 0; x < 27; x++) {
				System.out.print(alphabete[x][y] + " ");
			}
			System.out.println();
		}
	}

	public static void uebersetzungAusgeben(String[] uebersetzung) {
		for (int x = 0; x < uebersetzung.length; x++) {
			System.out.print(uebersetzung[x] + " ");
		}
		System.out.println();
	}

	public static void uebersetzenLatZuLeet() {
		alph = alph.toUpperCase();
		String[] uebersetzung = new String[alph.length()];
		for (int i = 0; i < alph.length(); i++) {
			for (int x = 0; x < alphabete.length; x++) {
				if (alphabete[x][1].contains(String.valueOf(alph.charAt(i)))) {
					uebersetzung[i] = alphabete[x][0];
				}
			}
		}
		uebersetzungAusgeben(uebersetzung);
	}

	public static void main(String[] Args) {
		fuellen();
		alphabeteAusgeben();
		uebersetzenLatZuLeet();
		alph="Jetzt nicht mehr";
		uebersetzenLatZuLeet();
	}

}
