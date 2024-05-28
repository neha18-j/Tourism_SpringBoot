package com.tour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tour.entity.Visitors;
import com.tour.service.VisService;

@RestController
public class VisitController {
 @Autowired
 VisService vs;
 @GetMapping("/Welcome")
 public String wel(){
	 return "<h1>Welcome</h1>";
 }
 
 @GetMapping("/view")
 public List<Visitors> view(){
	 return vs.view_vis();
 }
 @PostMapping("/save")
 public String save_v(@RequestBody Visitors v){
	 return vs.save_vis(v);
	
 }
 @DeleteMapping("/del/{id}")
 public String del(@PathVariable Long id) {
	 return vs.del_vis(id);
	 
 }
 @PutMapping("/edit/{id}")
	 public Visitors edit_v(@PathVariable Long id,@RequestBody Visitors v) {
		return vs.edit_vs(id, v); 
	 }
	 
 }

