package gallery.helloworld;

import org.osgl.mvc.annotation.GetAction;

import java.io.Serializable;

/**
 * @author biezhi
 * @date 2018/5/30
 */
public class User implements Serializable {

    public static class Address {
        public String street;
        public String city;
    }

    private Long uid;
    private String name;
    private Address address;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @GetAction("test")
    public static User test(User user) {
        return user;
    }
}
