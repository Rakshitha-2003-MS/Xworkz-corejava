class Gym{
	public static void main(String[] args){
		String gymName = "Fitness Pro";
		String trainer = "Karthik";
		String equipments[] = {"Treadmill","Dumbbells","Cardio Machines","Squat Racks","Weight Benches"};
		String area = "HSR Layout";
		String memberShips[] = {"Monthly","Yearly","Pro","Plus"};

		System.out.println("The Gym name is:"+gymName);
		System.out.println("The Trainer name is:"+trainer);

		System.out.println("\nEquipments available for workout are:");
		for(String equipment:equipments){
			System.out.println(equipment);
		}

		System.out.println("\nThe gym located in the area is :"+area);

		System.out.println("\nMember ships provided are:");
		for(String memberShip :memberShips){
			System.out.println(memberShip);
		}
	}
}
