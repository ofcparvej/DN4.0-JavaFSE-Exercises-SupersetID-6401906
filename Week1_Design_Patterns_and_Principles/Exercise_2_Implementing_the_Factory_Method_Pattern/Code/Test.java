import DocumentFactoryAbstraction.DocumentFactory;
import Factories.PdfDocumentFactory;
import Factories.WordDocumentFactory;
import Factories.ExcelDocumentFactory;


public class Test {
    public static void main(String[] args) {
        DocumentFactory pdfDocument = new PdfDocumentFactory();
        DocumentFactory excelDocument = new ExcelDocumentFactory();
        DocumentFactory wordDocument = new WordDocumentFactory();

        pdfDocument.createDocument().open();     //pdf created and opened
        excelDocument.createDocument().open();   //word created and opened
        wordDocument.createDocument().open();    //excel created and opened
    }
}
