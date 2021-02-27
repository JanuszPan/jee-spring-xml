package pl.coderslab.beans;

public class MessageSender {
   private MessageService messageService;

    public MessageSender(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }
    public void sendMessage() {
        messageService.send();
    }
   public void sendMessageFromProperty(){
        messageService.send(message);
   }
}
