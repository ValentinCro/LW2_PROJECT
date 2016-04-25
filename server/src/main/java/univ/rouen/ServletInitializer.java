package univ.rouen;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import univ.rouen.config.AppConfig;

/**
 * Created by valentin on 4/18/16.
 */
public class ServletInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
