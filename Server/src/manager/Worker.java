package manager;

import Commands.*;
import Mess.Mess;

import java.io.IOException;

public class Worker {

    public byte[] work(String command, Object arg) throws IOException {
        Receiver receiver = new Receiver();
        receiver.regist();
        receiver.regist(new Exit(), new Info(), new Show(), new Add(), new RemoveById(), new Clear(), new UpdateById(), new RemoveHead(), new Help(),
                new Head(), new Save(),new ExecuteScript(),new CountLessThanLocation(), new PrintFiledAscendingNationality(), new RemoveFirst());
        receiver.runCommand(command, arg);
        MessageToSer messageToSer = new MessageToSer(Message.getMessage());
        Mess.info(messageToSer);
        return Serializator.serialization(messageToSer);

    }
}
