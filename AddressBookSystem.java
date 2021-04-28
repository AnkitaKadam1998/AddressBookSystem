class Contact 
{
	String Firstname;
	String Lastname;
	String Address;
	String City;
	int ZipCode;
	int PhoneNumber;
	String Email;
	
	Contact(String FirstName,String LastName,String Address,String City, int ZipCode,int PhoneNumber,String Email)
	{
		this.Firstname = FirstName;
		this.Lastname = LastName;
		this.Address = Address;
		this.City = City;
		this.ZipCode = ZipCode;
		this.PhoneNumber = PhoneNumber;
		this.Email = Email

	}
}

class AddressBook
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Address Book");
	}
}
