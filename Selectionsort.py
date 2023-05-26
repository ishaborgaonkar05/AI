def selection_sort(array):
    length = len(array)

    for i in range(length - 1):
        minIndex = i

        for j in range(i + 1, length):
            if array[j] < array[minIndex]:
                minIndex = j

        array[i], array[minIndex] = array[minIndex], array[i]

    return array


# creating an empty list
lst = []

# number of elements as input
n = int(input("Enter number of elements : "))

# iterating till the range
for i in range(0, n):
    ele = int(input())
    # adding the element
    lst.append(ele)

print(lst)


print("The sorted array is: ", selection_sort(lst))