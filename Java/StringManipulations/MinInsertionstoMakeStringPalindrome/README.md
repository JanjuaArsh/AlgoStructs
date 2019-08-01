#problem statement
 given an input string find minimum number of insertions required to make it a palindrome.

#solution
  Time complexity: O(N^2)
  Auxiliary Space: O(N^2)
  dynamic programing based approach
  The minimum number of insertions in the string str[l...h] can be given as:
    if charAt(l) == charAt(h) -> minInsertions(str[l+1...h-1])
    else -> min(minInsertions(str[l...h-1]), minInsertions(str[l+1...h])) + 1 
