package newone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by aleksei on 03.08.17.
 */
@Component
public class MessagePrinter {

    @Autowired
    private MessageService service;

    public  void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
