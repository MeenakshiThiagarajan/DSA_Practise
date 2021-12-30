package com.bumblebee.javaImplementations;

public class LearnLambda {

    public static void main(String[] args) {
        Shopping shop = () -> {
            return "2662 9992 9929 1000";
        };

        Order ord = (orderNum) -> {
            return true;
        };
    }

    @FunctionalInterface
    interface Shopping {
        public String makePayment();
    }


    @FunctionalInterface
    interface Order {
        public boolean cancelOrder(int orderNumber);
    }
}

