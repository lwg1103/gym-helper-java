package com.gymhelper.app;

import com.gymhelper.domain.trainer.model.User;
import org.springframework.security.core.context.SecurityContextHolder;

abstract public class BaseController
{
    public User getCurrentUser()
    {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
