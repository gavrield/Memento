package memento;

public class DocMemento {
    private String content;
    private String fontName;
    private int fontSize;

    public DocMemento(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public boolean equals(Document document) {
        return this.getContent().equals(document.getContent())
                && this.getFontName().equals(document.getFontName())
                && this.getFontSize() == document.getFontSize();
    }
}
