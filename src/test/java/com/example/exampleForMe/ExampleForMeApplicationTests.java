package com.example.exampleForMe;

import com.example.exampleForMe.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class ExampleForMeApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	public UserController userController;
	@Test
	public void test() throws Exception{
		this.mockMvc.perform(get("/users")).andDo(print()).andExpect(status().isOk());
	}
	@Test
	void contextLoads() {
	}

}
