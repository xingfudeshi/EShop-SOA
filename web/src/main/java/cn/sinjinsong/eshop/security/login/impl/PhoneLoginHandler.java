package cn.sinjinsong.eshop.security.login.impl;

import cn.sinjinsong.eshop.common.domain.dto.user.LoginDTO;
import cn.sinjinsong.eshop.common.domain.entity.user.UserDO;
import cn.sinjinsong.eshop.security.login.LoginHandler;
import cn.sinjinsong.eshop.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by SinjinSong on 2017/4/27.
 */
@Component("LoginHandler.phone")
public class PhoneLoginHandler implements LoginHandler {
    @Autowired
    private UserService service;
    
    @Override
    public UserDO handle(LoginDTO loginDTO) {
        return service.findByPhone(loginDTO.getPhone());
    }
}
