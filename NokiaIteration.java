import java.util.Scanner;

public class Nokia{

	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

        String prompt = """

        ==================== Main Menu ==========================

        Press

        1    Phonebook
        2    Messages
        3    Chat
        4    Call register
        5    Tones
        6    Settings
        7    Call divert
        8    Music
        9    Games
        10   Calculater
        11   Remainders
        12   Clock
        13   Profiles
        14   Services
        15   Sim Services

        ========================================================

        """;

		while (true)
        System.out.println(prompt);
        System.out.println("Enter any option (1-15):");
        int menuChoice = input.nextInt();

		switch(menuChoice){

		    case 1 -> {

                     System.out.println("Phonebook");
                     while (true) 

                    String phonebookPrompt = """

                    ============== Welcome to Phonebook Menu ===============

                                        Press
                                        1 Search
                                        2 Service Nos. 
                                        3 Add name
                                        4 Erase
                                        5 Edit
                                        6 Copy
                                        7 Assign tone
                                        8 Send b’card
                                        9 Options
                                        10 Speed dials
                                        11 Voice tags
                                        0. Back

                    ========================================================

                    """ ;
                        

                    System.out.println(phonebookPrompt);
                    System.out.println("Enter any option (1-11):");
			        int phonebookChoice = input.nextInt();

			        switch(phonebookChoice){
			        	case 0 -> {
			        	break;
			        	}
			        case 1 -> System.out.println("Search"); 
			        case 2 -> System.out.println("Service NOS.1"); 
			        case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase"); 
                    case 5 -> System.out.println("Edit"); 
                    case 6 -> System.out.println("Copy"); 
                    case 7 -> System.out.println("Assign tone"); 
                    case 8 -> System.out.println("Send b'card'"); 
                    case 9 ->{ 
                                System.out.println("Options"); 

                                String optionsPrompt = """

        =========================== Option ==========================
                                    1. Memory in use
                                    2. Type of view
                                    3. Memory status

        =============================================================
                                        """;
                        while (true)
                        System.out.println(optionsPrompt);
                        System.out.println("Enter any option (1-3):");
		                int optionChoice = input.nextInt();
                        
                        

                    }
                    
                    case 10 -> System.out.println("Speed dials"); 
                    case 11 -> System.out.println("Voice tags"); 
			        default -> System.out.println("Do you want to go back to the main menu");
                 }

           }

           case 2 -> {

                     System.out.println("Messages"); 

                    String MessagePrompt = """
                    ============== Messages Menu ===============

                                        Press
                                        1 Write messages
                                        2 Inbox 
                                        3 Outbox
                                        4 Picture messages
                                        5 Templates
                                        6 Smileys
                                        7 Message settings
                                        8 Info service
                                        9 Voice mailbox number 4
                                        10 Service command editor

                    ========================================================

                    """ ;
                    System.out.println(MessagePrompt);
                    System.out.println("Enter any option (1-10):");
			        int MessagesChoice = input.nextInt();

                    switch(MessagesChoice){

			        case 1 -> System.out.println("Write messages"); 
			        case 2 -> System.out.println("Inbox"); 
			        case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages"); 
                    case 5 -> System.out.println("Templates"); 
                    case 6 -> System.out.println("Smileys"); 
                    case 7 -> { 
                                System.out.println("Message settings"); 

                                String MessageSettingsPrompt = """

        =========================== Option ==========================
                                    1.  Set 1
                                    2.  Common
        =============================================================
                                        """;
                        System.out.println(MessageSettingsPrompt);
                        System.out.println("Enter option");
		                int MessageSettingsChoice = input.nextInt();

                        switch(MessageSettingsChoice){

		             case 1 -> {

                     System.out.println("Set 1"); 

                    String SetPrompt = """

                    ================ Set 1 Menu ================

                                        Press
                                        1 Message centre number
                                        2 Messages sent as
                                        3 Message validity

                    ============================================

                    """ ;

                    System.out.println(SetPrompt);
                    System.out.println("Enter any option (1-3):");
			        int SetChoice = input.nextInt();
                        switch(SetChoice) {
                            case 1 -> System.out.println("Message centre number"); 
                            case 2 -> System.out.println("Messages sent as"); 
                            case 3 -> System.out.println("Messages validity"); 
                       }
                    }
                    case 2 -> {

                     System.out.println("Common"); 

                    String CommonPrompt = """

                    ================ Common Menu ================

                                        Press
                                        1 Delivery reports
                                        2 Reply via same centre
                                        3 Character support

                    ============================================

                    """ ;

                    System.out.println(CommonPrompt);
                    System.out.println("Enter any option (1-3):");
			        int CommonChoice = input.nextInt();
                        switch(CommonChoice) {
                            case 1 -> System.out.println("Delivery reports"); 
                            case 2 -> System.out.println("Reply via same centre"); 
                            case 3 -> System.out.println("Character support"); 
                            default -> System.out.println("Invalid Input");
                        }
                            }
                        }
                    }
                    case 8 -> System.out.println("Info service");
                    case 9 -> System.out.println("Voice mailbox number 4");
                    case 10 -> System.out.println("Service command editor");
                        }
         
                    }
           case 3 -> {
                     System.out.println("Chat"); 

                    String ChatPrompt = """
                    ====================== Chat Menu =======================

                                            Press
                                            1 Chat
                    ========================================================

                    """ ;
                    System.out.println(ChatPrompt);
                    System.out.println("Enter option:");
			        int ChatChoice = input.nextInt();

                    switch(ChatChoice){

			        case 1 -> System.out.println("Chat"); 
			        default -> System.out.println("Invalid Input");
                    }
           }
            case 4 -> {

                     System.out.println("Call register"); 

                    String CallRegisterPrompt = """
                    ================== CallRegister Menu ===================

                                        Press
                                        1   Missed calls
                                        2   Received calls
                                        3   Dialled numbers
                                        4   Erase recent call lists
                                        5   Show call duration
                                        6   Show call costs
                                        7   Call cost settings
                                        8   Prepaid credit

                    ========================================================

                    """ ;
                    System.out.println(CallRegisterPrompt);
                    System.out.println("Enter any option from (1/8):");
			        int CallRegisterChoice = input.nextInt();

                    switch(CallRegisterChoice){

			          case 1 -> System.out.println("Missed calls"); 
                      case 2 -> System.out.println("Received calls"); 
                      case 3 -> System.out.println("Dialled numbers"); 
                      case 4 -> System.out.println("Erase recent call lists"); 
                      case 5 -> {
                                System.out.println("Show call duration"); 

                         String ShowCallDurationPrompt = """
                    ================== Show call duration Menu ===================

                                        Press
                                        1   Last call duration
                                        2   All calls’ duration
                                        3   Received calls’ duration
                                        4   Dialled calls’ duration
                                        5   Clear timers
                                      
                    ==============================================================

                    """ ;
                    System.out.println(ShowCallDurationPrompt);
                    System.out.println("Enter any option from (1/5):");
			        int ShowCallDurationChoice = input.nextInt();
                    }

                      case 6 -> {
                            System.out.println("Show call costs"); 

                        String ShowCallCostsPrompt = """
                    ================== Show call costs Menu ===================

                                        Press
                                        1   Last call cost
                                        2   All calls’ cost
                                        3   Clear counters
                                      
                    ===========================================================

                    """ ;
                    System.out.println(ShowCallCostsPrompt);
                    System.out.println("Enter any option from (1/3):");
			        int ShowCallCostsChoice = input.nextInt();
                      }
                      case 7 -> {
                            System.out.println("Call cost settings"); 
                            
                         String CallCostSettingsPrompt = """
                    ================== Call cost settings Menu =============

                                        Press
                                        1   Call cost limit
                                        2   Show costs in
                                      
                    ========================================================

                    """ ;
                    System.out.println(CallCostSettingsPrompt);
                    System.out.println("Enter any option from (1/2):");
			        int CallCostSettingsChoice = input.nextInt();
                      }
                      case 8 -> System.out.println("Prepaid credit"); 
                      default -> System.out.println("Invalid Input");
          }
          }
             case 5 -> {

                     System.out.println("Tones"); 

                    String TonesPrompt = """
                    ===================== Tones Menu ======================

                                        Press
                                        1   Ringing tone
                                        2   Ringing volume
                                        3   Incoming call alert
                                        4   Message alert tone
                                        5   Keypad tones
                                        6   Warning tones
                                        7   Vibrating alert
                                        8   Screen saver

                    ========================================================

                    """ ;
                    System.out.println(TonesPrompt);
                    System.out.println("Enter any option from (1/8):");
			        int TonesChoice = input.nextInt();

                    switch(TonesChoice){

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
            }
                case 6 -> {

                     System.out.println("Settings"); 

                    String SettingsPrompt = """
                    ==================== Settings Menu =====================

                                        Press
                                        1   Call settings
                                        2   Phone settings
                                        3   Security settings
                                        4   Restore factory settings
                                        
                    ========================================================

                    """ ;
                    System.out.println(SettingsPrompt);
                    System.out.println("Enter any option from (1/4):");
			        int SettingsChoice = input.nextInt();

                    switch(SettingsChoice){

			          case 1 -> { 
                                System.out.println("Call settings");  

                                String CallSettingsPrompt = """

        =========================== CallSettings Option ==========================
                                    1. Automatic redial
                                    2. Speed dialling
                                    3. Call waiting options
                                    4  Own number sending 
                                    5  Phone line in use
                                    6  Automatic answer

        ==========================================================================
                                        """;
                        System.out.println(CallSettingsPrompt);
                        System.out.println("Enter any option (1-6):");
		                int CallSettingsChoice = input.nextInt();                     
                        }                     
                      case 2 -> {
                                System.out.println("Phone settings");  

                                String PhoneSettingsPrompt = """

        =========================== PhoneSettings Option ==========================
                                    1. Language
                                    2. Cell info display
                                    3. Welcome note
                                    4  Network selection 
                                    5  Confirm SIM service action

        ==========================================================================
                                        """;
                        System.out.println(PhoneSettingsPrompt);
                        System.out.println("Enter any option (1-5):");
		                int PhoneSettingsChoice = input.nextInt();
                    }
                      case 3 -> {
                            System.out.println("Security settings");
                                String SecuritySettingsPrompt = """

        =========================== SecuritySettings Option ========================
                                    1. PIN code request
                                    2. Call barring service
                                    3. Fixed dialling
                                    4  Closed user group 
                                    5  Security level
                                    6  Change access codes

        ============================================================================
                                        """;
                        System.out.println(SecuritySettingsPrompt);
                        System.out.println("Enter any option (1-6):");
		                int SecuritySettingsChoice = input.nextInt();
                            
                    } 
                      case 4 -> System.out.println("Restore factory settings");
                    } 
            }
             case 7 -> {

                     System.out.println("Call divert"); 

                    String CallDivertPrompt = """
                    ==================== CallDivert Menu ===================

                                        Press
                                        1   Call divert
                                        
                    ========================================================

                    """ ;
                    System.out.println(CallDivertPrompt);
                    System.out.println("Enter option :");
			        int CallDivertChoice = input.nextInt();

                    switch(CallDivertChoice){

			          case 1 -> System.out.println("Call divert");
			          default -> System.out.println("Invalid Input");
                    } 
            }
               case 8 -> {

                     System.out.println("Music"); 

                    String MusicPrompt = """
                    ====================== Music Menu ======================

                                        Press
                                        1   Music player
                                        2   Radio
                                        3   Recorder
                                        4   Track list
                                        
                    ========================================================

                    """ ;
                    System.out.println(MusicPrompt);
                    System.out.println("Enter any option from (1/4):");
			        int MusicChoice = input.nextInt();

                    switch(MusicChoice){

			          case 1 -> System.out.println("Music player"); 
                      case 2 -> System.out.println("Radio"); 
                      case 3 -> System.out.println("Recorder"); 
                      case 4 -> System.out.println("Track list");
                      default -> System.out.println("Invalid Input");  
                    } 
            }
                 case 9 -> {

                     System.out.println("Games"); 

                    String GamesPrompt = """
                    ==================== Games Menu ===================

                                        Press
                                        1   Games
                                        
                    ===================================================

                    """ ;
                    System.out.println(GamesPrompt);
                    System.out.println("Enter option :");
			        int GamesChoice = input.nextInt();

                    switch(GamesChoice){

			          case 1 -> System.out.println("Games"); 
			          default -> System.out.println("Invalid Input");
                    }
           }
                 case 10 -> {

                     System.out.println("Calculator"); 

                    String CalculatorPrompt = """
                    ==================== Calculator Menu ===================

                                        Press
                                        1   Calculator
                                        
                    ========================================================

                    """ ;
                    System.out.println(CalculatorPrompt);
                    System.out.println("Enter option :");
			        int CalculatorChoice = input.nextInt();

                    switch(CalculatorChoice){

			          case 1 -> System.out.println("Calculator"); 
			          default -> System.out.println("Invalid Input");
                    }
        }
            case 11 -> {

                     System.out.println("Reminders"); 

                    String RemindersPrompt = """
                    ==================== Reminder Menu ===================

                                        Press
                                        1   Reminders
                                        
                    ======================================================

                    """ ;
                    System.out.println(RemindersPrompt);
                    System.out.println("Enter option :");
			        int RemindersChoice = input.nextInt();

                    switch(RemindersChoice){

			          case 1 -> System.out.println("Reminders"); 
			          default -> System.out.println("Invalid Input");
                    }
        }
             case 12 -> {

                     System.out.println("Clock"); 

                    String ClockPrompt = """
                    ====================== Clock Menu ======================

                                        Press
                                        1   Alarm clock
                                        2   Clock settings
                                        3   Date setting
                                        4   Stopwatch
                                        5   Countdown timer  
                                        6   Auto update of date and time
                                        
                    ========================================================

                    """ ;
                    System.out.println(ClockPrompt);
                    System.out.println("Enter any option from (1/6):");
			        int ClockChoice = input.nextInt();

                    switch(ClockChoice){

			          case 1 -> System.out.println("Alarm clock"); 
                      case 2 -> System.out.println("Clock settings"); 
                      case 3 -> System.out.println("Date setting"); 
                      case 4 -> System.out.println("Stopwatch"); 
                      case 5 -> System.out.println("Countdown timer"); 
                      case 6 -> System.out.println("Auto update of date and time"); 
                      default -> System.out.println("Invalid Input");  
                    }
            }
                case 13 -> {

                     System.out.println("Profiles"); 

                    String ProfilesPrompt = """
                    ==================== Profiles Menu ===================

                                        Press
                                        1   Profiles
                                        
                    ======================================================

                    """ ;
                    System.out.println(ProfilesPrompt);
                    System.out.println("Enter option :");
			        int ProfilesChoice = input.nextInt();

                    switch(ProfilesChoice){

			          case 1 -> System.out.println("Profiles"); 
			          default -> System.out.println("Invalid Input");
                    }
            }
             case 14 -> {

                     System.out.println("Services"); 

                    String ServicesPrompt = """
                    ==================== Services Menu ===================

                                        Press
                                        1   Services
                                        
                    ======================================================

                    """ ;
                    System.out.println(ServicesPrompt);
                    System.out.println("Enter option :");
			        int ServicesChoice = input.nextInt();

                    switch(ServicesChoice){

			          case 1 -> System.out.println("Services");
			          default -> System.out.println("Invalid Input"); 
                    }
             }
              case 15 -> {

                     System.out.println("SIM services"); 

                    String SIMServicesPrompt = """
                    ==================== SIM services Menu ===================

                                        Press
                                        1   SIM services
                                        
                    ========================================================

                    """ ;
                    System.out.println(SIMServicesPrompt);
                    System.out.println("Enter option :");
			        int SIMServicesChoice = input.nextInt();

                    switch(SIMServicesChoice){

			          case 1 -> System.out.println("SIM services"); 
			          default -> System.out.println("Invalid Input");

                    }
                }
            }

        }
}
