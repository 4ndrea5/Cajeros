/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

/**
 * Clase que valida las credenciales del usuario.
 */
public class Validacion {
    String usuario;
    int password;
    Cuentas c  = new Cuentas();;
    
    /**
     * Constructor que inicializa la validación con las credenciales del usuario.
     *
     * @param usuario  El nombre de usuario.
     * @param password La contraseña del usuario.
     */
    public Validacion(String usuario, int password){
        this.usuario = usuario;
        this.password = password;
        
        
    }
    
    /**
     * Verifica si las credenciales del usuario existen en el sistema.
     *
     * @return true si las credenciales son válidas, false en caso contrario.
     */
    
    public boolean existe(){
        return c.comprobarUsuario(this.usuario, this.password);
    }
    
}
