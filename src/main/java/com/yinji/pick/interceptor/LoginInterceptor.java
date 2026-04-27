package com.yinji.pick.interceptor;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.yinji.pick.dto.UserDTO;
import com.yinji.pick.entity.User;
import com.yinji.pick.utils.RedisConstants;
import com.yinji.pick.utils.UserHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //1.判断是否需要拦截（ThreadLocal中是否有用户）
        if(UserHolder.getUser()==null){
            //没有，需要拦截，设置状态码
            response.setStatus(401);
            //拦截
            return false;
        }
        //有用户，放行
        return true;
    }
}





