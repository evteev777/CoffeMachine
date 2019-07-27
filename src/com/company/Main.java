package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int moneyAmount = 10;

        int capuccinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int pureWaterPrise = 20;

        var canBuyAnything = false;
        var isMilkEnough = true;

        if(moneyAmount >= capuccinoPrice && isMilkEnough) {
            System.out.println("Вы можете купить капуччино");
            canBuyAnything = true;
        }

        if(moneyAmount >= lattePrice && isMilkEnough) {
            System.out.println("Вы можете купить латте");
            canBuyAnything = true;
        }

        if(moneyAmount >= espressoPrice) {
            System.out.println("Вы можете купить еспрессо");
            canBuyAnything = true;
        }

        if(moneyAmount >= pureWaterPrise) {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }

        if(canBuyAnything == false) {
            System.out.println("Недостаточно денег");
        }
    }
}