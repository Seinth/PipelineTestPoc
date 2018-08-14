package org.dummy

class AddSubtract implements Serializable {
  private int a
  private int b
  private int sum
  private int sub
  
  AddSubtract(List<Integer> numbers) {
    this.a=numbers[0]
    this.b=numbers[1]
    this.sum=a+b
    this.sub=a-b
  }


  String isSumBiggerThan10() {
    return (this.sum > 10) ? "yes" : "no"
  }

  String isSumBiggerThan100() {
    return (this.sum > 100) ? "yes" : "no"
  }

  String isSubBiggerThan10() {
    return (this.sub > 10) ? "yes" : "no"
  }

  String isSubBiggerThan100() { 
    return (this.sub > 100) ? "yes" : "no"
  }
}
