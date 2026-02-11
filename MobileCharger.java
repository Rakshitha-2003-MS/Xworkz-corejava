class MobileCharger{
    static boolean isSupplying;
    static boolean onOrOff(){
        if(isSupplying==false){
            isSupplying = true;
            System.out.println("Mobile charger started charging");
        }else if(isSupplying == true){
            isSupplying = false;
            System.out.println("Mobile charger disconnected");
        }
        return isSupplying;
    }
}
