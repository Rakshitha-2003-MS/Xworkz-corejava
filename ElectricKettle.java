class ElectricKettle{
    static boolean isBoiling;
    static boolean onOrOff(){
        if(isBoiling==false){
            isBoiling = true;
            System.out.println("Electric kettle started boiling water");
        }else if(isBoiling==true){
            isBoiling = false;
            System.out.println("Electric kettle switched off");
        }
        return isBoiling;
    }
}
