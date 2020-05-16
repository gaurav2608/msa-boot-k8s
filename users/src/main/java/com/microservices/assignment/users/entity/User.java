package com.microservices.assignment.users.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/*
CREATE TABLE testuser.users
(
  userid number(4),
  name    VARCHAR(20),
  age     number(4),
  email   VARCHAR(20)
);*/

@Entity
@Table(name="users")
@NamedQueries({
    @NamedQuery(
        name = "findUserById",
        query = "from User u where u.userid = :userid"
        )
})
public class User {
 @Column(name = "userid") @Id private int userid;
@Column(name="name")private String name;
@Column(name="age")private int age;
@Column(name="email")private String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
