package com.robert.caching.repository;

import java.util.List;

import com.robert.caching.model.UserPayload;

/**
 * Created by Robert.
 */
public interface UserRepository {

    List<UserPayload> fetchAllUsers();

    UserPayload firstUser();

    UserPayload userByFirstNameAndLastName(String firstName,String lastName);

}
