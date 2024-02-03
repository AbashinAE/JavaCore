package DZ_4;

import java.util.Objects;

public class Client {
    private String name;

    private String address;

    private String phoneNumber;

    public <Gender> Client(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
            }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return Objects.equals(name, client.name) && Objects.equals(address, client.address)
                && Objects.equals(phoneNumber, client.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phoneNumber);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Address: %s, Phone: %s, Gender: %s", name, address, phoneNumber);
    }
}
