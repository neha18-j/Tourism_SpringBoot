package com.tour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tour.entity.Visitors;
import com.tour.repository.VisRep;

@Service
public class VisService {
	 @Autowired
     VisRep vr;
	 public List<Visitors> view_vis() {
		 return vr.findAll();
	 }
	 public String save_vis(Visitors v) {
		 vr.save(v);
		 return "Data saved successfully";
	 }
	 public String del_vis(Long id) {
		 vr.deleteById(id);
		 return id+"Deleted successfully";
		 
	 }
	 public Visitors edit_vs(Long id,Visitors v){
		 v.setId(id);
		 vr.save(v);
		 return v;
		 
	 }
}
