
package PROCESOS;
import ACCESODATOS.DAO_Tarjeta;
import ENTIDADES.Tarjeta;
import FORMULARIOS.FrmCrearTarjeta;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
public class ProcesoTarjeta {
    public static Tarjeta LeerTarjeta(FrmCrearTarjeta frp, String rutaImagen){
        Tarjeta tr = new Tarjeta();
        DAO_Tarjeta dao = new DAO_Tarjeta();
        int id_usuario = dao.idUsuario(frp.jtxtNombres.getText()+" "+frp.jtxtApellidos.getText());
        tr.setId_usuario(id_usuario);
        tr.setDni(frp.jtxtDni.getText());
        tr.setCorreo(frp.jtxtCorreo.getText());
        tr.setCelular(frp.jtxtCelular.getText());
        tr.setImagen(obtenerImagenDesdeVista(rutaImagen));
        return tr;
    }
    
    public static byte[] obtenerImagenDesdeVista(String rutaImagen) {
        try {
            File file = new File(rutaImagen); // Ruta de la imagen
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            fis.close();
            return bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al convertir la imagen.");
            return null;
        }
    }
}
