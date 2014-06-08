/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistema_para_administradores;
import javax.swing.JFrame;

/**
 *
 * @author christian
 */

/*
This class has some useful functions and small tricks
*/
public class coreApp {
    
    
    public String sucursal;    

    public void setWindowTitle(JFrame ventana, String titulo){ventana.setTitle(titulo);}
    public void setSucursal(String sucursal){this.sucursal = sucursal;}
    public String getSucursal(){return sucursal;}
    
}
