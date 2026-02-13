class PrinterExecuter {

    public static void main(String[] args) {

        // Turn printer ON
        boolean status = Printer.onOrOff();
        System.out.println("The printer status is " + status);

        // Increasing pages until max
        int pages1 = Printer.increasePages();
        System.out.println("The current page count is " + pages1);

        int pages2 = Printer.increasePages();
        System.out.println("The current page count is " + pages2);

        int pages3 = Printer.increasePages();
        System.out.println("The current page count is " + pages3);

        int pages4 = Printer.increasePages();
        System.out.println("The current page count is " + pages4);

        int pages5 = Printer.increasePages();
        System.out.println("The current page count is " + pages5);

        int pages6 = Printer.increasePages(); // repeat as needed to reach max
        System.out.println("The current page count is " + pages6);

        int pages7 = Printer.increasePages();
        System.out.println("The current page count is " + pages7);

        int pages8 = Printer.increasePages();
        System.out.println("The current page count is " + pages8);

        int pages9 = Printer.increasePages();
        System.out.println("The current page count is " + pages9);

        int pages10 = Printer.increasePages(); // should print "Maximum page limit reached"
        System.out.println("The current page count is " + pages10);

        // Decreasing pages until min
        int pages11 = Printer.decreasePages();
        System.out.println("The current page count is " + pages11);

        int pages12 = Printer.decreasePages();
        System.out.println("The current page count is " + pages12);

        int pages13 = Printer.decreasePages();
        System.out.println("The current page count is " + pages13);

        int pages14 = Printer.decreasePages();
        System.out.println("The current page count is " + pages14);

        int pages15 = Printer.decreasePages();
        System.out.println("The current page count is " + pages15);

        int pages16 = Printer.decreasePages();
        System.out.println("The current page count is " + pages16);

        int pages17 = Printer.decreasePages();
        System.out.println("The current page count is " + pages17);

        int pages18 = Printer.decreasePages();
        System.out.println("The current page count is " + pages18);

        int pages19 = Printer.decreasePages();
        System.out.println("The current page count is " + pages19);

        int pages20 = Printer.decreasePages(); // should print "Minimum page limit reached"
        System.out.println("The current page count is " + pages20);

        // Final Status
        System.out.println("The final page count of the printer is " + Printer.currentPages);
        System.out.println("The printer is currently printing status is " + Printer.isPrinting);

    }
}
