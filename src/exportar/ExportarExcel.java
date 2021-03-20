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
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExportarExcel {

    private Workbook libro;
    public static String rutaExcel;

    public void exportarExcel(JTable t1, JTable t2, JTable t3) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            rutaExcel = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(rutaExcel);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("DETALLES DE CONTRATO");
                hoja.setDisplayGridlines(false);
                hoja.setDefaultColumnWidth(25);
                rellenarHoja(t1, hoja);

                Sheet hoja2 = libro.createSheet("RESUMEN DE COSTOS");
                hoja2.setDisplayGridlines(false);
                hoja2.setDefaultColumnWidth(15);
                rellenarHoja(t2, hoja2);

                Sheet hoja3 = libro.createSheet("DETALLE DE COSTOS");
                hoja3.setDisplayGridlines(false);
                hoja3.setDefaultColumnWidth(25);
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
        CellStyle headderStyle = libro.createCellStyle();
        Font font = libro.createFont();
        font.setItalic(true);
        font.setBoldweight(Font.BOLDWEIGHT_BOLD);
        headderStyle.setFont(font);
        headderStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        headderStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
        headderStyle.setAlignment(CellStyle.ALIGN_CENTER);

        CellStyle styleCeldas = libro.createCellStyle();

        for (int f = 0; f < t1.getRowCount(); f++) {
            Row fila = hoja.createRow(f);
            for (int c = 0; c < t1.getColumnCount(); c++) {
                Cell celda = fila.createCell(c);
                celda.setCellStyle(headderStyle);
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
                celda.setCellStyle(styleCeldas);
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
