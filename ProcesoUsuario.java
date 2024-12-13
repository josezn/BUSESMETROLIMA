package Procesos;
import ENTIDADES.Usuario;
import FORMULARIOS.FrmRegistrar;
public class ProcesoUsuario {
   
public static Usuario LeerUsuario(FrmRegistrar reg){
       Usuario us =  new Usuario();
       us.setNomape(reg.jtxtNomape.getText());
       us.setNomusuario(reg.jtxtNomUsuario.getText());
       us.setContraseña(reg.jtxtContraseña.getText());
       us.setCorreo(reg.jtxtCorreo.getText());
       return us;
    }

}
