package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.School;
import com.example.demo.repo.SchoolRepo;

import oracle.jdbc.proxy.annotation.Post;

@Controller
public class SchoolController {
@Autowired

private SchoolRepo repo;
	
	@GetMapping("/index")
	public String goToIndexPage() {
		
		return "index";
	}
	
	@GetMapping("/addSchool")
	public String goToAddPage(Model model) {
		
		List<School> list=new ArrayList<School>();
		list=repo.findAll();
		model.addAttribute("list", list);
		return "addSchool";
	}
	
	@PostMapping("/insertSchool")
	public String insertSchool(School schl,Model model) {
		repo.save(schl);
		
		List<School> lists=new ArrayList<School>();
		lists=repo.findAll();
		model.addAttribute("list", lists);
		return "addSchool";
	}
	
	@GetMapping("/delete")
	public String deleteSchool(int id , Model model) {
		repo.deleteById(id);
		
		List<School> lists=new ArrayList<School>();
		lists=repo.findAll();
		model.addAttribute("list", lists);
		return "addSchool";
	}
	
	@GetMapping("/edit")
	public String editSchool(String r,int id,String name,String dis,int str,Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("name", name);
		model.addAttribute("dist", dis);
		model.addAttribute("str", str);
		model.addAttribute("val", r);
		
		List<School> lists=new ArrayList<School>();
		lists=repo.findAll();
		model.addAttribute("list", lists);
		return "addSchool";
	}
}
