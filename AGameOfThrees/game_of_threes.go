package main 
import (
"fmt"
"os"
"reflect" //reflect package implements run-time reflection such as get type info
"strconv"
)

func main() {
	//fmt.Println(os.Args[0]) //First argument is the name of the file itself
	//fmt.Println("Hello World")
	//fmt.Println(os.Args[1])
	Input := os.Args[1]
	Inp, err:= strconv.Atoi(Input)
	if(err != nil) {
		Inp= 100
	}
	fmt.Println("Type of Input variable is:",reflect.TypeOf(Input))
	fmt.Println("Type of Inp variable is:",reflect.TypeOf(Inp))
	fmt.Println("Type of err variable is:",reflect.TypeOf(err))
	for {
		if(Inp == 1) {
			fmt.Println("1")
			break
		} else {
			res := Inp % 3
			if(res == 0) {
			fmt.Printf("%d %d\n",Inp,res)
			Inp /= 3
			} else {
				if(res == 1) {
					fmt.Printf("%d %s\n",Inp,"-1")
					Inp -= 1
					Inp /= 3
				} else {
					fmt.Printf("%d %s\n",Inp, "+1")
					Inp += 1
					Inp /= 3
				}
			}

		}
	}
}