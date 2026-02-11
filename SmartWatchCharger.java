class SmartWatchCharger{
    static boolean isCharging;
    static boolean onOrOff(){
        if(isCharging==false){
            isCharging = true;
            System.out.println("Smart watch charger started charging");
        }else if(isCharging==true){
            isCharging = false;
            System.out.println("Smart watch charger unplugged");
        }
        return isCharging;
    }
}
