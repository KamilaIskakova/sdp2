public class WordFactory extends DocumentFactory{
    @Override
    public DocumentInterface createDocument() {
        return new WordDocument();
    }
}