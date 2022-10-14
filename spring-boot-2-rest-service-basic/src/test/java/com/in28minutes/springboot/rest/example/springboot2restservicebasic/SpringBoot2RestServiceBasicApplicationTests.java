package com.in28minutes.springboot.rest.example.springboot2restservicebasic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot2RestServiceBasicApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void createStudent() throws Exception {

		//Assert.assertEquals("application/json;charset=UTF-8",mvcResult.getResponse().getContentType());
      /*
      final Student student = buildDefaultStudent();
      student.setId(0);

      final String body = objectMapper.writeValueAsString(student);

      final String resultAsString = mvc.perform(post("/students")
            .contentType("application/json")
            .andExpect(jsonPath("$.id").value(1))
            .andExpect(jsonPath("$.name").value("student1"))
            .andExpect(jsonPath("$.mail").value("student1@test.com"))
            .andExpect(jsonPath("$.phone").value("+491242121"))
            .andExpect(status().isOk()));

       */

		// }
	}
}
