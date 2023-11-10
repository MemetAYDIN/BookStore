// package com.example.orderbookproject.service.userservice;
//
// import com.example.orderbookproject.entity.UserEntity;
// import com.fasterxml.jackson.annotation.JsonIgnore;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;
//
// import java.util.Collection;
// import java.util.Objects;
//
/// **
// * The type User details.
// */
// public class UserDetailsImpl implements UserDetails {
//
// private final Long id;
//
// private final String username;
//
// private final String email;
//
// @JsonIgnore
// private final String password;
//
// /**
// * Instantiates a new User details.
// *
// * @param id the id
// * @param username the username
// * @param email the email
// * @param password the password
// */
// public UserDetailsImpl(Long id, String username, String email, String
// password) {
// this.id = id;
// this.username = username;
// this.email = email;
// this.password = password;
// }
//
// /**
// * Build user details.
// *
// * @param userEntity the user entity
// * @return the user details
// */
// public static UserDetailsImpl build(UserEntity userEntity) {
//
// return new UserDetailsImpl(
// userEntity.getId(),
// userEntity.getName(),
// userEntity.getEmail(),
// userEntity.getPassword());
// }
//
// /**
// * Gets id.
// *
// * @return the id
// */
// public Long getId() {
// return id;
// }
//
// /**
// * Gets email.
// *
// * @return the email
// */
// public String getEmail() {
// return email;
// }
//
// @Override
// public String getPassword() {
// return password;
// }
//
// @Override
// public String getUsername() {
// return username;
// }
//
// @Override
// public boolean isAccountNonExpired() {
// return true;
// }
//
// @Override
// public boolean isAccountNonLocked() {
// return true;
// }
//
// @Override
// public boolean isCredentialsNonExpired() {
// return true;
// }
//
// @Override
// public boolean isEnabled() {
// return true;
// }
//
// @Override
// public boolean equals(Object o) {
// if (this == o)
// return true;
// if (o == null || getClass() != o.getClass())
// return false;
// UserDetailsImpl user = (UserDetailsImpl) o;
// return Objects.equals(id, user.id);
// }
//
// @Override
// public int hashCode() {
// return super.hashCode();
// }
//
// @Override
// public Collection<? extends GrantedAuthority> getAuthorities() {
// // TODO Auto-generated method stub
// throw new UnsupportedOperationException("Unimplemented method
// 'getAuthorities'");
// }
// }
//