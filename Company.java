class Company{
	public static void main(String[] comapany){
		String companyName = "Tech Solutions";
		String ceo = "Arjun";
		String employees[] = {"Asha","Naveen","Kiran"};
		String city = "Electronic City";
		String projects[] = {"App","Website","IOT","Data-Science"};

		System.out.println("The Company name is:"+companyName);
		System.out.println("The CEO of the comapany is:"+ceo);

		System.out.println("\nEmployees working in the company are:");
		for(String employee:employees){
			System.out.println(employee);
		}

		System.out.println("\nCity in which the company located is :"+city);

		System.out.println("\nProjects to be worked on:");
		for(String project:projects){
			System.out.println(project);
		}
	}
}
