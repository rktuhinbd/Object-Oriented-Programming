fun main(args: Array<String>) {
    println("* * * Inheritance Example * * *")

    val fullTimeEmployee = FullTimeEmployee("Solayman Hossain", "Rana", 100000)
    val partTimeEmployee = PartTimeEmployee("Ikram Khan", "Johan", 50000)

    /** As FullTimeEmployee and PartTimeEmployee is getting firstName & lastName from Employee,
     * this is an example of inheritance **/
    fullTimeEmployee.getFullTimeEmployeeInfo()
    partTimeEmployee.getPartTimeEmployeeInfo()

}

//To inherit this class, it should be open as without open classes are final which are not inheritable
open class Employee(val firstName: String, val lastName: String) {
    fun getEmployeeInfo() {
        println("$firstName $lastName")
    }
}

//Inherits Employee class as Super class
class FullTimeEmployee(firstName: String, lastName: String, val salary: Int) : Employee(firstName, lastName) {
    fun getFullTimeEmployeeInfo() {
        println("$firstName $lastName is a full-time employee and draws salary : $salary bdt per month")
    }
}

//Inherits Employee class as Super class
class PartTimeEmployee(firstName: String, lastName: String, val salary: Int) : Employee(firstName, lastName) {
    fun getPartTimeEmployeeInfo() {
        println("$firstName $lastName is a part-time employee and draws salary : $salary bdt per month")
    }
}
