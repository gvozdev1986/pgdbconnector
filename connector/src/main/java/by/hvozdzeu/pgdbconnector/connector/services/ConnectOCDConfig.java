package by.hvozdzeu.pgdbconnector.connector.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "ConnectOCDConfig")
public @interface ConnectOCDConfig {

    @AttributeDefinition(name = "login", description = "Login DB", type = AttributeType.STRING)
    String login() default "";

    @AttributeDefinition(name = "password", description = "Password DB", type = AttributeType.STRING)
    String password() default "";

    @AttributeDefinition(name = "key", description = "Key DB", type = AttributeType.STRING)
    String key() default "";

}
