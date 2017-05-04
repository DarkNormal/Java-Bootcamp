package Assignment1;

/**
 * Created by Mark on 04/05/2017.
 */
public class Address implements Constants {
    public String addressLine1, addressLine2, addressLine3, zipCode;

    public Address(String addressLine1, String addressLine2, String addressLine3, String zipCode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.zipCode = zipCode;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(addressLine1)
                .append(CSV_SEPARATOR)
                .append(addressLine2)
                .append(CSV_SEPARATOR)
                .append(addressLine3)
                .append(CSV_SEPARATOR)
                .append(zipCode)
                .append(CSV_SEPARATOR);
        return builder.toString();
    }
}

