package Assignment1;

import java.util.UUID;

/**
 * Created by Mark on 04/05/2017.
 */
public class Contact implements Constants{



    private UUID contactId;
    private String name, phoneNumber, emailAddress;
    private Address address;

    public Contact(UUID contactId, String name, String phoneNumber, String emailAddress, Address address) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public Contact(String[] contactDetails){
        this.contactId = UUID.fromString(contactDetails[0]);
        this.name = contactDetails[1];
        this.phoneNumber = contactDetails[2];
        this.emailAddress = contactDetails[3];
        this.address = new Address(contactDetails[4], contactDetails[5], contactDetails[6], contactDetails[7]);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(contactId)
                .append(CSV_SEPARATOR)
                .append(name)
                .append(CSV_SEPARATOR)
                .append(phoneNumber)
                .append(CSV_SEPARATOR)
                .append(emailAddress)
                .append(CSV_SEPARATOR)
                .append(address.toString());
        return builder.toString();

    }
}
