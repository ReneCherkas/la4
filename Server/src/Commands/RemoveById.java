package Commands;

import Org.CollectionManager;
import manager.Message;

public class RemoveById implements Command{
    @Override
    public String execute(Object arg) {
        try {
            if (CollectionManager.getSize() == 0) {
                Message.setMessage("Коллекция пустая.");
            }
            else {
                Long id = Long.parseLong((String) arg);
                //CollectionManager.getCollection().removeIf(product -> Objects.equals(product.getId(), id));
                Message.setMessage("Был удален продукт с id: "+ id);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public String getName() {
        return "remove_by_id";
    }

    @Override
    public String getDescription() {
        return "Удаление элемента по заданному id";
    }
}
