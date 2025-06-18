package Documents;

import DocumentAbstraction.Document;

public class ExcelDocument extends Document {
    public void open(){
        System.out.println("Opening ExcelDocument File ");
    }
}