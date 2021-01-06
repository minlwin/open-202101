package com.jdc.hello.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.hello.model.entity.Member;
import com.jdc.hello.model.repo.MemberRepo;

@RestController
@RequestMapping("member")
public class MemberApi {
	
	@Autowired
	private MemberRepo repo;

	@PostMapping
	public Member create(@RequestBody Member m) {
		return repo.save(m);
	}
	
	@GetMapping
	public List<Member> getAll() {
		return repo.findAll();
	}
}
