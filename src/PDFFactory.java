public class PDFFactory extends DocumentFactory{
    @Override
    public DocumentInterface createDocument() {
        return new PDFDocument();
    }
}