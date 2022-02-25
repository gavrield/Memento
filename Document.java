package memento;

public class Document {
    private String content = "";
    private String fontName = "David";
    private int fontSize = 10;

    public DocMemento save(){
        return new DocMemento(this.getContent(), this.getFontName(), this.getFontSize());
    }
    public void restore(DocMemento docMemento){
        setContent(docMemento.getContent());
        setFontName(docMemento.getFontName());
        setFontSize(docMemento.getFontSize());
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{ " +
                "content: '" + content + '\'' +
                ", fontName: '" + fontName + '\'' +
                ", fontSize=" + fontSize +
                " }";
    }
}
