package hello;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Jenkins on 26/02/2016.
 */
@Entity
public class Users {
    @Id
    private String username;
    private String password;
    private Boolean enabled;

    public String getUserDisplay() {
        return getUsername() + " --> " + getPassword() + " --> " + getEnabled();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
