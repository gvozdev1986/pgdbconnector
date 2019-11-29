package by.hvozdzeu.pgdbconnector.connector.services.impl;

import by.hvozdzeu.pgdbconnector.connector.services.ConnectOCDConfig;
import by.hvozdzeu.pgdbconnector.connector.services.IConnect;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(
        name = "by.hvozdzeu.pgdbconnector.connector.services.ConnectOCDConfig",
        service = IConnect.class,
        immediate = true
)
@Designate(ocd = ConnectOCDConfig.class)
public class ConnectImpl implements IConnect {

    private String login;
    private String password;
    private String key;

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Activate
    void activate(final ConnectOCDConfig config) {
        login = config.login();
        password = config.password();
        key = config.key();
    }

}
