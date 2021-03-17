package exportar;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExportarExcel {

    public void exportarExcel(JTable t1, JTable t2, JTable t3) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("DETALLES DE CONTRATO");
                hoja.setDisplayGridlines(false);
                
                rellenarHoja(t1, hoja);
                
                Sheet hoja2 = libro.createSheet("RESUMEN DE COSTOS");
                hoja2.setDisplayGridlines(false);
                rellenarHoja(t2, hoja2);
                
                Sheet hoja3 = libro.createSheet("DETALLE DE COSTOS");
                hoja2.setDisplayGridlines(false);
                rellenarHoja(t3, hoja3);
                
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }

    public void rellenarHoja(JTable t1, Sheet hoja) {
        for (int f = 0; f < t1.getRowCount(); f++) {
            Row fila = hoja.createRow(f);
            for (int c = 0; c < t1.getColumnCount(); c++) {
                Cell celda = fila.createCell(c);
                if (f == 0) {
                    celda.setCellValue(t1.getColumnName(c));
                }
            }
        }
        int filaInicio = 1;
        for (int f = 0; f < t1.getRowCount(); f++) {
            Row fila = hoja.createRow(filaInicio);
            filaInicio++;
            for (int c = 0; c < t1.getColumnCount(); c++) {
                Cell celda = fila.createCell(c);
                if (t1.getValueAt(f, c) instanceof Double) {
                    celda.setCellValue(Double.parseDouble(t1.getValueAt(f, c).toString()));
                } else if (t1.getValueAt(f, c) instanceof Float) {
                    celda.setCellValue(Float.parseFloat((String) t1.getValueAt(f, c)));
                } else {
                    celda.setCellValue(String.valueOf(t1.getValueAt(f, c)));
                }
            }
        }
    }

}
