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
void Display()
		{
		System.out.println("First Name is :" + Firstname);
		System.out.println("Last Name is :" + Lastname);
		System.out.println("Address is :" + Address);
		System.out.println("Name of city is :" + City);
		System.out.println("ZipCode is :" + ZipCode);
		System.out.println("Contact number is :" + PhoneNumber);
		System.out.println("Email id is :" + Email);
		}
}
class AddressBookInfo
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String Firstname=scan.nextLine();
		
		System.out.println("Enter Last Name:");
		String Lastname=scan.nextLine();
		
		System.out.println("Enter Address:");
		String Address=scan.nextLine();
		
		System.out.println("Enter City Name:");
		String City=scan.nextLine();
		
		System.out.println("Enter ZipCode :");
		int ZipCode=scan.nextInt();
		
		System.out.println("Enter ContactNumber:");
		Long PhoneNumber =scan.nextLong();
		
		System.out.println("Enter Email id:");
		String Email =scan.nextLine();
	
		System.out.println("Welcome to Address Book system");
		ContactInfo c = new ContactInfo();
		c.setContactInfo(Firstname,Lastname,Address,City,ZipCode,PhoneNumber,Email);
		c.Display();
	}
}


