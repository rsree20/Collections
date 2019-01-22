package com.collections.practice;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class StdBranchBasedSort implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		System.out.println(s1.getStdId()+" compared with "+s2.getStdId());
		int branchCompare = s1.getStdBranch().compareTo(s2.getStdBranch());
		int nameCompare = s1.getStdName().compareTo(s2.getStdName());
		int idCompare = s1.getStdId().compareTo(s2.getStdId());
		
		 return (branchCompare!=0) ? branchCompare: (nameCompare!=0)?nameCompare:idCompare;
	}
}
public class PracticeStudentSorting {

	public static void main(String[] args) {
		
		Set<Student> set = new TreeSet<>(new StdBranchBasedSort());
		set.add(new Student(104, "Prem", "EEE", "JBIT"));
		set.add(new Student(110, "Prem", "EEE", "VBIT"));
		set.add(new Student(101, "Prem", "EEE", "GRRR"));
		set.add(new Student(106, "Prem", "EEE", "JBIT"));
		
		System.out.println(set);
	}
}


class Student implements Comparable<Student>{
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return stdId+" : "+stdName+" : "+stdBranch+" : "+stdClg;
	}
	
	@Override
	public int compareTo(Student stu) {
		return this.getStdId().compareTo(stu.getStdId());
	}
	
	
	public Student(Integer stdId, String stdName, String stdBranch, String stdClg) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdBranch = stdBranch;
		this.stdClg = stdClg;
	}

	private Integer stdId;
	
	private String stdName;
	
	private String stdBranch;
	
	private String stdClg;

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdBranch() {
		return stdBranch;
	}

	public void setStdBranch(String stdBranch) {
		this.stdBranch = stdBranch;
	}

	public String getStdClg() {
		return stdClg;
	}

	public void setStdClg(String stdClg) {
		this.stdClg = stdClg;
	}
	
}


class StudentNameBasedSorting implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
		int nameBasedSort = s1.getStdName().compareTo(s2.getStdName());
		
		if(nameBasedSort ==0) {
			return s1.getStdId().compareTo(s2.getStdId());
		}else {
			return nameBasedSort;
		}
	}
	
	
	
}