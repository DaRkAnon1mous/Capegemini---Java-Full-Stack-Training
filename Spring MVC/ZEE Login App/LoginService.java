package com.service;

import org.springframework.stereotype.Service;
import com.bean.LoginBean;

@Service
public class LoginService {
    public boolean validate(LoginBean bean) {
        return bean.getUserName() != null && bean.getPassword() != null && bean.getUserName().equals(bean.getPassword());
    }
}
