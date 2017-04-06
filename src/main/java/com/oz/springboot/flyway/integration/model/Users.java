package com.oz.springboot.flyway.integration.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * <p><b>Created:</b> 6/04/17, 03:32 PM</p>
 *
 * @since 1.0
 */
@Data
@Entity
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private Date lastSign;
}
