package com.example.demo.resolver;

import com.example.demo.dto.CommonDto;
import org.apache.commons.io.IOUtils;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@Component
public class CustomHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        // 지정된 메서드의 파라미터를 검사하여 resolveArgument()를 실행할지의 여부를 boolean 값으로 리턴
        return parameter.getParameterType().equals(CommonDto.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        // 어떤 파라미터로 바인딩할 것인지 로직을 구현
        String ordNo = webRequest.getParameter("ordNo");
        String body = IOUtils.toString(webRequest.getNativeRequest(HttpServletRequest.class).getInputStream(), StandardCharsets.UTF_8);

        CommonDto commonDto = new CommonDto();
        commonDto.setName("TEST");
        commonDto.setOrdNo(ordNo);
        return commonDto;
    }
}
