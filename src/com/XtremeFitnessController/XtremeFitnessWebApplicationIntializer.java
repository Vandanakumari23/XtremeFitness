package com.XtremeFitnessController;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

	public class XtremeFitnessWebApplicationIntializer extends
	AbstractAnnotationConfigDispatcherServletInitializer{

		
		protected Class<?>[] getRootConfigClasses() {
			return new Class[] {XtremeFitnessConfig.class};
		}
		
		protected Class<?>[] getServletConfigClasses() {
			return new Class[] {XtremeFitnessConfig.class};
		}

		protected String[] getServletMappings() {
			System.out.println("**** getservletMapping");
			return new String[] {"*.jlc"};
		}

	}
