// package com.music.sound.security;

// import java.io.IOException;
// import org.springframework.security.core.AuthenticationException;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.security.web.AuthenticationEntryPoint;

// public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint{

//     private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationEntryPoint.class);

//     @Override
//     public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException{
//         httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
//     }
    
// }
