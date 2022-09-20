package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandListener extends ListenerAdapter {
    public final CommandManager cm = new CommandManager();

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        cm.run(event);
    }

}
