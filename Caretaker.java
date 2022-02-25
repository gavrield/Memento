package memento;

import java.util.ArrayList;

public class Caretaker {
    private Document document = new Document();
    private ArrayList<DocMemento> history = new ArrayList<>();

    public void undo(){
        if(history.isEmpty()) {
            document = new Document();
            return;
        }
        int i = history.size() - 1;
        while(i >= 0){
            var memento = history.get(i);
            if(memento.equals(getDocument())){
                history.remove(i--);
                continue;
            }
            document.restore(memento);
            history.remove(i);
            break;
        }
    }
    public void save(DocMemento memento){
        this.history.add(memento);
    }
    public Document getDocument(){
        return this.document;
    }

    public static void main(String[] args) {
       var careTaker = new Caretaker();

       // submit new content:
        careTaker.getDocument().setContent("Hi there!");
        careTaker.save(careTaker.getDocument().save());

        // submit new font name:
        careTaker.getDocument().setFontName("Arial");
        careTaker.save(careTaker.getDocument().save());

        // submit new font size:
        careTaker.getDocument().setFontSize(18);
        careTaker.save(careTaker.getDocument().save());

        // submit new font name:
        careTaker.getDocument().setFontName("new-times-roman");
        careTaker.save(careTaker.getDocument().save());

        System.out.println(careTaker.getDocument());
        careTaker.undo();
        System.out.println(careTaker.getDocument());
        careTaker.undo();
        System.out.println(careTaker.getDocument());
        careTaker.undo();
        System.out.println(careTaker.getDocument());
        careTaker.undo();
        System.out.println(careTaker.getDocument());
    }
}
