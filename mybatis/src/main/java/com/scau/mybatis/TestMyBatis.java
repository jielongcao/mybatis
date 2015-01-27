package com.scau.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMyBatis {
	public static void main(String[] args) {
		try {
			String resource = "mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			try {
				//RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);

				/*Role role = new Role();
				role.setName("cajl000");
				role.setCtime(111);
				role.setMtime(222);
				role.setListorder(3);
				mapper.addOne(role);
				sqlSession.commit();*/
				sqlSession.update("com.scau.mybatis.RoleMapper.updateRoleById", 2);
				sqlSession.commit();
				/*Role result = mapper.selectOne(3);
				Field[] declaredFields = Role.class.getDeclaredFields();
				for (Field field : declaredFields) {
					try {
						field.setAccessible(true);
						System.out.println(field.getName() + ":" + field.get(result));
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}*/
			} finally {
				sqlSession.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
