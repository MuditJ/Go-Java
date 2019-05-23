#Given a sequence, run the Havel-Hakimi algo on it
def hh(sequence):
    while True:
        sequence = [x for x in sequence if x != 0]
        if not sequence:
            return True
        else:
            sequence.sort(reverse=True)
            first = sequence.pop(0)
            if first > len(sequence):
                return False
            else:
                sequence = [x-1 for x in sequence]

#print(hh([5,3,0,2,6,2,0,7,2,5]))
#print(hh([16, 9, 9, 15, 9, 7, 9, 11, 17, 11, 4, 9, 12, 14, 14, 12, 17, 0, 3, 16]))
print(hh([6, 0, 10, 10, 10, 5, 8, 3, 0, 14, 16, 2, 13, 1, 2, 13, 6, 15, 5, 1]))
#print(hh([15, 18, 6, 13, 12, 4, 4, 14, 1, 6, 18, 2, 6, 16, 0, 9, 10, 7, 12, 3]))
#print(hh([14, 10, 17, 13, 4, 8, 6, 7, 13, 13, 17, 18, 8, 17, 2, 14, 6, 4, 7, 12]))
