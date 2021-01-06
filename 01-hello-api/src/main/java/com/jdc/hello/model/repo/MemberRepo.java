package com.jdc.hello.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdc.hello.model.entity.Member;

public interface MemberRepo extends JpaRepository<Member, String>{

}
