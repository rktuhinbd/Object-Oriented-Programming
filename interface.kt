fun main(args: Array<String>) {
    println("* * * Polymorphism, Inheritance, Interface, Abstraction Example * * *")

    val fullTimeEmployee = FullTimeEmployee("Solayman Hossain", "Rana", 100000)
    val partTimeEmployee = PartTimeEmployee("Ikram Khan", "Johan", 50000)

    /** As employeeList is Employee type but behaving like FullTimeEmployee once and
     * another time PartTimeEmployee this is an example of polymorphism **/
    val employeeList: List<Employee> = listOf(fullTimeEmployee, partTimeEmployee)

    for (employee in employeeList) {
        println("~> ${employee.getEmployeeInfo()}")
    }

}

/**This is an abstract class, the purpose of creating this class abstract is to if any class inherits this class,
 *  they have to override the abstract methods inside this class. NB: Abstract class's object can't be created */
abstract class Employee(val firstName: String, val lastName: String) {
    //To override this method, it should be abstract and doesn't require body
    abstract fun getEmployeeInfo(): String
}

//Inherits Employee class as Super class
class FullTimeEmployee(firstName: String, lastName: String, private val salary: Int) : Employee(firstName, lastName) {
    //Must override this method
    override fun getEmployeeInfo(): String {
        return "$firstName $lastName is a full-time employee and draws salary : $salary bdt per month"
    }
}

//Inherits Employee class as Super class, Implements AllowanceInterface 
class PartTimeEmployee(firstName: String, lastName: String, private val salary: Int) : Employee(firstName, lastName),
    AllowanceInterface {
    //Must override this method
    override fun getEmployeeInfo(): String {
        return "$firstName $lastName is a part-time employee and draws salary : $salary bdt per month"
    }

    override fun calculateAllowance() {
        println("Your medicine allowance is 420TK.")
    }

}

/**Allowance interface to implement when user wants to
 *  add extra feature to a class declared inside this**/
interface AllowanceInterface {

    //Unimplemented method which must be implemented if user implement this Interface
    fun calculateAllowance()

    //Default implementation of method which make this method implementation optional
    fun defaultMethod() {

    }
}
