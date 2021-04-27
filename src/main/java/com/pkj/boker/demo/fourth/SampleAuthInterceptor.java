package com.pkj.boker.demo.fourth;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.util.Optional;

@Component
public class SampleAuthInterceptor implements HandlerInterceptor {

  private static final String SECRET_HEADER = "X-STUDY";

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {

    if (!(handler instanceof HandlerMethod)) return true;
    HandlerMethod handlerMethod = (HandlerMethod) handler;

    if (ObjectUtils.isEmpty(getAnnotation(handlerMethod, SampleAuth.class))) {
      return true;
    }

    final String token = request.getHeader(SECRET_HEADER);
    if (token == null) {

      throw new Exception("wrong wrong");
    }
    return true;
  }

  private <A extends Annotation> A getAnnotation(
      HandlerMethod handlerMethod, Class<A> annotationType) {
    return Optional.ofNullable(handlerMethod.getMethodAnnotation(annotationType))
        .orElse(handlerMethod.getBeanType().getAnnotation(annotationType));
  }
}
