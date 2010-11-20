/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javastudyproject.users;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author EladYarkoni
 */
public class ReadWriteUser extends User implements Serializable{

    public ReadWriteUser(
            String userName,
            String id,
            String firstName,
            String lastName,
            String email,
            String password,
            String age
            )
    {
        runId++;
        this.userRunId = runId;
        this.userName = userName;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.createDate = new Date(System.currentTimeMillis());
    }

    @Override
    public String toString()
    {
        return "ReadWriteUser";
    }
}
