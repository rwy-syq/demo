package com.offcn.dao;

import com.offcn.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person,Long> {

    //查询指定用户姓名的信息
    @Query("select p from Person p where p.name=:name")
    public Person findByNameIs(@Param("name") String name);


}
