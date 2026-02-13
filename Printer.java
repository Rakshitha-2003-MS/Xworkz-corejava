class Printer {

    static boolean isPrinting;
    static int currentPages = 1;
    static int maxPages = 100;
    static int minPages = 1;
    static int step = 1; // pages to increase or decrease per operation

    // Method to turn printer ON or OFF
    static boolean onOrOff() {

        if (isPrinting == false) {
            isPrinting = true;
            System.out.println("Printer started printing documents");
        } else {
            isPrinting = false;
            System.out.println("Printer stopped printing");
        }

        return isPrinting;
    }

    // Method to increase page count
    static int increasePages() {

        System.out.println("Increase Pages is invoked");

        if (isPrinting) {

            if (currentPages < maxPages) {
                currentPages = currentPages + step;
                if (currentPages > maxPages) currentPages = maxPages;
                System.out.println("Current page count is " + currentPages);
            } else {
                System.out.println("Maximum page limit reached");
            }

        } else {
            System.out.println("Printer is Off. Please turn it On");
        }

        return currentPages;
    }

    // Method to decrease page count
    static int decreasePages() {

        System.out.println("Decrease Pages is invoked");

        if (isPrinting) {

            if (currentPages > minPages) {
                currentPages = currentPages - step;
                if (currentPages < minPages) currentPages = minPages;
                System.out.println("Current page count is " + currentPages);
            } else {
                System.out.println("Minimum page limit reached");
            }

        } else {
            System.out.println("Printer is Off. Please turn it On");
        }

        return currentPages;
    }
}
