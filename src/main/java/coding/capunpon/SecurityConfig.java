package coding.capunpon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig
        extends WebSecurityConfigurerAdapter
{

    @Autowired
    public void configureGlobalSecurity( AuthenticationManagerBuilder auth ) throws Exception
    {
        auth.inMemoryAuthentication().withUser( "Ramon" )
                .password( "Capunpon" ).roles( "developer" );
    }

    @Bean
    public CustomBasicAuthenticationEntryPoint getBasicAuthEntryPoint()
    {
        return new CustomBasicAuthenticationEntryPoint();
    }

    /* To allow Pre-flight [OPTIONS] request from browser */
    @Override
    public void configure( WebSecurity web ) throws Exception
    {
        web.ignoring().antMatchers( HttpMethod.OPTIONS, "/**" );
    }

    @Override
    protected void configure( HttpSecurity http ) throws Exception
    {
        http.csrf().disable().authorizeRequests().antMatchers( "/**" ).hasRole( "developer" )
                .and().httpBasic().realmName( "coding" )
                .authenticationEntryPoint( getBasicAuthEntryPoint() ).and().sessionManagement()
                .sessionCreationPolicy( SessionCreationPolicy.STATELESS );
        //We don't need sessions to be created.
    }
}
