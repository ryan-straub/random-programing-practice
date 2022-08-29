from datetime import date

today = date.today()
IT_position = False
GAME_Position = True

def main():
    # Non-Costants
    print("Is this a Game Design Position or IT Position?")
    company_name = input()

    print("What is the name of the position?")
    company_name = input()

    print("What is the company adress?")
    company_adress = input()

    print("What is the company phone number?")
    company_phone = input()

    print("What is the name of the position?")
    hiring_manager_email = input()

    print("What is the name of the hiring manager?")
    hiring_manager_name = input()

    date = today.strftime("%B %d, %Y")

    print("Do you want to save this company's information?")

if __name__ == "__main__":
    main()