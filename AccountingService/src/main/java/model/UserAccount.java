package model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Builder
@EqualsAndHashCode(of = { "email" })
@Data
@Document(collection = "users")
public class UserAccount {

	private String name;

	private String email;

	private String password;

	private String avatar;

	private String phone;

	private boolean block;

	private List<String> roles;

	public void addRole(String role) {
		roles.add(role);
	}

	public void removeRole(String role) {
		roles.remove(role);
	}
}
