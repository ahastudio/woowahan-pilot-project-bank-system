package woowahan.bank.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * 계정 관리 컨트롤러 테스트.
 */
public class AccountControllerTest {

    @Test
    public void getList() throws Exception {
        AccountController controller = new AccountController();

        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

        mockMvc.perform(get("/accounts"))
                .andExpect(status().isOk());
    }
}
