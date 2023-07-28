package com.test.graalvmproject.controller;

import com.test.graalvmproject.entity.TestEntity;
import com.test.graalvmproject.repository.TestRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tests")
@RequiredArgsConstructor
public class TestController {

  private final TestRepository testRepository;

  @GetMapping
  public List<TestEntity> getAllTests(){
    return testRepository.findAll();
  }
}
