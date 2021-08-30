package com.example.springinitializrlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@SpringBootApplication
//public class SpringInitializrLabApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringInitializrLabApplication.class, args);
//	}
//	@GetMapping("/")
//	public String index() {
//		return "Greetings from Spring Boot!";
//	}
//
//}
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@RestController
@SpringBootApplication
public class SpringInitializrLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInitializrLabApplication.class, args);
	}
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
//Results of creating and running the application class
//Let's inspect the beans provided by Spring Boot:
//applicationAvailability
//applicationTaskExecutor
//basicErrorController
//beanNameHandlerMapping
//beanNameViewResolver
//characterEncodingFilter
//commandLineRunner
//conventionErrorViewResolver
//defaultServletHandlerMapping
//defaultViewResolver
//dispatcherServlet
//dispatcherServletRegistration
//error
//errorAttributes
//errorPageCustomizer
//errorPageRegistrarBeanPostProcessor
//flashMapManager
//forceAutoProxyCreatorToUseClassProxying
//formContentFilter
//handlerExceptionResolver
//handlerFunctionAdapter
//httpRequestHandlerAdapter
//jacksonObjectMapper
//jacksonObjectMapperBuilder
//jsonComponentModule
//lifecycleProcessor
//localeCharsetMappingsCustomizer
//localeResolver
//mappingJackson2HttpMessageConverter
//messageConverters
//multipartConfigElement
//multipartResolver
//mvcContentNegotiationManager
//mvcConversionService
//mvcHandlerMappingIntrospector
//mvcPathMatcher
//mvcPatternParser
//mvcResourceUrlProvider
//mvcUriComponentsContributor
//mvcUrlPathHelper
//mvcValidator
//mvcViewResolver
//org.springframework.aop.config.internalAutoProxyCreator
//org.springframework.boot.autoconfigure.AutoConfigurationPackages
//org.springframework.boot.autoconfigure.aop.AopAutoConfiguration
//org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration
//org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration
//org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration
//org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration
//org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration
//org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration
//org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration
//org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration
//org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration
//org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration
//org.springframework.boot.autoconfigure.internalCachingMetadataReaderFactory
//org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
//org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration
//org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration
//org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration
//org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$ParameterNamesModuleConfiguration
//org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration
//org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration
//org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration
//org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration
//org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration
//org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration$TomcatWebServerFactoryCustomizerConfiguration
//org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration
//org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletConfiguration
//org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration
//org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration
//org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration
//org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration
//org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat
//org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration
//org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration
//org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter
//org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
//org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration
//org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration
//org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration
//org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration$TomcatWebSocketConfiguration
//org.springframework.boot.context.internalConfigurationPropertiesBinder
//org.springframework.boot.context.internalConfigurationPropertiesBinderFactory
//org.springframework.boot.context.properties.BoundConfigurationProperties
//org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor
//org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter
//org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor
//org.springframework.context.annotation.internalAutowiredAnnotationProcessor
//org.springframework.context.annotation.internalCommonAnnotationProcessor
//org.springframework.context.annotation.internalConfigurationAnnotationProcessor
//org.springframework.context.event.internalEventListenerFactory
//org.springframework.context.event.internalEventListenerProcessor
//parameterNamesModule
//preserveErrorControllerTargetClassPostProcessor
//propertySourcesPlaceholderConfigurer
//requestContextFilter
//requestMappingHandlerAdapter
//requestMappingHandlerMapping
//resourceHandlerMapping
//restTemplateBuilder
//restTemplateBuilderConfigurer
//routerFunctionMapping
//scheduledBeanLazyInitializationExcludeFilter
//server-org.springframework.boot.autoconfigure.web.ServerProperties
//servletWebServerFactoryCustomizer
//simpleControllerHandlerAdapter
//spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties
//spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties
//spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties
//spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties
//spring.resources-org.springframework.boot.autoconfigure.web.ResourceProperties
//spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties
//spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties
//spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties
//spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties
//spring.web-org.springframework.boot.autoconfigure.web.WebProperties
//springInitializrLabApplication
//standardJacksonObjectMapperBuilderCustomizer
//stringHttpMessageConverter
//taskExecutorBuilder
//taskSchedulerBuilder
//themeResolver
//tomcatServletWebServerFactory
//tomcatServletWebServerFactoryCustomizer
//tomcatWebServerFactoryCustomizer
//viewControllerHandlerMapping
//viewNameTranslator
//viewResolver
//webServerFactoryCustomizerBeanPostProcessor
//websocketServletWebServerCustomizer
//welcomePageHandlerMapping