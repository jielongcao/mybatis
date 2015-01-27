package com.scau.mybatis;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface RoleMapper {
	@Insert("insert into ts_role(name,ctime,mtime,listorder) values(#{name},#{ctime},#{mtime},#{listorder})")
	public int addOne(Role role);
	
	@Select("select * from ts_role where id = #{id}")
	public Role selectOne(int id);
}
