package com.springbbot.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springbbot.domain.Test;

public interface TestRepository extends JpaRepository<Test,Integer>{

}
