# Tufin Junior Developer Technical Assessment

Programming language used is Java 21

## Questions
###1. Get the longest string:
I iterate through list of strings that's the method argument, check if it has any repetitive identical characters. Pick and store them in a list then remove them from the original String list and the remaining confirm whether their characters are allowed then calculate the longest string from the remaining and return it.

###2. Uniqe sums:
Calculate all possible additions of each array element to equal the result and with the array sorted
        check if the elements of the array qualify for the possible unique ways. Store in the map and output it.

###3. Turn to Zero:
iterate through the array starting from the element in the second position, then have a variable that
      keeps stores the sum of the previous element then check if element can be made to zero by comparing what 
      variable has
###4. First unique product:
iterate the products array and get the number of times each product appears and store this in a map
      then via another iteration go through the map and check/get the first one and return it

###5. Nearest Minimum:
iterate through the array and find the minimum number that's appearing multiple times
      Then get the indexes of all this number's instances and find the difference between them

###6. Most Common:
Break down the string to make it iteratable, iterate it calculating and storing the number of times each string
      element appears then in this store, find those that appear more than once.

###7. Rotate String:
first ensure the provided strings are within the size of the list create a new list to store the elements in 
      their new placement. Then pull the elements from the first one and lodge them to the end of the string. 
      Repeat this for the number of times indicated by n
