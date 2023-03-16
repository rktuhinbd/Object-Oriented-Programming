fun main(args: Array<String>) {
    println("* * * Polymorphism Example * * *")

    val fullTimeEmployee = FullTimeEmployee("Solayman Hossain", "Rana", 100000)
    val partTimeEmployee = PartTimeEmployee("Ikram Khan", "Johan", 50000)

    /** As employeeList is Employee type but behaving like FullTimeEmployee once and
     * another time PartTimeEmployee this is an example of polymorphism **/
    val employeeList: List<Employee> = listOf(fullTimeEmployee, partTimeEmployee)

    for (employee in employeeList) {
        employee.getEmployeeInfo()
    }

}

//To inherit this class, it should be open as without open classes are final which are not inheritable
open class Employee(val firstName: String, val lastName: String) {
    //To override this method, it should be open
    open fun getEmployeeInfo() {
        println("$firstName $lastName")
    }
}

//Inherits Employee class as Super class
class FullTimeEmployee(firstName: String, lastName: String, val salary: Int) : Employee(firstName, lastName) {
    //Method override
    override fun getEmployeeInfo() {
        println("$firstName $lastName is a full-time employee and draws salary : $salary bdt per month")
    }
}

//Inherits Employee class as Super class
class PartTimeEmployee(firstName: String, lastName: String, val salary: Int) : Employee(firstName, lastName) {
    //Method override
    override fun getEmployeeInfo() {
        println("$firstName $lastName is a part-time employee and draws salary : $salary bdt per month")
    }
}

