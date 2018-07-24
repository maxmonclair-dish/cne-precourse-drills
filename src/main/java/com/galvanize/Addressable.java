package com.galvanize;

import java.util.List;

public interface Addressable {
    List getAddresses();
    void addAddress(Address address);
}
