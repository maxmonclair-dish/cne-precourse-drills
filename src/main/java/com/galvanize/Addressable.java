package com.galvanize;

import java.util.List;

import com.galvanize.Address;

public interface Addressable {
    List<Address> getAddresses();
    void addAddress(Address address);
}
