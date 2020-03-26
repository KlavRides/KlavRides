package dto;

import java.util.List;


import lombok.Getter;


@Getter
public class UserProfileDto {
String avatar;
String name;
String email;
String phone;
boolean block;
List<String> roles;
}
