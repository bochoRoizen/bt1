package ahorcado;

import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

public class ahorcado {
	
	

	protected Shell shell;
	private Text txtPalabra;
	private Label lblAhorcadoGrafico;
	private Button btnEmpezar;
	private Label lblPalabraAdivinar;
	private Label lblLog;
	
	private int numVidas = 0;
	private Button btnA;
	private Button btnB;
	private Button btnC;
	private Button btnE;
	private Button btnF;
	private Button btnG;
	private Button btnI;
	private Button btnJ;
	private Button btnK;
	private Button btnM;
	private Button btnU;
	private Button btnP;
	private Button btnS;
	private Button btnT;
	private Button btnQ;
	private Button btnR;
	private Button btnO;
	private Button btnN;
	private Button btnV;
	private Button btnY;
	private Button btnZ;
	private Button btnÑ;
	private Button btnX;
	private Button btnW;
	private Button btnD;
	private Button btnH;
	private Button btnL;
	private String palabraSecreta;
	private char[] palabraDisplay;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ahorcado window = new ahorcado();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		
		//String[] ahorcadoGraficos = graficos.ahorcadoGraficos;
		
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		lblAhorcadoGrafico = new Label(shell, SWT.NONE);
		lblAhorcadoGrafico.setBounds(329, 10, 72, 105);
		lblAhorcadoGrafico.setVisible(false);
		
		btnEmpezar = new Button(shell, SWT.NONE);
		btnEmpezar.setBounds(169, 146, 75, 25);
		btnEmpezar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Juego(txtPalabra.getText());
			}
		});
		btnEmpezar.setText("Empezar");
		
		txtPalabra = new Text(shell, SWT.BORDER | SWT.PASSWORD);
		txtPalabra.setBounds(103, 119, 210, 21);
		txtPalabra.setToolTipText("palabra a adivinar");
		
		lblPalabraAdivinar = new Label(shell, SWT.NONE);
		lblPalabraAdivinar.setAlignment(SWT.RIGHT);
		lblPalabraAdivinar.setBounds(202, 94, 121, 15);
		
		lblLog = new Label(shell, SWT.WRAP);
		lblLog.setBounds(103, 177, 210, 64);
		lblLog.setAlignment(SWT.CENTER);
		
		btnA = new Button(shell, SWT.NONE);
		btnA.setBounds(20, 10, 20, 25);
		btnA.setText("A");
		
		btnB = new Button(shell, SWT.NONE);
		btnB.setText("B");
		btnB.setBounds(46, 10, 20, 25);
		
		btnC = new Button(shell, SWT.NONE);
		btnC.setText("C");
		btnC.setBounds(72, 10, 20, 25);
		
		btnE = new Button(shell, SWT.NONE);
		btnE.setText("E");
		btnE.setBounds(20, 41, 20, 25);
		
		btnF = new Button(shell, SWT.NONE);
		btnF.setText("F");
		btnF.setBounds(46, 41, 20, 25);
		
		btnG = new Button(shell, SWT.NONE);
		btnG.setText("G");
		btnG.setBounds(72, 41, 20, 25);
		
		btnI = new Button(shell, SWT.NONE);
		btnI.setText("I");
		btnI.setBounds(20, 72, 20, 25);
		
		btnJ = new Button(shell, SWT.NONE);
		btnJ.setText("J");
		btnJ.setBounds(46, 72, 20, 25);
		
		btnK = new Button(shell, SWT.NONE);
		btnK.setText("K");
		btnK.setBounds(72, 72, 20, 25);
		
		btnM = new Button(shell, SWT.NONE);
		btnM.setText("M");
		btnM.setBounds(20, 103, 20, 25);
		
		btnU = new Button(shell, SWT.NONE);
		btnU.setText("U");
		btnU.setBounds(72, 165, 20, 25);
		
		btnP = new Button(shell, SWT.NONE);
		btnP.setText("P");
		btnP.setBounds(20, 134, 20, 25);
		
		btnS = new Button(shell, SWT.NONE);
		btnS.setText("S");
		btnS.setBounds(20, 165, 20, 25);
		
		btnT = new Button(shell, SWT.NONE);
		btnT.setText("T");
		btnT.setBounds(46, 165, 20, 25);
		
		btnQ = new Button(shell, SWT.NONE);
		btnQ.setText("Q");
		btnQ.setBounds(46, 134, 20, 25);
		
		btnR = new Button(shell, SWT.NONE);
		btnR.setText("R");
		btnR.setBounds(72, 134, 20, 25);
		
		btnO = new Button(shell, SWT.NONE);
		btnO.setText("O");
		btnO.setBounds(72, 103, 20, 25);
		
		btnN = new Button(shell, SWT.NONE);
		btnN.setText("N");
		btnN.setBounds(46, 103, 20, 25);
		
		btnV = new Button(shell, SWT.NONE);
		btnV.setText("V");
		btnV.setBounds(20, 196, 20, 25);
		
		btnY = new Button(shell, SWT.NONE);
		btnY.setText("Y");
		btnY.setBounds(20, 227, 20, 25);
		
		btnZ = new Button(shell, SWT.NONE);
		btnZ.setText("Z");
		btnZ.setBounds(46, 227, 20, 25);
		
		btnÑ = new Button(shell, SWT.NONE);
		btnÑ.setText("Ñ");
		btnÑ.setBounds(72, 227, 20, 25);
		
		btnX = new Button(shell, SWT.NONE);
		btnX.setText("X");
		btnX.setBounds(72, 196, 20, 25);
		
		btnW = new Button(shell, SWT.NONE);
		btnW.setText("W");
		btnW.setBounds(46, 196, 20, 25);
		
		btnD = new Button(shell, SWT.NONE);
		btnD.setText("D");
		btnD.setBounds(98, 10, 20, 25);
		
		btnH = new Button(shell, SWT.NONE);
		btnH.setText("H");
		btnH.setBounds(98, 41, 20, 25);
		
		btnL = new Button(shell, SWT.NONE);
		btnL.setText("L");
		btnL.setBounds(98, 72, 20, 25);
		
		setUpLetterButton(btnA, 'A');
		setUpLetterButton(btnB, 'B');
		setUpLetterButton(btnC, 'C');
		setUpLetterButton(btnD, 'D');
		setUpLetterButton(btnE, 'E');
		setUpLetterButton(btnF, 'F');
		setUpLetterButton(btnG, 'G');
		setUpLetterButton(btnH, 'H');
		setUpLetterButton(btnI, 'I');
		setUpLetterButton(btnJ, 'J');
		setUpLetterButton(btnK, 'K');
		setUpLetterButton(btnL, 'L');
		setUpLetterButton(btnM, 'M');
		setUpLetterButton(btnN, 'N');
		setUpLetterButton(btnÑ, 'Ñ');
		setUpLetterButton(btnO, 'O');
		setUpLetterButton(btnP, 'P');
		setUpLetterButton(btnQ, 'Q');
		setUpLetterButton(btnR, 'R');
		setUpLetterButton(btnS, 'S');
		setUpLetterButton(btnT, 'T');
		setUpLetterButton(btnU, 'U');
		setUpLetterButton(btnV, 'V');
		setUpLetterButton(btnW, 'W');
		setUpLetterButton(btnX, 'X');
		setUpLetterButton(btnY, 'Y');
		setUpLetterButton(btnZ, 'Z');
		
		toggleLetterButtons(false);
		

	}
	
	private void toggleLetterButtons(boolean visible) {
	    Button[] letterButtons = {btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ, btnÑ};
	    for (Button btn : letterButtons) {
	        btn.setVisible(visible);
	    }
	}
	
	private void setUpLetterButton(Button btn, char letra) {
	    btn.addSelectionListener(new SelectionAdapter() {
	        @Override
	        public void widgetSelected(SelectionEvent e) {
	            actualizarPalabraAdivinar(letra, btn);
	        }
	    });
	}
	
	private void actualizarPalabraAdivinar(char letra, Button btnLetra) {
	    boolean acierto = false;
	    for (int i = 0; i < palabraSecreta.length(); i++) {
	        if (palabraSecreta.charAt(i) == letra) {
	            palabraDisplay[i] = letra;
	            acierto = true;
	        }
	    }

	    if (!acierto) {
	        numVidas++;
	        if(numVidas > 6) {
	            lblLog.setText("¡Juego terminado! La palabra era: " + palabraSecreta);
	        } else {
	        	lblAhorcadoGrafico.setText(graficos.ahorcadoGraficos[numVidas]);
	        }
	    }

	    lblPalabraAdivinar.setText(String.valueOf(palabraDisplay));

	    btnLetra.setVisible(false);

	    if (String.valueOf(palabraDisplay).equals(palabraSecreta)) {
		    lblAhorcadoGrafico.setVisible(false);
		    lblPalabraAdivinar.setVisible(false);
		    btnEmpezar.setVisible(true);
		    txtPalabra.setVisible(true);
		    lblLog.setText("");
	    	toggleLetterButtons(false);
	    	txtPalabra.setText("");
	        lblLog.setText("¡Has ganado!");
	    }
	}
	
	private void SetupJuego(String palabra) {
		
		numVidas = 0;
		
		palabraSecreta = palabra.toUpperCase();
	    palabraDisplay = new char[palabra.length()];
	    Arrays.fill(palabraDisplay, '_');
		
	    lblAhorcadoGrafico.setText(graficos.ahorcadoGraficos[0]);
	    lblAhorcadoGrafico.setVisible(true);
	    lblPalabraAdivinar.setText(String.valueOf(palabraDisplay));
	    lblPalabraAdivinar.setVisible(true);
	    btnEmpezar.setVisible(false);
	    txtPalabra.setVisible(false);
	    lblLog.setText("");
		toggleLetterButtons(true);
	}
	
	private int Juego(String palabra) {
		if(palabra.isBlank()) {
			lblLog.setText("Completa los espacios en blanco");
			return -1;
		}
		
		if(palabra.length() < 3 || palabra.length() > 25) {
			lblLog.setText("La palabra no puede ser mas corta que 3 letras o mas larga que 25 letras");
			return -1;
		}
		
		SetupJuego(palabra);
		
		return 0;
	}
}
