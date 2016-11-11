package com.manyTomany;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
//@Table(name="Std")
public class Student {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  private String name;

  @ManyToMany 
  @JoinTable(name="Student_Dept", 
      joinColumns=@JoinColumn(name="Stut_ID"),
      inverseJoinColumns=@JoinColumn(name="DEPT_ID"))  
  private Collection<Dept> departments;
  public Student() {
    departments = new ArrayList<Dept>();
}
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void addDepartment(Dept department) {
    if (!getDept().contains(department)) {
        getDept().add(department);
    }
    if (!department.getStudents().contains(this)) {
      department.getStudents().add(this);
    }
  }


  public Collection<Dept> getDept() {
    return departments;
  }

  public void setDepartment(Collection<Dept> departments) {
    this.departments = departments;
  }

  public String toString() {
    return "\n\nID:" + id + "\nName:" + name ;
  }
}
