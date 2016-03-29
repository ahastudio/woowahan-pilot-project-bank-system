package woowahan.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 계정 관리 컨트롤러.
 */
@Controller
@RequestMapping("/accounts")
public class AccountController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String list() {
        return "accounts/list";
    }
}
