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
	
	public void insertar_usario_password(String usario, String password) {
		exec_update("insert into articulos(usario,password) values ('" + usario + "','" + password + "')");
	}
	
	public String[] consultar_codigo(int codigo) {
		String[] user = new String[2];
		try {
			Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
			Statement comando=conexion.createStatement();
			ResultSet registro = comando.executeQuery("select usario,password from articulos where codigo=" + codigo);
			if (registro.next()==true) {
				user[0] = registro.getString("usario");
				user[1] = registro.getString("password");
			} else {
				//System.out.println("No existe un artículo con dicho código");
			}
			conexion.close();
		} catch(SQLException ex){
			System.out.println(ex.toString());
		}
		return user;
	}
	
	public int consultar_usario(String usario) {
		int codigo = 0;
		try {
			Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root" ,"");
			Statement comando=conexion.createStatement();
			ResultSet registro = comando.executeQuery(String.format("select codigo from articulos where usario=\"%s\"", usario));
			if (registro.next()==true) {
				codigo = registro.getInt("codigo");
			} else {
				//System.out.println("No existe un artículo con dicho código");
			}
			conexion.close();
		} catch(SQLException ex){
			System.out.println(ex.toString());
		}
		return codigo;
	}

}
