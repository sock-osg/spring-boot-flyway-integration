package com.oz.springboot.flyway.integration.repository;

import com.oz.springboot.flyway.integration.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * <p><b>Created:</b> 6/04/17, 03:32 PM</p>
 * @since 1.0
 */
@RepositoryRestResource
public interface UsersRepository extends CrudRepository<Users, Long> {

}
