game_board = []

game_active = True

def fill_board():
    size = 3
    game_board = [[0 for i in range(size)] for j in range(size)]

    
    for row in game_board:
        print(row)



def print_board():
    print("printing")
    for row in game_board:
        print(row)


fill_board()
#print_board()
