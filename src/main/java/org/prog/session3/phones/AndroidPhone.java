package org.prog.session3.phones;

public class AndroidPhone extends Phone implements IPhoneCamera {

    @Override
    public void takePhoto() {
        System.out.println("Take better photo");
    }
}
