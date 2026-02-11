class Refrigerator{
    static boolean isWorking;
    static boolean onOrOff(){
        if(isWorking==false){
            isWorking = true;
            System.out.println("Refrigerator started cooling");
        }else if(isWorking == true){
            isWorking = false;
            System.out.println("Refrigerator stopped cooling");
        }
        return isWorking;
    }
}

