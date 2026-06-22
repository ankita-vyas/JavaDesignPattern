package com.javadp.creational;

// ============== ABSTRACT FACTORY PATTERN ==============

// Product 1
interface Payment1 {
    void pay(int amount);
}

// Product 2
interface Receipt {
    void generate();
}

// ---------------- UPI FAMILY ----------------

class UpiPayment1 implements Payment1 {
    public void pay(int amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

class UpiReceipt implements Receipt {
    public void generate() {
        System.out.println("UPI Receipt Generated");
    }
}

// ---------------- CARD FAMILY ----------------

class CardPayment1 implements Payment1 {
    public void pay(int amount) {
        System.out.println("Card Payment: " + amount);
    }
}

class CardReceipt implements Receipt {
    public void generate() {
        System.out.println("Card Receipt Generated");
    }
}

// ---------------- ABSTRACT FACTORY ----------------

interface PaymentFactory1 {
    Payment createPayment();
    Receipt createReceipt();
}

// UPI Factory
class UpiFactory implements PaymentFactory1 {

    public Payment createPayment() {
        return new UpiPayment();
    }

    public Receipt createReceipt() {
        return new UpiReceipt();
    }
}

// CARD Factory
class CardFactory implements PaymentFactory1 {

    public Payment createPayment() {
        return new CardPayment();
    }

    public Receipt createReceipt() {
        return new CardReceipt();
    }
}

// ---------------- CLIENT ----------------

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        PaymentFactory1 factory = new UpiFactory();

        Payment payment = factory.createPayment();
        Receipt receipt = factory.createReceipt();

        payment.pay(1500);
        receipt.generate();
    }
}