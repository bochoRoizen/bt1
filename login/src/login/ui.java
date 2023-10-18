package login;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class ui {

	protected Shell shlBaseDeDatos;
	private Text textUser;
	private Text textPassword;
	private Label lblLogText;
	private Button btnLogin;
	private Button btnRegister;
	
	private static base_de_datos sql = new base_de_datos();
	private static validar_passwords validador = new validar_passwords();
	
	private String usuario, password;
	private int codigo = 0;
	
	private int log_count = 0;


	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ui window = new ui();
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
		shlBaseDeDatos.open();
		shlBaseDeDatos.layout();
		while (!shlBaseDeDatos.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		
		shlBaseDeDatos = new Shell();
		shlBaseDeDatos.setTouchEnabled(true);
		shlBaseDeDatos.setSize(308, 280);
		shlBaseDeDatos.setText("Base de datos de bocho uwu");
		
		Label lblUser = new Label(shlBaseDeDatos, SWT.NONE);
		lblUser.setAlignment(SWT.RIGHT);
		lblUser.setBounds(35, 44, 55, 15);
		lblUser.setText("user");
		
		Label lblPassword = new Label(shlBaseDeDatos, SWT.NONE);
		lblPassword.setAlignment(SWT.RIGHT);
		lblPassword.setBounds(35, 80, 55, 15);
		lblPassword.setText("password");
		
		textUser = new Text(shlBaseDeDatos, SWT.BORDER);
		textUser.setBounds(96, 41, 130, 21);
		
		textPassword = new Text(shlBaseDeDatos, SWT.BORDER | SWT.PASSWORD);
		textPassword.setBounds(96, 77, 130, 21);
		
		btnLogin = new Button(shlBaseDeDatos, SWT.NONE);
		btnLogin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				usuario = textUser.getText();				
				password = textPassword.getText();
				
				codigo = sql.consultar_usario(usuario);
				
				if(usuario.isBlank()) {
					log("Ingrese un usario");
					return;
				}
								
				if(codigo == 0) {
					log("No se encontro el usario");
					return;
				}
					
				if(password.equals(sql.consultar_codigo(codigo)[1])) {
					log("Se inicio sesion correctamente");
				} else {
					log("Combinacion usuario/contraseña incorrecta");
				}
			}
		});
		btnLogin.setBounds(70, 125, 75, 25);
		btnLogin.setText("login");
		
		btnRegister = new Button(shlBaseDeDatos, SWT.NONE);
		btnRegister.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {	
				usuario = textUser.getText();				
				password = textPassword.getText();
				
				if(usuario.isBlank() || password.isBlank()) {
					log("Completa los espacios en blanco");
					return;
				}
				
				if(sql.consultar_usario(usuario) != 0) {
					log("Ese usario ya existe");
					return;
				}
				
				if(!validador.validar(password)) {
					log("Password invalida: " + validador.validar_error(password));
					return;
				}
				
				sql.insertar_usario_password(usuario, password);
				log("Registrado correctamente");
			}
		});
		btnRegister.setText("register");
		btnRegister.setBounds(151, 125, 75, 25);
		
		Label lblLog = new Label(shlBaseDeDatos, SWT.NONE);
		lblLog.setAlignment(SWT.RIGHT);
		lblLog.setBounds(10, 161, 35, 15);
		lblLog.setText("log:");
		
		lblLogText = new Label(shlBaseDeDatos, SWT.WRAP);
		lblLogText.setBackground(SWTResourceManager.getColor(192, 192, 192));
		lblLogText.setBounds(51, 161, 208, 67);

	}
	
	public void log(String str) {
		// limpia el log cuando no queda mas espacio
		if(log_count >= 4) {
			lblLogText.setText("");
			log_count = 0;
		}
		lblLogText.setText(lblLogText.getText() + str + '\n');
		if(str.length()> 19) {
			log_count += Math.floorDiv(str.length(), 19);
		} else {
			log_count++;
		}
	}
}
