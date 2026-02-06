class BankDetails{
	public static void main(String[] bank){
		String bankName = "Union Bank";
		String manager = "Mahesh";
		String accounts[] = {"Savings","Current"};
		String area = "BTM Layout";
		String services[] = {"Loan","Deposit","ATM"};

		System.out.println("The Bank Name is:"+bankName);
		System.out.println("The Manager is:"+manager);

		System.out.println("\nThe tpye of accounts are:");
		for(String account:accounts){
			System.out.println(account);
		}

		System.out.println("\nThe bank located in an area is :"+area);

		System.out.println("\nThe services provided are:");
		for(String service:services){
			System.out.println(service);
		}
	}
}
