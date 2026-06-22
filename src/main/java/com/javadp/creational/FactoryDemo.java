package com.javadp.creational;

// ================= FACTORY PATTERN =================

interface Payment {
    void pay(int amount);
}

class UpiPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class CardPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid via Card: " + amount);
    }
}

class PaymentFactory {

    public static Payment getPayment(String type) {

        return switch (type.toLowerCase()) {
            case "upi" -> new UpiPayment();
            case "card" -> new CardPayment();
            default -> throw new IllegalArgumentException("Invalid payment type: " + type);
        };
    }
}

public class FactoryDemo {

    public static void main(String[] args) {

        Payment p1 = PaymentFactory.getPayment("upi");
        p1.pay(1000);

        Payment p2 = PaymentFactory.getPayment("card");
        p2.pay(2000);
    }
}