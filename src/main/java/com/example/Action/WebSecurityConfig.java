package com.example.Action;
import com.example.Service.CustomUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by WK on 2018/4/2.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //开启security注解
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{

    @Bean
    UserDetailsService customUserService() {
        return new CustomUserService();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()
                .antMatchers("/bootstrap/**", "/css/**", "/image/*").permitAll()
                .anyRequest().authenticated()         //其他请求都需要有权限认证
                .and()
                .formLogin().loginPage("/login")
                .defaultSuccessUrl("/index").failureUrl("/login?error").permitAll()
                .and()
                .rememberMe()                      //开启cookies保存用户信息
                .tokenValiditySeconds(60*60*24*7) //设置cookie有效期
                .and()
                .logout()
                .logoutSuccessUrl("/login")
                .permitAll();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService());
    }



}
