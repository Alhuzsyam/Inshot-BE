package com.inshot.inshotTest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.inshot.inshotTest.model.Employes;

@Mapper
public interface Employeemapper {

    @Select("SELECT * FROM employee")
    public List<Employes> getAllemployee();

    @Insert("insert into employee(Id, name, phone, position, email) values(#{Id}, #{name}, #{phone}, #{position}, #{email})")
    void insertEmployee(Employes employes);

   @Update("update employee set " +
        "name=#{employee.name}, " +
        "phone=#{employee.phone}, " +
        "position=#{employee.position}, " +
        "email=#{employee.email} " +
        "where Id=#{employee.Id}")
    void updateEmployee(@Param("employee") Employes employes);

    @Delete("delete from employee where Id=#{Id}")
    void deleteEmployeeById(int Id);


}
