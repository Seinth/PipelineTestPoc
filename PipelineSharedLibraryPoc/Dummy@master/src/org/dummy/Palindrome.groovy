package org.dummy

def isPalindrome(word) {
  return (word[-1..0] == word[0..-1]) ? "yes" : "no"
}
