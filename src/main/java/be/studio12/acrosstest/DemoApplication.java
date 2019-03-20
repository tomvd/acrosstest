package be.studio12.acrosstest;

import com.foreach.across.config.AcrossApplication;
import com.foreach.across.modules.web.AcrossWebModule;
import com.foreach.across.modules.adminweb.AdminWebModule;
import com.foreach.across.modules.debugweb.DebugWebModule;
import com.foreach.across.modules.logging.LoggingModule;
import com.foreach.across.modules.applicationinfo.ApplicationInfoModule;
import com.foreach.across.modules.hibernate.jpa.AcrossHibernateJpaModule;
import com.foreach.across.modules.user.UserModule;
import com.foreach.across.modules.entity.EntityModule;
import com.foreach.across.modules.webcms.WebCmsModule;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.h2.H2ConsoleAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.util.Collections;

@AcrossApplication(
		modules = {
				AcrossWebModule.NAME,
				AdminWebModule.NAME,
				DebugWebModule.NAME,
				LoggingModule.NAME,
				ApplicationInfoModule.NAME,
				AcrossHibernateJpaModule.NAME,
				UserModule.NAME,
				EntityModule.NAME,
				WebCmsModule.NAME
		}
)
public class DemoApplication
{
	public static void main( String[] args ) {
		SpringApplication springApplication = new SpringApplication( DemoApplication.class );
		springApplication.setDefaultProperties( Collections.singletonMap( "spring.config.location", "${user.home}/dev-configs/demo-application.yml" ) );
		springApplication.run( args );
	}
}