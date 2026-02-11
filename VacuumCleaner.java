class VacuumCleaner{
    static boolean isSuctionOn;
    static boolean onOrOff(){
        if(!isSuctionOn){
            isSuctionOn = true;
            System.out.println("Vacuum cleaner began suction");
        }else{
            isSuctionOn = false;
            System.out.println("Vacuum cleaner stopped working");
        }
        return isSuctionOn;
    }
}
