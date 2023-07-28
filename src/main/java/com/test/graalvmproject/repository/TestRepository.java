package com.test.graalvmproject.repository;

import com.test.graalvmproject.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long> {

}
