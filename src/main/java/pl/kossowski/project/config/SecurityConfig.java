package pl.kossowski.project.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;



@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/h2-console/**").permitAll()
                .antMatchers("/guardian").hasAuthority("GUARDIAN")
                .antMatchers("/owner").hasAuthority("OWNER")
                .antMatchers("/**").authenticated()
                .and()
                .formLogin().loginPage("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .successHandler(successHandler())
                .and()
                .exceptionHandling()
                .accessDeniedPage("/accessDenied")
                .and()
                .headers().frameOptions().disable()
                .and()
                .logout()
                .logoutSuccessUrl("/login?logout");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    AuthenticationSuccessHandler successHandler() {
        return new SavedRequestAwareAuthenticationSuccessHandler();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
