package main 

import "fmt"
//Implementing the Havel Hakimi Algorithm
func main() {
	a := []int {1}
	//fmt.Printf("Length of the input slice is %d\n",len(a))
	res := HavelHakimi(a)
	fmt.Println(res)
}

func HavelHakimi(answers []int)bool {
if len(answers) == 0 {
	return true
} else {
	fmt.Println("Another iteration")
	fmt.Printf("Currently, slice is %v\n",answers)
	counts := make([]int,len(answers))
	//Use counting sort
	for ind := 0; ind < len(answers); ind++ {
		counts[answers[ind]] += 1
	}
	for el,j := len(counts)-1,0; el >= 0; el-- {
		for i := counts[el]; i > 0; i-- {
			answers[j] = el
			j++
		} 
	}
	fmt.Printf("After sorting:%v\n",answers)
	top := answers[0]
	zeros := counts[0]
	if len(answers) == zeros {
		return true
	} else {
	answers = answers[1:len(answers)-zeros]
	fmt.Printf("After slicing:%v\n",answers)
	if len(answers) == 0 {
		return true
	} else {
		if top > len(answers) {
			return false
		} else {
			for i:= 0; i < top; i++ {
				answers[i] -= 1
			}
			return HavelHakimi(answers)
		}
	}
}
}
}