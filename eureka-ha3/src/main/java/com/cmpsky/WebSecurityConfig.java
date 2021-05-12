package com.cmpsky;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		 // Configure HttpSecurity as needed (e.g. enable http basic).
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER);
        http.csrf().disable();
        //注意：为了可以使用 http://${user}:${password}@${host}:${port}/eureka/ 这种方式登录,所以必须是httpBasic,
        // 如果是form方式,不能使用url格式登录
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
	
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
////        // Spring Security 默认开启了所有 CSRF 攻击防御，需要禁用 /eureka 的防御
//    	http.csrf().ignoringAntMatchers("/eureka/**");
//    	//访问eureka控制台和/actuator时能做安全控制
//        super.configure(http);
////        http.csrf().disable();//禁用CSRF
////        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
//    }
}
