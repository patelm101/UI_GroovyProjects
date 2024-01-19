static void main(String[] args) {
  println "Hello world!"
  int age = 40
  println age
  println age.getClass()
 def name = "Jack"
  HelloW person = new HelloW()
  person.setFirstName("John")
  person.setLastName("Smith")
  person.setAge(45)

  println person.getFullName()
  println person.getAge()

  if(person.getAge() >= 45 && person.getAge() <= 65){
    println person.getFullName() + " is middle-aged"
  }else {
    println person.getFullName() + " is "  + person.getAge() + " years old"
  }

    //This is testing

}