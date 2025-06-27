package Java8_features_1.Question4;

interface Message {
    MyMessage getMessage(String msg);
}

class MyMessage {
    MyMessage(String msg) {
        System.out.println("Message is: " + msg);
    }
}

public class Question4{
    public static void main(String[] args) {
        Message messageRef = MyMessage::new;
        messageRef.getMessage("Hello from constructor reference");
    }
}