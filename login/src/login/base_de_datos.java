package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class base_de_datos {
	
	public void cargarDriver() {
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	    }catch(Exception ex) {
	      System.out.println(ex.toString());
	    }
	}
	
	public void exec_update(String sql) {
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
	        Statement comando = conexion.createStatement();
	        comando.executeUpdate(sql);	        
	        conexion.close();	 
		} catch(SQLException ex) {			
			System.out.println(ex.toString());
		}
	}
	
	public String exec_query(String query, String parameter) {
		String resultado = null;
		try {
			Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
			Statement comando=conexion.createStatement();
			ResultSet registro = comando.executeQuery(query);
			if (registro.next()) {
				resultado = registro.getString(parameter);
			}
			conexion.close();
		} catch(SQLException ex){
			System.out.println(ex.toString());
		}
		return resultado;
	}
	
	public void insertar_usario_password(String usario, String password) {
		exec_update("insert into articulos(usario,password) values ('" + usario + "','" + password + "')");
	}
	
	public String[] consultar_codigo(int codigo) {
		String usario, password;
		String[] user = new String[2];
		
		usario = exec_query("select usario from articulos where codigo=" + codigo, "usario");
		password = exec_query("select password from articulos where codigo=" + codigo, "password");
		
		user[0] = usario;
		user[1] = password;
		
		return user;
	}
	
	public int consultar_usario(String usario) {
		String query = exec_query(String.format("select codigo from articulos where usario=\"%s\"", usario), "codigo");
		if(query == null)
			return 0;
		return Integer.valueOf(query);
	}

}
