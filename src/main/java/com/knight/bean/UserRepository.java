package com.knight.bean;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserInfo,Long> {

}
