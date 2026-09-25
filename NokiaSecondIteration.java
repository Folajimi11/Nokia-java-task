import java.util.Scanner;

public class NokiaSecondIteration {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        
        String prompt = """
        
        WELCOME
        
        Select
    
        1. Phone book
        2. Messages
        3. Chat
        4. Call register
        5. Tones
        6. Settings
        7. Call divert 1
        8. Music
        9. Games
        10. Calculator
        11. Reminders
        12. Clock
        13. Profiles
        14. Services
        15. SIM services2
        0. Turn Off


    """;
    while (true) {
    System.out.println(prompt);
    int userPrompt = input.nextInt();
    
    switch (userPrompt) {
                case 0 -> {
                    break;
                }       
                case 1 -> {System.out.println("Phone book");
                while (true) {
            String phoneBook = """
                
Select
               
1. Search
2. Service Nos. 1
3. Add name
4. Erase
5. Edit
6. Copy
7. Assign tone
8. Send b’card
9. Options
10. Speed dials
11. Voice tags
0. Back

    
            """;
                System.out.println(phoneBook);
                int phoneBookPrompt = input.nextInt();
            
            switch (phoneBookPrompt) {
                case 0 -> {
                    break;
                }
                case 1 -> System.out.println("Search");
                case 2 -> System.out.println("Service Nos. 1");
                case 3 -> System.out.println("Add name");
                case 4 -> System.out.println("Erase");
                case 5 -> System.out.println("Edit");
                case 6 -> System.out.println("Copy");
                case 7 -> System.out.println("Assign tone");
                case 8 -> System.out.println("Send b’card");
                case 9 -> {System.out.println("Options");
            
                String options = """

Select

1. Memory in use
2. Type of view
3. Memory status
0. Back

                """;
                while (true) {
                System.out.println(options);
                int optionsPrompt = input.nextInt();
            switch (optionsPrompt) {
                case 0 -> {
                    break;
                }
                case 1 -> System.out.println("Memory in use");
                case 2 -> System.out.println("Type of view");
                case 3 -> System.out.println("Memory status");
                default -> System.out.println("Invalid Input");


}
                if (optionsPrompt == 0) {
                break;
            }
}
}
                case 10 -> System.out.println("Speed dials");
                case 11 -> System.out.println("Voice tags");

                default -> System.out.println("Invalid Input");


             
    

        
}

            if (phoneBookPrompt == 0) {
                break;
            }

        }
}

        
        case 2 -> {System.out.println("Messages");
        while (true) {
            String messages = """
            
Select

1. Write messages
2. Inbox
3. Outbox
4. Picture messages
5. Templates
6. Smileys
7. Message settings
8. Info service
9. Voice mailbox number 4
10. Service command editor
0. Back

        """;

            System.out.println(messages);
        int messagesPrompt = input.nextInt();
  
        switch (messagesPrompt){    
            case 0 -> {
                break;
            }            
            case 1 -> System.out.println("Write messages");
            case 2 -> System.out.println("Inbox");
            case 3 -> System.out.println("Outbox");
            case 4 -> System.out.println("Picture messages");
            case 5 -> System.out.println("Templates");
            case 6 -> System.out.println("Smileys");
            case 7 -> {System.out.println("Message settings");
            String messageSettings = """
Select
1. Set 1 2
2. Common 3 
0. Back

""";

            while (true) {
            System.out.println(messageSettings);
            int messageSettingsPrompt = input.nextInt();

            switch (messageSettingsPrompt) {
            case 0 -> {
                break;
            }  
            case 1 -> {System.out.println("Set 1 2");

                String set = """

Select

1. Message centre number
2. Messages sent as
3. Message validity
0. Back
            
""";    
                while (true) {
                System.out.println(set);
                int setPrompt = input.nextInt();

                switch(setPrompt) {
                case 0 -> {
                    break;
                } 
                case 1 -> System.out.println("Message centre number");
                case 2 -> System.out.println("Messages sent as");
                case 3 -> System.out.println("Message validity");
                default -> System.out.println("Invalid Input");
}
                if (setPrompt == 0) {
                break;
            }
}
}
            case 2 -> {System.out.println("Common 3");

                String common = """ 

Select

1. Delivery reports
2. Reply via same centre
3. Character support
0. Back

""";
                while (true) {
                System.out.println(common);
                int commonPrompt = input.nextInt();

                switch (commonPrompt) {
                case 0 -> {
                    break;
                } 
                case 1 -> System.out.println("Delivery reports");
                case 2 -> System.out.println("Reply via same centre");
                case 3 -> System.out.println("Character support");
                default -> System.out.println("Invalid Input");
}
            if (commonPrompt == 0) {
                            break;
                        }
}
}               

}
            if (messageSettingsPrompt == 0) {
                            break;
                        }
}
}
            case 8 -> System.out.println("Info service");
            case 9 -> System.out.println("Voice mailbox number 4");
            case 10 -> System.out.println("Service command editor");
            default -> System.out.println("Invalid Input");
}
                if (messagesPrompt == 0) {
                        break; 
                    }
}
}
        case 3 -> System.out.println("Chat");
        case 4 -> {System.out.println("Call register");
            String callRegister = """

Select

1. Missed calls
2. Received calls
3. Dialled numbers
4. Erase recent call lists
5. Show call duration
6. Show call costs
7. Call cost settings
8. Prepaid credit
0. Back

""";

            while (true) {
            System.out.println(callRegister);
            int callRegisterPrompt = input.nextInt();
            
            switch (callRegisterPrompt) {
            case 0 -> {
                break;
            } 
            case 1 -> System.out.println("Missed calls");
            case 2 -> System.out.println("Received calls");
            case 3 -> System.out.println("Dialled numbers");
            case 4 -> System.out.println("Erase recent call lists");
            case 5 -> {System.out.println("Show call duration");

                String showCallDuration = """
                
Select
                
1. Last call duration
2. All calls’ duration
3. Received calls’ duration
4. Dialled calls’ duration
5. Clear timers
0. Back

""";

                while (true) {
                System.out.println(showCallDuration);
                int showCallDurationPrompt = input.nextInt();

                switch(showCallDurationPrompt) {
                case 0 -> {
                    break;
                } 
                case 1 -> System.out.println("Last call duration");
                case 2 -> System.out.println("All calls’ duration");
                case 3 -> System.out.println("Received calls’ duration");
                case 4 -> System.out.println("Dialled calls’ duration");
                case 5 -> System.out.println("Clear timers");
                default -> System.out.println("Invalid Input");



}
            if (showCallDurationPrompt == 0) {
                            break;
                        }
}
}
            case 6 -> {System.out.println("Show call costs");

            String showCallCosts = """

Select

1. Last call cost
2. All calls’ cost
3. Clear counters
0. Back

""";

            while (true) {
            System.out.println(showCallCosts);
            int showCallCostsPrompt = input.nextInt();
                switch (showCallCostsPrompt) {
                case 0 -> {
                    break;
                } 
                case 1 -> System.out.println("Last call cost");
                case 2 -> System.out.println("All calls’ cost");
                case 3 -> System.out.println("Clear counters"); 
                default -> System.out.println("Invalid Input");

}
            if (showCallCostsPrompt == 0) {
                            break;
                        }
}
}
            case 7 -> {System.out.println("Call cost settings");

                String callCostSettings = """

Select

1. Call cost limit
2. Show costs in
0. Back                

""";

                while (true) {
                System.out.println(callCostSettings);
                int callCostSettingsPrompt = input.nextInt();

                switch (callCostSettingsPrompt) {
                case 0 -> {
                    break;
                } 
                case 1 -> System.out.println("Call cost limit");
                case 2 -> System.out.println("Show costs in");
                default -> System.out.println("Invalid Input");
}
            if (callCostSettingsPrompt == 0) {
                            break;
                        }
}
}
            case 8 -> System.out.println("Prepaid credit");
            default -> System.out.println("Invalid Input");
}
            if (callRegisterPrompt == 0) {
                            break;
                        }
}
}
        case 5 -> {System.out.println("Tones");

            String tones = """

Select

1. Ringing tone
2. Ringing volume
3. Incoming call alert
4. Message alert tone
5. Keypad tones
6. Warning tones
7. Vibrating alert
8. Screen saver
0. Back

""";

            while (true) {
            System.out.println(tones);
            int tonesPrompt = input.nextInt();

            switch (tonesPrompt) {
            case 0 -> {
                break;
            } 
            case 1 -> System.out.println("Ringing tone");
            case 2 -> System.out.println("Ringing volume");
            case 3 -> System.out.println("Incoming call alert");
            case 4 -> System.out.println("Message alert tone");
            case 5 -> System.out.println("Keypad tones");
            case 6 -> System.out.println("Warning tones");
            case 7 -> System.out.println("Vibrating alert");
            case 8 -> System.out.println("Screen saver");
            default -> System.out.println("Invalid Input");
}
            if (tonesPrompt == 0) {
                            break;
                        }
}
}
        case 6 -> {System.out.println("Settings");

            String settings = """

Select            

1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings
0. Back

""";

            while (true) {
            System.out.println(settings);
            int settingsPrompt = input.nextInt();
            switch (settingsPrompt) {
            case 0 -> {
                break;
            } 
            case 1 -> {System.out.println("Call settings");
                String callSettings = """

Select   
                
1. Automatic redial
2. Speed dialling
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer 1
0. Back

""";

                while (true) {
                System.out.println(callSettings);
                int callSettingsPrompt = input.nextInt();
                switch (callSettingsPrompt) {
                case 0 -> {
                    break;
                } 
                case 1 -> System.out.println("Automatic redial");
                case 2 -> System.out.println("Speed dialling");
                case 3 -> System.out.println("Call waiting options");
                case 4 -> System.out.println("Own number sending");
                case 5 -> System.out.println("Phone line in use");
                case 6 -> System.out.println("Automatic answer 1");
                default -> System.out.println("Invalid Input");
}
            if (callSettingsPrompt == 0) {
                            break;
                        }
}
}

            case 2 -> {System.out.println("Phone settings");
                String phoneSettings = """

Select   
                
1. Language
2. Cell info display
3. Welcome note
4. Network selection
5. Confirm SIM service actions
0. Back

""";

                while (true) {
                System.out.println(phoneSettings);
                int phoneSettingsPrompt = input.nextInt();
                switch (phoneSettingsPrompt) {
                case 0 -> {
                    break;
                } 
                case 1 -> System.out.println("Language");
                case 2 -> System.out.println("Cell info display");
                case 3 -> System.out.println("Welcome note");
                case 4 -> System.out.println("Network selection");
                case 5 -> System.out.println("Confirm SIM service actions");
                default -> System.out.println("Invalid Input");

}
            if (phoneSettingsPrompt == 0) {
                            break;
                        }
}
}

            case 3 -> {System.out.println("Security settings");

                String securitySettings = """
                
Select   
                
1. PIN code request
2. Call barring service
3. Fixed dialling
4. Closed user group
5. Security level
6. Change access codes
0. Back

""";

                while (true) {
                System.out.println(securitySettings);
                int securitySettingsPrompt = input.nextInt();
                switch (securitySettingsPrompt) {
                case 0 -> {
                    break;
                } 
                case 1 -> System.out.println("PIN code request");
                case 2 -> System.out.println("Call barring service");
                case 3 -> System.out.println("Fixed dialling");
                case 4 -> System.out.println("Closed user group");
                case 5 -> System.out.println("Security level");
                case 6 -> System.out.println("Change access codes");
                default -> System.out.println("Invalid Input");
}
            if (securitySettingsPrompt == 0) {
                            break;
                        }
}
}
            case 4 -> System.out.println("Restore factory settings");
            default -> System.out.println("Invalid Input");


}
            if (settingsPrompt == 0) {
                            break;
                        }
}
}
        case 7 -> System.out.println("Call divert 1");
        case 8 -> {System.out.println("Music");
                String music = """

Select   
                
1. Music player
2. Radio
3. Recorder
4. Track list
0. Back

""";

                while (true) {
                System.out.println(music);
                int musicPrompt = input.nextInt();
                switch (musicPrompt) {
                case 0 -> {
                    break;
                }       
                case 1 -> System.out.println("Music player");
                case 2 -> System.out.println(" Radio");
                case 3 -> System.out.println("Recorder");
                case 4 -> System.out.println("Track list");
                default -> System.out.println("Invalid Input");

}

            if (musicPrompt == 0) {
                            break;
                        }

}
}
        case 9 -> System.out.println("Games");
        case 10 -> System.out.println("Calculator");
        case 11 -> System.out.println("Reminders");
        case 12 -> {System.out.println("Clock");
                String clock = """

Select   
                
1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6. Auto update of date and time
0. Back

""";

                while (true) {
                System.out.println(clock);
                int clockPrompt = input.nextInt();
                switch (clockPrompt) {
                case 0 -> {
                    break;
                }   
                case 1 -> System.out.println("Alarm clock");
                case 2 -> System.out.println("Clock settings");
                case 3 -> System.out.println("Date setting");
                case 4 -> System.out.println("Stopwatch");
                case 5 -> System.out.println("Countdown timer");
                case 6 -> System.out.println("Auto update of date and time");
                default -> System.out.println("Invalid Input");

}
            if (clockPrompt == 0) {
                            break;
                        }
}
}
        case 13 -> System.out.println("Profiles");
        case 14 -> System.out.println("Services");
        case 15 -> System.out.println("SIM services2");
        default -> System.out.println("Invalid Input");

}
            if (userPrompt == 0) {
                            break;
                        }
}
}

}
