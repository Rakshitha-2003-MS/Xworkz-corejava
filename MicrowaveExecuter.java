class MicrowaveExecuter {

    public static void main(String[] args) {

        // Turn Microwave ON
        boolean status = Microwave.onOrOff();
        System.out.println("The microwave operating status is " + status);

        // Increasing Timer until max
        int timer1 = Microwave.increaseTimer();
        System.out.println("The timer after increase is " + timer1 + " seconds");

        int timer2 = Microwave.increaseTimer();
        System.out.println("The timer after increase is " + timer2 + " seconds");

        int timer3 = Microwave.increaseTimer();
        System.out.println("The timer after increase is " + timer3 + " seconds");

        int timer4 = Microwave.increaseTimer();
        System.out.println("The timer after increase is " + timer4 + " seconds");

        int timer5 = Microwave.increaseTimer();
        System.out.println("The timer after increase is " + timer5 + " seconds");

        int timer6 = Microwave.increaseTimer();
        System.out.println("The timer after increase is " + timer6 + " seconds");

        int timer7 = Microwave.increaseTimer();
        System.out.println("The timer after increase is " + timer7 + " seconds");

        int timer8 = Microwave.increaseTimer();
        System.out.println("The timer after increase is " + timer8 + " seconds");

        int timer9 = Microwave.increaseTimer();
        System.out.println("The timer after increase is " + timer9 + " seconds");

        int timer10 = Microwave.increaseTimer(); // Should print "Maximum timer limit reached"
        System.out.println("The timer after increase is " + timer10 + " seconds");

        // Decreasing Timer until min
        int timer11 = Microwave.decreaseTimer();
        System.out.println("The timer after decrease is " + timer11 + " seconds");

        int timer12 = Microwave.decreaseTimer();
        System.out.println("The timer after decrease is " + timer12 + " seconds");

        int timer13 = Microwave.decreaseTimer();
        System.out.println("The timer after decrease is " + timer13 + " seconds");

        int timer14 = Microwave.decreaseTimer();
        System.out.println("The timer after decrease is " + timer14 + " seconds");

        int timer15 = Microwave.decreaseTimer();
        System.out.println("The timer after decrease is " + timer15 + " seconds");

        int timer16 = Microwave.decreaseTimer();
        System.out.println("The timer after decrease is " + timer16 + " seconds");

        int timer17 = Microwave.decreaseTimer();
        System.out.println("The timer after decrease is " + timer17 + " seconds");

        int timer18 = Microwave.decreaseTimer();
        System.out.println("The timer after decrease is " + timer18 + " seconds");

        int timer19 = Microwave.decreaseTimer();
        System.out.println("The timer after decrease is " + timer19 + " seconds");

        int timer20 = Microwave.decreaseTimer(); // Should print "Minimum timer limit reached"
        System.out.println("The timer after decrease is " + timer20 + " seconds");

        // Final Status
        System.out.println("The final timer value of the microwave is " + Microwave.currentTimer + " seconds");
        System.out.println("The microwave is currently operating status is " + Microwave.isOperating);

    }
}
