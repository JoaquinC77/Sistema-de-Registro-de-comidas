package exportar;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.clases.Empresa;
import model.clases.Encargado;
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

    public void exportarExcel(JTable t1, JTable t2, JTable t3, String em, Encargado en, String fechaDesde, String fechaHasta) throws IOException {
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
                rellenarHoja(t1, t2, t3, hoja, em, fechaDesde, fechaHasta, en);

                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }

    private void rellenarHojaEmpresa(String fechaDesde, String fechaHasta) {

    }

    public void rellenarHoja(JTable t1, JTable t2, JTable t3, Sheet hoja, String nomEmpresa, String rangoFechaInicial, String rangoFechaFinal, Encargado encargado) {

        CellStyle headderStyle = libro.createCellStyle();
        Font font = libro.createFont();
        font.setItalic(true);
        font.setBoldweight(Font.BOLDWEIGHT_BOLD);
        headderStyle.setFont(font);
        headderStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        headderStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
        headderStyle.setAlignment(CellStyle.ALIGN_CENTER);

        CellStyle styleCeldas = libro.createCellStyle();

        Row filaTituloEmpresa = hoja.createRow(0);
        Cell celdaTNombreEmpresa = filaTituloEmpresa.createCell(0);
        Cell celdaTNombreRepre = filaTituloEmpresa.createCell(1);
        Cell celdaTRangoFechaInicio = filaTituloEmpresa.createCell(2);
        Cell celdaTRangoFechaFin = filaTituloEmpresa.createCell(3);

        celdaTNombreEmpresa.setCellValue("EMPRESA");
        celdaTNombreRepre.setCellValue("REPRESENTANTE");
        celdaTRangoFechaInicio.setCellValue("FECHA INICIAL DE CONSULTA");
        celdaTRangoFechaFin.setCellValue("FECHA FINAL DE CONSULTA");

        celdaTNombreEmpresa.setCellStyle(headderStyle);
        celdaTNombreRepre.setCellStyle(headderStyle);
        celdaTRangoFechaFin.setCellStyle(headderStyle);
        celdaTRangoFechaInicio.setCellStyle(headderStyle);

        Row filaPrimeraLineaDetallesEmpresayRangos = hoja.createRow(1);
        Cell celdaNombreEmpresa = filaPrimeraLineaDetallesEmpresayRangos.createCell(0);
        Cell celdaNombreRepre = filaPrimeraLineaDetallesEmpresayRangos.createCell(1);
        Cell celdaRangoFechaInicio = filaPrimeraLineaDetallesEmpresayRangos.createCell(2);
        Cell celdaRangoFechaFin = filaPrimeraLineaDetallesEmpresayRangos.createCell(3);

        celdaNombreEmpresa.setCellValue(nomEmpresa);
        celdaNombreRepre.setCellValue(encargado.getNombre());
        celdaRangoFechaInicio.setCellValue(rangoFechaInicial);
        celdaRangoFechaFin.setCellValue(rangoFechaFinal);

        hoja.createRow(3);

        for (int f = 3; f < t1.getRowCount() + 3; f++) {
            Row fila = hoja.createRow(f);
            for (int c = 0; c < t1.getColumnCount(); c++) {
                Cell celda = fila.createCell(c);
                celda.setCellStyle(headderStyle);
                if (f == 3) {
                    celda.setCellValue(t1.getColumnName(c));
                }
            }
        }
        int filaInicio = 4;
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

        //tabla dos deberia de empezar donde la otra termina
        for (int f = t1.getRowCount() + 6; f < t1.getRowCount() + t2.getRowCount() + 6; f++) {
            Row fila = hoja.createRow(f);
            for (int c = 0; c < t2.getColumnCount(); c++) {
                Cell celda = fila.createCell(c);
                celda.setCellStyle(headderStyle);
                if (f == t1.getRowCount() + 6) {
                    celda.setCellValue(t2.getColumnName(c));
                }
            }
        }

        //tabla dos ahora deberia de comenzar el contenido en la siguiente
        int filaInicioTabla2 = t1.getRowCount() + 7;
        for (int f = t1.getRowCount() + 7; f < t2.getRowCount() + t1.getRowCount() + 7; f++) {
            Row fila = hoja.createRow(filaInicioTabla2);
            filaInicioTabla2++;
            for (int fil = 0; fil < t2.getRowCount(); fil++) {
                for (int c = 0; c < t2.getColumnCount(); c++) {
                    Cell celda = fila.createCell(c);
                    celda.setCellStyle(styleCeldas);
                    if (t2.getValueAt(fil, c) instanceof Double) {
                        celda.setCellValue(Double.parseDouble(t2.getValueAt(fil, c).toString()));
                    } else if (t2.getValueAt(fil, c) instanceof Float) {
                        celda.setCellValue(Float.parseFloat((String) t2.getValueAt(fil, c)));
                    } else {
                        celda.setCellValue(String.valueOf(t2.getValueAt(fil, c)));
                    }
                }
            }
        }

        //tabla 3, la de los registros.
        for (int f = t1.getRowCount() + t2.getRowCount() + 9; f < t1.getRowCount() + t2.getRowCount() + t3.getRowCount() + 9; f++) {
            System.out.println(f);
            Row fila = hoja.createRow(f);
            for (int c = 0; c < t3.getColumnCount(); c++) {
                Cell celda = fila.createCell(c);
                celda.setCellStyle(headderStyle);
                if (f == t1.getRowCount() + t2.getRowCount() + 9) {
                    celda.setCellValue(t3.getColumnName(c));
                }
            }
        }

        //tabla dos ahora deberia de comenzar el contenido en la siguiente
        int filaRellenodeCampos = 0;
        int filaInicioTabla3 = t1.getRowCount() + t2.getRowCount() + 10;
        for (int f = t1.getRowCount() + t2.getRowCount() + 10; f < t1.getRowCount() + t2.getRowCount() + t3.getRowCount() + 10; f++) {

            Row fila = hoja.createRow(filaInicioTabla3);
            filaInicioTabla3++;
            
            System.out.println(filaRellenodeCampos);
            
            for (int c = 0; c < t3.getColumnCount(); c++) {
                Cell celda = fila.createCell(c);
                celda.setCellStyle(styleCeldas);
                if (t3.getValueAt(filaRellenodeCampos, c) instanceof Double) {
                    celda.setCellValue(Double.parseDouble(t3.getValueAt(filaRellenodeCampos, c).toString()));
                } else if (t3.getValueAt(filaRellenodeCampos, c) instanceof Float) {
                    celda.setCellValue(Float.parseFloat((String) t3.getValueAt(filaRellenodeCampos, c)));
                } else {
                    celda.setCellValue(String.valueOf(t3.getValueAt(filaRellenodeCampos, c)));
                }
            }
            
            filaRellenodeCampos++;

        }

    }

}
