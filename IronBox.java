class IronBox{
    static boolean isHeating;
    static boolean onOrOff(){
        if(isHeating==false){
            isHeating = true;
            System.out.println("Iron box started getting hot");
        }else if(isHeating == true){
            isHeating = false;
            System.out.println("Iron box cooled down");
        }
        return isHeating;
    }
}
