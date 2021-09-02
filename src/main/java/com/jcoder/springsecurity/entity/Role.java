package com.jcoder.springsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="role")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String rolename;


//    @ManyToMany(mappedBy = "roles", targetEntity = User.class,fetch = FetchType.LAZY)
//    private List<User> users=new ArrayList<>();

//    public void addUser(User u){
//        users.add(u);
//    }

//    @Override
//    public String toString() {
//        return "Role{" +
//                "id=" + id +
//                ", rolename='" + rolename + '\'' +
//                ", users=" + users +
//                '}';
//    }
}
