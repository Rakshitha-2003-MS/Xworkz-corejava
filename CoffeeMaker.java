class CoffeeMaker{
    static boolean isBrewing;
    static boolean onOrOff(){
        if(isBrewing==false){
            isBrewing = true;
            System.out.println("Coffee maker started brewing coffee");
        }else if(isBrewing == true){
            isBrewing = false;
            System.out.println("Coffee maker stopped brewing");
        }
        return isBrewing;
    }
}
