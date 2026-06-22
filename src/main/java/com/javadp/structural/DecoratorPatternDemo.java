package com.javadp.structural;

public class DecoratorPatternDemo {
    public static void run() {
        Message simpleMessage = new SimpleMessage("Hello");
        Message encrypted = new EncryptionDecorator(simpleMessage);

        System.out.println("Decorator: " + encrypted.getContent());
    }
}

interface Message {
    String getContent();
}

class SimpleMessage implements Message {
    private final String text;

    public SimpleMessage(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
        return text;
    }
}

abstract class MessageDecorator implements Message {
    protected final Message wrapped;

    public MessageDecorator(Message wrapped) {
        this.wrapped = wrapped;
    }
}

class EncryptionDecorator extends MessageDecorator {
    public EncryptionDecorator(Message wrapped) {
        super(wrapped);
    }

    @Override
    public String getContent() {
        return "[encrypted] " + wrapped.getContent();
    }
}
