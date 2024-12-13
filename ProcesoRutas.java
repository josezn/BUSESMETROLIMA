package Procesos;
import ENTIDADES.Ruta;
import ENTIDADES.RutaFavorita;
import FORMULARIOS.FrmRutasGenerales;
import FORMULARIOS.FrmFavoritos;
import FORMULARIOS.FrmBusqueda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
public class ProcesoRutas {
    

    
    public static void MostrarEnTablaRutas(FrmRutasGenerales flp, ArrayList<Ruta> Lista){
       String titulos[] = {"Num","ID","RUTA","PRIMERA ESTACION","ULTIMA ESTACION","HORARIO","DIAS"};
       DefaultTableModel mt = new DefaultTableModel(null,titulos);
       flp.jtblrutasgenerales.setModel(mt);
       for(int i = 0; i < Lista.size(); i++){
           mt.addRow(Lista.get(i).Registro(i+1));
       }
    }
    
    public static void MostrarEnTablaRutasFvaoritas(FrmFavoritos flp, ArrayList<Ruta> Lista){
       String titulos[] = {"Num","ID","RUTA","PRIMERA ESTACION","ULTIMA ESTACION","HORARIO","DIAS"};
       DefaultTableModel mt = new DefaultTableModel(null,titulos);
       flp.jtblFavoritos.setModel(mt);
       for(int i = 0; i < Lista.size(); i++){
           mt.addRow(Lista.get(i).Registro(i+1));
       }
    }

}

