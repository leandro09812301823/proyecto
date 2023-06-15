/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujos;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.BaseColor;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
/**
 *
 * @author Leandro
 */
public class EjercicioPdf {
 Document doc = new Document();
 
 Font t1= new Font(Font.FontFamily.TIMES_ROMAN, 22, Font.BOLD,BaseColor.BLUE);
 Font t2= new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLDITALIC, BaseColor.BLUE);
 Font enca1=new Font(Font.Family.TIMES_ROMAN, 18, Font.Bold);
 Font enca2=new Font(Font.Family.TIMES_ROMAN, 16, Font.Bold);
 Font enca3=new Font(Font.Family.TIMES_ROMAN, 14, Font.Bold);
 Font enca4=new Font(Font.Family.TIMES_ROMAN, 12, Font.Bold);
 Font text=new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.Bold);
 
 //Procedimiento para creacion de PDF//
 public void creandoArchivoPDF(){
     abrirPDF();
     agregarPortada();
     agregarContenido();
     
     doc.close();
     
 }
 //procedimiento para abrir PDF//
 private void abrirPDF(){
     /*se llena a JFile para mostra
     caja de navegacion de archivos*/
     JFileChooser jf=new JFileChooser();
     jf.showSaveDialog(null);
     
     File file=jf.getSelectedFile();
     
     try{
         //se toma la ruta y la extension del archivo
         PdfWirder.getInstance(doc, new FileOutputStream(file.getAbsolutePath()+".pdf"));
     }catch(Exception e){
         
     }
    }
 //procedimiento para agregar espacios o lineas vacios
 private void lineasBlancas(Paragraph parrafo, int cantLineas){
     for (int i=0;i<cantLineas;i++){
         parrafo.add(new Paragraph(""));
     }
 }
//procedimiento para agregar portada al archivo
     private void agregarPortada(){
         doc.open();
         Paragraph titulo= new Paragraph("Investigando un nuevo concepto", t1);
         lineasBlancas(titulo, 8);
         Paragraph subtitulo=new Paragraph("Concepto A", t2);
         
         try{
             doc.add(titulo);
             doc.add(subtitulo);
         }catch(Exception e){
             
         }
 }
  //procedimiento para agregar contenido
     private void agregarContenido(){
         try{
             doc.newPage();
             
             Paragraph p=new Paragraph("Aprendo un nuevo concepto", enca1); 
             doc.add(p);
             
             p=new Paragraph("Sobre los gatos y su accionar", text);
             lineasBlancas(p,1);
             doc.add(p);
             
             p=new Paragraph("Evolucion", enca2);
             lineasBlancas(p,1);
             doc.add(p);
             
             p=new Paragraph("La evolucion de los seres humanos"
                     + "es algo maravilloso y transcendental"
                     + "de manera que es importante para todos"
                     + "conocer este tipo de informacion", text);
             p.setAlignment(Paragraph.ALIGN_JUSTIFIED);
             lineasBlancas(p, 3);
             doc.add(p);
             
             
             
             //HECHA POR MI//
             p=new Paragraph("En la radio, hay un pollito"
                     + "En la radio, hay un pollito"
                     + "El pollito pío, el pollito pío"
                     + "El pollito pío, el pollito pío"
                     + "El pollito pío, el pollito pío", text);
             p.setAlignment(Paragraph.ALIGN_CENTER);
             lineasBlancas(p, 4);
             doc.add(p);
         }catch(Exception e){
             
         }
     }
}
