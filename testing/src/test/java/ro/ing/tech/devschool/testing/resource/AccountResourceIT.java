package ro.ing.tech.devschool.testing.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import ro.ing.tech.devschool.testing.api.model.Account;
import ro.ing.tech.devschool.testing.api.resource.AccountResource;
import ro.ing.tech.devschool.testing.api.service.AccountService;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@WebMvcTest(value = AccountResource.class)
@ContextConfiguration(classes = {AccountResource.class})
public class AccountResourceIT {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AccountService accountService;

    @Test
    public void shouldReturnOkWhenAccountIsPresent() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/account/1");

        when(accountService.findById(any())).thenReturn(new Account());

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = result.getResponse();

        assertEquals(HttpStatus.OK.value(), response.getStatus());
    }

    @Test
    public void shouldReturnBadRequestWhenAccountIsNotPresent() throws Exception {
        //TODO
    }

    @Test
    public void shouldDeleteAccountIfExists() throws Exception {
        //TODO

    }


}
