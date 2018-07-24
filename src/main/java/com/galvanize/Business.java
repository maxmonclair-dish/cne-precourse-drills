package com.galvanize;

import java.util.ArrayList;

public class Business implements Addressable {
    private final String name;
    private final ArrayList<Address> addresses = new ArrayList<Address>();

    public Business (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public ArrayList getAddresses() {
        return this.addresses;
    }
}

/**
 *
 Create a class named Business that implements Addressable.

 Create two private, final fields:

 name: String
 addresses: ArrayList of Addresses
 Create a constructor for Business with a single parameter for name (a String).

 Create a getter for name.

 Implement Addressable such that if you call addAddress and pass it an address,
 then call getAddresses, the address you added should be in the list.
 */
