package by.academy.lesson21.classwork;

import java.util.Set;

public class Customer extends PriviledgedCustomer{
	private String name;
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Address> getMyAddressSet() {
		return myAddressSet;
	}

	public void setMyAddressSet(Set<Address> myAddressSet) {
		this.myAddressSet = myAddressSet;
	}

	Set<Address> myAddressSet;

    void setAddres(Address myAddress) {
        myAddressSet.add(myAddress);
    }


}
