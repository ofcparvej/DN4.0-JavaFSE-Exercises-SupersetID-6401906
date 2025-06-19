package Factories;

import DocumentAbstraction.Document;
import DocumentFactoryAbstraction.DocumentFactory;
import Documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument(){
        return new WordDocument();
    }
}