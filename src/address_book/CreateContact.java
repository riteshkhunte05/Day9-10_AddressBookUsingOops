package address_book;

public class CreateContact {

	public static void main(String[] args) {
	
		        System.out.println("Welcome to the Address Book System code !!!");
		        contactDetails newContact = new contactDetails();
		        newContact.setFirstName("Ritesh \n");
		        newContact.setLastName("Khunte \n");
		        newContact.setAddressCity("Amravati \n");
		        newContact.setState("Maharashtra \n");
		        newContact.setZip(444806) ;
		        newContact.setEmail("riteshkhunte05@gmail.com \n");
		        newContact.setPhoneNumber(9168112901l);
		        System.out.println("The Contact is : \n" +newContact);
		    }
		}

		class contactDetails {
		    private String firstName;
		    private String lastName;
		    private String addressCity;
		    private String state;
		    private int zip;
		    private long phoneNumber;
		    private String email;


		    public String getFirstName() {
		        return firstName;
		    }

		    public void setFirstName(String firstName) {
		        this.firstName = firstName;
		    }

		    public String getLastName() {
		        return lastName;
		    }

		    public void setLastName
		            (String lastName) {
		        this.lastName = lastName;
		    }

		    public String getAddressCity() {
		        return addressCity;
		    }

		    public void setAddressCity(String addressCity) {
		        this.addressCity = addressCity;
		    }

		    public String getState() {
		        return state;
		    }

		    public void setState(String state) {
		        this.state = state;
		    }

		    public int getZip() {
		        return zip;
		    }

		    public void setZip(int zip) {
		        this.zip = zip;
		    }

		    public long getPhoneNumber() {
		        return phoneNumber;
		    }

		    public void setPhoneNumber(long phoneNumber) {
		        this.phoneNumber = phoneNumber;
		    }

		    public String getEmail() {
		        return email;
		    }

		    public void setEmail(String email) {
		        this.email = email;
		    }


		    @Override
		    public String toString() {
		        return
		                        " FirstName : " + firstName +
		                        " LastName : " + lastName +
		                        " Address City : " + addressCity +
		                        " State : " + state +
		                        " Zip : " + zip +'\'' +
		                        " PhoneNumber : " + phoneNumber +'\'' +
		                        " Email : " + email;

	}

}
