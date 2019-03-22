package com.sharmaxz.interceptor;

import com.sharmaxz.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    UserSession userSession;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String url = httpServletRequest.getRequestURI();
        // recupera usuario logado
        Client client = userSession.getLoggedUser();
        System.out.println(client);
        if(client != null) {
            return true; // se tem usuario logado, pode acessar qualquer pagina
        } else if(url.contains("/") ) {
            // se nao tem usuario logado, so pode acessar paginas publicas
            return true;
        }
        String loginPage = httpServletRequest.getContextPath() + "/login";
        httpServletResponse.sendRedirect(loginPage);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}