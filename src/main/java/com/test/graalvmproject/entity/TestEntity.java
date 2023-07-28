package com.test.graalvmproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
@Table(name = "test_table")
public class TestEntity {

  @Id
  @Column(name = "test_id")
  private Long id;
  @Column(name = "test_column")
  private String testColumn;

}
