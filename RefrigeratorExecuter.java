class RefrigeratorExecuter {

    public static void main(String[] args) {

        boolean status = Refrigerator.onOrOff();
        System.out.println("The refrigerator working status is " + status);

        // Increasing Temperature
        int temp1 = Refrigerator.increaseTemperature();
        System.out.println("The temperature after increase is " + temp1);

        int temp2 = Refrigerator.increaseTemperature();
        System.out.println("The temperature after increase is " + temp2);

        int temp3 = Refrigerator.increaseTemperature();
        System.out.println("The temperature after increase is " + temp3);

        // Decreasing Temperature
        int temp4 = Refrigerator.decreaseTemperature();
        System.out.println("The temperature after decrease is " + temp4);

        int temp5 = Refrigerator.decreaseTemperature();
        System.out.println("The temperature after decrease is " + temp5);

        int temp6 = Refrigerator.decreaseTemperature();
        System.out.println("The temperature after decrease is " + temp6);

    }
}
