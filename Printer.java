class Printer{
    static boolean isPrinting;
    static boolean onOrOff(){
        if(isPrinting==false){
            isPrinting = true;
            System.out.println("Printer started printing documents");
        }else if(isPrinting == true){
            isPrinting = false;
            System.out.println("Printer stopped printing");
        }
        return isPrinting;
    }
}
