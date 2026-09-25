main_menu = """
List of menu functions
1. Phone book
2. Messages
3. Chat
4. Call register
5. Tones
6. Settings
7. Call divert
8. Music 
9. Games
10. Calculator
11. Reminders
12. Clock
13. Profiles
14. Services
15. SIM services
0. Back"""
while True:
	print(main_menu)
	main_menu_prompt = int(input('Enter any option: '))
	match(main_menu_prompt):
		case 0: break
		case 1: 
			print("Phone book")
			phonebook_menu = """
				List of phonebook functions
				1. Search
				2. Service Nos.
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
			"""
			while True:
				print(phonebook_menu)
				phonebook_prompt = int(input('Enter any option: '))
				match(phonebook_prompt):
					case 0: break
					case 1: print("Search")
					case 2: print("Service Nos.")
					case 3: print("Add name")
					case 4: print("Erase")
					case 5: print("Edit")
					case 6: print("Copy")
					case 7: print("Assign tone")
					case 8: print("Send b’card")
					case 9: 
						print("Options")
						option_menu = """
							List of Option functions
							1. Memory in use
							2. Type of view
							3. Memory status
							0. Back
						"""
						print(option_menu)
						option_prompt = int(input('Enter any option: '))
						match(option_prompt):
							case 0: break
							case 1: print("Memory in use")
							case 2: print("Type of view")
							case 3: print("Memory status")
					
					case 10: print("Speed dials")
					case 11: print("Voice tags")
		case 2:
			print("Messages")
			messages_menu = """
	List of Messages functions
	1. Write messages
	2. Inbox
	3. Outbox
	4. Picture messages
	5. Templates
	6. Smileys
	7. Message settings
	8. Info service
	9. Voice mailbox number
	10. Service command editor
	0. Back
	"""
			while True:
				print(messages_menu)
				messages_prompt = int(input('Enter any option: '))
				match(messages_prompt):
					case 0: break
					case 1: print("Write messages")
					case 2: print("Inbox")
					case 3: print("Outbox")
					case 4: print("Picture messages")
					case 5: print("Templates")
					case 6: print("Smileys")
					case 7: 
						print("Message settings")
						messsage_settings_menu = """
		List of Message settings functions
		1. Set 1
		2. Common
		0. Back
		"""
						while True:
							print(messsage_settings_menu)
							messsage_settings_prompt = int(input('Enter any option: '))
							match(messsage_settings_prompt):
								case 0: break
								case 1: 
									print("Set 1")
									set_menu = """
			List of set functions
			1. Message centre number
			2. Messages sent as
			3. Message validity
			0. Back
			"""
									print(set_menu)
									set_prompt = int(input('Enter any option: '))
									
								case 2:
									print("Common")
									common_menu = """
			List of common functions
			1. Delivery reports
			2. Reply via same centre
			3. Character support
			0. Back
			"""
									print(common_menu)
									common_prompt = int(input('Enter any option: '))
											
					case 8: print("Info service")
					case 9: print("Voice mailbox number")
					case 10: print("Service command editor")
				
		case 3: print("Chat")
		case 4: 
			print("Call register")
			call_register_menu = """
	List of call register functions
	1. Missed calls
	2. Received calls
	3. Dialled numbers
	4. Erase recent call lists
	5. Show call duration
	6. Show call costs
	7. Call cost settings
	8. Prepaid credit
	0. Back
	"""
			while True:
				print(call_register_menu)
				call_register_prompt = int(input('Enter any option: '))
				match(call_register_prompt):
							case 0: break
							case 1: print("Missed calls") 
							case 2: print("Received calls")
							case 3: print("Dialled numbers")
							case 4: print("Erase recent call lists")
							case 5: 
								print("Show call duration")
								Show_call_duration_menu = """
		List of Show call duration functions
		1. Last call duration
		2. All calls’ duration
		3. Received calls’ duration
		4. Dialled calls’ duration
		5. Clear timers
		0. Back
		"""
								while True:
									print(Show_call_duration_menu)
									Show_call_duration_prompt = int(input('Enter any option: '))
									match(Show_call_duration_prompt):
										case 0: break
										case 1: print("Last call duration") 
										case 2: print("All calls’ duration") 
										case 3: print("Received calls’ duration") 
										case 4: print("Dialled calls’ duration") 
										case 5: print("Clear timers") 
								
							case 6: 
								print("Show call costs")
								Show_call_costs_menu = """
		List of Show call costs functions
		1. Last call cost
		2. All calls’ cost
		3. Clear counters
		0. Back
		"""
								while True:
									print(Show_call_costs_menu)
									Show_call_costs_prompt = int(input('Enter any option: '))
									match(Show_call_costs_prompt):
										case 0: break
										case 1: print("Last call cost") 
										case 2: print("All calls’ cost") 
										case 3: print("Clear counters") 
								
							case 7:
								print("Call cost settings")
								Call_cost_settings_menu = """
		List of Show call costs functions
		1. Call cost limit
		2. Show costs in	
		0. Back				
		"""
								while True:
									print(Call_cost_settings_menu)
									Call_cost_settings_prompt = int(input('Enter any option: '))
									match(Call_cost_settings_prompt):
										case 0: break
										case 1: print("Call cost limit") 
										case 2: print("Show costs in") 
								
							case 8: print("Prepaid credit")	
			
		case 5: 
			print("Tones")
			tones_menu = """
	List of tones functions
	1. Ringing tone
	2. Ringing volume
	3. Incoming call alert
	4. Message alert tone
	5. Keypad tones
	6. Warning tones
	7. Vibrating alert
	8. Screen saver
	0. Back
	"""
			while True:
				print(tones_menu)
				tones_prompt = int(input('Enter any option: '))
				match(tones_prompt):
					case 0: break
					case 1: print("Ringing tone") 
					case 2: print("Ringing volume") 
					case 3: print("Incoming call alert") 
					case 4: print("Message alert tone") 
					case 5: print("Keypad tones") 
					case 6: print("Warning tones") 
					case 7: print("Vibrating alert") 
					case 8: print("Screen saver") 
			
		case 6:
			print("Settings")
			settings_menu = """
	List of settings functions
	1. Call settings
	2. Phone settings
	3. Security settings
	4. Restore factory settings
	0. Back
	"""
			while True:
				print(settings_menu)
				settings_prompt = int(input('Enter any option: '))
				match(settings_prompt):
					case 0: break
					case 1: 
						print("Call settings") 
						call_settings_menu = """
		List of call settings functions
		1. Automatic redial
		2. Speed dialling
		3. Call waiting options
		4. Own number sending
		5. Phone line in use
		6. Automatic answer
		0. Back
		"""
						while True:
							print(call_settings_menu)
							call_settings_prompt = int(input('Enter any option: '))
							match(call_settings_prompt):
								case 0: break
								case 1: print("Automatic redial") 
								case 2: print("Speed dialling") 
								case 3: print("Call waiting options") 
								case 4: print("Own number sending") 
								case 5: print("Phone line in use") 
								case 6: print("Automatic answer") 
				
							
					case 2:
						print("Phone settings") 
						phone_settings_menu = """
		List of phone settings functions
		1. Language
		2. Cell info display
		3. Welcome note
		4. Network selection
		5. Confirm SIM service actions
		0. Back
		"""
						while True:
							print(phone_settings_menu)
							phone_settings_prompt = int(input('Enter any option: '))
							match(phone_settings_prompt):
								case 0: break
								case 1: print("Language") 
								case 2: print("Cell info display") 
								case 3: print("Welcome note") 
								case 4: print("Network selection") 
								case 5: print("Confirm SIM service actions") 
						
					case 3: 
						print("Security settings") 
						security_settings_menu = """
		List of security settings functions
		1. PIN code request
		2. Call barring service
		3. Fixed dialling
		4. Closed user group
		5. Security level
		6. Change access codes
		0. Back
		"""
						while True:
							print(security_settings_menu)
							security_settings_prompt = int(input('Enter any option: '))
							match(security_settings_prompt):
								case 0: break
								case 1: print("PIN code request") 
								case 2: print("Call barring service") 
								case 3: print("Fixed dialling") 
								case 4: print("Closed user group") 
								case 5: print("Security level") 
								case 6: print("Change access codes") 
						
					case 4: print("Restore factory settings") 
				

		case 7: print("Call divert")
		case 8: 
			print("Music")
			music_menu = """
	List of music functions
	1. Music player
	2. Radio
	3. Recorder
	4. Track list
	0. Back
	"""
			while True:
				print(music_menu)
				music_prompt = int(input('Enter any option: '))
				match(music_prompt):
					case 0: break
					case 1: print("Music player") 
					case 2: print("Radio") 
					case 3: print("Recorder") 
					case 4: print("Track list") 
		
		case 9: print("Games")
		case 10: print("Calculator")
		case 11: print("Reminders")
		case 12:
			print("Clock")
			clock_menu = """
	List of clock functions
	1. Alarm clock
	2. Clock settings
	3. Date setting
	4. Stopwatch
	5. Countdown timer
	6. Auto update of date and time	
	0. Back
	"""
			while True
				print(clock_menu)
				clock_prompt = int(input('Enter any option: '))
				match(clock_prompt):
					case 0: break
					case 1: print("Alarm clock") 
					case 2: print("Clock settings") 
					case 3: print("Date setting") 
					case 4: print("Stopwatch")
					case 5: print("Countdown timer")
					case 6: print("Auto update of date and time	") 
			
		case 13: print("Profiles")
		case 14: print("Services")
		case 15: print("SIM services")
		
		
