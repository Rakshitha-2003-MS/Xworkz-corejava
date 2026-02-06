class Hospital{
	public static void main(String[] hospital){
		String hospitalName = "City Care";
		String doctor = "Dr. Kiran";
		String nurses[] = {"Latha","Meena"};
		String location = "Vijayanagar";
		String departments[] = {"Cardiology","ENT","Ortho"};

		System.out.println("The hospital name is:"+hospitalName);
		System.out.println("\nThe Head Doctor name is:"+doctor);

		System.out.println("\nNurses in the hospital are:");
		for(String nurse:nurses){
			System.out.println(nurse);
		}

		System.out.println("\nThe hospital location is:"+location);

		System.out.println("\nThe Departments are:");
		for(String department:departments){
			System.out.println(department);
		}
	}
}
