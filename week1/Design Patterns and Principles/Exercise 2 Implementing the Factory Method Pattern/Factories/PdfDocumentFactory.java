package Factories;

import DocumentAbstraction.Document;
import DocumentFactoryAbstraction.DocumentFactory;
import Documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument(){
        return new PdfDocument();
    }
}
