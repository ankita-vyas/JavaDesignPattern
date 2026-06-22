package com.javadp.behavioral;

public class StrategyPatternDemo {
    public static void run() {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        System.out.println("Strategy: " + context.pay(100));

        context.setPaymentStrategy(new PayPalPayment());
        System.out.println("Strategy: " + context.pay(150));
    }
}

interface PaymentStrategy {
    String pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "Paid " + amount + " using Credit Card";
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public String pay(int amount) {
        return "Paid " + amount + " using PayPal";
    }
}

class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String pay(int amount) {
        return paymentStrategy.pay(amount);
    }
}
