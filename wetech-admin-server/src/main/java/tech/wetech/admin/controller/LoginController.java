package tech.wetech.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.admin.model.Result;
import tech.wetech.admin.model.dto.UserDTO;
import tech.wetech.admin.model.dto.LoginDTO;
import tech.wetech.admin.service.ResourceService;
import tech.wetech.admin.service.UserService;

/**
 * @author cjbi
 */
@Slf4j
@RestController
public class LoginController {

    @Autowired
    private ResourceService resourceService;

    @Autowired
    private UserService userService;

    @PostMapping("auth/login")
    public Result<UserDTO> login(@RequestBody LoginDTO loginDTO) {
        UserDTO userDTO = userService.login(loginDTO);
        return Result.success(userDTO);
    }

    @PostMapping("auth/logout")
    public Result logout() {
        return Result.success();
    }

}
