package Commands;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class CountLessThanLocation implements Command{
    @Override
    public String execute(Object o) throws ParserConfigurationException, IOException, TransformerException {
        return null;
    }

    @Override
    public String getName() {
        return "count_less_than_location";
    }

    @Override
    public String getDescription() {
        return null;
    }
}
