package models;
import java.util.*;
import javax.persistence.*;
import play.db.jpa.*;
@Entity
@Table(name="blog_user")
public class User extends Model{
	@Id
	public  String Id;
	@Column (name="email")
public String email;
	@Column(name="password")
public String password;
	@Column(name="fullname")
public String fullname;
	@Column(name="is_admin")
public boolean isAdmin;
public User (String email,String password,String fullname){
	this.email=email;
	this.password=password;
	this.fullname=fullname;
}
}
