package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sql_funcs {
	
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
	
	public ResultSet exec_query(String sql) {
		try {
			Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
			Statement comando=conexion.createStatement();
			ResultSet registro = comando.executeQuery(sql);
			conexion.close();
			return registro;
		} catch(SQLException ex){
			System.out.println(ex.toString());
		}
		return null;
	}
	
	
	public void insertar_usario_password(String usario, String password) {
		exec_update("insert into articulos(usario,password) values ('" + usario + "','" + password + "')");
	}
	
	public String[] consultar_codigo(int codigo) {
		String[] user = new String[2];
			try {
				ResultSet registro = exec_query(String.format("select user,password from articulos where codigo=%d", codigo));
				if (registro.next()==true) {
					user[0] = registro.getString("usario");
					user[1] = registro.getString("password");
				}
			} catch(SQLException ex) {
				System.out.println(ex.toString());
			}
		return user;
	}
	
	public int consultar_usario(String usario) {
		int codigo = 0;
		try {
			ResultSet registro = exec_query(String.format("select codigo from articulos where usario=\"%s\"", usario));
			if (registro.next()==true) {
				codigo = registro.getInt("codigo");
			}
		} catch(SQLException ex){
			System.out.println(ex.toString());
		}
		return codigo;
	}

}
