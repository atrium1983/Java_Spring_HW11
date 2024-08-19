Домашнее задание: 
1. Протестировать TimesheetController
    1. GET /timesheets/{id}
    2. GET /timesheets
    3. POST /timesheets
    4. DELETE /timesheets
    5. PUT /timesheets/{id}


```java
class User {
//  @ManyToMany(fetch = FetchType.EAGER)
//  @JoinTable(
//    name = "users_roles",
//    joinColumns = @JoinColumn(name = "user_id"),
//    inverseJoinColumns = @JoinColumn(name = "role_id")
//  )
//  private List<Role> roles;
}

class UserRole {
  @Id
  Long id;
  @ManyToOne
  User user;
  @ManyToOne
  Role role;
}

@Data
class Role {
//@ToString.Exclude // убирает циклическую зависимость, отключая вывод в Tostring 
//@ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
//private List<User> users;
} 
```