class Microwave{
    static boolean isHeating;
    static boolean onOrOff(){
        if(isHeating==false){
            isHeating = true;
            System.out.println("Microwave started heating food");
        }else if(isHeating == true){
            isHeating = false;
            System.out.println("Microwave stopped heating");
        }
        return isHeating;
    }
}
