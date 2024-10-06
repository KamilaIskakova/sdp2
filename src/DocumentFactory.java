public abstract class DocumentFactory {
    public abstract DocumentInterface createDocument();

    public void generateDoc(){
        DocumentInterface doc = createDocument();
        doc.createDoc();
    }
}