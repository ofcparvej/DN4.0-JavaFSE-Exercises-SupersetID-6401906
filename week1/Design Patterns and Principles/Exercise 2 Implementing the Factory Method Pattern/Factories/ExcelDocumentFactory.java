package Factories;

import DocumentAbstraction.Document;
import DocumentFactoryAbstraction.DocumentFactory;
import Documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument(){
        return new ExcelDocument();
    }
}
