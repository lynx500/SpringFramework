package com.skillsup.springWithJavaConfig.config;

import com.skillsup.springWithJavaConfig.Contact;
import com.skillsup.springWithJavaConfig.dao.ContactsDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.skillsup.springWithJavaConfig")
@PropertySource("classpath:app.properties")
public class AppContext {

    @Bean
    public ContactsDaoImpl contactsDao() {
        List<Contact> contacts = new ArrayList<Contact>();
        Contact contact1 = new Contact("Nika Renaud", 123);
        Contact contact2 = new Contact("Richard Brown", 456);
        contacts.add(contact1);
        contacts.add(contact2);

        ContactsDaoImpl contactsDao = new ContactsDaoImpl();
        contactsDao.setAllContacts(contacts);
        return contactsDao;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
