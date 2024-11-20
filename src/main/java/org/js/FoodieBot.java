package org.js;
import net.dv8tion.jda.api.JDABuilder;
import javax.security.auth.login.LoginException;

public class FoodieBot {

    public FoodieBot(){

    }
    public static void main(String[] args) throws LoginException {
        final String TOKEN = "MTMwODczODc3NTk1MzcwMjk3Mg.G7Zx2L.dVwRFtMiNNnpAHijfyi00drbOo_hp3kTj7WHfM";
        JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN);

        jdaBuilder.build();
    }
}
