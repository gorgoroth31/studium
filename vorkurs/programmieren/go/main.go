package main

import "fmt"

var (
	currentPlayer string
	board         [3][3][3]string
)

func main() {
	reset()
}

func reset() {
	currentPlayer = "X"
	for row := range board {
		for i := range row {
			fmt.Println(i)
		}
	}
}
