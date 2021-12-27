package com.example.testproject.domain.repository;

import com.example.testproject.domain.member.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public interface MemberRepositoryTest extends JpaRepository<Member, Long> {




}