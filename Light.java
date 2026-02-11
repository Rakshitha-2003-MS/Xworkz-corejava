class Light{
    static boolean isGlowing;
    static boolean onOrOff(){
        if(isGlowing==false){
            isGlowing = true;
            System.out.println("Light began to glow");
        }else if(isGlowing == true){
            isGlowing = false;
            System.out.println("Light went dark");
        }
        return isGlowing;
    }
}
