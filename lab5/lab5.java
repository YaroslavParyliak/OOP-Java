package com.tasks5.command;

public class HelpCommand implements Command {
    public void execute() {
        System.out.println("Help executed");
    }
}

package com.tasks5.command;

public class ExitCommand implements Command {
    public void execute() {
        System.out.println("Goodbye!");
    }
}

package com.tasks5.command;

public class DateCommand implements Command {
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}

package com.tasks5.command;

public class EchoCommand implements Command {
    private String string;

    public EchoCommand(String string) {
        this.string = string;
    }

    public void execute() {
        System.out.println(this.string);
    }
}

package com.tasks5.command;

public class Application {

    public static void main(String[] args) {
        if(args == null || args.length <= 0 || args.length > 2 || args[0] == null) {
            System.out.println("Error");
        }
        else if(args[0].equals("help") && args.length == 1) {
            HelpCommand command = new HelpCommand();
            command.execute();
        }
        else if(args[0].equals("exit") && args.length == 1) {
            ExitCommand command = new ExitCommand();
            command.execute();
        }
        else if(args[0].equals("date") && args[1].equals("now") && args.length < 3) {
            DateCommand command = new DateCommand();
            command.execute();
        }
        else if(args[0].equals("echo") && args[1] != null && args.length < 3) {
            EchoCommand command = new EchoCommand(args[1]);
            command.execute();
        }
        else {
            System.out.println("Error");
        }
    }
}

