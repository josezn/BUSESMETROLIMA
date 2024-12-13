package Procesos;

import FORMULARIOS.FrmInicioSesion;
import ENTIDADES.Usuario;

public class ProcesoIniciarSesion {
    public static Usuario LeerUsuario(FrmInicioSesion in){
       Usuario us =  new Usuario();
       us.setNomusuario(in.jtxtUsuario.getText());
       us.setContraseña(in.jtxtContraseña.getText());
       return us;
    } 
 public static void Presentacion(FrmInicioSesion in){
        in.setVisible(true);
        in.setTitle("Ingresa al sistema");
        in.setLocationRelativeTo(null);
    }
}
