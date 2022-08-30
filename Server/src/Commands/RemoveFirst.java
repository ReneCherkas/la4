package Commands;

import Mess.Mess;
import Org.CollectionManager;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class RemoveFirst implements Command{
    private CollectionManager collectionManager;

    //public RemoveFirst() {
        //this.collectionManager = collectionManager;
    //}


    @Override
    public String execute(Object o) throws ParserConfigurationException, IOException, TransformerException {
        try {
            if (CollectionManager.getSize() <= 0){
                Mess.error("Коллекция пуста");
            }else {
                Mess.info("Из коллекции был удален 1 элемент.\n"+ CollectionManager.getPerson().peekFirst());
                collectionManager.removeFirst();}
        } catch (Exception e) {
            Mess.error("Коллекция пуста");
        }
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
